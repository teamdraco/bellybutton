package teamdraco.dusted.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamdraco.dusted.Dusted;
import teamdraco.dusted.common.blocks.DustCarpetBlock;

public class DustedBlocks {
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, Dusted.MOD_ID);

    public static final RegistryObject<Block> DUST_BLOCK = REGISTER.register("dust_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(0.5f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> DUST_CARPET = REGISTER.register("dust_carpet", () -> new DustCarpetBlock(BlockBehaviour.Properties.of(Material.DECORATION).strength(0.5f).sound(SoundType.WOOL)));
}