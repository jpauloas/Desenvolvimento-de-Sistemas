package Atv026;

import java.util.Scanner; 
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class principal {
	
	public static void main(String[] args) {
		
		ArrayList<String> mochila = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Quantas coisas existem na sua mochina?");
		int num = scan.nextInt();
		
		System.out.println("O que há na sua mochila?");
		for (int i = 0; i < num; i ++) {
			String item = scan.nextLine();
			mochila.add(item);
		}
		System.out.println("O que deseja achar?");
		String achado = scan.next();
		if(mochila.contains(achado)) {
		    System.out.println(achado + " está na mochila!");
		}
		else {
		    System.out.println(achado + " não está na mochila!");
		}
	}
}