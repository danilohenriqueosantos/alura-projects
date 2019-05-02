package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		//Fluxo de saída
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bufferedWriter = new BufferedWriter(osw);
		
		bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bufferedWriter.newLine();
		bufferedWriter.write("çlkajsdçlfkjaçlsdfjçlasd");
		
		
		bufferedWriter.close();
	}

}
