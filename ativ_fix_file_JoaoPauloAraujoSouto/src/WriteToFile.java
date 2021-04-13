import java.io.File; // para criar o arquivo
import java.io.IOException; // Importa IOException class manejar erros
import java.io.FileWriter;  // Importa FileWriter class


public class WriteToFile {
	public static void main (String[] args) {
		try {
			FileWriter myWriter = new FileWriter("filename.txt"); // criando o arquivo
			myWriter.write("Files in Java migth be tricky, but is fun enough!"); // escrevendo sob o arquivo
			myWriter.close(); // fecha edições no arquivo
			System.out.println("Successully wrote to the file."); // mensagem de sucesso na edição!
					
		
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	
	}
	
}
