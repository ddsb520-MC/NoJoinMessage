package org.ddsb520.nojoinmessage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoJoinMessage extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("plugin enabled");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("plugin disabled");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // 取消进服提示
        event.setJoinMessage(null);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        // 取消退出提示
        event.setQuitMessage(null);
    }
}
