package tfar.classicscapeorigins;

import net.minecraft.client.renderer.entity.EntityRenderers;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ClassicScapeOriginsClient {

    public static void renderers() {
        EntityRenderers.register(Init.FEATHER,context -> new GeoEntityRenderer<>(context,new DefaultedEntityGeoModel<>(Constants.id("feather"))));
    }

}
