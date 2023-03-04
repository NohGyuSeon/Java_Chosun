class Menu {
	private int id;
	private String name;
	private int price;
	
	public Menu(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice() {
		this.price = price;
	}
	
	public void print() {
		System.out.println(id + ": " + name + " [" + (price / 1000.0) + "]");
	}

}

class Menuboard {
	
    private static String[] menus = {"Americano", "Latte", "Mocca", "Cappuccino",
            "Milk Tea", "Chi Tea", "Lemon Sweet", "Jamong Honey"};
    private static int[] prices = {4100, 4300, 4300, 4800, 5100, 5300, 5800, 6100};
    private static Menu[] menuList;
    
    /*
    public static Menuboard makeBoard() {
    	menuList = new Menu[menus.length];
    	for (int i = 0; i < menuList.length; i++) {
			menuList[i] = new Menu(i+1, menus[i], prices[i]);
    	}
    	
		return new Menuboard();
    }
    */
    
    public static void makeBoard() {
    	menuList = new Menu[menus.length];
    	for (int i = 0; i < menuList.length; i++) {
			menuList[i] = new Menu(i+1, menus[i], prices[i]);
    	}
    }
    
	public static void print() {
		System.out.println("***** Best Coffee *****");
		for(Menu menu : menuList) menu.print();
		System.out.println("***********************");
	}
}

public class Main {

	public static void main(String[] args) {
		
		// Menuboard mboard = Menuboard.makeBoard();
		// mboard.print(); 
		
		Menuboard.makeBoard();
		Menuboard.print();
	}
}
