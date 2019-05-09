package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {

		//Fluxo de Leitura e escrita
		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader bufferedReader = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bufferedWriter = new BufferedWriter(osw);
		
		String linha = bufferedReader.readLine();
		
		while(linha != null) {
			
			bufferedWriter.write(linha);
			bufferedWriter.newLine();
			linha = bufferedReader.readLine();
			
		}
		
		bufferedReader.close();
		bufferedWriter.close();
	}

}
