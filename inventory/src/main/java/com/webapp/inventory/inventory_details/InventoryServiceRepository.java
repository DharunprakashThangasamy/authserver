package com.webapp.inventory.inventory_details;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryServiceRepository extends JpaRepository<Inventory,Integer> {
}
