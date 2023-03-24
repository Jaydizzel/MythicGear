package com.jaydizzle.mythicgear.entity.client.armor;

import com.jaydizzle.mythicgear.item.VibrantArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class VibrantArmorRenderer extends GeoArmorRenderer<VibrantArmorItem> {
    public VibrantArmorRenderer() {
        super(new VibrantArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}