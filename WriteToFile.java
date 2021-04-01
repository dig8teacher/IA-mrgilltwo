import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	String name;
	public void Writen(String name){
	try {
		FileWriter Writer = new FileWriter("name.txt");
		Writer.write(name);
		Writer.close();
	} catch (IOException e) {
			e.printStackTrace();
}
}
	int s;
	public void Writes(int s){
	try {
		String filename= "name.txt";
		FileWriter Writer = new FileWriter(filename, true);
		Writer.write("\n"+s);
		Writer.close();
	} catch (IOException e) {
			e.printStackTrace();
		}
}
	String password;
	public void Writep(String password){
	try {
		String filename= "name.txt";
		FileWriter Writer = new FileWriter(filename, true);
		Writer.write("\n"+password);
		Writer.close();
	} catch (IOException e) {
			e.printStackTrace();
		}
}
	public void Prints(String name, int s, String password){
		System.out.println("File write Succesful, you will find a name.txt file, that has " + name +" and " + s +" and " + password);
} 	

}
		 
