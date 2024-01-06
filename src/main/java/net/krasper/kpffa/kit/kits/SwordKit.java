package net.krasper.kpffa.kit.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SwordKit {

    public static void givePremadeKit(Player player) {

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        sword.editMeta(itemMeta -> {
            itemMeta.setUnbreakable(true);
        });
        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        helmet.editMeta(itemMeta -> {
            itemMeta.setUnbreakable(true);
            itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
        });
        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        chestplate.editMeta(itemMeta -> {
            itemMeta.setUnbreakable(true);
            itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
        });
        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        leggings.editMeta(itemMeta -> {
            itemMeta.setUnbreakable(true);
            itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
        });
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        boots.editMeta(itemMeta -> {
            itemMeta.setUnbreakable(true);
            itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
        });

        player.getInventory().setHelmet(helmet);
        player.getInventory().setChestplate(chestplate);
        player.getInventory().setLeggings(leggings);
        player.getInventory().setBoots(boots);

        player.getInventory().setItem(0, sword);

    }

}
