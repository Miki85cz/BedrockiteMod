package com.miki.bedrockbreaker.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import com.miki.bedrockbreaker.block.NetherBedrockOreBlock;
import com.miki.bedrockbreaker.block.CrackedBedrockBlock;
import com.miki.bedrockbreaker.block.BedrockOreBlock;
import com.miki.bedrockbreaker.block.BedrockCracksBlock;
import com.miki.bedrockbreaker.BedrockBreakerMod;

public class BedrockBreakerModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BedrockBreakerMod.MODID);
	public static final DeferredBlock<Block> CRACKED_BEDROCK;
	public static final DeferredBlock<Block> BEDROCK_ORE;
	public static final DeferredBlock<Block> NETHER_BEDROCK_ORE;
	public static final DeferredBlock<Block> BEDROCK_CRACKS;
	static {
		CRACKED_BEDROCK = REGISTRY.register("cracked_bedrock", CrackedBedrockBlock::new);
		BEDROCK_ORE = REGISTRY.register("bedrock_ore", BedrockOreBlock::new);
		NETHER_BEDROCK_ORE = REGISTRY.register("nether_bedrock_ore", NetherBedrockOreBlock::new);
		BEDROCK_CRACKS = REGISTRY.register("bedrock_cracks", BedrockCracksBlock::new);
	}
}