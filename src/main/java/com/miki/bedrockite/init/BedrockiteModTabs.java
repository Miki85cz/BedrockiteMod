package com.miki.bedrockite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.miki.bedrockite.BedrockiteMod;

public class BedrockiteModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BedrockiteMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BEDROCKITE = REGISTRY.register("bedrockite",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bedrockite.bedrockite")).icon(() -> new ItemStack(BedrockiteModItems.BEDROCK_SHARD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BedrockiteModItems.BEDROCKITE_PICKAXE.get());
				tabData.accept(BedrockiteModBlocks.CRACKED_BEDROCK.get().asItem());
				tabData.accept(BedrockiteModItems.BEDROCK_NUGGET.get());
				tabData.accept(BedrockiteModItems.BEDROCK_SHARD.get());
				tabData.accept(BedrockiteModItems.MOLTEN_BEDROCK.get());
				tabData.accept(BedrockiteModItems.BEDROCKITE_INGOT.get());
				tabData.accept(BedrockiteModBlocks.BEDROCK_ORE.get().asItem());
				tabData.accept(BedrockiteModBlocks.NETHER_BEDROCK_ORE.get().asItem());
				tabData.accept(net.minecraft.world.level.block.Blocks.BEDROCK.asItem());
			}).withSearchBar().build());
}
