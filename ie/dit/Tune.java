public class Tune {
	
	int x
	private String title
	private String altTitle
	private String notation
	
	public getX() {
		
		return x;
	}
	
	public getTitle() {
		
		return title;
	}
	
	public getAltTitle() {
		
		return altTitle;
	}
	
	public getNotation() {
		
		return notation;
	}
	
	public toString(int x, String title, String altTitle) {
		
		System.out.println( x + "," + title + "," + altTitle)
	}
	
}