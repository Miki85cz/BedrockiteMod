package com.miki.bedrockbreaker.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import com.miki.bedrockbreaker.init.BedrockBreakerModBlocks;

public class BedrockCracksBlock extends Block {
    public BedrockCracksBlock() {
        super(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_GRAY)
            .sound(SoundType.NETHERITE_BLOCK)
            .strength(200f, 1200f)
            .requiresCorrectToolForDrops()
            .pushReaction(PushReaction.BLOCK)
            .instrument(NoteBlockInstrument.BASEDRUM));
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
        return new ItemStack(BedrockBreakerModBlocks.CRACKED_BEDROCK.get());
    }

    @Override
    public void playerDestroy(Level world, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        
        super.playerDestroy(world, player, pos, state, blockEntity, tool);
        
        if (!world.isClientSide) {
            world.setBlock(pos, BedrockBreakerModBlocks.CRACKED_BEDROCK.get().defaultBlockState(), 3);
        }
    }
}