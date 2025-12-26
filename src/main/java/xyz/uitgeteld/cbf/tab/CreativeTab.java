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
                        ModItems.getAllItems().forEach(item -> output.accept(item.get()));
                        ModFluids.getAllFluids().forEach(fluid -> output.accept(fluid.getBucket().get()));
                    }).build());
}
