package com.miki.bedrockbreaker.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BedrockNuggetItem extends Item {
	public BedrockNuggetItem() {
		super(new Item.Properties().fireResistant().rarity(Rarity.RARE));
	}
}