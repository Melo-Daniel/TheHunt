/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.io.Serializable;

/**
 *
 * @author Daniel Melo
 */
public class InventoryItem implements Serializable{
    private int quantityInStock, requiredAmount,inventoryType;

    public InventoryItem() {
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public int getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(int inventoryType) {
        this.inventoryType = inventoryType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.quantityInStock;
        hash = 19 * hash + this.requiredAmount;
        hash = 19 * hash + this.inventoryType;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (this.inventoryType != other.inventoryType) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + ", inventoryType=" + inventoryType + '}';
    }
}
