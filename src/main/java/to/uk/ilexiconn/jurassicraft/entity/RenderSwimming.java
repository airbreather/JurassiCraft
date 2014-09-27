package to.uk.ilexiconn.jurassicraft.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public abstract class RenderSwimming extends RenderDinosaur
{

    /* Inherithed from Animals+ by Click_Me */

    public RenderSwimming(ModelBase modelbase, Dinosaur dino, float f)
    {
        super(modelbase, dino, f);
    }

    protected void rotateCorpse(EntityLivingBase entitylivingbase, float f, float f1, float f2)
    {
        super.rotateCorpse(entitylivingbase, f, f1, f2);
        float f3 = entitylivingbase.prevRotationPitch
                + (entitylivingbase.rotationPitch - entitylivingbase.prevRotationPitch) * f2;
        GL11.glRotatef(f3, 1.0F, 0.0F, 0.0F);
    }

    @Override
    public void preRenderCallback(EntityLivingBase entity, float side)
    {
        /**float scale = (float) ((EntitySwimming) entity).getCreatureScale();
         this.shadowSize = scale * this.getShadow();
         GL11.glScalef(scale, scale, scale);
         **/
    }

}