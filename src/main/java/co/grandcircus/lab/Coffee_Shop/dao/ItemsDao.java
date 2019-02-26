package co.grandcircus.lab.Coffee_Shop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.lab.Coffee_Shop.entity.Items;
import co.grandcircus.lab.Coffee_Shop.entity.cartitems;

@Repository
@Transactional
public class ItemsDao {

	@PersistenceContext
	private EntityManager em;

	public Items findById(Long id) {
		return em.find(Items.class, id);
	}
	
	public List<Items> findAll() {
		return em.createQuery("FROM Items", Items.class).getResultList();
	}
	
	public List<cartitems> findByCartitems(cartitems cartitems) {
		return em.createQuery("from cartitems where cartitems = :cartitems order by itemname", cartitems.class)
				.setParameter("cartitems", cartitems)
				.getResultList();
	}
	
	public void create(Items items) {
		em.persist(items);
	}
	
	public void update(Items items) {
		em.merge(items);
	}
	
	public void delete(Long id) {
		em.remove(em.getReference(Items.class, id));
	}
	
}
