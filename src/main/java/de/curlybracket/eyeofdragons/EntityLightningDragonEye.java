package de.curlybracket.eyeofdragons;

import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityLightningDragonEye extends EntityEyeBase {
    public EntityLightningDragonEye(World world) {
        super(world);
    }

    public EntityLightningDragonEye(World world, double x, double y, double z, int id) {
        super(world, x, y, z, id);
    }

    @Override
    protected Item getDropItem() {
        return ModItems.eye_of_lightningdragon;
    }
}