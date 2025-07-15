package fox.dvd;

import fox.dvd.block.ModBlocks;
import fox.dvd.item.ModItemGroups;
import fox.dvd.item.ModItems;
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
		// 当Minecraft处于可加载模组的状态时，这段代码会立即运行。
		// 然而，某些内容（如资源）可能尚未初始化。
		// 请谨慎操作。
		ModItems.initialize();
		ModItemGroups.initialize();
		ModBlocks.initialize();
		Dvd.LOGGER.info("Initializing");
	}
}