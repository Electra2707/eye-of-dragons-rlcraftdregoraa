package de.curlybracket.eyeofdragons;

import com.github.alexthe666.iceandfire.entity.EntityDragonBase;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import com.github.alexthe666.iceandfire.entity.EntityLightningDragon;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;

public class ItemIceDragonEye extends ItemEyeBase {
    public ItemIceDragonEye() {
        super("eye_of_icedragon");
    }

    @Override
    protected List<Entity> getNearbyEntities(World world, EntityPlayer player) {
        AxisAlignedBB bb = new AxisAlignedBB(player.getPosition()).grow(500);
        List<Entity> entities = world.getEntitiesWithinAABB(EntityIceDragon.class, bb);

        // Filter out tamed and dead dragons
        entities.removeIf(entity -> entity instanceof EntityDragonBase &&
                ((EntityDragonBase) entity).isModelDead() ||
                ((EntityDragonBase) entity).isTamed());

        return entities;
    }

    @Override
    protected EntityEyeBase createEntity(World world, EntityPlayer player, ItemStack itemstack) {
        return new EntityIceDragonEye(world, player.posX, player.posY + player.height, player.posZ,
                getDamage(itemstack));
    }
}
