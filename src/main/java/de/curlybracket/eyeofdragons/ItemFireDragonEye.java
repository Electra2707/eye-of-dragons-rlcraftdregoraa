package de.curlybracket.eyeofdragons;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import com.github.alexthe666.iceandfire.entity.EntityDragonBase;
import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;

import java.util.List;

public class ItemFireDragonEye extends ItemEyeBase {
    public ItemFireDragonEye() {
        super("eye_of_firedragon");
    }

    @Override
    protected List<Entity> getNearbyEntities(World world, EntityPlayer player) {
        AxisAlignedBB bb = new AxisAlignedBB(player.getPosition()).grow(500);
        List<Entity> entities = world.getEntitiesWithinAABB(EntityFireDragon.class, bb);

        // Filter out tamed and dead dragons
        entities.removeIf(entity -> entity instanceof EntityDragonBase &&
                ((EntityDragonBase) entity).isModelDead() ||
                ((EntityDragonBase) entity).isTamed()); // Change isTame() to isTamed() or the correct method

        return entities;
    }

    @Override
    protected EntityEyeBase createEntity(World world, EntityPlayer player, ItemStack itemstack) {
        return new EntityFireDragonEye(world, player.posX, player.posY + player.height, player.posZ,
                getDamage(itemstack));
    }
}
