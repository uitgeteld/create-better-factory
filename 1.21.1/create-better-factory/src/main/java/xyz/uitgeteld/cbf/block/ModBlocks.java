package xyz.uitgeteld.cbf.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import xyz.uitgeteld.cbf.fluid.FluidRegistrationHelper;
import xyz.uitgeteld.cbf.fluid.ModFluids;

import static xyz.uitgeteld.cbf.Cbf.MODID;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(Registries.BLOCK, MODID);

    public static final DeferredHolder<Block, LiquidBlock> MOLTEN_IRON_BLOCK =
            BLOCKS.register("molten_iron_block",
                    () -> new LiquidBlock(ModFluids.MOLTEN_IRON.get(),
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));

    public static final DeferredHolder<Block, LiquidBlock> MOLTEN_COPPER_BLOCK =
            BLOCKS.register("molten_copper_block",
                    () -> new LiquidBlock(ModFluids.MOLTEN_COPPER.get(),
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));

    public static final DeferredHolder<Block, LiquidBlock> MOLTEN_ZINC_BLOCK =
            BLOCKS.register("molten_zinc_block",
                    () -> new LiquidBlock(ModFluids.MOLTEN_ZINC.get(),
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));

    public static final DeferredHolder<Block, LiquidBlock> MOLTEN_GOLD_BLOCK =
            BLOCKS.register("molten_gold_block",
                    () -> new LiquidBlock(ModFluids.MOLTEN_GOLD.get(),
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));

    public static final DeferredHolder<Block, LiquidBlock> MOLTEN_BRASS_BLOCK =
            BLOCKS.register("molten_brass_block",
                    () -> new LiquidBlock(ModFluids.MOLTEN_BRASS.get(),
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));

    public static final DeferredHolder<Block, LiquidBlock> HEAVY_METAL_BLOCK =
            BLOCKS.register("heavy_metal_block",
                    () -> new LiquidBlock(ModFluids.HEAVY_METAL.get(),
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));

    public static final DeferredHolder<Block, LiquidBlock> IRRADIATED_MIX_BLOCK =
            BLOCKS.register("irradiated_mix_block",
                    () -> new LiquidBlock(ModFluids.IRRADIATED_MIX.get(),
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));
}