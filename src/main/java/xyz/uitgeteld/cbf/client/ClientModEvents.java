package xyz.uitgeteld.cbf.client;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import xyz.uitgeteld.cbf.Cbf;
import xyz.uitgeteld.cbf.fluid.ModFluids;

@Mod.EventBusSubscriber(modid = Cbf.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientModEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        setFluidRenderLayer(ModFluids.MOLTEN_IRON);
        setFluidRenderLayer(ModFluids.MOLTEN_COPPER);
        setFluidRenderLayer(ModFluids.MOLTEN_ZINC);
        setFluidRenderLayer(ModFluids.MOLTEN_GOLD);
        setFluidRenderLayer(ModFluids.MOLTEN_BRASS);
        setFluidRenderLayer(ModFluids.HEAVY_METAL);
        setFluidRenderLayer(ModFluids.IRRIATED_MIX);
    }

    private static void setFluidRenderLayer(xyz.uitgeteld.cbf.fluid.FluidRegistry fluid) {
        ItemBlockRenderTypes.setRenderLayer(fluid.getSource().get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(fluid.getFlowing().get(), RenderType.translucent());
    }
}
