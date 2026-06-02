package com.miki.bedrockbreaker.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BedrockiteIngotItem extends Item {
	public BedrockiteIngotItem() {
		super(new Item.Properties().fireResistant().rarity(Rarity.RARE));
	}
}