package xyz.uitgeteld.cbf.item;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.uitgeteld.cbf.Cbf;
import xyz.uitgeteld.cbf.fluid.ModFluids;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cbf.MODID);

    public static final RegistryObject<Item> RAW_IRON_CHUNK = ITEMS.register("raw_iron_chunk", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COPPER_CHUNK = ITEMS.register("raw_copper_chunk", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ZINC_CHUNK = ITEMS.register("raw_zinc_chunk", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BRASS_CHUNK = ITEMS.register("raw_brass_chunk", () -> new Item(new Item.Properties()));


    public static final RegistryObject<BucketItem> MOLTEN_IRON_BUCKET =
            ITEMS.register("molten_iron_bucket",
                    () -> new BucketItem(ModFluids.MOLTEN_IRON,
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));

    public static final RegistryObject<BucketItem> MOLTEN_COPPER_BUCKET =
            ITEMS.register("molten_copper_bucket",
                    () -> new BucketItem(ModFluids.MOLTEN_COPPER,
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));

    public static final RegistryObject<BucketItem> MOLTEN_ZINC_BUCKET =
            ITEMS.register("molten_zinc_bucket",
                    () -> new BucketItem(ModFluids.MOLTEN_ZINC,
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));

    public static final RegistryObject<BucketItem> MOLTEN_BRASS_BUCKET =
            ITEMS.register("molten_brass_bucket",
                    () -> new BucketItem(ModFluids.MOLTEN_BRASS,
                            new Item.Properties()
                                    .craftRemainder(Items.BUCKET)
                                    .stacksTo(1)));
}
