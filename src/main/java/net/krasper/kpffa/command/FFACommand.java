package net.krasper.kpffa.command;

import net.krasper.kpffa.FFA;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FFACommand extends Command {

    public FFACommand() {
        super("ffa");
    }

    FFA ffa = FFA.getPlugin(FFA.class);

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {

        Player executer = (Player) sender;
        FileConfiguration config = ffa.getConfig();

        if(args[0].equalsIgnoreCase("help") && executer.hasPermission("kp.ffa.help")) {

            executer.sendMessage(ChatColor.GRAY + "------------------");
            executer.sendMessage(ChatColor.GRAY + "");
            executer.sendMessage(ChatColor.GRAY + "Usage: ");
            executer.sendMessage(ChatColor.GRAY + "/ffa goto <ffaName>");
            executer.sendMessage(ChatColor.GRAY + "");
            executer.sendMessage(ChatColor.GRAY + "------------------");

        }


        if (args[0].equalsIgnoreCase("goto") && executer.hasPermission("kp.ffa.goto")) {

            if (config.contains("ffa.FFAs")) {
                ConfigurationSection warps = config.getConfigurationSection("ffa.FFAs");
                for (String warpName : warps.getKeys(false)) {

                    String x = warps.getString(warpName + ".x");
                    double newX = Double.parseDouble(x);
                    String y = warps.getString(warpName + ".y");
                    double newY = Double.parseDouble(y);
                    String z = warps.getString(warpName + ".z");
                    double newZ = Double.parseDouble(z);
                    String yaw = warps.getString(warpName + ".yaw");
                    float newYaw = Float.parseFloat(yaw);
                    String pitch = warps.getString(warpName + ".pitch");
                    float newPitch = Float.parseFloat(pitch);

                    String worldName = warps.getString(warpName + ".world");
                    World newWorld = Bukkit.getWorld(worldName);

                    if(args[1].equalsIgnoreCase(warpName)) {

                        executer.sendMessage(ChatColor.GREEN + "Navigating to " + ChatColor.YELLOW + warpName + ChatColor.GREEN + "!");

                        Location location = new Location(newWorld, newX, newY, newZ, newYaw, newPitch);
                        executer.teleport(location);
                    }

                }

            }

        }

        return false;
    }
}
