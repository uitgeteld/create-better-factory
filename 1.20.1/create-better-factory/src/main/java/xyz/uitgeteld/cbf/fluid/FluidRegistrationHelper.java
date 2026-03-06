package xyz.uitgeteld.cbf.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import xyz.uitgeteld.cbf.Cbf;

import java.util.function.Supplier;

public class FluidRegistrationHelper {
    
    public static FluidType.Properties createMoltenFluidTypeProperties() {
        return FluidType.Properties.create()
                .density(3000)
                .viscosity(6000)
                .motionScale(0.007)
                .lightLevel(15)
                .canConvertToSource(true);
    }

    public static FluidType.Properties createMoltenFluidTypeProperties(int density, int viscosity, int lightLevel) {
        return FluidType.Properties.create()
                .density(density)
                .viscosity(viscosity)
                .motionScale(0.007)
                .lightLevel(lightLevel)
                .canConvertToSource(true);
    }

    public static ForgeFlowingFluid.Properties createMoltenFluidProperties(
            RegistryObject<FluidType> fluidType,
            Supplier<? extends ForgeFlowingFluid.Source> source,
            Supplier<? extends ForgeFlowingFluid.Flowing> flowing,
            Supplier<?> block,
            Supplier<?> bucket) {
        return new ForgeFlowingFluid.Properties(fluidType, source, flowing)
                .block((Supplier<? extends LiquidBlock>) block)
                .bucket((Supplier<? extends Item>) bucket)
                .tickRate(30)
                .slopeFindDistance(2)
                .levelDecreasePerBlock(2)
                .explosionResistance(1000f);
    }

    public static BlockBehaviour.Properties createMoltenFluidBlockProperties(int lightLevel) {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .noCollission()
                .strength(100.0F, 100.0F)
                .lightLevel((state) -> lightLevel)
                .noLootTable()
                .replaceable();
    }

    public static IClientFluidTypeExtensions createClientExtensions(String name) {
        return new IClientFluidTypeExtensions() {
            private final ResourceLocation STILL_TEXTURE = new ResourceLocation(
                    Cbf.MODID, "block/" + name + "_still");
            private final ResourceLocation FLOWING_TEXTURE = new ResourceLocation(
                    Cbf.MODID, "block/" + name + "_flow");

            @Override
            public @NotNull ResourceLocation getStillTexture() {
                return STILL_TEXTURE;
            }

            @Override
            public @NotNull ResourceLocation getFlowingTexture() {
                return FLOWING_TEXTURE;
            }
        };
    }
}
