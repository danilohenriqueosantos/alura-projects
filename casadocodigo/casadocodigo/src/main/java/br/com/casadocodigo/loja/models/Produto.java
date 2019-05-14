package br.com.casadocodigo.loja.models;


import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titulo;
	
	@Lob
	private String descricao;
	private int paginas;
	
	@DateTimeFormat
	private Date dataLancamento;

	@ElementCollection
	private List<Preco> precos; 
	
	private String sumarioPath;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Produto(String titulo, String descricao, int paginas) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.paginas = paginas;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Preco> getPrecos() {
		return precos;
	}
	
	public void setPrecos(List<Preco> precos) {
		this.precos = precos;
	}
	
	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getSumarioPath() {
		return sumarioPath;
	}
	
	public void setSumarioPath(String sumarioPath) {
		this.sumarioPath = sumarioPath;
	}
		
	@Override
	public String toString() {
		return "Produto [titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + "]";
	}


}
