package com.mo.KeepInventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerDeath implements Listener {

	
	
	 @EventHandler()
	    public void onDeath(PlayerDeathEvent event){
		 boolean keepInv = Get.getKeepMyInventory();
		 	if (keepInv == true) {
		 		ItemStack[] content = event.getEntity().getInventory().getContents();
		 		PlayerRespawn.items.put(event.getEntity(), content);
		 		event.getEntity().getInventory().clear();
		 		event.getDrops().clear();
	    }
	 }     
}
	
	

