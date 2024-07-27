package net.zardian.monstersandgirlsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zardian.monstersandgirlsmod.MonstersAndGirlsMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MonstersAndGirlsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAG_Tab = CREATIVE_MODE_TABS.register("monstersandgirls_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DRACONIAN_GEM.get()))
            .title(Component.translatable("creativetab.monstersandgirls_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.DRACONIAN_GEM.get());
                pOutput.accept(ModItems.DRACONIAN_RAW.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
