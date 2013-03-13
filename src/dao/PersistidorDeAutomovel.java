package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import modelo.Automovel;
import persistence.JPAUtil;

public class PersistidorDeAutomovel {
	public static void main(String[] args) {

		Automovel auto = new Automovel();
		auto.setAnoFabricacao(2010);
		auto.setModelo("Ferrari");
		auto.setObservacoes("Nunca foi batido");

		EntityManager em = JPAUtil.getEntityManager();
		Query q = em.createQuery("select a from Automovel a", Automovel.class);
		List<Automovel> autos = q.getResultList();

		for (Automovel a : autos) {
			System.out.println(a.getMarca());
		}

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(auto);
		tx.commit();
		em.close();

	}
}