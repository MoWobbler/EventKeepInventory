package com.mo.KeepInventory;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class EventKeepInventoryCommand implements CommandExecutor {

	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = null;
		if (sender instanceof Player) {
			player = (Player) sender;
		}

		/* If non-op */
		if (player != null && !player.isOp()) {
			player.sendMessage(ChatColor.RED + "You do not have permission to use this command.");
			return true;
		}
		
		
		boolean keepMyInventory = Get.getKeepMyInventory();
		
			if(( cmd).getName().equalsIgnoreCase("eventkeepinventory")) {
				if (args[0].toLowerCase().startsWith("true")) {
					keepMyInventory = true;
					player.sendMessage("Keep Inventory Enabled");
					Get.setKeepMyInventory(keepMyInventory);
					
			
			} else {
				keepMyInventory = false;
				player.sendMessage("Keep Inventory Disabled");
				Get.setKeepMyInventory(keepMyInventory);
				
			}
		}
	
		

		
		
		
		
		
		
		return false;
	}

	
}
