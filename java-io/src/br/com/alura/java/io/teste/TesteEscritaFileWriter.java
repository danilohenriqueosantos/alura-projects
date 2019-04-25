package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		//Fluxo de saída
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bufferedWriter = new BufferedWriter(osw);
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bufferedWriter.write(System.lineSeparator());
		bufferedWriter.write("çlkajsdçlfkjaçlsdfjçlasd");
		
		
		bufferedWriter.close();
	}

}
