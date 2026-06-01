package com.miki.bedrockbreaker.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MoltenBedrockItem extends Item {
	public MoltenBedrockItem() {
		super(new Item.Properties().fireResistant().rarity(Rarity.RARE));
	}
}