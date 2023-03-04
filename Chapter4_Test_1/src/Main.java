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
		System.out.println(this.TV + "에서 만든 " + this.y + "년형 " + this.d + "인치 TV"); 
	} 
	public static void main(String[] args) { 
		Main MyExp = new Main("LG", 2017, 32); 
		MyExp.show(); 
		} 
	}

