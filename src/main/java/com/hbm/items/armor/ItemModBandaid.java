package com.hbm.items.armor;

import java.util.List;

import com.hbm.handler.ArmorModHandler;

import com.hbm.util.I18nUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class ItemModBandaid extends ItemArmorMod {

	public ItemModBandaid() {
		super(ArmorModHandler.extra, true, true, true, true);
	}
	
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool) {

		list.add(EnumChatFormatting.RED + I18nUtil.resolveKeyArray("armorMod.mod.bandaid")[0]);
		list.add("");
		super.addInformation(itemstack, player, list, bool);
	}
	
	@Override
	public void addDesc(List list, ItemStack stack, ItemStack armor) {
		list.add(EnumChatFormatting.RED + "  " + stack.getDisplayName() + I18nUtil.resolveKeyArray("armorMod.mod.bandaid")[1]);
	}
	
	@Override
	public void modDamage(LivingHurtEvent event, ItemStack armor) {
		
		if(event.entity.worldObj.rand.nextInt(100) < 3) {
			event.ammount = 0;
			event.entityLiving.heal(event.entityLiving.getMaxHealth());
		}
	}
}
