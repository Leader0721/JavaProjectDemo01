package dao;

import domain.Category;

import java.util.List;

/**
 * Created by 83731 on 2017/11/26.
 */
public interface CategoryDao {
    void save(Category category);

    List<Category> findAll();

    Category findById(String categoryId);
}
