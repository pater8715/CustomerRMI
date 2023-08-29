package model;

public class MenuItem {
    
    private int id;
    private String name, description;
    private double price;
    private String section;

    public MenuItem(int id, String name, String description, double price, String section) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getSection() {
        return section;
    }

 @Override
    public String toString() {
        return name + " - " + description + " - $" + price + " - " + section;
    }  
    
    
}
