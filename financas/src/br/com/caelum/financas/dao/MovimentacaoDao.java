package br.com.caelum.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class MovimentacaoDao {

	private EntityManager em = new JPAUtil().getEntityManager();
	
	public List<Double> getMediaPorDiasETipo(TipoMovimentacao saida, Conta conta) {
		String jpql = "select avg(m.valor) from Movimentacao m where m.conta = :pConta" + " and m.tipo = :pTipo"
				+ " group by day(m.data), month(m.data), year(m.data)";

		TypedQuery<Double> query = em.createQuery(jpql, Double.class);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.SAIDA);

		return query.getResultList();
	}

}
