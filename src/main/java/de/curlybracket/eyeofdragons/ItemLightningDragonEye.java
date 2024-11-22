package de.curlybracket.eyeofdragons;

import com.github.alexthe666.iceandfire.entity.EntityLightningDragon;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;

public class ItemLightningDragonEye extends ItemEyeBase {
    public ItemLightningDragonEye() {
        super("eye_of_lightningdragon");
    }

    @Override
    protected List<Entity> getNearbyEntities(World world, EntityPlayer player) {
        AxisAlignedBB bb = new AxisAlignedBB(player.getPosition()).grow(500);
        return world.getEntitiesWithinAABB(EntityLightningDragon.class, bb);
    }

    @Override
    protected EntityEyeBase createEntity(World world, EntityPlayer player, ItemStack itemstack) {
        return new EntityLightningDragonEye(world, player.posX, player.posY + player.height, player.posZ, getDamage(itemstack));
    }
}
