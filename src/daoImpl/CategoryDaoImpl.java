package daoImpl;

import dao.CategoryDao;
import domain.Category;
import exception.DaoException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.DBCPUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 83731 on 2017/11/26.
 */
public class CategoryDaoImpl implements CategoryDao {
    private QueryRunner queryRunner = new QueryRunner(DBCPUtil.getDataSource());

    @Override
    public void save(Category category) {
        try {
            queryRunner.update("insert into categorys(id,name,description) values(?,?,?)", category.getId(), category.getName(), category.getDescription());
        } catch (SQLException e) {
            throw new DaoException(e);
        }

    }

    @Override
    public List<Category> findAll() {
        try {
            return queryRunner.query("select * from categorys", new BeanListHandler<Category>(Category.class));
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }

    @Override
    public Category findById(String categoryId) {
        try {
            return queryRunner.query("select * from categorys where id = ?", new BeanHandler<Category>(Category.class));
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }
}
