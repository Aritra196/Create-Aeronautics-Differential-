package com.aritra.dwb_differential.block;

import com.aritra.dwb_differential.DWBDifferentialMod;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DWBDifferentialMod.MOD_ID);

    public static final DeferredBlock<DriveByWireDifferentialBlock> DRIVE_BY_WIRE_DIFFERENTIAL =
            BLOCKS.register("drive_by_wire_differential", () -> new DriveByWireDifferentialBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.METAL)
                            .strength(1.5F)
                            .sound(SoundType.METAL)
                            .requiresCorrectToolForDrops()
                            .noOcclusion()
            ));
}
