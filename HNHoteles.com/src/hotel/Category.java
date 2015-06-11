/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

/**
 *
 * @author Stward
 */
public class Category {
    private String taxType;
    private String description;

    public Category() {
    }

    public Category(String taxType, String description) {
        this.taxType = taxType;
        this.description = description;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" + "taxType=" + taxType + ", description=" + description + '}';
    }
    
}
