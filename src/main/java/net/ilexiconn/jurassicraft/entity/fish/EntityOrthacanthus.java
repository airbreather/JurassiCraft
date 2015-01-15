package net.ilexiconn.jurassicraft.entity.fish;

import net.ilexiconn.jurassicraft.client.model.modelbase.ChainBuffer;
import net.ilexiconn.jurassicraft.entity.CreatureManager;
import net.ilexiconn.jurassicraft.entity.EntitySwimming;
import net.ilexiconn.jurassicraft.interfaces.ICarnivore;
import net.ilexiconn.jurassicraft.interfaces.IFish;
import net.ilexiconn.jurassicraft.interfaces.IHerbivore;
import net.ilexiconn.jurassicraft.interfaces.IPiscivore;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityOrthacanthus extends EntitySwimming implements IFish, IPiscivore
{
	public ChainBuffer tailBuffer = new ChainBuffer();
	
    public EntityOrthacanthus(World world)
    {
        super(world, CreatureManager.classToCreature(EntityOrthacanthus.class));
        this.swimRadius = 8.0F;
        this.swimRadiusHeight = 4.0F;
        this.swimSpeed = 0.4F;
        this.jumpOnLand = false;

        this.setCreatureExperiencePoints(50);
    }

    @Override
    protected Entity findEntityToAttack()
    {
        return null;
    }

    @Override
    public String getLivingSound()
    {
        return null;
    }

    @Override
    public String getHurtSound()
    {
        return null;
    }

    @Override
    public String getDeathSound()
    {
        return null;
    }

    @Override
    protected void dropFewItems(boolean recentlyBeenHit, int enchantBonus)
    {
    	
    }

    @Override
    public boolean canDespawn()
    {
        return true;
    }
}