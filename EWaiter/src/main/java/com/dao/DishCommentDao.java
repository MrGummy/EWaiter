package com.dao;

import com.model.DishComment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DishCommentDao
{
    List<DishComment> selectAll();
    DishComment selectById(Integer id);
    int deleteById(Integer id);
    int insert(DishComment dishComment);
    int update(DishComment dishComment);
}
