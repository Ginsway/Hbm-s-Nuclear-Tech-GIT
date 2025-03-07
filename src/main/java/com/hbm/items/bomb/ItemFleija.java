package com.hbm.items.bomb;

import java.util.List;

import com.hbm.items.ModItems;

import com.hbm.util.I18nUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFleija extends Item {

	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool)
	{
		for(String s : I18nUtil.resolveKeyArray( "tile.nuke_fleija.desc"))
			list.add(s);
		super.addInformation(itemstack, player, list, bool);
	}

    @Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
    	
    	if(this == ModItems.fleija_propellant)
    	{
        	return EnumRarity.rare;
    	}
    	
    	return EnumRarity.common;
    }

}
