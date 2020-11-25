package me.sentryozvn.disguisecookies;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public class DisguiseCookie extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

//        if (cfg.getBoolean("options.auto-update")) {
//            // You could start an Auto-Updater for example
//        }

        ItemStack categoryItem = new CustomItem(Material.COOKIE, "&4Disguise Cookies", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey categoryId = new NamespacedKey(this, "disguise_cookie");
        Category category = new Category(categoryId, categoryItem);

        createCookie(category, "Cow", new ItemStack(Material.BEEF), new ItemStack(Material.LEATHER));
    }
    public void createCookie(
            Category category,
            String type,
            ItemStack material1,
            ItemStack material2
    ){
        SlimefunItemStack slimefunItem =
                new SlimefunItemStack(
                        "DISGUISE_COOKIE_"+ type.toUpperCase() ,
                        Material.COOKIE,
                        "&4Disguise Cookie", "&7Type: " + type);

        ItemStack[] recipe = {
                SlimefunItems.MAGIC_LUMP_3,
                material1,
                SlimefunItems.ENDER_LUMP_3,
                material2,
                new ItemStack(Material.COOKIE),
                material2,
                SlimefunItems.ENDER_LUMP_3,
                material1,
                SlimefunItems.MAGIC_LUMP_3,
        };
        DisguiseCookieHandle item = new DisguiseCookieHandle(category, slimefunItem, RecipeType.MAGIC_WORKBENCH, recipe);
//        SlimefunItem item =
//                new SlimefunItem(category, slimefunItem, RecipeType.MAGIC_WORKBENCH, recipe);
        item.register(this);
    }
    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}
