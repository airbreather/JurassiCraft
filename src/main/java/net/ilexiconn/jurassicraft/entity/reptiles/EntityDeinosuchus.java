package net.ilexiconn.jurassicraft.entity.reptiles;

import net.ilexiconn.jurassicraft.ai.JurassiCraftAIEatDroppedFood;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIEating;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIFollowFood;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIOwnerHurtsTarget;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIOwnerIsHurtByTarget;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAISit;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAITargetIfHasAgeAndNonTamed;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIWander;
import net.ilexiconn.jurassicraft.client.model.modelbase.ChainBuffer;
import net.ilexiconn.jurassicraft.entity.CreatureManager;
import net.ilexiconn.jurassicraft.entity.EntityJurassiCraftAggressive;
import net.ilexiconn.jurassicraft.entity.dinosaurs.EntityGallimimus;
import net.ilexiconn.jurassicraft.entity.dinosaurs.EntityOviraptor;
import net.ilexiconn.jurassicraft.interfaces.ICarnivore;
import net.ilexiconn.jurassicraft.interfaces.IPiscivore;
import net.ilexiconn.jurassicraft.interfaces.IReptile;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityDeinosuchus extends EntityJurassiCraftAggressive implements IReptile, ICarnivore, IPiscivore
{
	public ChainBuffer tailBuffer = new ChainBuffer(5);
	
    public EntityDeinosuchus(World world)
    {
        super(world, CreatureManager.classToCreature(EntityDeinosuchus.class));
        this.getNavigator().setAvoidsWater(false);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0F * this.getCreatureSpeed(), false));
        this.tasks.addTask(3, new JurassiCraftAIWander(this, 40, this.getCreatureSpeed()));
        this.tasks.addTask(4, new JurassiCraftAISit(this));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, this.getCreatureSpeed()));
        this.tasks.addTask(6, new JurassiCraftAIFollowFood(this, 100, 1.2D * this.getCreatureSpeed()));
        this.tasks.addTask(6, new JurassiCraftAIEatDroppedFood(this, 16.0D));
        this.tasks.addTask(6, new JurassiCraftAIEating(this, 20));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new JurassiCraftAIOwnerIsHurtByTarget(this));
        this.targetTasks.addTask(2, new JurassiCraftAIOwnerHurtsTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityGallimimus.class, 50, 0.4F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityOviraptor.class, 50, 0.3F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityChicken.class, 50, 0.1F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityCow.class, 50, 0.2F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityPig.class, 50, 0.15F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntitySheep.class, 50, 0.2F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityHorse.class, 50, 0.25F));
        this.targetTasks.addTask(4, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityPlayer.class, 10, 0.3F));
        this.setCreatureExperiencePoints(4000);
    }

    @Override
    public int getTalkInterval()
    {
        return 350;
    }

	@Override
	public String getLivingSound()
	{
		if (this.isSitting())
		{
			if (this.rand.nextBoolean())
			{
				this.playSound("jurassicraft:DeinosuchusRest1", this.getSoundVolume(), this.getSoundPitch());
			}
			else
			{
				this.playSound("jurassicraft:DeinosuchusRest2", this.getSoundVolume(), this.getSoundPitch());
			}
		}
		else
		{
			switch (this.rand.nextInt(10))
			{
				case 0:
				case 1:
				case 2:
					this.playSound("jurassicraft:DeinosuchusHiss1", this.getSoundVolume(), this.getSoundPitch());
					break;
				case 3:
				case 4:
				case 5:
					this.playSound("jurassicraft:DeinosuchusHiss3", this.getSoundVolume(), this.getSoundPitch());
					break;
				case 6:
				case 7:
					this.playSound("jurassicraft:DeinosuchusHiss2", this.getSoundVolume(), this.getSoundPitch());
					break;
				case 8:
				case 9:
					this.playSound("jurassicraft:DeinosuchusHiss4", this.getSoundVolume(), this.getSoundPitch());
					break;
			}
		}
		return null;
	}

	@Override
	public String getHurtSound()
	{
		switch (this.rand.nextInt(10))
		{
			case 0:
			case 1:
				this.playSound("jurassicraft:DeinosuchusHit1", this.getSoundVolume(), this.getSoundPitch());
				break;
			case 2:
				this.playSound("jurassicraft:DeinosuchusHit2", this.getSoundVolume(), this.getSoundPitch());
				break;
			case 3:
			case 4:
				this.playSound("jurassicraft:DeinosuchusHit3", this.getSoundVolume(), this.getSoundPitch());
				break;
		}
		this.playSound("jurassicraft:DeinosuchusSnap1", this.getSoundVolume(), this.getSoundPitch());
		return null;
	}

	@Override
	public String getDeathSound()
	{
		this.playSound("jurassicraft:DeinosuchusHiss3", this.getSoundVolume(), this.getSoundPitch());
		return null;
	}

    @Override
    public void onUpdate()
    {
        super.onUpdate();
        this.tailBuffer.calculateChainSwingBuffer(45.0F, 5, 2.5F, this);
    }
    
    @Override
    protected void dropFewItems(boolean recentlyBeenHit, int enchantBonus)
    {
    	float developmentFraction = this.getGrowthStage() / 120.0F;
        int count = Math.round(1 + (3.5F * developmentFraction) + this.rand.nextInt(1 + (int) (3.5F * developmentFraction)) + this.rand.nextInt(1 + enchantBonus));
    	if (!this.isBurning())
        {
            this.dropItemStackWithGenetics(new ItemStack(this.getCreature().getMeat(), count));
        }
        else
        {
            this.dropItem(this.getCreature().getSteak(), count);
        }
    }
}
