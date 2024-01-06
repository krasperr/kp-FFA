package net.krasper.kpffa.command;

import net.krasper.kpffa.FFA;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;

public class LobbyCommand extends Command {

    public LobbyCommand() {
        super("lobby", "Teleport to lobby", "/lobby", Collections.singletonList("hub"));
    }

    FFA ffa = FFA.getPlugin(FFA.class);

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {

        Player player = (Player) sender;

        FileConfiguration config = ffa.getConfig();

        if(player.hasPermission("kp.spawn")) {

            String x = config.getString("spawn.x");
            double newX = Double.parseDouble(x);
            String y = config.getString("spawn.y");
            double newY = Double.parseDouble(y);
            String z = config.getString("spawn.z");
            double newZ = Double.parseDouble(z);
            String yaw = config.getString("spawn.yaw");
            float newYaw = Float.parseFloat(yaw);
            String pitch = config.getString("spawn.pitch");
            float newPitch = Float.parseFloat(pitch);

            String worldName = config.getString("spawn.world");
            World newWorld = Bukkit.getWorld(worldName);

            Location location = new Location(newWorld, newX, newY, newZ, newYaw, newPitch);
            player.teleport(location);

        }

        return false;
    }
}
