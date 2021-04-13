import java.io.File;// para criar o arquivo
import java.io.IOException; // Importa IOException class manejar erros
import java.io.FileWriter; // Importa FileWriter class
import java.io.FileNotFoundException;  // Importa class para manejar erros
import java.util.Scanner; // Importa Scanner class para ler arquivo texto
public class ReadFile {
	public static void main (String[] args) {
		try { 
			File myObj = new File ("filename.txt"); // criando o arquivo
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					System.out.println(data);			
			}
			myReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
