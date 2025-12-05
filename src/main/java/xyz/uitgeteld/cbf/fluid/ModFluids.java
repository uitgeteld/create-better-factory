package xyz.uitgeteld.cbf.fluid;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.uitgeteld.cbf.block.ModBlocks;
import xyz.uitgeteld.cbf.item.ModItems;

import static xyz.uitgeteld.cbf.Cbf.MODID;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, MODID);

    public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_IRON =
            FLUIDS.register("molten_iron",
                    () -> new ForgeFlowingFluid.Source(getMoltenIronProperties()));

    public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_IRON_FLOWING =
            FLUIDS.register("molten_iron_flowing",
                    () -> new ForgeFlowingFluid.Flowing(getMoltenIronProperties()));

    private static ForgeFlowingFluid.Properties getMoltenIronProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.MOLTEN_IRON_TYPE,
                MOLTEN_IRON,
                MOLTEN_IRON_FLOWING,
                () -> (LiquidBlock) ModBlocks.MOLTEN_IRON_BLOCK.get(),
                ModItems.MOLTEN_IRON_BUCKET
        );
    }

}
