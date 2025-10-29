package ch.bhstudios.bhmaterialsandmetals.item;

import ch.bhstudios.bhmaterialsandmetals.BhMaterialsAndMetals;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS=DeferredRegister.createItems(BhMaterialsAndMetals.MOD_ID);

    public static final DeferredItem<Item> RAW_MYTHRILL = ITEMS.register("raw_mythrill",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MYTHRILL_INGOT = ITEMS.register("mythrill_ingot",
            ()-> new Item(new Item.Properties()));



    public static void  register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

