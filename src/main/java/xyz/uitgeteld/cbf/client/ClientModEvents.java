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
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_IRON.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_IRON_FLOWING.get(), RenderType.translucent());    }
}
