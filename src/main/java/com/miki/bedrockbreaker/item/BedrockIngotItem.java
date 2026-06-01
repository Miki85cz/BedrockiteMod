package com.miki.bedrockbreaker.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BedrockIngotItem extends Item {
	public BedrockIngotItem() {
		super(new Item.Properties().fireResistant().rarity(Rarity.RARE));
	}
}