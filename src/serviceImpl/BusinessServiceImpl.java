package serviceImpl;

import dao.CategoryDao;
import daoImpl.CategoryDaoImpl;
import domain.Category;
import service.BusinessService;

import java.util.List;
import java.util.UUID;

/**
 * Created by 83731 on 2017/11/26.
 */
public class BusinessServiceImpl implements BusinessService {
    private CategoryDao categoryDao = new CategoryDaoImpl();

    @Override
    public void addCategory(Category category) {
        category.setId(UUID.randomUUID().toString());
        categoryDao.save(category);
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryDao.findAll();
    }

    @Override
    public Category findCategoryById(String categoryId) {
        return categoryDao.findById(categoryId);
    }
}
