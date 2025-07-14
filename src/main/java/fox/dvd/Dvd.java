package fox.dvd;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dvd implements ModInitializer {
	public static final String MOD_ID = "dvd";

	// 此记录器用于向控制台和日志文件写入文本。
	// 建议使用你的模组ID作为记录器的名称。
	// 这样一来，就能清楚地知道哪些信息、警告和错误是由哪个模组输出的。
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Dvd.LOGGER.info("Initializing");
	}
}