package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada
		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader bufferedReader = new BufferedReader(isr);
		
		String linha = bufferedReader.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = bufferedReader.readLine();
			
		}
		
		bufferedReader.close();
	}

}
