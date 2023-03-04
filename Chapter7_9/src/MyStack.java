import java.util.Vector;

class GStack <T> {
	int tos;
	Vector<T> stck;
	public GStack() {
		tos = 0;
		stck = new Vector<T> ();
	}

	public void push(T item) {
//		if(tos == 10) 
//			return;
//		stck[tos] = item;
//		tos++;
		stck.add(item);
	}
	
	public T pop() {
		if(stck.isEmpty())
			return null;
		
		return stck.remove(stck.size()-1);
	}
}

public class MyStack {

	public static void main(String[] args) {
		
		GStack<String> stringStack = new GStack<String>();
		
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for (int n = 0; n < 3; n++) {
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<Integer>();
		
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for (int n = 0; n < 3; n++) {
			System.out.println(intStack.pop());
		}

	}
}
