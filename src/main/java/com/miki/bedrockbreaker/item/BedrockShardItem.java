package com.miki.bedrockbreaker.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BedrockShardItem extends Item {
	public BedrockShardItem() {
		super(new Item.Properties().fireResistant().rarity(Rarity.RARE));
	}
}