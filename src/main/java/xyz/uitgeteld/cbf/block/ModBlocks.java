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
}
