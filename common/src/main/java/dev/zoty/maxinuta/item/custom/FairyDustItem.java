package dev.zoty.maxinuta.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class FairyDustItem extends Item {
    public FairyDustItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext useOnContext) {
        Level level = useOnContext.getLevel();
        BlockPos positionClicked = useOnContext.getClickedPos();
        BlockState state = level.getBlockState(positionClicked);

        boolean didTransform = false;
        if (!level.isClientSide()) {
            Player player = useOnContext.getPlayer();

            if (isValuableBlock(state)) {
                ItemStack itemStack = useOnContext.getItemInHand();
                Inventory inventory = player.getInventory();

                transformBlock(level, positionClicked);

                int itemCount = itemStack.getCount();
                if (itemCount > 1) {
                    itemStack.setCount(itemCount - 1);
                } else {
                    player.getInventory().removeItem(useOnContext.getItemInHand());
                }

                didTransform = true;
            }
        } else {
            if (isValuableBlock(state)) {
                didTransform = true;
            }
        }

        if (didTransform) {
            level.playLocalSound(positionClicked, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1, 1, true);
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.FAIL;
        }
    }

    private void transformBlock(Level level, BlockPos positionClicked) {
        level.setBlock(positionClicked, Blocks.AMETHYST_BLOCK.defaultBlockState(), 1);
    }

    private boolean isValuableBlock(BlockState state) {
        return state.is(Blocks.STONE);
    }
}
