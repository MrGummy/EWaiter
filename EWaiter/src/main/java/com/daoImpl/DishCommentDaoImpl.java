package com.daoImpl;

import com.dao.DishCommentDao;
import com.mappers.DishCommentMapper;
import com.model.DishComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class DishCommentDaoImpl implements DishCommentDao {

    @Autowired
    private DishCommentMapper dishCommentMapper;

    @Override
    public List<DishComment> selectAll() {
        List<DishComment> categories = dishCommentMapper.selectAll();
        return categories;
    }

    @Override
    public DishComment selectById(Integer id) {
        return dishCommentMapper.selectById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return dishCommentMapper.deleteById(id);
    }

    @Override
    public int insert(DishComment dishComment) {
        return dishCommentMapper.insert(dishComment);
    }

    @Override
    public int update(DishComment dishComment) {
        return dishCommentMapper.update(dishComment);
    }
}
