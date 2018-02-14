import java.util.ArrayList;

public Class TuneBook {
	
	ArrayList<Tune> tunes = new ArrayList<Tune>;

	TuneBook(String s) {
		
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader("abc.txt"));
    
			String l;
			while ((l = inputStream.readLine()) != null) 
			{
				tunes.set(l);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			if (inputStream != null) {
				try
				{
					inputStream.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		} 
			
}