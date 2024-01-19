package learning.modid;
import learning.modid.Item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Learning implements ModInitializer {
	public static String MOD_ID = "Learning";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
	}
}