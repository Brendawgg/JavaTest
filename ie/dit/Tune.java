//Author Brendan O'Dowd - c16476404
//Date 14-02-2018
//LabTest 2 program to load a text file into an ArrayList

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
		
		getX();
		getTitle();
		getAltTitle();
		getNotation();
		System.out.println( x + "," + title + "," + altTitle);
	}
	
}