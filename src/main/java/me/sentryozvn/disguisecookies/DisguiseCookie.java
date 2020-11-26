package me.sentryozvn.disguisecookies;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.ChatColor;
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

        ItemStack categoryItem = new CustomItem(Material.COOKIE, "&4Disguise Cookies", "", "&4Unstable Build", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey categoryId = new NamespacedKey(this, "disguise_cookie");
        Category category = new Category(categoryId, categoryItem);

        //Friendly mobs
        createCookie(category, "Bat", new ItemStack(Material.BLACK_DYE), new ItemStack(Material.FEATHER));
        createCookie(category, "Bee", new ItemStack(Material.HONEY_BOTTLE), new ItemStack(Material.HONEY_BOTTLE));
        createCookie(category, "Cat", new ItemStack(Material.COD), new ItemStack(Material.SALMON));
        createCookie(category, "Chicken", new ItemStack(Material.FEATHER), new ItemStack(Material.CHICKEN));
        createCookie(category, "Cod", new ItemStack(Material.COD_BUCKET), new ItemStack(Material.WATER_BUCKET));
        createCookie(category, "Cow", new ItemStack(Material.BEEF), new ItemStack(Material.LEATHER));
//        createCookie(category, "Dolphin", new ItemStack(Material.BEEF), new ItemStack(Material.LEATHER));
//        createCookie(category, "Donkey", new ItemStack(Material.BEEF), new ItemStack(Material.LEATHER));
//        createCookie(category, "Fox", new ItemStack(Material.BEEF), new ItemStack(Material.LEATHER));
        createCookie(category, "Horse", new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER));
        createCookie(category, "Iron Golem", new ItemStack(Material.IRON_BLOCK), SlimefunItems.BASIC_CIRCUIT_BOARD);
//        createCookie(category, "Llama", new ItemStack(Material.BEEF), new ItemStack(Material.LEATHER));
//        createCookie(category, "Mule", new ItemStack(Material.BEEF), new ItemStack(Material.LEATHER));
//        createCookie(category, "Ocelot", new ItemStack(Material.BEEF), new ItemStack(Material.LEATHER));
        createCookie(category, "Panda", new ItemStack(Material.BAMBOO), new ItemStack(Material.BAMBOO));
        createCookie(category, "Parrot", new ItemStack(Material.FEATHER), new ItemStack(Material.COCOA_BEANS));
        createCookie(category, "Pig", new ItemStack(Material.PORKCHOP), new ItemStack(Material.CARROT));
        createCookie(category, "Polar Bear", new ItemStack(Material.PACKED_ICE), new ItemStack(Material.COD));
        createCookie(category, "Pufferfish", new ItemStack(Material.PUFFERFISH_BUCKET), new ItemStack(Material.WATER_BUCKET));
        createCookie(category, "Rabbit", new ItemStack(Material.RABBIT_HIDE), new ItemStack(Material.RABBIT_FOOT));
        createCookie(category, "Salmon", new ItemStack(Material.SALMON_BUCKET), new ItemStack(Material.WATER_BUCKET));
        createCookie(category, "Sheep", new ItemStack(Material.MUTTON), new ItemStack(Material.WHITE_WOOL));
        createCookie(category, "Snowman", new ItemStack(Material.SNOW_BLOCK), new ItemStack(Material.PUMPKIN));
        createCookie(category, "Squid", new ItemStack(Material.INK_SAC), new ItemStack(Material.WATER_BUCKET));
        createCookie(category, "Tropical Fish", new ItemStack(Material.TROPICAL_FISH_BUCKET), new ItemStack(Material.WATER_BUCKET));
        createCookie(category, "Turtle", new ItemStack(Material.SCUTE), new ItemStack(Material.WATER_BUCKET));
        createCookie(category, "Villager", new ItemStack(Material.EMERALD), new ItemStack(Material.EMERALD));
        createCookie(category, "Wandering Trader", new ItemStack(Material.EMERALD), new ItemStack(Material.ENDER_PEARL));
        createCookie(category, "Wolf", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));

    }

    public void createCookie(Category category, String type, ItemStack material1, ItemStack material2) {

        SlimefunItemStack slimefunItem =
                new SlimefunItemStack(
                        "DISGUISE_COOKIE_" + type.toUpperCase(),
                        new ItemStack(Material.COOKIE),
                        "&4Disguise Cookie", ChatColor.GRAY + "Type: " + type);

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
