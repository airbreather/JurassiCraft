package to.uk.ilexiconn.jurassicraft.entity.render;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import to.uk.ilexiconn.jurassicraft.JurassiCraft;
import to.uk.ilexiconn.jurassicraft.client.model.entity.ModelCoelacanth;
import to.uk.ilexiconn.jurassicraft.entity.Dinosaur;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCoelacanth extends RenderSwimming
{

    public RenderCoelacanth(Dinosaur dino)
    {
        super(new ModelCoelacanth(), dino, 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(Entity var1)
    {
        return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Coelacanth.png");
    }

}
