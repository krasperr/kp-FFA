package net.krasper.kpffa.managers;

import net.krasper.kpffa.files.KitsYML;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class KitManager {

    public static HashMap<String, UUID> currentKit = new HashMap<>();

    public static void setCurrentKit(String kit, UUID uuid) {

        currentKit.put(kit, uuid);

    }

    public static UUID getCurrentKit(UUID uuid) {
        return currentKit.get(uuid);
    }

    public static void saveKit(Player player, UUID uuid) {

        KitsYML.set("kits." + uuid + "." + KitManager.getCurrentKit(uuid) + ".1", String.valueOf(player.getInventory().getItem(1)));

    }


}
