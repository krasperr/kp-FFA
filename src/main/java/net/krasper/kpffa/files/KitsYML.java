package net.krasper.kpffa.files;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;

public class KitsYML {

    private static File file;
    private static FileConfiguration customFile;

    public static void setup() {
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("kp-FFA").getDataFolder(), "kits.yml");

        if(!file.exists()) {
            try {
                file.createNewFile();
            }catch (IOException e) {
                //
            }
        }

        customFile = YamlConfiguration.loadConfiguration(file);
    }

    public static void set(String path, String value) {
        customFile.set(path, value);
        save();
    }

    public static Object get(String path) {
        return customFile.get(path);

    }

    public static void save() {
        try {
            customFile.save(file);
        }catch (IOException e) {
            System.out.println("Couldn't save file.");
        }
    }




}
