package in.cpg.lab02.dao;

import java.util.ArrayList;

import in.cpg.lab02.domain.Food;

public interface FoodDAO {
	
	/**
	 * Save the food details.
	 * @param food
	 * @return
	 */
	void save(Food food);
	
	/**
	 * List all the food items
	 */
	ArrayList<Food> list(ArrayList<Food> foodList);
}
