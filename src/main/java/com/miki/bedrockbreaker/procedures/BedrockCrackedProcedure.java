package com.miki.bedrockbreaker.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import com.miki.bedrockbreaker.init.BedrockBreakerModBlocks;

@EventBusSubscriber(modid = "bedrockbreaker") 
public class BedrockCrackedProcedure {

    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        // Automatically intercept standard survival mining
        if (event.getState().is(BedrockBreakerModBlocks.BEDROCK_CRACKS.get())) {
            event.setCanceled(true);
            executeStageSwap(event.getLevel(), event.getPos());
        }
    }

    // Marked as public so BedrockPickaxeItem can manually invoke it if needed
    public static void executeStageSwap(LevelAccessor world, BlockPos pos) {
        world.setBlock(pos, BedrockBreakerModBlocks.CRACKED_BEDROCK.get().defaultBlockState(), 3);
    }
}