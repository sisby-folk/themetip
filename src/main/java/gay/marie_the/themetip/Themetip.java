package gay.marie_the.themetip;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Themetip implements ModInitializer {
	public static final String MOD_ID = "themetip";
    public static final Logger LOGGER = LoggerFactory.getLogger("themetip");
	public static final ThemetipConfig CONFIG = ThemetipConfig.createToml(FabricLoader.getInstance().getConfigDir(), "", MOD_ID, ThemetipConfig.class);
	public final String version = getClass().getPackage().getImplementationVersion(); // null in dev env

	@Override
	public void onInitialize() {
		LOGGER.info("themetip v{} initialized", version);
	}
}