package xyz.uitgeteld.cbf.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class QuartzTier implements Tier {
    
    public static final QuartzTier INSTANCE = new QuartzTier();
    
    @Override
    public int getUses() {
        return 250;
    }

    @Override
    public float getSpeed() {
        return 10.0f;
    }

    @Override
    public float getAttackDamageBonus() {
        return 1.0f;
    }

    @Override
    public int getLevel() {
        return 2;
    }

    @Override
    public int getEnchantmentValue() {
        return 18;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return Ingredient.of(ModItems.QUARTZ_SHARD.get());
    }
}
