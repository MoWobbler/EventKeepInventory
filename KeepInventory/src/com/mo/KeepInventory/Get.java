package com.mo.KeepInventory;

public class Get {
	private static Boolean keepMyInventory = false;
	
	
	public static Boolean getKeepMyInventory() {
		return keepMyInventory;
	}

	public static void setKeepMyInventory(Boolean keepMyInventory) {
		Get.keepMyInventory = keepMyInventory;
	}
	
	
}
