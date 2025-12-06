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

    public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_COPPER =
            FLUIDS.register("molten_copper",
                    () -> new ForgeFlowingFluid.Source(getMoltenCopperProperties()));

    public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_ZINC =
            FLUIDS.register("molten_zinc",
                    () -> new ForgeFlowingFluid.Source(getMoltenZincProperties()));

    public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_BRASS =
            FLUIDS.register("molten_brass",
                    () -> new ForgeFlowingFluid.Source(getMoltenBrassProperties()));

    public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_IRON_FLOWING =
            FLUIDS.register("molten_iron_flowing",
                    () -> new ForgeFlowingFluid.Flowing(getMoltenIronProperties()));

    public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_COPPER_FLOWING =
            FLUIDS.register("molten_copper_flowing",
                    () -> new ForgeFlowingFluid.Flowing(getMoltenCopperProperties()));

    public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_ZINC_FLOWING =
            FLUIDS.register("molten_zinc_flowing",
                    () -> new ForgeFlowingFluid.Flowing(getMoltenZincProperties()));

    public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_BRASS_FLOWING =
            FLUIDS.register("molten_brass_flowing",
                    () -> new ForgeFlowingFluid.Flowing(getMoltenBrassProperties()));


    private static ForgeFlowingFluid.Properties getMoltenIronProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.MOLTEN_IRON_TYPE,
                MOLTEN_IRON,
                MOLTEN_IRON_FLOWING,
                () -> (LiquidBlock) ModBlocks.MOLTEN_IRON_BLOCK.get(),
                ModItems.MOLTEN_IRON_BUCKET
        );
    }

    private static ForgeFlowingFluid.Properties getMoltenCopperProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.MOLTEN_COPPER_TYPE,
                MOLTEN_COPPER,
                MOLTEN_COPPER_FLOWING,
                () -> (LiquidBlock) ModBlocks.MOLTEN_COPPER_BLOCK.get(),
                ModItems.MOLTEN_COPPER_BUCKET
        );
    }

    private static ForgeFlowingFluid.Properties getMoltenZincProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.MOLTEN_ZINC_TYPE,
                MOLTEN_ZINC,
                MOLTEN_ZINC_FLOWING,
                () -> (LiquidBlock) ModBlocks.MOLTEN_ZINC_BLOCK.get(),
                ModItems.MOLTEN_ZINC_BUCKET
        );
    }

    private static ForgeFlowingFluid.Properties getMoltenBrassProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.MOLTEN_BRASS_TYPE,
                MOLTEN_BRASS,
                MOLTEN_BRASS_FLOWING,
                () -> (LiquidBlock) ModBlocks.MOLTEN_BRASS_BLOCK.get(),
                ModItems.MOLTEN_BRASS_BUCKET
        );
    }
}
