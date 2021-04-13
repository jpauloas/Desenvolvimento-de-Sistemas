import java.io.File; // para criar o arquivo

public class GetFileInfo {
	public static void main (String[] args) {
		File myObj = new File("filename.txt"); //criando o arquivo
		if (myObj.exists()) { //se o arquivo existir, imprimir informações sobre
			System.out.println("File name: " + myObj.getName()); 
			System.out.println("Absolute path: " + myObj.getAbsolutePath());
			System.out.println("Writeable: " + myObj.canWrite());
			System.out.println("Readable: " + myObj.canRead());
			System.out.println("File size in bytes: " + myObj.length());
			
		} else { // se o arquivo não existir, imprimir que não existe
			System.out.println("The file does not exist");
		}
	}


}
