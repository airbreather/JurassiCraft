package com.rafamv.bygoneage.items.drops;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.rafamv.bygoneage.BygoneAge;
import com.rafamv.bygoneage.registry.BygoneAgeItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TitanisThighCooked extends ItemFood {

	public TitanisThighCooked(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		this.setCreativeTab(BygoneAge.bygoneAgeTab);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack itemStack) {
		return 35;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(BygoneAge.MODID + ":" + BygoneAgeItems.titanisThighCooked.getUnlocalizedName().substring(5));
	}
}