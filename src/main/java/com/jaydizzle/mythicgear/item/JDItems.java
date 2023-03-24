package com.jaydizzle.mythicgear.item;

import com.jaydizzle.mythicgear.MythicGear;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JDItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MythicGear.MOD_ID);

    public static final RegistryObject<Item> VIBRANT_HELMET = ITEMS.register("vibrant_helmet",
            () -> new VibrantArmorItem(JDArmorMaterials.VIBRANT, EquipmentSlot.HEAD, new Item.Properties().tab(JDCreativeModeTab.MYTHIC_TAB)));
    public static final RegistryObject<Item> VIBRANT_CHESTPLATE = ITEMS.register("vibrant_chestplate",
            () -> new VibrantArmorItem(JDArmorMaterials.VIBRANT, EquipmentSlot.CHEST, new Item.Properties().tab(JDCreativeModeTab.MYTHIC_TAB)));
    public static final RegistryObject<Item> VIBRANT_LEGGINGS = ITEMS.register("vibrant_leggings",
            () -> new VibrantArmorItem(JDArmorMaterials.VIBRANT, EquipmentSlot.LEGS, new Item.Properties().tab(JDCreativeModeTab.MYTHIC_TAB)));
    public static final RegistryObject<Item> VIBRANT_BOOTS = ITEMS.register("vibrant_boots",
            () -> new VibrantArmorItem(JDArmorMaterials.VIBRANT, EquipmentSlot.FEET, new Item.Properties().tab(JDCreativeModeTab.MYTHIC_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
