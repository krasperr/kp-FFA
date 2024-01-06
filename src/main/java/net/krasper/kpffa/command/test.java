package net.krasper.kpffa.command;

import net.krasper.kpffa.kit.kits.SwordKit;
import net.krasper.kpffa.managers.KitManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class test extends Command {

    public test() {
        super("testcmd");
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {

        Player player = (Player) sender;

        player.sendMessage(KitManager.getCurrentKit(player.getUniqueId()));
        return false;
    }
}
