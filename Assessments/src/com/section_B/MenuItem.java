package com.section_B;

import java.util.ArrayList;
import java.util.Iterator;

class ItemUnavailableException extends Exception {
	ItemUnavailableException(String msg){
		super(msg);
	}
	
}
class NoSuchElementException extends Exception{
	NoSuchElementException(String msg){
		super(msg);
	}
}
class CartManager{
	ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
void addItem(MenuItem item) {
		menu.add(item);
		try {
			if(!item.isAvailable()) {
				throw new ItemUnavailableException(item.getName() + " is unavailabe at this time!");
			}
			System.out.println(item.getName() + " is availabe at this time!");
		} catch (ItemUnavailableException e) {
			
			System.out.println(e.getMessage());
		}
//		if(!item.isAvailable()) {
//			throw new ItemUnavailableException(item.getName() + " is unavailabe at this time!");
//		}
		
	}
void removeItem(int itemId) throws NoSuchElementException {

    for (int i = 0; i < menu.size(); i++) {

        if (menu.get(i).getItemId() == itemId) {
            menu.remove(i);
            System.out.println("Item removed from cart");
            return;
        }
    }

    throw new NoSuchElementException(
        "No item available with this Id " + itemId
    );
}
void displayCart() {
	Iterator<MenuItem> it = menu.iterator();
	while(it.hasNext()) {
		MenuItem value = it.next();
		System.out.println("Name" + " | " + "Price" + " | " + "Id" + " | " + "isAvailabe");
		System.out.println("-------------------------------------");
		System.out.println(value.getName()+ " | " +value.getPrice() + " | " +value.getItemId() + " | " +value.isAvailable());
		
		System.out.println("-------------------------------------");
	}
}
}
public class MenuItem {
	private int itemId;
	private String name;
	private double price;
	private boolean isAvailable;
	
	
	public int getItemId() {
		return itemId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public MenuItem() {
		this.isAvailable= true;
		this.price = 0.0;

	}
	public MenuItem(int itemid, String name, double price, boolean isAvailable){
		this.isAvailable = isAvailable;
		this.itemId = itemid;
		this.name = name;
		this.price = price;
		
	}
	
	
	void displayDetails(){
		if(isAvailable) {
			System.out.println(name + " AVAILABLE");
		}else {
			System.out.println(name + " UNAVAILABLE");

		}
		
	}
public static void main(String[] args) {
	MenuItem menu = new MenuItem();
//	MenuItem menu2 = new MenuItem(3, "panner-chili", 250, true);
//	menu2.displayDetails();
	CartManager cart = new CartManager();

		cart.addItem( new MenuItem(3, "Panner-chili", 250, true));
		cart.addItem( new MenuItem(4, "Wrapper", 200, true));
		cart.addItem( new MenuItem(5, "Dosa", 250, true));
		cart.addItem( new MenuItem(6, "Italy", 250, true));

	try {
		cart.removeItem(3);
	} catch (NoSuchElementException e) {
       System.out.println(e.getMessage());
	}
	cart.displayCart();

}
}
