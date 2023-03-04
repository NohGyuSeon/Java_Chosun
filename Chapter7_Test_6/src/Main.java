import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
	private String city;
	private double longitude;
	private double latitude;

	public Location(String city, double longitude, double latitude) {
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLatitude() {
		return latitude;
	}	
}

public class Main {

	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>();
	
	private void read() {
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String city = st.nextToken().trim();
			double logitude = Double.parseDouble(st.nextToken().trim());
			double latitude = Double.parseDouble(st.nextToken().trim());
			
			Location loc = new Location(city, logitude, latitude);
			dept.put(city, loc);
		}
	}

	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		while(it.hasNext()) {
			String city = it.next();
			Location loc = dept.get(city);

			System.out.print(loc.getCity() + "\t"); 
			System.out.print(loc.getLongitude() + "\t"); 
			System.out.println(loc.getLatitude());
		}
		System.out.println("---------------------------");
	}
	
	private void processQuery() {
		while(true) {
			System.out.println("도시 이름 >> ");
			String city = scanner.nextLine();
			if(city.equals("그만"))
				return;
			
			Location loc = dept.get(city);
			
			if(loc == null) {
				System.out.println(city + "는 없습니다.");
			}
			else {
				System.out.print(loc.getCity() + "\t"); 
				System.out.print(loc.getLongitude() + "\t"); 
				System.out.println(loc.getLatitude());
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
