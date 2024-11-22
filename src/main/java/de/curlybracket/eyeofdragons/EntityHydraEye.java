package de.curlybracket.eyeofdragons;

import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityHydraEye extends EntityEyeBase {
    public EntityHydraEye(World world) {
        super(world);
    }

    public EntityHydraEye(World world, double x, double y, double z, int id) {
        super(world, x, y, z, id);
    }

    @Override
    protected Item getDropItem() {
        return ModItems.eye_of_hydra;
    }
}