package service;

import domain.Category;

import java.util.List;

/**
 * Created by 83731 on 2017/11/26.
 */
public interface BusinessService {
    /**
     * 添加一个分类
     *
     * @param category
     */
    void addCategory(Category category);

    /**
     * 查询所有的分类
     *
     * @return
     */
    List<Category> findAllCategories();

    /**
     * 根据id查询实体
     *
     * @param categoryId
     * @return  没有找到返回null
     */
    Category findCategoryById(String categoryId);
}
