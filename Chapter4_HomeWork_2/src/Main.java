import java.util.Scanner;

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
    
    public static int MenuLen() {
    	return menus.length;
    }
    
    public static String[] Menu() {
    	return menus;
    }
    
    public static Menuboard makeBoard() {
    	menuList = new Menu[menus.length];
    	for (int i = 0; i < menuList.length; i++) {
			menuList[i] = new Menu(i+1, menus[i], prices[i]);
    	}
    	
		return new Menuboard();
    }
    
    /*
    public static void makeBoard() {
    	menuList = new Menu[menus.length];
    	for (int i = 0; i < menuList.length; i++) {
			menuList[i] = new Menu(i+1, menus[i], prices[i]);
    	}
    }
    */
    
	public static void print() {
		System.out.println("***** Best Coffee *****");
		for(Menu menu : menuList) menu.print();
		System.out.println("***********************");
	}
	
	public static void Menuprint(int n) {
		System.out.print(menus[n - 1]);
	}
	
	public static void Priceprint(int n, int m) {
		int sum = 0;
		sum = prices[n - 1] * m;
		System.out.println(sum);
	}
}

class Order {
	private static int MenuNum[];
	private static int OrderNum[];
	
	public Order() {
		
	}
	
	public static void add(int n) {
		MenuNum = new int[n];
		OrderNum = new int[n];
		for (int i = 0; i < MenuNum.length; i++) {
			MenuNum[i] = 0;
			OrderNum[i] = 0;	
		}
	}
	
	public static void addMenu(int index, int i, int j) {
		MenuNum[index] = i;
		OrderNum[index] = j;
	}
	
	public static void print() {
		System.out.println("** Order details **");
		for (int i = 0; i < MenuNum.length; i++) {
			System.out.print("Menu: ");
			Menuboard.Menuprint(MenuNum[i]);	
			System.out.print(" " + "Qty: " + OrderNum[i] + "Price: ");
			Menuboard.Priceprint(MenuNum[i], OrderNum[i]);
		}
	}
	
}

class MenuOrder {
	public static MenuOrder makeOrder() {
		int n, i, j;
		Scanner scanner = new Scanner(System.in);
		//Menuboard.makeBoard();
		//Menuboard.print();
		Menuboard mboard = Menuboard.makeBoard();
		mboard.print();
		System.out.print("How many kinds of drinks? ");
		n = scanner.nextInt();
		Order order = new Order();
		order.add(n);
		
		for (int k = 0; k < n; k++) {
			System.out.print("Menu no? ");
			i = scanner.nextInt();
			System.out.print("Quantity? ");
			j = scanner.nextInt();
			Order.addMenu(k, i, j);
			if(i >= 1 && i <= mboard.MenuLen()) {
				System.out.println("Your selected menu is added to the order");
			}
			else {
				System.out.println("Menu id " + i + " doesn't exist in our menuboard");
				k--;
			}
		}	
		
		Order.print();
		return new MenuOrder();
	}
} 

public class Main {

	public static void main(String[] args) {
		
		// Menuboard mboard = Menuboard.makeBoard();
		// mboard.print();

		MenuOrder mboard = MenuOrder.makeOrder();
	}
}
