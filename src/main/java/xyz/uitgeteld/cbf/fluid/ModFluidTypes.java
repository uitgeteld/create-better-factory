package xyz.uitgeteld.cbf.fluid;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.RegistryObject;

import static xyz.uitgeteld.cbf.Cbf.MODID;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MODID);

    public static final RegistryObject<FluidType> MOLTEN_IRON_TYPE =
            FLUID_TYPES.register("molten_iron",
                    () -> new FluidType(FluidRegistrationHelper.createMoltenFluidTypeProperties()) {
                        @Override
                        public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions> consumer) {
                            consumer.accept(FluidRegistrationHelper.createClientExtensions("molten_iron"));
                        }
                    });
}
