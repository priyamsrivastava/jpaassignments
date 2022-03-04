package in.cpg.lab02.serviceimpl;

import in.cpg.lab02.dao.FoodDAO;
import in.cpg.lab02.daoimpl.FoodDAOImpl;
import in.cpg.lab02.domain.Food;
import in.cpg.lab02.service.FoodService;

public class FoodServiceImpl implements FoodService {
	
	private FoodDAO foodDAO;
	
	public FoodServiceImpl() {
		foodDAO = new FoodDAOImpl();
	}

	@Override
	public void addList(Food food) {
		
		foodDAO.save(food);
	}

}
