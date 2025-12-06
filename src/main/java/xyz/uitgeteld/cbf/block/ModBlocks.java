package xyz.uitgeteld.cbf.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.uitgeteld.cbf.fluid.FluidRegistrationHelper;
import xyz.uitgeteld.cbf.fluid.ModFluids;

import static xyz.uitgeteld.cbf.Cbf.MODID;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK =
            BLOCKS.register("molten_iron_block",
                    () -> new LiquidBlock(ModFluids.MOLTEN_IRON,
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));

    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK =
            BLOCKS.register("molten_copper_block",
                    () -> new LiquidBlock(ModFluids.MOLTEN_COPPER,
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_BLOCK =
            BLOCKS.register("molten_zinc_block",
                    () -> new LiquidBlock(ModFluids.MOLTEN_ZINC,
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));

    public static final RegistryObject<LiquidBlock> MOLTEN_BRASS_BLOCK =
            BLOCKS.register("molten_brass_block",
                    () -> new LiquidBlock(ModFluids.MOLTEN_BRASS,
                            FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));
}
