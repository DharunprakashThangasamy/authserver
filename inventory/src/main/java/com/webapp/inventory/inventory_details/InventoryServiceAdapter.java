
package com.webapp.inventory.inventory_details;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface InventoryServiceAdapter {
    public Inventory addInventory(Inventory inventory);
    public List<Inventory> getAllInventory();
}
