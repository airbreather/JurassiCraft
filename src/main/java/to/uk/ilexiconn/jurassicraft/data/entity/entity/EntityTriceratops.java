package to.uk.ilexiconn.jurassicraft.data.entity.entity;

import com.rafamv.bygoneage.BygoneAge;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import to.uk.ilexiconn.jurassicraft.Util;
import to.uk.ilexiconn.jurassicraft.data.entity.EntityJurassiCraftCreature;
import to.uk.ilexiconn.jurassicraft.data.entity.EntityJurassiCraftLandProtective;

public class EntityTriceratops extends EntityJurassiCraftLandProtective {

	public EntityTriceratops(World world) {
		super(world, (byte) 4, 1);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, this.aiSit);
		// tasks.addTask(2, new EntityAIMate(this, 1.0D));
		tasks.addTask(4, new EntityAITempt(this, 1.1D * this.getCreatureSpeed(), Items.wheat, false));
		// tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
		this.tasks.addTask(5, new EntityAIWander(this, 0.7D * this.getCreatureSpeed()));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
	}

	@Override
	public double getMountedYOffset() {
		return (double) this.getYBouningBox() * 0.95D;
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