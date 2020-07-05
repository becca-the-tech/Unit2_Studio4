package restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItems> fullMenu;
    public static String lastUpdated;

    public ArrayList<MenuItems> getFullMenu(){
        return fullMenu;
    }

    public void setFullMenu(ArrayList<MenuItems> aMenu){
        fullMenu = aMenu;
    }


    public static void main(String[] args){
        MenuItems pizza = new MenuItems();
        MenuItems cupcakes = new MenuItems();
        MenuItems brownies = new MenuItems();

        ArrayList<MenuItems> pizzaShop = new ArrayList();
        pizzaShop.add(pizza);
        pizzaShop.add(cupcakes);
        pizzaShop.add(brownies);
        System.out.println(pizzaShop);
    }
}
