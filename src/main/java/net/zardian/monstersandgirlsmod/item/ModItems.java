package net.zardian.monstersandgirlsmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zardian.monstersandgirlsmod.MonstersAndGirlsMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MonstersAndGirlsMod.MOD_ID);

    public  static final RegistryObject<Item> DRACONIAN_GEM = ITEMS.register("draconiangem",
            () -> new Item(new Item.Properties()));
    public  static final RegistryObject<Item> DRACONIAN_RAW = ITEMS.register("rawdraconian",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
