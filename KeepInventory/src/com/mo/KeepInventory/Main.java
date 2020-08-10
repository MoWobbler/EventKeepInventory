package com.mo.KeepInventory;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;





public class Main extends JavaPlugin implements Listener {

	public static Main instance;

	public Main() {
		instance = this;
	}

	
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new PlayerDeath(), this);
		getServer().getPluginManager().registerEvents(new PlayerRespawn(), this);
		getCommand("eventkeepinventory").setExecutor(new EventKeepInventoryCommand());
		
	}
	
	
	
}
