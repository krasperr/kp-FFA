package net.krasper.kpffa;

import net.krasper.kpffa.command.FFACommand;
import net.krasper.kpffa.command.KitEditorCommand;
import net.krasper.kpffa.command.test;
import net.krasper.kpffa.files.KitsYML;
import net.krasper.kpffa.listeners.JoinEvent;
import net.krasper.kpffa.listeners.WorldEnter;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class FFA extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        KitsYML.setup();

        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        // cmd
        Bukkit.getCommandMap().register("ffa", new FFACommand());
        Bukkit.getCommandMap().register("kiteditor", new KitEditorCommand());
        Bukkit.getCommandMap().register("testcmd", new test());

        // listeners
        Bukkit.getPluginManager().registerEvents(new WorldEnter(), this);
        Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);

    }





    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
