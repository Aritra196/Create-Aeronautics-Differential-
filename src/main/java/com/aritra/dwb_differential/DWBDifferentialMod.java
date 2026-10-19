package com.aritra.dwb_differential;

import com.aritra.dwb_differential.block.ModBlockEntityTypes;
import com.aritra.dwb_differential.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(DWBDifferentialMod.MOD_ID)
public class DWBDifferentialMod {

    public static final String MOD_ID = "dwb_differential";

    public DWBDifferentialMod(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlockEntityTypes.BLOCK_ENTITY_TYPES.register(modEventBus);
    }
}
