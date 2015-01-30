package net.ilexiconn.jurassicraft.entity.mammals;

import net.ilexiconn.jurassicraft.AnimationHandler;
import net.ilexiconn.jurassicraft.ai.*;
import net.ilexiconn.jurassicraft.ai.animation.AnimationAIRoar;
import net.ilexiconn.jurassicraft.client.model.modelbase.IntermittentAnimation;
import net.ilexiconn.jurassicraft.entity.CreatureManager;
import net.ilexiconn.jurassicraft.entity.EntityJurassiCraftProtective;
import net.ilexiconn.jurassicraft.enums.JurassiCraftAnimationIDs;
import net.ilexiconn.jurassicraft.interfaces.IHerbivore;
import net.ilexiconn.jurassicraft.interfaces.IMammal;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityMammoth extends EntityJurassiCraftProtective implements IMammal, IHerbivore
{
    public IntermittentAnimation trunkLift = new IntermittentAnimation(20, 30, 10, 1);
    public IntermittentAnimation trunkSwing = new IntermittentAnimation(20, 50, 10, 1);
    public IntermittentAnimation earFlap = new IntermittentAnimation(20, 20, 10, 1);
    public IntermittentAnimation tailSwing = new IntermittentAnimation(20, 30, 10, 1);

    public EntityMammoth(World world)
    {
        super(world);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new JurassiCraftAIAngry(this, 200));
        this.tasks.addTask(1, new JurassiCraftAIFlee(this, 60, 1.1D * this.getCreatureSpeed()));
        this.tasks.addTask(2, new JurassiCraftAISit(this));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, 1.1F * this.getCreatureSpeed(), false));
        this.tasks.addTask(4, new JurassiCraftAIFollowFood(this, 50, 1.1D * this.getCreatureSpeed()));
        this.tasks.addTask(4, new JurassiCraftAIEatDroppedFood(this, 16.0D));
        this.tasks.addTask(4, new JurassiCraftAIEating(this, 20));
        this.tasks.addTask(5, new JurassiCraftAIWander(this, 45, 0.7D * this.getCreatureSpeed()));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.tasks.addTask(7, new AnimationAIRoar(this, 40));
        this.tasks.addTask(7, new JurassiCraftAIHerdBehavior(this, 128, 2500, 24, this.getCreatureSpeed()));
        this.targetTasks.addTask(1, new JurassiCraftAIOwnerIsHurtByTarget(this));
        this.targetTasks.addTask(2, new JurassiCraftAIOwnerHurtsTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.setCreatureExperiencePoints(3500);
    }

    @Override
    public double getMountedYOffset()
    {
        return (double) this.getYBouningBox() + 0.5;
    }

    @Override
    public int getNumberOfAllies()
    {
        return 1;
    }

    @Override
    public int getTalkInterval()
    {
        return 400;
    }

    @Override
    protected void dropFewItems(boolean recentlyBeenHit, int enchantBonus)
    {
        float developmentFraction = this.getGrowthStage() / 120.0F;
        int count = Math.round(1 + (3.5F * developmentFraction) + this.rand.nextInt(1 + (int) (4.0F * developmentFraction)) + this.rand.nextInt(1 + enchantBonus));
        if (!this.isBurning())
        {
            this.dropItemStackWithGenetics(new ItemStack(this.getCreature().getMeat(), count));
        }
        else
        {
            this.dropItem(this.getCreature().getSteak(), count);
        }
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();
        if(trunkSwing.getTimer() == 0) trunkLift.runAnimation();
        if(trunkLift.getTimer() == 0) trunkSwing.runAnimation();
        earFlap.runAnimation();
        tailSwing.runAnimation();
    }
}