package ie.dit;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook {
	
	ArrayList<Tune> tunes = new ArrayList<Tune>();

	TuneBook(String title) {
		
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader("abc.txt"));
    
			String l;
			while ((l = inputStream.readLine()) != null) 
			{
				tunes.add(l);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			if (inputStream != null) 
			{
				try {
					inputStream.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		} 
		
		public String toString() 
			{	
				StringBuffer sb = new StringBuffer();
				for(String list:tunes)
				{
					sb.append(list + "\n");
				}

				return sb.toString();
			}
			
		public Tune findTune(String title) 
		{
			this.title = "dance"
			for(x = 0; x < tunes.size(); x++)
			{
				String check;
				check = tunes.get(x)
				
			}
	
	
		}
		
		public static void main(String[] args)
			{
				TuneBook tb = new TuneBook("hnj0.abc");
				System.out.println(tb);

				Tune t = tb.findTune("Scotsman over the Border");
				t.play();
			}
			
	}		
}