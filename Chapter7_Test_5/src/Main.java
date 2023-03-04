import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

class Student { 
	private String name;
	private String department;
	private String id;
	private double grade;
	
	public Student(String name, String department, String id, double grade) {
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public double getGrade() {
		return grade;
	}
}

public class Main {
	
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> dept = new ArrayList<Student>();

	private void read() {
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String id= st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());

			Student student = new Student(name, department, id, grade);
			
			dept.add(student);
		}
	}
	
	private void printAll() {
		Iterator<Student> it = dept.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println("---------------------------"); 
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getDepartment()); 
			System.out.println("학번:" + student.getId()); 
			System.out.println("학점평균:" + student.getGrade()); 
			System.out.println("---------------------------");
		}
	}
	
	private void processQuery() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine();
			if(name.equals("그만"))
				return;
			for (int i = 0; i < dept.size(); i++) {
				Student student = dept.get(i);
				
				if(student.getName().equals(name)) {
					System.out.print(student.getName() + ", "); 
					System.out.print(student.getDepartment() + ", "); 
					System.out.print(student.getId() + ", "); 
					System.out.println(student.getGrade()); 
					break; // for 문을 벗어남
				}
			}
		}
	}
	
	public void run() {
		read();
		printAll();
		processQuery();
	}

	public static void main(String[] args) {
		
		Main man = new Main();
		man.run();
	}
}

/*
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Student { 
	private String name;
	private String department;
	private String id;
	private double grade;
	
	public Student(String name, String department, String id, double grade) {
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public double getGrade() {
		return grade;
	}
}

public class Main {
	
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Student> dept = new HashMap<String, Student>();

	private void read() {
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String id= st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());

			Student student = new Student(name, department, id, grade);
			
			dept.put(name, student);
		}
	}
	
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Student student = dept.get(name);
			System.out.println("---------------------------"); 
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getDepartment()); 
			System.out.println("학번:" + student.getId()); 
			System.out.println("학점평균:" + student.getGrade()); 
			System.out.println("---------------------------");
		}
	}
	
	private void processQuery() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine();
			if(name.equals("그만"))
				return;
			
			Student student = dept.get(name);

			if(student == null) {
				System.out.println(name + "학생 없습니다.");
			}
			else {
				System.out.print(student.getName() + ", ");
				System.out.print(student.getDepartment() + ", ");
				System.out.print(student.getId() + ", ");
				System.out.println(student.getGrade());
			}
		}
	}
	
	public void run() {
		read();
		printAll();
		processQuery();
	}

	public static void main(String[] args) {
		
		Main man = new Main();
		man.run();
	}
}	
*/
