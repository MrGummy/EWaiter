package com.daoImpl;

import com.dao.DishDao;
import com.mappers.CategoryMapper;
import com.mappers.DishMapper;
import com.model.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class DishDaoImpl implements DishDao {

    @Autowired
    private DishMapper dishMapper;
    private CategoryMapper categoryMapper;

    @Override
    public List<Dish> selectAll() {
        List<Dish> dishes = dishMapper.selectAll();
        return dishes;
    }

    @Override
    public Dish selectById(Integer id) {
        return dishMapper.selectById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return dishMapper.deleteById(id);
    }

    @Override
    public int insert(Dish dish) {
        return dishMapper.insert(dish);
    }

    @Override
    public int update(Dish dish) {
        return dishMapper.update(dish);
    }
}
