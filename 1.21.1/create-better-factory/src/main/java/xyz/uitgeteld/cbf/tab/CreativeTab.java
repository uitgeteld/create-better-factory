package xyz.uitgeteld.cbf.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.uitgeteld.cbf.Cbf;
import xyz.uitgeteld.cbf.item.ModItems;
import xyz.uitgeteld.cbf.fluid.ModFluids;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cbf.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CBF_TAB =
            CREATIVE_MODE_TABS.register("cbf", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cbf"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.MOLTEN_IRON_BUCKET.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        ModItems.getAllItems().forEach(item -> output.accept(item.get()));
                        output.accept(ModItems.MOLTEN_IRON_BUCKET.get());
                        output.accept(ModItems.MOLTEN_COPPER_BUCKET.get());
                        output.accept(ModItems.MOLTEN_ZINC_BUCKET.get());
                        output.accept(ModItems.MOLTEN_GOLD_BUCKET.get());
                        output.accept(ModItems.MOLTEN_BRASS_BUCKET.get());
                        output.accept(ModItems.HEAVY_METAL_BUCKET.get());
                        output.accept(ModItems.IRRADIATED_MIX_BUCKET.get());
                    }).build());
}
