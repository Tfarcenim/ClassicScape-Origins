package tfar.classicscapeorigins;

import net.fabricmc.api.ClientModInitializer;

public class ClassicScapeOriginsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClassicScapeOriginsClient.renderers();
    }
}
