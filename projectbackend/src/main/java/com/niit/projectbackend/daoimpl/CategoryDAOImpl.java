package com.niit.projectbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.projectbackend.dao.CategoryDAO;
import com.niit.projectbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	private static List<Category> categories=new ArrayList<>();

	
static
{
	Category category=new Category();
	 category.setId(1);
	 category.setName("TELEVISION");
	 category.setDescription(" this is our product");
	 category.setImageURL("1.jpg");
	 categories.add(category);
	 category=new Category();
	 category.setId(2);
	 category.setName("MOBLIE");   
	 category.setDescription(" this is our product");
	 category.setImageURL("2.jpg");
	 categories.add(category);
	 category=new Category();
	 category.setId(3);
	 category.setName("LAPTOP");   
	 category.setDescription(" this is our product");
	 category.setImageURL("3.jpg");
	 categories.add(category);
}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		//enhanced for loop
		for(Category category : categories)
		{
			if(category.getId()== id)return category;
		}
		return null;
		
	}

}
