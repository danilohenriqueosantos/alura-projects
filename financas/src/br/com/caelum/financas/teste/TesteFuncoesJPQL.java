package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteFuncoesJPQL {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setId(2);
		
		
		MovimentacaoDao dao = new MovimentacaoDao();
		List<Double> medias = dao .getMediaPorDiasETipo(TipoMovimentacao.SAIDA, conta);	    
	    System.out.println("A média do dia 26 é: " + medias.get(0));
	    System.out.println("A média do dia 27 é: " + medias.get(1));
	    
		em.getTransaction().commit();
		em.close();
		
		
	}
}
