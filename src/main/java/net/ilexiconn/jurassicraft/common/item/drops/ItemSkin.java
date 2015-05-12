package net.ilexiconn.jurassicraft.common.item.drops;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.ilexiconn.jurassicraft.common.JurassiCraft;
import net.ilexiconn.jurassicraft.common.creativetab.ModCreativeTabs;
import net.ilexiconn.jurassicraft.common.entity.CreatureManager;
import net.ilexiconn.jurassicraft.common.item.ItemDNA;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemSkin extends ItemGenericDNASource
{
    @SideOnly(Side.CLIENT)
    public IIcon maleIcon;

    @SideOnly(Side.CLIENT)
    public IIcon femaleIcon;

    public ItemSkin(String name)
    {
        super(name, "Skin");
        this.setCreativeTab(ModCreativeTabs.items);
        this.setHasSubtypes(true);
    }

    public ItemDNA getCorrespondingDNA()
    {
        return this.getCorrespondingDNA("Skin");
    }

    public String getItemStackDisplayName(ItemStack itemStack)
    {
        return StatCollector.translateToLocal(itemStack.getUnlocalizedName() + (itemStack.getItemDamage() == 0 ? "_Male.name" : "_Female.name")).trim();
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int i)
    {
        return i == 0 ? this.maleIcon : this.femaleIcon;
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list)
    {
        list.add(new ItemStack(item, 1, 0));
        //list.add(new ItemStack(item, 1, 1));
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iIconRegister)
    {
        this.maleIcon = iIconRegister.registerIcon(JurassiCraft.getModId() + "creatures/" + CreatureManager.getCategoryFromCreatureName(this.getUnlocalizedName().substring(5, this.getUnlocalizedName().indexOf("_"))).toLowerCase() + "/" + this.getUnlocalizedName().substring(5, this.getUnlocalizedName().indexOf("_")).toLowerCase() + "/" + this.getUnlocalizedName().substring(5, this.getUnlocalizedName().indexOf("_")).toLowerCase() + "_Skin_Male");
        //this.femaleIcon = iIconRegister.registerIcon(JurassiCraft.getModId() + "creature/" + this.getUnlocalizedName().substring(5, this.getUnlocalizedName().length()) + "_Female");
    }
}