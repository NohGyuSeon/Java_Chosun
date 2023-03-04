import java.util.*;

/*
   �޴� ���ÿ��� ����� �޴� �̸��� ���� ������ ����
     MAIN_MENU : ���� ���� : ������ ����Ʈ�� ���� ������ ����  
         ����(��), ����(��), ����(��), ����(��), �̵�(�� �� ������), �̵�(�� �� ������), ����Ʈ ���, ����
     SHAPE_TYPE  : ������ Shape
         Rect, Circle, Line  
*/

enum MAIN_MENU {
	Insert_front(0), Insert_rear(1), Remove_front(2), Remove_rear(3),
	Move_front(4), Move_rear(5), list_all(6), Exit(7); 

	MAIN_MENU(int value) { this.value = value; }

    private final int value;
    public int value() { return value; }
}

enum SHAPE_TYPE {
	Shape_Rect(0), Shape_Circle(1), Shape_Line(2);

	SHAPE_TYPE(int value) { this.value = value; }

    private final int value;
    public int value() { return value; }
}

/******************************************************************************
 UI Ŭ���� ���� �� ����
    ��� ��� �Լ����� ��� ����(static) �Լ���
    �Է°� ����� ����ϴ� ���� �Լ����� ����
    static �Լ� ȣ���� ���� 4-11 ����
*******************************************************************************/

class UI {
	// msg�� ����� �� ���� �� �ϳ��� �Է� �޾� ����
    // MAIN_MENU ������ ���� �޼ҵ�
	static int getMainMenu(Scanner scanner) {
		System.out.println("Select one operation  ");   // �ȳ� ���� ���
		System.out.print("Insert(Front):" + MAIN_MENU.Insert_front.value() + ", "
				+ "Insert(Rear):" + MAIN_MENU.Insert_rear.value() + ", "
				+ "Remove(Front):" + MAIN_MENU.Remove_front.value() + ", "
				+ "Remove(Rear):" + MAIN_MENU.Remove_rear.value() + ", "
				+ "Move(Front):" + MAIN_MENU.Move_front.value() + ", "
				+ "Move(Rear):" + MAIN_MENU.Move_rear.value() + ", "
				+ "Print List:" + MAIN_MENU.list_all.value() + ", "
				+ "Exit:" + MAIN_MENU.Exit.value() + " >> ");          // ���� ���� ���
		
		int nMenu = scanner.nextInt();                                // ����ڰ� ������ ���� �Է� 
		
		return nMenu;                                                 // ����ڰ� ������ ���� ����  
	}
	
	// msg�� ����� �� ���� �� �ϳ��� �Է� �޾� ����
    // SHAPE_TYPE ������ ���� �޼ҵ�
	static int getShape(Scanner scanner) {
		// �ȳ� ���� ���
		// Shape ���� ���
		System.out.println("Select one Shape");
		System.out.println("Rectangle:0, Circle:1, Line:2 >> ");
		
		 // ����ڰ� ������ Shape �Է� 
		 // ����ڰ� ������ Shape ���� 
		int Shape = scanner.nextInt();
		return Shape;
	}
	
	// �ȳ� msg�� �Ű� ������ �޾� ����ϰ�
	// ������ ������ Point ���� �ϳ��� �Է� �޾� ����
	static public Point getWidthHeight(Scanner scanner, String msg) {
		// msg ���
		// width, height ���� ����
		System.out.println(msg);
		int width, height;
		
		// width �Է�
		// height �Է� 
		width = scanner.nextInt();
		height = scanner.nextInt();
		
		// ����Ʈ ��ü ����
		Point point = new Point(height, height);
		//����Ʈ ��ü ����
		return point;
	}
	
	// �ȳ� msg�� �Ű� ������ �޾� ����ϰ�
	// Circle ��ü�� ������ �ϳ��� �Է� �޾� ����
	static public int getRadius(Scanner scanner, String msg) {
		// msg ���
		// radius ���� ����
		System.out.println(msg);
		int radius;
		
		// radius �Է� 
		// radius ����
		radius = scanner.nextInt();
		return radius;
	}
}

/*****************************************************************************
   Circle ��ü��  �߽���
   Line   ��ü�� �� ��
   Rectangle ��ü�� �� �������� ������ ������ �ڷ��� 
*****************************************************************************/

class Point {
	int x; // ���� x ��ǥ ��
	int y; // ���� y ��ǥ ��

	// ��ü �ʱ�ȭ: x, y ��ǥ �ʱ�ȭ
	 public Point(int x, int y) {
		this.x = x;	this.y = y;
	}

	// x, y ��ǥ�� ���� width, height��ŭ �̵���Ų��.
	 public void move(int width, int height) {
		this.x += width;
		this.y += height;
	}

	// (x,y) ��ǥ ���ڿ��� ����, ��) "(10, 15)"
	// �޼ҵ� �������̵�, Object Ŭ������ public String toString()�� �������̵� 
	 @Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}

//*****************************************************************************
// Shape�� �߻� Ŭ���� ���� 
abstract class Shape {
	public abstract String draw();                       // ���� ���
	public abstract void move(int width, int height);    // ��ǥ �̵�
};


/*****************************************************************************
Line Ŭ���� ���� �� ����
*****************************************************************************/

class Line extends Shape {
	private Point p1;	// �簢���� ���� ���� ��ǥ
	private Point p2;	// �簢���� ������ �Ʒ��� ��ǥ
	
	// ������ �ۼ�
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	// Shape �� draw �޼ҵ� �������̵�
	// �������� �ڷḦ �����ϴ� �Լ��� toString
    // �Լ� ���ο��� toString() �޼ҵ� ȣ��
	@Override
	public String draw() { return toString(); }
	
	// ȭ�鿡 ������ ��ǥ ���� ���, ��) "Line (10,15) (20,30)"
	// �޼ҵ� �������̵�, Object Ŭ������ public String toString()�� �������̵� 
	 @Override
	public String toString() {
		return ( "Line " + p1.toString() + " " + p2.toString() );
	}

	//���� ��ü�� ��ġ�� width, height��ŭ �ű��.
	public void move(int width, int height) {
		//���� p1�� ��ġ�� width, height��ŭ �ű��.
		p1.move(width, height);
		//���� p2�� ��ġ�� width, height��ŭ �ű��.
		p2.move(width, height);
	}
}

/*****************************************************************************
	Rect Ŭ���� ���� �� ����
    Line Ŭ������ �����Ͽ� �ۼ�
*****************************************************************************/
class Rect extends Shape {
	private Point p1;	// �簢���� ���� ���� ��ǥ
	private Point p2;	// �簢���� ������ �Ʒ��� ��ǥ

	//������: ��� �ʱ�ȭ
	public Rect(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	// Shape �� draw �޼ҵ� �������̵�
	@Override
	public String draw() {
		// �������� �ڷḦ �����ϴ� �Լ��� toString
		// �Լ� ���ο��� toString() �޼ҵ� ȣ��
		return toString();
	}
	
	// �޼ҵ� �������̵�, Object Ŭ������ public String toString()�� �������̵� 
	 @Override
	public String toString() {
                   //ȭ�鿡 �簢���� ��ǥ ���� ���, ��) "Rectangle (10,15) (20,30)"
		 return ( "Rect " + p1.toString() + " " + p2.toString() );
	}
	
	public void move(int width, int height) {
		//���� ��ü�� ��ġ�� width, height��ŭ �ű��.
		p1.move(width, height);
		p2.move(width, height);
	}
}

/*****************************************************************************
	Rect Ŭ���� ���� �� ����
    Line Ŭ������ �����Ͽ� �ۼ�
*****************************************************************************/
class Circle extends Shape {
	private Point center;	// ���� �߽� ��ǥ
	private int   radius;   // �������� ����
	
	//������: ��� �ʱ�ȭ
	public Circle(int radius, Point center) {
		this.radius = radius;
		this.center = center;
	}
	
	// Shape �� draw �޼ҵ� �������̵�
	@Override
	public String draw() {
		// �������� �ڷḦ �����ϴ� �Լ��� toString
		// �Լ� ���ο��� toString() �޼ҵ� ȣ��
		return toString();
	}
	
	// �޼ҵ� �������̵�, Object Ŭ������ public String toString()�� �������̵� 
	 @Override
	public String toString() {
                   //ȭ�鿡 �������� �߽� ��ǥ ���� ���, ��) "Circle 5 (20,30)"
		 return ( "Circle " + center.toString() );
	}
	
	public void move(int width, int height) {
		//���� ��ü�� ��ġ�� width, height��ŭ �ű��.
		center.move(width, height);
	}
}

//*****************************************************************************
// linked list���� �ڷ� �� ��ũ�� ������ node ����
class Node  {
	public Node next;
	public Node prev;
	
	private Object value;   // ������ (��ĳ������ ���ؼ� ���� ��, ��� Ŭ������ �ֻ��� Ŭ������ Object Ŭ������ ��ĳ����)  
	
	public Node(Object value) {  next = null; prev = null; this.value = value; }  // ������
	public Object  getValue() { return value; }     // ���� Node�� ������ ����
};


//*****************************************************************************
//double linked list�� ���� �������̽� ����
interface LinkedList{
	public abstract void add_front(Object value);   // ����Ʈ �� �տ� ����
	public abstract void add_rear(Object value);    // ����Ʈ �� �ڿ� ����
	public abstract boolean isEmpty(); ;            // ����Ʈ�� empty���� Ȯ��        
	public abstract Object remove_front();          // ����Ʈ �� �տ��� ����
	public abstract Object remove_rear();           // ����Ʈ �� �ڿ��� ����
}


//*****************************************************************************
// Shape�� �̿��� double linked list �ۼ�
class ShapeList implements LinkedList{

	private Node head;	// double linked ����Ʈ�� �� ó�� ��带 ����Ű�� ������
	private Node tail;	// double linked ����Ʈ�� �� ������ ��带 ����Ű�� ������
	
	ShapeList() { head= null; tail = null;} // ������: ��� �ʱ�ȭ

	// ����Ʈ�� �� ���� ��带 ����
	public Object get_frontValue() {
		// ����Ʈ�� empty �̸� 
		// null ����
		if (isEmpty())
			return null;
		// ����Ʈ�� empty�� �ƴϸ�
		// �� ���� ������ ����,  head�� �̿��Ͽ� getValue �޼ҵ� ȣ��
		else {
			return head.getValue();
		}
	}
	
	// ����Ʈ�� �� ���� ��带 ����
	public Object get_rearValue() { 
		// ����Ʈ�� empty �̸� 
		// null ����; 
		if (isEmpty())
			return null;
		 // ����Ʈ�� empty�� �ƴϸ�
		 // �� ���� ������ ����, tail�� �̿��Ͽ� getValue �޼ҵ� ȣ��
		else {
			return tail.getValue();
		}
	}
	
	// ����Ʈ �� �տ� ��� ����
	//  �������̽� �޼ҵ� ����
	public void add_front(Object value) {
	    // ��带 �����մϴ�.
		// ���ο� ����� ���� ���� ��带 �����մϴ�.
		Node newNode = new Node(value);
		newNode.next = head;
		
	   // ������ ��尡 �־��ٸ� 
	   //  ���� ����� ���� ���� ���ο� ��带 ����
		if (!isEmpty())	{
			head.prev = newNode;
		}
		
	   // ���� ���ο� ��带 ����
		head = newNode;
		
	    // ��尡 �ϳ����� Ȯ��
	    // tail �� head ���� 
		
		
	}
	
	// ����Ʈ �� �ڿ� ��� ����
	//  �������̽� �޼ҵ� ����
	public void add_rear(Object value) {
	    if (isEmpty()) {   // ����Ʈ�� ��尡 ���ٸ� ù��° ��带 �߰��ϴ� �޼ҵ带 ����մϴ�.
	        add_front(value);
	    } else {
	       Node newNode = new Node(value); 			// ��带 �����մϴ�.
	        tail.next = newNode; 	    	// tail�� ���� ���� ������ ��带 �����մϴ�.
	        newNode.prev = tail;  	        // ���ο� ����� ���� ���� tail�� �����մϴ�.
	        tail = newNode;  	        // ������ ��带 �����մϴ�.
	    }
	}
	
	
	// list �� empty���� Ȯ��
	//  �������̽� �޼ҵ� ����
	public boolean isEmpty() {
		 // head ��  tail �� ��� null �̸� 
		// true ����
		if(head == null && tail == null) {
			return true;
		}
		// �׷��� ������
		// false ����
		else {
			return false;
		}
	}
	
	// ����Ʈ �� �տ��� ����
	//  �������̽� �޼ҵ� ����
	public Object remove_front() {
		// list�� empty���� Ȯ��
		//  empty �̸�  null ����
		if (isEmpty())
			return null;
	    // ù��° ��带 temp�� �����ϰ�
	    // head �� �����  �ڹٿ����� ��� �Ǵ� �κ�
	    //  head�� ���� �ι�° ���� ����
		Node temp = head; 
		head = null;
		head = temp.next;   
	    // temp�κ��� ������ ���� �ӽ� ����(Object Ÿ��)�� �ֱ�
	    // temp �����  (temp=null)
		Object returnData = temp.getValue();
		temp = null;
		
	    // head�� ���� �ƴϸ�	
	    // head�� ���� ��带 null�� ����
        if (head != null) {
        	head.prev = null;
        }
        
	    // ������ ������ ���� (Object Ÿ��)
        return returnData;
	}
	
	// ����Ʈ �� �ڿ��� ����
	//  �������̽� �޼ҵ� ����
	public Object remove_rear() {
		if (isEmpty())       // list�� empty���� Ȯ��
			return null;     //  empty �̸�  null ����
		
		Node temp = tail;         // tail�� ���� �ӽú���(temp)�� ����
		tail = null;              // tail ����� (tail = null) �ڹٿ����� ��� �Ǵ� �κ�
		tail = temp.prev;         // tail�� �ӽú����� prev �ֱ�
		if (tail!= null)
			tail.next = null;      // tail�� next�� null �ֱ�
		
		Object returnData = temp.getValue();  	 // temp�κ��� ������ ���� �ӽ� ����(Object Ÿ��)�� �ֱ�
		return returnData;              // ������ ���� (Object Ÿ��)
	}
	
	// �޼ҵ� �������̵�, Object Ŭ������ public String toString()�� �������̵� 
	 @Override
	public String toString() {
		StringBuffer result = new StringBuffer("");          // ������ String ���� result ����
		if (!isEmpty()) {                                            // ������ empty�� �ƴϸ�
			Node node = head;                          // head�� ���ο� ���� node�� �ֱ� 

			while (node != null) {                          // node�� null �� �ƴ� ����
				result.append("[");                     //  result�� "[" ���̱�
				result.append(node.getValue());         //  result��  node.getValue() ȣ���ؼ� ��� ���̱�
				result.append("]");                     //  result�� "]" ���̱�
				if (node.next==null)                    //  node.next �� null �̸� 
					result.append("\r\n");              //  result�� "\r\n" ���̱�
				else
					result.append(", ");                 //  result�� ", " ���̱�
				node = node.next;                         //  node = node.next �� ���� ���� �̵�
			} 
		} 
		
		return result.toString(); 
	}
}

class GraphicEditor {
	private Shape createShape(Scanner scanner) {
		
		SHAPE_TYPE shapeType;
		Point p1, p2; 
		int radius;
		
		int type = UI.getShape(scanner);
		
		shapeType = SHAPE_TYPE.values()[type] ;
		Shape shape = null;
		
		String msgpoint = "Enter point coordinates (enter two integers) >> ";
		String msgradius = "Enter the radius (enter one integer) >> ";
	
		switch (shapeType) {
			case Shape_Rect : // �簢��
				p1 = UI.getWidthHeight(scanner, msgpoint);
				p2 = UI.getWidthHeight(scanner, msgpoint);
				shape = new Rect(p1, p2);
				break;
			case Shape_Circle : // ��
				p1 = UI.getWidthHeight(scanner, msgpoint);
				radius = UI.getRadius(scanner, msgradius);
				shape = new Circle(radius, p1);
				break;
			case Shape_Line : // ����
				p1 = UI.getWidthHeight(scanner, msgpoint);
				p2 = UI.getWidthHeight(scanner, msgpoint);
				shape = new Line(p1, p2);
				break;
				
		}
		return shape;
	}
	

	public void run() {
		ShapeList list = new ShapeList();             // shape ����Ʈ�� ������ ��ü ����
		
		Scanner scanner = new Scanner(System.in);     // ����� �Է��� ���� ��ĳ�� ��ü ����
		
		Shape shape = null;			  // �ӽ÷� ����� Shape ���۷��� ���� ����  
		boolean  bLoop = true;                         // �ݺ��� ������ �ο︰ ���� 
		Point p1;
		String msgpoint = "Enter two integers to move along the X and Y axes (enter two integers) >> ";
		
		while (bLoop) {
			int n = UI.getMainMenu(scanner);           // �޴� ���� �о� ����
			MAIN_MENU menu = MAIN_MENU.values()[n] ;   // �������� ������ ��ȯ  
			
			switch (menu)
			{
				case Insert_front:	 // ����Ʈ �տ� ����
					 // ������ ���� ��ü ����
					
 					//   ����Ʈ �տ� ����
					break;
				case Insert_rear:  // ����Ʈ �ڿ� ����
					// ������ ���� ��ü ����
					UI.getShape(scanner);
					 // ����Ʈ �ڿ� ����	
					break;
				case Remove_front:	// ����Ʈ �տ��� ����
					// ����Ʈ �տ��� ���� (���� ���� shape�� ����)		
					break;
				case Remove_rear: // ����Ʈ �ڿ��� ����
					// ����Ʈ �ڿ��� ���� (���� ���� shape�� ����)	
					break;
				case Move_front: // ����Ʈ ù��° ��ü �̵�
					
					//  get_frontValue �޼ҵ带 �̿��ؼ� ù��° shape ���� ������ ����
					//  shape �� ���� �ƴϸ�
					//     �̵��� ���� ���� �ޱ�, UI.getWidthHeight �̿�	
					//     ��ǥ�̵�
					break;
				case Move_rear:	// ����Ʈ ������ ��ü �̵�
					//  get_rearValue�޼ҵ带 �̿��ؼ� ������ shape ���� ������ ����
					//  shape �� ���� �ƴϸ�
					//     �̵��� ���� ���� �ޱ�, UI.getWidthHeight �̿�	
					//      ��ǥ�̵�
					
				case list_all:	// ����Ʈ ���� ���
					System.out.print(list.toString());	
					break;
				case Exit:
					bLoop= false;  // ������
			}
		}
		scanner.close();
	}
}

public class Main {

	public static void main(String[] args) {

		GraphicEditor g = new GraphicEditor();  		// GraphicEditor  ���� 
		g.run();                                                                // ���� �Լ� ȣ��
		
		System.out.println("Good Bye");   		        
	}
}