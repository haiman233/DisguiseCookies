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

        ItemStack categoryItem = new CustomItem(Material.COOKIE, "&4Disguise Cookies", "", "&a> Click to open");

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
        createCookie(category, "Dolphin", new ItemStack(Material.COD), SlimefunItems.WATER_RUNE);
        createCookie(category, "Donkey", new ItemStack(Material.LEATHER), new ItemStack(Material.CARROT));
        createCookie(category, "Fox", new ItemStack(Material.SWEET_BERRIES), new ItemStack(Material.LEATHER));
        createCookie(category, "Horse", new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER));
        createCookie(category, "Iron Golem", new ItemStack(Material.IRON_BLOCK), SlimefunItems.BASIC_CIRCUIT_BOARD);
        createCookie(category, "Llama", new ItemStack(Material.LEATHER), new ItemStack(Material.WHITE_CARPET));
        createCookie(category, "Mule", new ItemStack(Material.CARROT), new ItemStack(Material.LEATHER));
        createCookie(category, "Ocelot", new ItemStack(Material.COD), new ItemStack(Material.COD));
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

        //Monster
        createCookie(category, "Blaze", new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.BLAZE_ROD));
        createCookie(category, "Cave Spider", new ItemStack(Material.SPIDER_EYE), new ItemStack(Material.STRING));
        createCookie(category, "Creeper", new ItemStack(Material.TNT), new ItemStack(Material.TNT));
        createCookie(category, "Drowned", new ItemStack(Material.ROTTEN_FLESH), SlimefunItems.WATER_RUNE);
//        createCookie(category, "Elder Guardian", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
        createCookie(category, "Enderman", new ItemStack(Material.ENDER_EYE), SlimefunItems.ENDER_RUNE);
        createCookie(category, "Endermite", new ItemStack(Material.END_STONE), SlimefunItems.ENDER_RUNE);
//        createCookie(category, "Evoker", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
//        createCookie(category, "Evoker Fangs", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
        createCookie(category, "Ghast", new ItemStack(Material.GUNPOWDER), new ItemStack(Material.GHAST_TEAR));
//        createCookie(category, "Guardian", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
//        createCookie(category, "Hoglin", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
        createCookie(category, "Husk", new ItemStack(Material.ROTTEN_FLESH), SlimefunItems.EARTH_RUNE);
//        createCookie(category, "Illusioner", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
        createCookie(category, "Magma Cube", new ItemStack(Material.MAGMA_BLOCK), new ItemStack(Material.MAGMA_CREAM));
//        createCookie(category, "Phantom", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
//        createCookie(category, "Piglin", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
//        createCookie(category, "Pillager", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
//        createCookie(category, "Ravager", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
        createCookie(category, "Shulker", new ItemStack(Material.SHULKER_SHELL), SlimefunItems.ENDER_RUNE);
        createCookie(category, "Silverfish", new ItemStack(Material.STONE), new ItemStack(Material.STONE));
        createCookie(category, "Skeleton", new ItemStack(Material.BONE), new ItemStack(Material.BONE));
        createCookie(category, "Slime", new ItemStack(Material.SLIME_BALL), new ItemStack(Material.SLIME_BALL));
        createCookie(category, "Spider", new ItemStack(Material.STRING), new ItemStack(Material.SPIDER_EYE));
//        createCookie(category, "Stray", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
//        createCookie(category, "Vex", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
//        createCookie(category, "Vindicator", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
//        createCookie(category, "Witch", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
//        createCookie(category, "Wither Skeleton", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
//        createCookie(category, "Zoglin", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));
        createCookie(category, "Zombie", new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.ROTTEN_FLESH));
//        createCookie(category, "Zombified Piglin", new ItemStack(Material.BONE), new ItemStack(Material.BEEF));

    }

    public void createCookie(Category category, String type, ItemStack material1, ItemStack material2) {

        SlimefunItemStack slimefunItem =
                new SlimefunItemStack(
                        "DISGUISE_COOKIE_" + type.toUpperCase().replace(" ", "_"),
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
