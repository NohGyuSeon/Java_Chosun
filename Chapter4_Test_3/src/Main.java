class Song {
	private String title, artist, country;
	private int year;
	
	public Song() {
		
	}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(this.year + "�� " + this.country + "������ " + this.artist + "�� �θ� " + this.title);	
	}
}

public class Main {

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "������");
		song.show();
	}

}