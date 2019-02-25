package co.grandcircus.lab.Coffee_Shop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.lab.Coffee_Shop.entity.cartitems;

@Repository
@Transactional
public class CartitemsDao {

	@PersistenceContext
	private EntityManager em;

	public cartitems findById(Long id) {
		return em.find(cartitems.class, id);
	}
	
	public List<cartitems> findAll() {
		return em.createQuery("from cartitems order by itemname", cartitems.class).getResultList();
	}
	
	public void create(cartitems cartitems) {
		em.persist(cartitems);
	}
	
	public void update(cartitems cartitems) {
		em.merge(cartitems);
	}
	
	public void delete(Long id) {
		em.remove(em.getReference(cartitems.class, id));
	}
	
}
