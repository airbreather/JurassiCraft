package com.rafamv.bygoneage.entity.creatures;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import thehippomaster.AnimationAPI.AnimationAPI;

import com.rafamv.bygoneage.ai.BygoneAgeEntityAIFollowFood;
import com.rafamv.bygoneage.animation.AIHeadbutt;
import com.rafamv.bygoneage.entity.EntityBygoneAgeLandProtective;
import com.rafamv.bygoneage.enums.BygoneAgeAnimationIDs;
import com.rafamv.bygoneage.enums.BygoneAgeGeneticsInformation;
import com.rafamv.bygoneage.enums.BygoneAgeMobsInformation;
import com.rafamv.bygoneage.registry.BygoneAgeItems;

public class EntityUintatherium extends EntityBygoneAgeLandProtective {

	public EntityUintatherium(World world) {
		super(world, BygoneAgeGeneticsInformation.UINTATHERIUM.getCreatureID(), 1, 0.4F);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, this.aiSit);
		this.tasks.addTask(2, new AIHeadbutt(this));
		this.tasks.addTask(4, new BygoneAgeEntityAIFollowFood(this, 1.05D, false));
		this.tasks.addTask(5, new EntityAIWander(this, 0.75F));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
	}

	@Override
	public double getMountedYOffset() {
		return (double) this.getYBouningBox() * 1.0D;
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.rand.nextFloat() >= 0.6F) {
			super.attackEntityAsMob(entity);
			return true;
		} else {
			if (animID == 0) {
				AnimationAPI.sendAnimPacket(this, BygoneAgeAnimationIDs.ANIMATION_HEADBUTT.getAnimationID());
			}
			return true;
		}
	}

	@Override
	protected void dropFewItems(boolean recentlyBeenHit, int enchantBonus) {
		float developmentFraction = this.getGrowthStage() / BygoneAgeMobsInformation.values()[this.creatureID].getTimesOfGrowth();
		int count = 1 + (int) (1 * developmentFraction) + this.rand.nextInt(2 + (int) (1 * developmentFraction)) + this.rand.nextInt(1 + enchantBonus);
		for (int i = 0; i < count; i++) {
			if (this.isBurning()) {
				this.dropItem(BygoneAgeItems.uintatheriumMeatCooked, 1);
			} else {
				this.dropItemStackWithDNA(createDNACodeForItemStack(new ItemStack(BygoneAgeItems.uintatheriumMeatRaw, 1)));
			}
		}
	}
}
