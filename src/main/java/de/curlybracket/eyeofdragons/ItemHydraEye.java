package de.curlybracket.eyeofdragons;

import com.github.alexthe666.iceandfire.entity.EntityHydra;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;

public class ItemHydraEye extends ItemEyeBase {
    public ItemHydraEye() {
        super("eye_of_hydra");
    }

    @Override
    protected List<Entity> getNearbyEntities(World world, EntityPlayer player) {
        AxisAlignedBB bb = new AxisAlignedBB(player.getPosition()).grow(500);
        return world.getEntitiesWithinAABB(EntityHydra.class, bb);
    }

    @Override
    protected EntityEyeBase createEntity(World world, EntityPlayer player, ItemStack itemstack) {
        return new EntityHydraEye(world, player.posX, player.posY + player.height, player.posZ, getDamage(itemstack));
    }
}
