package com.webapp.inventory.inventory_details_adapter;

import com.webapp.inventory.inventory_details.Inventory;
import com.webapp.inventory.inventory_details.InventoryServiceAdapter;
import com.webapp.inventory.inventory_details.InventoryServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class InventoryServiceAdapterImpl implements InventoryServiceAdapter {

   private final InventoryServiceRepository inventoryServiceRepository;

   @Override
    public Inventory addInventory(Inventory inventory) {
        return inventoryServiceRepository.save(inventory);
    }

    @Override
    public List<Inventory> getAllInventory() {
        return inventoryServiceRepository.findAll();
    }
}
