package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Danilo");
		cliente.setProfissao("DEV");
		cliente.setCpf("123456789");
		
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.setTitular(cliente);
		contaCorrente.deposita(222.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(contaCorrente);
		oos.close();
	}
}
