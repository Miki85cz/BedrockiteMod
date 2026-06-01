package com.miki.bedrockbreaker.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class CrackedBedrockBlock extends Block {
	public CrackedBedrockBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(80f, 1200f).requiresCorrectToolForDrops().pushReaction(PushReaction.BLOCK).instrument(NoteBlockInstrument.BASEDRUM));
	}
}