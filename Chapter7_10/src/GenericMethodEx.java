import java.util.Vector;

class GStack <T> {
	int tos;
	Vector<T> stck;
	public GStack() {
		tos = 0;
		stck = new Vector<T> ();;
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

public class GenericMethodEx {

	public static <T> GStack<T> reverse(GStack<T> a) {
		
		GStack<T> s = new GStack<T>();
		
		while(true)	 {
			T tmp;
			tmp = a.pop();
			if (tmp == null)
				break;
			else 
				s.push(tmp);
		}
		return s;
	}

	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		
		for (int i = 0; i < 5; i++) {
			gs.push(Double.valueOf(i));
		}
		gs = reverse(gs);
		for (int i = 0; i < 5; i++) {
			System.out.println(gs.pop());
		}
	}
}
