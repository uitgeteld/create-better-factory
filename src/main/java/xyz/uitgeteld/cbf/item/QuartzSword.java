package xyz.uitgeteld.cbf.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public class QuartzSword extends SwordItem {
    public QuartzSword(Properties properties) {
        super(Tiers.IRON, 3, -2.4f, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
        boolean hitSuccess = super.hurtEnemy(itemStack, target, attacker);
        
        if (hitSuccess) {
            target.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 0));
        }
        
        return hitSuccess;
    }
}
