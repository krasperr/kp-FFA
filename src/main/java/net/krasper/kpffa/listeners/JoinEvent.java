package net.krasper.kpffa.listeners;

import net.krasper.kpffa.managers.KitManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();


        KitManager.setCurrentKit("none", player.getUniqueId());

    }

}
