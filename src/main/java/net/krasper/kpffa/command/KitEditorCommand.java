package net.krasper.kpffa.command;

import net.krasper.kpffa.FFA;
import net.krasper.kpffa.files.KitsYML;
import net.krasper.kpffa.kit.kits.SwordKit;
import net.krasper.kpffa.managers.KitManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class KitEditorCommand extends Command {

    public KitEditorCommand() {
        super("kiteditor");
    }

    FFA ffa = FFA.getPlugin(FFA.class);

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {


        Player executer = (Player) sender;
        UUID uuid = executer.getUniqueId();


        if(args.length < 2 && executer.hasPermission("kp.ffa")) {


            if(args[0].equalsIgnoreCase("edit")) {

                if(args[1].equalsIgnoreCase("sword") && KitManager.getCurrentKit(uuid).equals("none")) {

                    executer.sendMessage("Kit given!");
                    executer.sendMessage("CurrentKit: " + KitManager.getCurrentKit(uuid));

                    SwordKit.givePremadeKit(executer);
                }

            } else if(args[0].equalsIgnoreCase("save")) {



            }
        }

        return false;
    }
}
