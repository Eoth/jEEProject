package com.EJB;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.entity.Product;

@Stateless
public class ProductDao {
	// Injected database connection:
    @PersistenceContext private EntityManager em;
    
    // Stores a new guest:
    public void persist(Product product) {
        em.merge(product);
    }

    // Retrieves all the guests:
    public List<Product> getAllProducts() {
        TypedQuery<Product> query = em.createQuery(
            "SELECT p FROM Product p", Product.class);
        return query.getResultList();
    }

}
