package com.jaydizzle.mythicgear.event;

import com.jaydizzle.mythicgear.MythicGear;
import com.jaydizzle.mythicgear.entity.client.armor.VibrantArmorRenderer;
import com.jaydizzle.mythicgear.item.VibrantArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = MythicGear.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class JDEventBusEvents {

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(VibrantArmorItem.class, new VibrantArmorRenderer());
    }
}