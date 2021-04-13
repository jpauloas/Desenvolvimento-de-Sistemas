import java.io.File; // para criar o arquivo
import java.io.IOException; // Importa IOException class manejar erros

public class CreateFile {
	public static void main (String[] args) {
		try {
			File myObj = new File("filename.txt"); // criando arquivo
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("Arquivo já existe!");
			}

			
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();			
		}
	}
}
