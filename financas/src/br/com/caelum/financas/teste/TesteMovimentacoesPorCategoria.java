package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Categoria;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteMovimentacoesPorCategoria {
	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Categoria categoria = new Categoria();
		categoria.setId(8);
		
		String jpql = "select m from Movimentacao m where m.conta = :pConta" + 
		" and m.tipo = :pTipo" +
		" order by m.valor desc";
		
	    Query query = em.createQuery(jpql);
	  
	    
	    List<Movimentacao> resultados = query.getResultList();
	    
	    for (Movimentacao movimentacao : resultados) {
			System.out.println("Descrição: " + movimentacao.getDescricao());
			System.out.println("Conta.id: " + movimentacao.getConta().getId());
		}
		
		em.getTransaction().commit();
		em.close();
	}

}
