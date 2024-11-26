package de.curlybracket.eyeofdragons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {
    public static final CreativeTabs EYE_OF_DRAGONS_TAB = new CreativeTabs("eye_of_dragons") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.eye_of_hydra); // Change this to your desired item
        }

        @Override
        public String getTabLabel() {
            return "eye_of_dragons"; // This is the identifier used in the lang file
        }
    };
}