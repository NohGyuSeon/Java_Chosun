public class Main { 
	String TV; 
	int y; 
	int d; 
	
	public Main(String TV, int y, int d) 
	{ 
		this.TV = TV; 
		this.y = y; 
		this.d = d; 
	} 
	void show() { 
		System.out.println(this.TV + "���� ���� " + this.y + "���� " + this.d + "��ġ TV"); 
	} 
	public static void main(String[] args) { 
		Main MyExp = new Main("LG", 2017, 32); 
		MyExp.show(); 
		} 
	}

