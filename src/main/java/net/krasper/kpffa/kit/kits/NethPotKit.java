package net.krasper.kpffa.kit.kits;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NethPotKit {

    public static void givePremadeKit(Player player) {

        ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);
        sword.editMeta(itemMeta -> {
            itemMeta.setUnbreakable(true);
            itemMeta.addEnchant(Enchantment.DAMAGE_ALL, 5, false);
        });
        ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET);
        helmet.editMeta(itemMeta -> {
            itemMeta.setUnbreakable(true);
            itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
            itemMeta.addEnchant(Enchantment.DURABILITY, 3, false);
        });
        ItemStack chestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
        chestplate.editMeta(itemMeta -> {
            itemMeta.setUnbreakable(true);
            itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
            itemMeta.addEnchant(Enchantment.DURABILITY, 3, false);
        });
        ItemStack leggings = new ItemStack(Material.NETHERITE_LEGGINGS);
        leggings.editMeta(itemMeta -> {
            itemMeta.setUnbreakable(true);
            itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
            itemMeta.addEnchant(Enchantment.DURABILITY, 3, false);
        });
        ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS);
        boots.editMeta(itemMeta -> {
            itemMeta.setUnbreakable(true);
            itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
            itemMeta.addEnchant(Enchantment.DURABILITY, 3, false);
        });

        ItemStack healthpot = new ItemStack(Material.SPLASH_POTION);
        healthpot.editMeta(itemMeta -> {
            itemMeta.setDisplayName(ChatColor.WHITE + "Splash Potion of Healing");
            itemMeta.displayName();
            PotionMeta pm = (PotionMeta) itemMeta;
            pm.setColor(Color.RED);
            pm.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 1, 1),false);
        });

        ItemStack speedpot = new ItemStack(Material.SPLASH_POTION);
        speedpot.editMeta(itemMeta -> {
            itemMeta.setDisplayName(ChatColor.WHITE + "Splash Potion of Swiftness");
            PotionMeta pm = (PotionMeta) itemMeta;
            pm.setColor(Color.AQUA);
            pm.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 1800, 1),false);
        });

        ItemStack strengthpot = new ItemStack(Material.SPLASH_POTION);
        strengthpot.editMeta(itemMeta -> {
            itemMeta.setDisplayName(ChatColor.WHITE + "Splash Potion of Strength");
            PotionMeta pm = (PotionMeta) itemMeta;
            pm.setColor(Color.PURPLE);
            pm.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1800, 1),false);
        });

        ItemStack firerespot = new ItemStack(Material.SPLASH_POTION);
        firerespot.editMeta(itemMeta -> {
            itemMeta.setDisplayName(ChatColor.WHITE + "Splash Potion of Fire Resistance");
            PotionMeta pm = (PotionMeta) itemMeta;
            pm.setColor(Color.ORANGE);
            pm.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1800, 1),false);
        });

        ItemStack gaps = new ItemStack(Material.GOLDEN_APPLE, 64);

        ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);

        ItemStack xp = new ItemStack(Material.EXPERIENCE_BOTTLE, 64);


        player.getInventory().setHelmet(helmet);
        player.getInventory().setChestplate(chestplate);
        player.getInventory().setLeggings(leggings);
        player.getInventory().setBoots(boots);

        player.getInventory().setItem(0, sword);
        player.getInventory().setItem(1, gaps);
        player.getInventory().setItem(2, healthpot);
        player.getInventory().setItem(3, healthpot);
        player.getInventory().setItem(4, healthpot);
        player.getInventory().setItem(5, firerespot);
        player.getInventory().setItem(6, strengthpot);
        player.getInventory().setItem(7, speedpot);
        player.getInventory().setItem(8, totem);

        player.getInventory().setItem(9, totem);
        player.getInventory().setItem(10, healthpot);
        player.getInventory().setItem(11, healthpot);
        player.getInventory().setItem(12, healthpot);
        player.getInventory().setItem(13, healthpot);
        player.getInventory().setItem(14, healthpot);
        player.getInventory().setItem(15, healthpot);
        player.getInventory().setItem(16, strengthpot);
        player.getInventory().setItem(17, speedpot);

        player.getInventory().setItem(18, firerespot);
        player.getInventory().setItem(19, xp);
        player.getInventory().setItem(20, healthpot);
        player.getInventory().setItem(21, healthpot);
        player.getInventory().setItem(22, healthpot);
        player.getInventory().setItem(23, speedpot);
        player.getInventory().setItem(24, strengthpot);
        player.getInventory().setItem(25, strengthpot);
        player.getInventory().setItem(26, speedpot);
        player.getInventory().setItem(27, firerespot);
        player.getInventory().setItem(28, xp);
        player.getInventory().setItem(29, healthpot);
        player.getInventory().setItem(30, healthpot);
        player.getInventory().setItem(31, healthpot);
        player.getInventory().setItem(32, speedpot);
        player.getInventory().setItem(33, strengthpot);
        player.getInventory().setItem(34, strengthpot);
        player.getInventory().setItem(35, speedpot);

    }

}
