package com.jaydizzle.mythicgear.entity.client.armor;

import com.jaydizzle.mythicgear.MythicGear;
import com.jaydizzle.mythicgear.item.VibrantArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VibrantArmorModel extends AnimatedGeoModel<VibrantArmorItem> {
    @Override
    public ResourceLocation getModelResource(VibrantArmorItem object) {
        return new ResourceLocation(MythicGear.MOD_ID, "geo/vibrant_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(VibrantArmorItem object) {
        return new ResourceLocation(MythicGear.MOD_ID, "textures/models/armor/vibrant_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(VibrantArmorItem animatable) {
        return new ResourceLocation(MythicGear.MOD_ID, "animations/armor_animations.json");
    }
}