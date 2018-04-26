package com.dao;

import com.model.DishPhoto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DishPhotoDao
{
    List<DishPhoto> selectAll();
    DishPhoto selectById(Integer id);
    int deleteById(Integer id);
    int insert(DishPhoto dishPhoto);
    int update(DishPhoto dishPhoto);
}
