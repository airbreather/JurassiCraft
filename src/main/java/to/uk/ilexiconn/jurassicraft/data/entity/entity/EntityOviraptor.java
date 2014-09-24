package to.uk.ilexiconn.jurassicraft.data.entity.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import to.uk.ilexiconn.jurassicraft.Util;
import to.uk.ilexiconn.jurassicraft.data.entity.EntityJurassiCraftCreature;
import to.uk.ilexiconn.jurassicraft.data.entity.EntityJurassiCraftLandAggressive;

public class EntityOviraptor extends EntityJurassiCraftLandAggressive {
	
	public EntityOviraptor(World world) {
		super(world, (byte) 15);
		tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, this.aiSit);
		// tasks.addTask(2, new EntityAIMate(this, 1.0D));
		tasks.addTask(4, new EntityAITempt(this, 1.1D * this.getCreatureSpeed(), Items.wheat, false));
		// tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
		tasks.addTask(5, new EntityAIWander(this, 0.75D * this.getCreatureSpeed()));
		tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		tasks.addTask(7, new EntityAILookIdle(this));
	}

	@Override
	public int getTalkInterval() {
		return 350;
	}

	@Override
	public String getLivingSound() {
		if (this.rand.nextInt(2) == 0) {
			return Util.getDinoByID(this.getCreatureID()).livingSound1;
		} else {
			return Util.getDinoByID(this.getCreatureID()).livingSound2;
		}
	}

	@Override
	public String getHurtSound() {
		return Util.getDinoByID(this.getCreatureID()).hurtSound;
	}

	@Override
	public String getDeathSound() {
		return Util.getDinoByID(this.getCreatureID()).deathSound;
	}
}