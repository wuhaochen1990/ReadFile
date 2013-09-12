import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ReadFile {
	public static void main(String arg[]){
		// Input file path
		String filePath = "/Users/haochenwu/Documents/Instruction.txt";
		//string from the certain file
		String instruction = "";
		//try read file from that path
		try{
			//create a input stream to read a file
			File file = new File(filePath);
			FileReader fileread = new FileReader(file);  
			BufferedReader br = new BufferedReader(fileread);
			//start read the file
			while((instruction=br.readLine())!=null){
				//deal with each line of that file
				System.out.println(instruction+"\n");
			}
		}catch(Exception ex){
			//for exception situation
			System.out.println(ex.getMessage());  
		}
	}
}
