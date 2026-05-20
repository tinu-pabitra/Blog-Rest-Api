package com.pk.services;

import java.util.List;

import com.pk.payloads.CategoryDto;

public interface CategoryService {
	//create
	public CategoryDto createCategory(CategoryDto categoryDto);
	//update
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	//delete
	void deleteCategory(Integer categoryId);
	//get
	CategoryDto getCategory(Integer categoryId);

	//get All
	List<CategoryDto> getCategories();
	

}
