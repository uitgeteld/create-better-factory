package xyz.uitgeteld.cbf.item;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.uitgeteld.cbf.Cbf;
import xyz.uitgeteld.cbf.fluid.ModFluids;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(Cbf.MODID);

    public static final DeferredItem<Item> RAW_IRON_CHUNK = (DeferredItem<Item>) ITEMS.register("raw_iron_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_COPPER_CHUNK = (DeferredItem<Item>) ITEMS.register("raw_copper_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ZINC_CHUNK = (DeferredItem<Item>) ITEMS.register("raw_zinc_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_GOLD_CHUNK = (DeferredItem<Item>) ITEMS.register("raw_gold_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEEPSLATE_CHUNK = (DeferredItem<Item>) ITEMS.register("deepslate_chunk", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NETHERACK_POWDER = (DeferredItem<Item>) ITEMS.register("netherrack_powder", () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, BucketItem> MOLTEN_IRON_BUCKET =
            ITEMS.register("molten_iron_bucket",
                    () -> new BucketItem(ModFluids.MOLTEN_IRON.get(),
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));

    public static final DeferredHolder<Item, BucketItem> MOLTEN_COPPER_BUCKET =
            ITEMS.register("molten_copper_bucket",
                    () -> new BucketItem(ModFluids.MOLTEN_COPPER.get(),
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));

    public static final DeferredHolder<Item, BucketItem> MOLTEN_ZINC_BUCKET =
            ITEMS.register("molten_zinc_bucket",
                    () -> new BucketItem(ModFluids.MOLTEN_ZINC.get(),
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));

    public static final DeferredHolder<Item, BucketItem> MOLTEN_GOLD_BUCKET =
            ITEMS.register("molten_gold_bucket",
                    () -> new BucketItem(ModFluids.MOLTEN_GOLD.get(),
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));

    public static final DeferredHolder<Item, BucketItem> MOLTEN_BRASS_BUCKET =
            ITEMS.register("molten_brass_bucket",
                    () -> new BucketItem(ModFluids.MOLTEN_BRASS.get(),
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));

    public static final DeferredHolder<Item, BucketItem> HEAVY_METAL_BUCKET =
            ITEMS.register("heavy_metal_bucket",
                    () -> new BucketItem(ModFluids.HEAVY_METAL.get(),
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));

    public static final DeferredHolder<Item, BucketItem> IRRADIATED_MIX_BUCKET =
            ITEMS.register("irradiated_mix_bucket",
                    () -> new BucketItem(ModFluids.IRRADIATED_MIX.get(),
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));

    private static final List<DeferredItem<Item>> ALL_ITEMS = List.of(
           RAW_IRON_CHUNK, RAW_COPPER_CHUNK, RAW_ZINC_CHUNK, RAW_GOLD_CHUNK, DEEPSLATE_CHUNK, NETHERACK_POWDER
    );

    public static List<DeferredItem<Item>> getAllItems() {
        return ALL_ITEMS;
    }

}
