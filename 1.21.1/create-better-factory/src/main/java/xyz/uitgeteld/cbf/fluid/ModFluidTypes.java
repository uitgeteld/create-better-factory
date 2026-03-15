package xyz.uitgeteld.cbf.fluid;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;

import static xyz.uitgeteld.cbf.Cbf.MODID;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, MODID);

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_IRON_TYPE =
            FLUID_TYPES.register("molten_iron",
                    () -> new FluidType(FluidRegistrationHelper.createMoltenFluidTypeProperties()));

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_COPPER_TYPE =
            FLUID_TYPES.register("molten_copper",
                    () -> new FluidType(FluidRegistrationHelper.createMoltenFluidTypeProperties()));

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_ZINC_TYPE =
            FLUID_TYPES.register("molten_zinc",
                    () -> new FluidType(FluidRegistrationHelper.createMoltenFluidTypeProperties()));

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_GOLD_TYPE =
            FLUID_TYPES.register("molten_gold",
                    () -> new FluidType(FluidRegistrationHelper.createMoltenFluidTypeProperties()));

    public static final DeferredHolder<FluidType, FluidType> BRASS_TYPE =
            FLUID_TYPES.register("molten_brass",
                    () -> new FluidType(FluidRegistrationHelper.createMoltenFluidTypeProperties()));

    public static final DeferredHolder<FluidType, FluidType> HEAVY_METAL_TYPE =
            FLUID_TYPES.register("heavy_metal",
                    () -> new FluidType(FluidRegistrationHelper.createMoltenFluidTypeProperties()));

    public static final DeferredHolder<FluidType, FluidType> IRRADIATED_MIX_TYPE =
            FLUID_TYPES.register("irradiated_mix",
                    () -> new FluidType(FluidRegistrationHelper.createMoltenFluidTypeProperties()));
}