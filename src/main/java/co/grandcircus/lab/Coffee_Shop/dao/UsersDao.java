package co.grandcircus.lab.Coffee_Shop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.lab.Coffee_Shop.entity.Users;

@Repository
@Transactional
public class UsersDao {

	@PersistenceContext
	private EntityManager em;
	
	public Users findById(Long id) {
		return em.find(Users.class, id);
	}
	
	public List<Users> findAll() {
		return em.createQuery("FROM Users", Users.class).getResultList();
	}
	
	public void create(Users users) {
		em.persist(users);
	}
	
	public void update(Users users) {
		em.merge(users);
	}
	
	public void delete(Long id) {
		em.remove(em.getReference(Users.class, id));
	}
	
}
