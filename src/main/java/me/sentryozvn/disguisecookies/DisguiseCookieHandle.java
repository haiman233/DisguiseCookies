package me.sentryozvn.disguisecookies;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MobDisguise;
import me.libraryaddict.disguise.disguisetypes.PlayerDisguise;
import me.mrCookieSlime.CSCoreLibPlugin.cscorelib2.inventory.ItemUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.apache.logging.log4j.message.Message;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;
import java.util.Objects;

public class DisguiseCookieHandle extends SlimefunItem {

    public DisguiseCookieHandle(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        ItemUseHandler itemUseHandler = this::onItemRightClick;
        addItemHandler(itemUseHandler);
    }

    private void onItemRightClick(PlayerRightClickEvent event) {
        event.cancel();
        Player player = event.getPlayer();
        //Get lore then get type
        ItemMeta im = event.getItem().getItemMeta();
        assert im != null;
        String type = null;
        if (im.hasLore()){
            for (String line : im.getLore()) {
                if (line.startsWith("Type:") || line.startsWith(ChatColor.GRAY + "Type: ")){
                    type = line.replace(ChatColor.GRAY + "Type: ", "").replace(" ", "_").toUpperCase();
                }
            }
        }


        if(type != null){
            //Start disguise
            MobDisguise mobDisguise = new MobDisguise(DisguiseType.getType(EntityType.valueOf(type)));
            mobDisguise.setEntity(player);
            mobDisguise.startDisguise();

        }else{
            player.sendMessage(ChatColor.GREEN + "This cookie do not have disguise type, please report to admin if this is a error");
        }

        //Consume item and play sound
        player.playSound(player.getEyeLocation(), Sound.ENTITY_GENERIC_EAT, 1, 1);
        ItemUtils.consumeItem(event.getItem(), false);
    }

}