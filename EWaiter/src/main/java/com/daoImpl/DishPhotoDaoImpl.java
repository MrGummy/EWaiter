package com.daoImpl;

import com.dao.DishPhotoDao;
import com.mappers.DishPhotoMapper;
import com.model.DishPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class DishPhotoDaoImpl implements DishPhotoDao {

    @Autowired
    private DishPhotoMapper dishPhotoMapper;

    @Override
    public List<DishPhoto> selectAll() {
        List<DishPhoto> categories = dishPhotoMapper.selectAll();
        return categories;
    }

    @Override
    public DishPhoto selectById(Integer id) {
        return dishPhotoMapper.selectById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return dishPhotoMapper.deleteById(id);
    }

    @Override
    public int insert(DishPhoto dishPhoto) {
        return dishPhotoMapper.insert(dishPhoto);
    }

    @Override
    public int update(DishPhoto dishPhoto) {
        return dishPhotoMapper.update(dishPhoto);
    }
}
