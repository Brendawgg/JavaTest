package ie.dit;

public class Tune {
	
	int x;
	private String title;
	private String altTitle;
	private String notation;
	
	public int getX() {
		
		return x;
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public String getAltTitle() {
		
		return altTitle;
	}
	
	public String getNotation() {
		
		return notation;
	}
	
	public void toString(int x, String title, String altTitle) {
		
		System.out.println( x + "," + title + "," + altTitle);
	}
	
}