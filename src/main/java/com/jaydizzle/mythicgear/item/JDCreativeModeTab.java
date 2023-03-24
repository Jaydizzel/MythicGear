package com.jaydizzle.mythicgear.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class JDCreativeModeTab {
    public static final CreativeModeTab MYTHIC_TAB = new CreativeModeTab("mythicModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(JDItems.VIBRANT_BOOTS.get());
        }
    };
}

