package xyz.uitgeteld.cbf.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xyz.uitgeteld.cbf.Cbf;
import xyz.uitgeteld.cbf.fluid.ModFluids;
import xyz.uitgeteld.cbf.item.ModItems;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cbf.MODID);

    public static final RegistryObject<CreativeModeTab> CBF_TAB =
            CREATIVE_MODE_TABS.register("cbf", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cbf"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModFluids.MOLTEN_IRON.getBucket().get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RAW_IRON_CHUNK.get());
                        output.accept(ModItems.RAW_COPPER_CHUNK.get());
                        output.accept(ModItems.RAW_ZINC_CHUNK.get());
                        output.accept(ModItems.RAW_GOLD_CHUNK.get());
                        output.accept(ModItems.DEEPSLATE_CHUNK.get());
                        output.accept(ModFluids.MOLTEN_IRON.getBucket().get());
                        output.accept(ModFluids.MOLTEN_COPPER.getBucket().get());
                        output.accept(ModFluids.MOLTEN_ZINC.getBucket().get());
                        output.accept(ModFluids.MOLTEN_GOLD.getBucket().get());
                        output.accept(ModFluids.MOLTEN_BRASS.getBucket().get());
                        output.accept(ModFluids.HEAVY_METAL.getBucket().get());
                        output.accept(ModFluids.IRRIATED_MIX.getBucket().get());
                    }).build());
}

