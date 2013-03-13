package Controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Automovel;
import persistence.JPAUtil;

@ManagedBean
public class AutomovelBean {
	private Automovel automovel = new Automovel();
	private List<Automovel> automoveis;
     
	// ####### Metodos Get e Set #######
	public List<Automovel> getAutomoveis() {
		if (this.automoveis == null) {
			EntityManager em = JPAUtil.getEntityManager();
			Query q = em.createQuery("select a from Automovel a ",Automovel.class);
			this.automoveis = q.getResultList();
			em.close();
		}
		return automoveis;

	}

	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	// ####### Metodo Salva #######
	public void salva(Automovel automovel) {
		// conseguimos a EntityManager
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();

		em.persist(automovel);

		em.getTransaction().commit();
		em.close();

	}

	// ###### Metodo Excluir #########
	public void exclui(Automovel automovel) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		
		em.remove(automovel);
		em.getTransaction().commit();
		em.close();

	}

}
