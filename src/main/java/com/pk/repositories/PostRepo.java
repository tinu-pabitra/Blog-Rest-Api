package com.pk.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.entities.Category;
import com.pk.entities.Post;
import com.pk.entities.User;

public interface PostRepo extends JpaRepository<Post,Integer>{
List<Post> findByUser(User user);
List<Post> findByCategory(Category category);
List<Post> findByTitleContaining(String title);


}
