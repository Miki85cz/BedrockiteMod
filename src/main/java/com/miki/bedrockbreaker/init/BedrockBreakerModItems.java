package com.miki.bedrockbreaker.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.miki.bedrockbreaker.item.MoltenBedrockItem;
import com.miki.bedrockbreaker.item.BedrockShardItem;
import com.miki.bedrockbreaker.item.BedrockPickaxeItem;
import com.miki.bedrockbreaker.item.BedrockNuggetItem;
import com.miki.bedrockbreaker.item.BedrockIngotItem;
import com.miki.bedrockbreaker.BedrockBreakerMod;

public class BedrockBreakerModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BedrockBreakerMod.MODID);
	public static final DeferredItem<Item> BEDROCK_PICKAXE;
	public static final DeferredItem<Item> CRACKED_BEDROCK;
	public static final DeferredItem<Item> BEDROCK_NUGGET;
	public static final DeferredItem<Item> BEDROCK_SHARD;
	public static final DeferredItem<Item> MOLTEN_BEDROCK;
	public static final DeferredItem<Item> BEDROCK_INGOT;
	public static final DeferredItem<Item> BEDROCK_ORE;
	public static final DeferredItem<Item> NETHER_BEDROCK_ORE;
	static {
		BEDROCK_PICKAXE = REGISTRY.register("bedrock_pickaxe", BedrockPickaxeItem::new);
		CRACKED_BEDROCK = block(BedrockBreakerModBlocks.CRACKED_BEDROCK, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		BEDROCK_NUGGET = REGISTRY.register("bedrock_nugget", BedrockNuggetItem::new);
		BEDROCK_SHARD = REGISTRY.register("bedrock_shard", BedrockShardItem::new);
		MOLTEN_BEDROCK = REGISTRY.register("molten_bedrock", MoltenBedrockItem::new);
		BEDROCK_INGOT = REGISTRY.register("bedrock_ingot", BedrockIngotItem::new);
		BEDROCK_ORE = block(BedrockBreakerModBlocks.BEDROCK_ORE, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		NETHER_BEDROCK_ORE = block(BedrockBreakerModBlocks.NETHER_BEDROCK_ORE, new Item.Properties().rarity(Rarity.RARE).fireResistant());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}