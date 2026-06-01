/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.miki.bedrockbreaker.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.miki.bedrockbreaker.BedrockBreakerMod;

public class BedrockBreakerModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BedrockBreakerMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BEDROCK_BREAKER = REGISTRY.register("bedrock_breaker",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bedrockbreaker.bedrock_breaker")).icon(() -> new ItemStack(BedrockBreakerModItems.BEDROCK_SHARD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BedrockBreakerModItems.BEDROCK_PICKAXE.get());
				tabData.accept(BedrockBreakerModBlocks.CRACKED_BEDROCK.get().asItem());
				tabData.accept(BedrockBreakerModItems.BEDROCK_NUGGET.get());
				tabData.accept(BedrockBreakerModItems.BEDROCK_SHARD.get());
				tabData.accept(BedrockBreakerModItems.MOLTEN_BEDROCK.get());
				tabData.accept(BedrockBreakerModItems.BEDROCK_INGOT.get());
				tabData.accept(BedrockBreakerModBlocks.BEDROCK_ORE.get().asItem());
				tabData.accept(BedrockBreakerModBlocks.NETHER_BEDROCK_ORE.get().asItem());
			}).withSearchBar().build());
}