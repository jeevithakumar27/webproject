package com.niit.projectbackend.dao;

import java.util.List;

import com.niit.projectbackend.dto.Category;

public interface CategoryDAO {
	List<Category>list();
	Category get(int id);

}
