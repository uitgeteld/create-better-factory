package xyz.uitgeteld.cbf.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.uitgeteld.cbf.Cbf;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cbf.MODID);

    public static final RegistryObject<Item> RAW_IRON_CHUNK = ITEMS.register("raw_iron_chunk", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COPPER_CHUNK = ITEMS.register("raw_copper_chunk", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ZINC_CHUNK = ITEMS.register("raw_zinc_chunk", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GOLD_CHUNK = ITEMS.register("raw_gold_chunk", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_CHUNK = ITEMS.register("deepslate_chunk", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERACK_POWDER = ITEMS.register("netherrack_powder", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_SHARD = ITEMS.register("quartz_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword", () -> new QuartzSword(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", () -> new QuartzPickaxe(QuartzTier.INSTANCE, new Item.Properties()));

    private static final List<RegistryObject<Item>> ALL_ITEMS = List.of(
            RAW_IRON_CHUNK, RAW_COPPER_CHUNK, RAW_ZINC_CHUNK, RAW_GOLD_CHUNK, DEEPSLATE_CHUNK, NETHERACK_POWDER, QUARTZ_SHARD,
            QUARTZ_SWORD, QUARTZ_PICKAXE
    );

    public static List<RegistryObject<Item>> getAllItems() {
        return ALL_ITEMS;
    }
}