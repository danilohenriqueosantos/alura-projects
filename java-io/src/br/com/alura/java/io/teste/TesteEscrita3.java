package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {

		//Fluxo de saída
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bufferedWriter = new BufferedWriter(osw);
		
		PrintStream printStream = new PrintStream("lorem2.txt");
		printStream.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		printStream.println();
		printStream.println("papumbols");
		printStream.close();
	}

}
