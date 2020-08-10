package com.mo.KeepInventory;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerRespawn implements Listener {

	static public HashMap<Player , ItemStack[]> items = new HashMap<Player , ItemStack[]>();
	
	boolean keepInv = Get.getKeepMyInventory();
	
	
	
	
	@EventHandler()
    public void onRespawn(PlayerRespawnEvent event){
		boolean keepInv = Get.getKeepMyInventory();
		if (keepInv == true) {
			if(items.containsKey(event.getPlayer())){
				event.getPlayer().getInventory().clear();
				for(ItemStack stack : items.get(event.getPlayer())){
					event.getPlayer().getInventory().addItem(stack);
            }
           
            items.remove(event.getPlayer());
        }
    }
	}
	
}
