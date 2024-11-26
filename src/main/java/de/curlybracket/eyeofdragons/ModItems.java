package de.curlybracket.eyeofdragons;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModItems {
    public static Item eye_of_firedragon;
    public static Item eye_of_icedragon;
    public static Item eye_of_lightningdragon;
    public static Item eye_of_hydra;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        eye_of_firedragon = new ItemFireDragonEye().setCreativeTab(ModCreativeTabs.EYE_OF_DRAGONS_TAB);
        event.getRegistry().register(eye_of_firedragon);

        eye_of_icedragon = new ItemIceDragonEye().setCreativeTab(ModCreativeTabs.EYE_OF_DRAGONS_TAB);
        event.getRegistry().register(eye_of_icedragon);

        eye_of_lightningdragon = new ItemLightningDragonEye().setCreativeTab(ModCreativeTabs.EYE_OF_DRAGONS_TAB);
        event.getRegistry().register(eye_of_lightningdragon);

        eye_of_hydra = new ItemHydraEye().setCreativeTab(ModCreativeTabs.EYE_OF_DRAGONS_TAB);
        event.getRegistry().register(eye_of_hydra);
    }
}