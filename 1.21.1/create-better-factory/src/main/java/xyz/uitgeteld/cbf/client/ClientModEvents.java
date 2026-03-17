package xyz.uitgeteld.cbf.client;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

import xyz.uitgeteld.cbf.fluid.FluidRegistrationHelper;
import xyz.uitgeteld.cbf.fluid.ModFluidTypes;
import xyz.uitgeteld.cbf.fluid.ModFluids;

import static xyz.uitgeteld.cbf.Cbf.MODID;

@EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_IRON.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_IRON_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_COPPER.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_COPPER_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_ZINC.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_ZINC_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_GOLD.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_GOLD_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_BRASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_BRASS_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.HEAVY_METAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.HEAVY_METAL_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.IRRADIATED_MIX.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.IRRADIATED_MIX_FLOWING.get(), RenderType.translucent());
    }

    @SubscribeEvent
    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
        event.registerFluidType(
                FluidRegistrationHelper.createClientExtensions("molten_iron"),
                ModFluidTypes.MOLTEN_IRON_TYPE.get());

        event.registerFluidType(
                FluidRegistrationHelper.createClientExtensions("molten_copper"),
                ModFluidTypes.MOLTEN_COPPER_TYPE.get());

        event.registerFluidType(
                FluidRegistrationHelper.createClientExtensions("molten_zinc"),
                ModFluidTypes.MOLTEN_ZINC_TYPE.get());

        event.registerFluidType(
                FluidRegistrationHelper.createClientExtensions("molten_gold"),
                ModFluidTypes.MOLTEN_GOLD_TYPE.get());

        event.registerFluidType(
                FluidRegistrationHelper.createClientExtensions("molten_brass"),
                ModFluidTypes.BRASS_TYPE.get());

        event.registerFluidType(
                FluidRegistrationHelper.createClientExtensions("heavy_metal"),
                ModFluidTypes.HEAVY_METAL_TYPE.get());

        event.registerFluidType(
                FluidRegistrationHelper.createClientExtensions("irradiated_mix"),
                ModFluidTypes.IRRADIATED_MIX_TYPE.get());
    }
}