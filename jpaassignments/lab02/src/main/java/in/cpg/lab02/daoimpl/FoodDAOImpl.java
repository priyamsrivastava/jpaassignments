package in.cpg.lab02.daoimpl;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import in.cpg.lab02.dao.FoodDAO;
import in.cpg.lab02.domain.Food;
import in.cpg.lab02.menuutil.JPAUtil;

public class FoodDAOImpl extends JPAUtil implements FoodDAO {

	@Override
	public void save(Food food) {
		EntityManager entityManager = getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(food);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public ArrayList<Food> list(ArrayList<Food> foodList) {
		// TODO Auto-generated method stub
		return null;
	}
	
}