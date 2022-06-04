package green.misc.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;

public class ItemManager {
    public static void init() { createStringRecipe(); }

    public static void createStringRecipe(){
        ItemStack item = new ItemStack(Material.STRING);
        ShapelessRecipe sr = new ShapelessRecipe(NamespacedKey.minecraft("string"), item);
        sr.addIngredient(1, Material.GRASS);
        Bukkit.getServer().addRecipe(sr);
    }
}
