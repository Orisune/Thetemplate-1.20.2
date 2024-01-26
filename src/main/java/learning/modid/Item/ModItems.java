package learning.modid.Item;

import learning.modid.Learning;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem( "ruby", new Item(new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));

    private static void additemstoIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY); entries.add(TOPAZ);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Learning.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Learning.LOGGER.info("Registering Mod items for " + Learning.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::additemstoIngredientItemGroup);
    }
}
