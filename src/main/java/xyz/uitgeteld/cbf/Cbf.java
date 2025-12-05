package xyz.uitgeteld.cbf;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import xyz.uitgeteld.cbf.block.ModBlocks;
import xyz.uitgeteld.cbf.fluid.ModFluidTypes;
import xyz.uitgeteld.cbf.fluid.ModFluids;
import xyz.uitgeteld.cbf.item.ModItems;
import xyz.uitgeteld.cbf.tab.CreativeTab;

@Mod(Cbf.MODID)
public class Cbf {
    public static final String MODID = "cbf";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Cbf() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        modEventBus.addListener(this::commonSetup);

        ModFluidTypes.FLUID_TYPES.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModFluids.FLUIDS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        CreativeTab.CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onCommandRegister(RegisterCommandsEvent event) {
    }
}

