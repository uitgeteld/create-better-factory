package xyz.uitgeteld.cbf.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xyz.uitgeteld.cbf.Cbf;
import xyz.uitgeteld.cbf.item.ModItems;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cbf.MODID);

    public static final RegistryObject<CreativeModeTab> CBF_TAB =
            CREATIVE_MODE_TABS.register("cbf", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cbf"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.MOLTEN_IRON_BUCKET.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RAW_IRON_CHUNK.get());
                        output.accept(ModItems.RAW_COPPER_CHUNK.get());
                        output.accept(ModItems.MOLTEN_IRON_BUCKET.get());
                        output.accept(ModItems.MOLTEN_COPPER_BUCKET.get());
                        output.accept(ModItems.MOLTEN_ZINC_BUCKET.get());
                        output.accept(ModItems.MOLTEN_BRASS_BUCKET.get());
                    }).build());
}

