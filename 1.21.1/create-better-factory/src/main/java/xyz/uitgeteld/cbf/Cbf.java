package xyz.uitgeteld.cbf;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import xyz.uitgeteld.cbf.block.ModBlocks;
import xyz.uitgeteld.cbf.fluid.ModFluidTypes;
import xyz.uitgeteld.cbf.fluid.ModFluids;
import xyz.uitgeteld.cbf.item.ModItems;
import xyz.uitgeteld.cbf.tab.CreativeTab;

@Mod(Cbf.MODID)
public class Cbf {
    public static final String MODID = "cbf";

    public Cbf(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        ModFluidTypes.FLUID_TYPES.register(modEventBus);
        ModFluids.FLUIDS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        CreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }
}
