package net.krasper.kpffa.listeners;

import net.krasper.kpffa.FFA;
import net.krasper.kpffa.kit.kits.NethPotKit;
import net.krasper.kpffa.kit.kits.SwordKit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

import java.util.List;

public class WorldEnter implements Listener {

    FFA ffa = FFA.getPlugin(FFA.class);

    @EventHandler
    public void onWorldChange(PlayerChangedWorldEvent e) {

        Player player = e.getPlayer();

        World world = e.getPlayer().getWorld();
        String worldName = world.getName();

        List<String> swordFFAWorlds = ffa.getConfig().getStringList("ffa.kits.swordFFA.worlds");
        List<String> diapotFFAWorlds = ffa.getConfig().getStringList("ffa.kits.diapotFFA.worlds");
        List<String> nethpotFFAWorlds = ffa.getConfig().getStringList("ffa.kits.nethpotFFA.worlds");
        List<String> axeFFAWorlds = ffa.getConfig().getStringList("ffa.kits.axeFFA.worlds");

        if(swordFFAWorlds.contains(worldName)) { // SWORD FFA

            SwordKit.givePremadeKit(player);
        }


        if(nethpotFFAWorlds.contains(worldName)) { // NETHPOT FFA

            NethPotKit.givePremadeKit(player);
        }


    }

}
