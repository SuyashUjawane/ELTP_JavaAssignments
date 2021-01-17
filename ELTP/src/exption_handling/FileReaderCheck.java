package exption_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReaderCheck {
	public static void main(String[] args) throws FileNotFoundException{
		File Fileobject = new File("C:\\Users\\Suyash\\Downloads\\JavaEltp\\Movies.txt");
		Scanner fileReader = new Scanner(Fileobject);
		while(fileReader.hasNext())
		{
			String line = fileReader.nextLine();
		    String[] splitText = line.split("-");
		    if (splitText.length < 2) {
		        try {
					throw new Exception("Check for number of fields provided");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		    try {
		        Integer.parseInt(splitText[1]);
		    }
		    catch(Exception e) {
		    	System.out.println("Check for valid movie ids. Must be Integers "+ e);
				e.printStackTrace();
				System.out.println(e.getMessage());
		    }
		}
	}
}
