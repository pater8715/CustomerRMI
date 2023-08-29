package model;

import java.util.ArrayList;
import java.util.List;

public class RemoteServicesCustomer {

    private List<MenuItem> menuList;

    public void addMenuItems(MenuItem items) {
        this.menuList.add(items);
    }
    public void addMenuList(List<MenuItem> list) {
        this.menuList = list;
    }

    public RemoteServicesCustomer() {
        this.menuList = loadData();
    }

    public List<MenuItem> getMenuList() {
        return this.menuList;
    }

    public List<MenuItem> loadData() {
        this.menuList = new ArrayList<>();
        addMenuItems(new MenuItem(1, "Hamburguesa", "Deliciosa hamburguesa con queso y lechuga", 10.99, "Platos Principales"));
        addMenuItems(new MenuItem(2, "Ensalada César", "Ensalada fresca con pollo a la parrilla y aderezo César", 8.99, "Platos Principales"));
        addMenuItems(new MenuItem(3, "Tarta de Manzana", "Deliciosa tarta casera de manzana", 5.99, "Postres"));
        // Agregar más elementos según sea necesario
        return getMenuList();
    }

}
