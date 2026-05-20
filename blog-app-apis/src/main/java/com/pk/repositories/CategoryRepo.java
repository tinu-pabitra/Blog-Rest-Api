package com.pk.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.entities.Category;
public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
