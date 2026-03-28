package xyz.uitgeteld.cbf.fluid;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import xyz.uitgeteld.cbf.block.ModBlocks;
import xyz.uitgeteld.cbf.item.ModItems;

import static xyz.uitgeteld.cbf.Cbf.MODID;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(Registries.FLUID, MODID);

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> MOLTEN_IRON =
            FLUIDS.register("molten_iron",
                    () -> new BaseFlowingFluid.Source(getMoltenIronProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> MOLTEN_IRON_FLOWING =
            FLUIDS.register("molten_iron_flowing",
                    () -> new BaseFlowingFluid.Flowing(getMoltenIronProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> MOLTEN_COPPER =
            FLUIDS.register("molten_copper",
                    () -> new BaseFlowingFluid.Source(getMoltenCopperProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> MOLTEN_COPPER_FLOWING =
            FLUIDS.register("molten_copper_flowing",
                    () -> new BaseFlowingFluid.Flowing(getMoltenCopperProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> MOLTEN_ZINC =
            FLUIDS.register("molten_zinc",
                    () -> new BaseFlowingFluid.Source(getMoltenZincProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> MOLTEN_ZINC_FLOWING =
            FLUIDS.register("molten_zinc_flowing",
                    () -> new BaseFlowingFluid.Flowing(getMoltenZincProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> MOLTEN_GOLD =
            FLUIDS.register("molten_gold",
                    () -> new BaseFlowingFluid.Source(getMoltenGoldProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> MOLTEN_GOLD_FLOWING =
            FLUIDS.register("molten_gold_flowing",
                    () -> new BaseFlowingFluid.Flowing(getMoltenGoldProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> MOLTEN_BRASS =
            FLUIDS.register("molten_brass",
                    () -> new BaseFlowingFluid.Source(getBrassProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> MOLTEN_BRASS_FLOWING =
            FLUIDS.register("molten_brass_flowing",
                    () -> new BaseFlowingFluid.Flowing(getBrassProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> HEAVY_METAL =
            FLUIDS.register("heavy_metal",
                    () -> new BaseFlowingFluid.Source(getHeavyMetalProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> HEAVY_METAL_FLOWING =
            FLUIDS.register("heavy_metal_flowing",
                    () -> new BaseFlowingFluid.Flowing(getHeavyMetalProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> IRRADIATED_MIX =
            FLUIDS.register("irradiated_mix",
                    () -> new BaseFlowingFluid.Source(getIrradiatedMixProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> IRRADIATED_MIX_FLOWING =
            FLUIDS.register("irradiated_mix_flowing",
                    () -> new BaseFlowingFluid.Flowing(getIrradiatedMixProperties()));

    private static BaseFlowingFluid.Properties getMoltenIronProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.MOLTEN_IRON_TYPE,
                MOLTEN_IRON,
                MOLTEN_IRON_FLOWING,
                () -> (LiquidBlock) ModBlocks.MOLTEN_IRON_BLOCK.get(),
                ModItems.MOLTEN_IRON_BUCKET
        );
    }

    private static BaseFlowingFluid.Properties getMoltenCopperProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.MOLTEN_COPPER_TYPE,
                MOLTEN_COPPER,
                MOLTEN_COPPER_FLOWING,
                () -> (LiquidBlock) ModBlocks.MOLTEN_COPPER_BLOCK.get(),
                ModItems.MOLTEN_COPPER_BUCKET
        );
    }

    private static BaseFlowingFluid.Properties getMoltenZincProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.MOLTEN_ZINC_TYPE,
                MOLTEN_ZINC,
                MOLTEN_ZINC_FLOWING,
                () -> (LiquidBlock) ModBlocks.MOLTEN_ZINC_BLOCK.get(),
                ModItems.MOLTEN_ZINC_BUCKET
        );
    }

    private static BaseFlowingFluid.Properties getMoltenGoldProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.MOLTEN_GOLD_TYPE,
                MOLTEN_GOLD,
                MOLTEN_GOLD_FLOWING,
                () -> (LiquidBlock) ModBlocks.MOLTEN_GOLD_BLOCK.get(),
                ModItems.MOLTEN_GOLD_BUCKET
        );
    }

    private static BaseFlowingFluid.Properties getBrassProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.BRASS_TYPE,
                MOLTEN_BRASS,
                MOLTEN_BRASS_FLOWING,
                () -> (LiquidBlock) ModBlocks.MOLTEN_BRASS_BLOCK.get(),
                ModItems.MOLTEN_BRASS_BUCKET
        );
    }

    private static BaseFlowingFluid.Properties getHeavyMetalProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.HEAVY_METAL_TYPE,
                HEAVY_METAL,
                HEAVY_METAL_FLOWING,
                () -> (LiquidBlock) ModBlocks.HEAVY_METAL_BLOCK.get(),
                ModItems.HEAVY_METAL_BUCKET
        );
    }

        private static BaseFlowingFluid.Properties getIrradiatedMixProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                ModFluidTypes.IRRADIATED_MIX_TYPE,
                IRRADIATED_MIX,
                IRRADIATED_MIX_FLOWING,
                () -> (LiquidBlock) ModBlocks.IRRADIATED_MIX_BLOCK.get(),
                ModItems.IRRADIATED_MIX_BUCKET
        );
    }
}