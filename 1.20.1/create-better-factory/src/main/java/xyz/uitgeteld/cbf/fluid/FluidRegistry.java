package xyz.uitgeteld.cbf.fluid;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;

public class FluidRegistry {
    private final String name;
    private final RegistryObject<FluidType> fluidType;
    private final RegistryObject<ForgeFlowingFluid.Source> source;
    private final RegistryObject<ForgeFlowingFluid.Flowing> flowing;
    private final RegistryObject<LiquidBlock> block;
    private final RegistryObject<net.minecraft.world.item.BucketItem> bucket;

    public FluidRegistry(String name) {
        this.name = name;
        
        this.fluidType = ModFluidTypes.FLUID_TYPES.register(name,
                () -> new FluidType(FluidRegistrationHelper.createMoltenFluidTypeProperties()) {
                    @Override
                    public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions> consumer) {
                        consumer.accept(FluidRegistrationHelper.createClientExtensions(name));
                    }
                });
        
        this.source = ModFluids.FLUIDS.register(name,
                () -> new ForgeFlowingFluid.Source(getProperties()));
        
        this.flowing = ModFluids.FLUIDS.register(name + "_flowing",
                () -> new ForgeFlowingFluid.Flowing(getProperties()));
        
        this.block = xyz.uitgeteld.cbf.block.ModBlocks.BLOCKS.register(name + "_block",
                () -> new LiquidBlock(source, FluidRegistrationHelper.createMoltenFluidBlockProperties(15)));
        
        this.bucket = xyz.uitgeteld.cbf.item.ModItems.ITEMS.register(name + "_bucket",
                () -> new net.minecraft.world.item.BucketItem(source,
                        new net.minecraft.world.item.Item.Properties()
                                .craftRemainder(net.minecraft.world.item.Items.BUCKET)
                                .stacksTo(1)));
    }

    private ForgeFlowingFluid.Properties getProperties() {
        return FluidRegistrationHelper.createMoltenFluidProperties(
                fluidType,
                source,
                flowing,
                () -> (LiquidBlock) block.get(),
                bucket
        );
    }

    public RegistryObject<FluidType> getFluidType() { return fluidType; }

    public RegistryObject<ForgeFlowingFluid.Source> getSource() { return source; }

    public RegistryObject<ForgeFlowingFluid.Flowing> getFlowing() { return flowing; }

    public RegistryObject<LiquidBlock> getBlock() { return block; }

    public RegistryObject<net.minecraft.world.item.BucketItem> getBucket() { return bucket; }
}
