package com.webapp.inventory.inventory_details_resource;

import com.webapp.inventory.InventoryApplication;
import com.webapp.inventory.inventory_details.Inventory;
import com.webapp.inventory.inventory_details_adapter.InventoryServiceAdapterImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class InventoryHandler {

    private final InventoryServiceAdapterImpl inventoryServiceAdapterImpl;


    @PostMapping("/inventory")
    public ResponseEntity<Inventory> addInventory(@RequestBody Inventory inventory) {
        return new ResponseEntity<>(inventoryServiceAdapterImpl.addInventory(inventory), HttpStatus.OK);
    }

    @GetMapping("/inventory")
    public ResponseEntity<List<Inventory>> getAllInventory() {
        return new ResponseEntity<>(inventoryServiceAdapterImpl.getAllInventory(), HttpStatus.OK);
    }


    @GetMapping("/testing")
    public ResponseEntity<String> testing() {
        return new ResponseEntity<>("testing it is working .....", HttpStatus.OK);
    }
}
