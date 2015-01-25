package net.ilexiconn.jurassicraft.client.animation;

import net.ilexiconn.jurassicraft.AnimationHandler;
import net.ilexiconn.jurassicraft.ai.AIAnimation;
import net.ilexiconn.jurassicraft.entity.dinosaurs.EntityGallimimus;
import net.ilexiconn.jurassicraft.entity.dinosaurs.EntityTyrannosaurus;
import net.minecraft.entity.EntityLivingBase;

public class AIGallimimusBeingEaten extends AIAnimation
{
    private EntityTyrannosaurus tyrannosaurus;
    private EntityGallimimus gallimimus;

    public AIGallimimusBeingEaten(EntityGallimimus gallimimus)
    {
        super(gallimimus);
        this.gallimimus = gallimimus;
    }

    public int getAnimationId()
    {
        return JurassiCraftAnimationIDs.BEING_EATEN.animID();
    }

    public int getDuration()
    {
        return 50;
    }

    public boolean isAutomatic()
    {
        return true;
    }
    
    public void resetTask() {
    	super.resetTask();
    	gallimimus.setHealth(0);
    	gallimimus.setDead();
    }
}