package xyz.uitgeteld.cbf.fluid;

import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static xyz.uitgeteld.cbf.Cbf.MODID;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, MODID);

    public static final FluidRegistry MOLTEN_IRON = new FluidRegistry("molten_iron");
    public static final FluidRegistry MOLTEN_COPPER = new FluidRegistry("molten_copper");
    public static final FluidRegistry MOLTEN_ZINC = new FluidRegistry("molten_zinc");
    public static final FluidRegistry MOLTEN_GOLD = new FluidRegistry("molten_gold");
    public static final FluidRegistry MOLTEN_DIAMOND = new FluidRegistry("molten_diamond");
    public static final FluidRegistry MOLTEN_BRASS = new FluidRegistry("molten_brass");

    public static RegistryObject<ForgeFlowingFluid.Source> getMoltenIronSource() { return MOLTEN_IRON.getSource(); }
    public static RegistryObject<ForgeFlowingFluid.Source> getMoltenCopperSource() { return MOLTEN_COPPER.getSource(); }
    public static RegistryObject<ForgeFlowingFluid.Source> getMoltenZincSource() { return MOLTEN_ZINC.getSource(); }
    public static RegistryObject<ForgeFlowingFluid.Source> getMoltenGoldSource() { return MOLTEN_GOLD.getSource(); }
    public static RegistryObject<ForgeFlowingFluid.Source> getMoltenDiamondSource() { return MOLTEN_DIAMOND.getSource(); }
    public static RegistryObject<ForgeFlowingFluid.Source> getMoltenBrassSource() { return MOLTEN_BRASS.getSource(); }
}
