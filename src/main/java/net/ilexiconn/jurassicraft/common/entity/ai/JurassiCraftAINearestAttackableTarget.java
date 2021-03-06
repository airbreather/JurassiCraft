package net.ilexiconn.jurassicraft.common.entity.ai;

import net.ilexiconn.jurassicraft.common.entity.EntityJurassiCraftSmart;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITarget;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JurassiCraftAINearestAttackableTarget extends EntityAITarget
{

    private final Class targetClass;
    private final JurassiCraftAINearestAttackableTarget.Sorter theNearestAttackableTargetSorter;
    private final IEntitySelector targetEntitySelector;
    private final EntityJurassiCraftSmart attackerCreature;
    private EntityLivingBase targetEntity;

    public JurassiCraftAINearestAttackableTarget(EntityJurassiCraftSmart creature, Class target, boolean flag)
    {
        super(creature, flag, false);
        this.targetClass = target;
        this.attackerCreature = creature;
        this.theNearestAttackableTargetSorter = new JurassiCraftAINearestAttackableTarget.Sorter(creature);
        this.setMutexBits(1);
        this.targetEntitySelector = new IEntitySelector()
        {
            @Override
            public boolean isEntityApplicable(Entity entity)
            {
                return !(entity instanceof EntityLivingBase) ? false : (!JurassiCraftAINearestAttackableTarget.this.isSuitableTarget((EntityLivingBase) entity, false) ? false : attackerCreature.isCreatureAdult());
            }
        };
    }

    public boolean shouldExecute()
    {
        double d0 = this.getTargetDistance();
        List list = this.taskOwner.worldObj.selectEntitiesWithinAABB(this.targetClass, this.taskOwner.boundingBox.expand(d0, 4.0D, d0), this.targetEntitySelector);
        Collections.sort(list, this.theNearestAttackableTargetSorter);
        if (list.isEmpty())
        {
            return false;
        }
        else
        {
            this.targetEntity = (EntityLivingBase) list.get(0);
            return this.attackerCreature.checkTargetBeforeAttacking(targetEntity);
        }
    }

    public void startExecuting()
    {
        this.taskOwner.setAttackTarget(this.targetEntity);
        super.startExecuting();
    }

    public static class Sorter implements Comparator
    {
        private final Entity theEntity;

        public Sorter(Entity par1Entity)
        {
            this.theEntity = par1Entity;
        }

        public int compare(Entity par1Entity, Entity par2Entity)
        {
            double d0 = this.theEntity.getDistanceSqToEntity(par1Entity);
            double d1 = this.theEntity.getDistanceSqToEntity(par2Entity);
            return d0 < d1 ? -1 : (d0 > d1 ? 1 : 0);
        }

        public int compare(Object par1Obj, Object par2Obj)
        {
            return this.compare((Entity) par1Obj, (Entity) par2Obj);
        }
    }
}