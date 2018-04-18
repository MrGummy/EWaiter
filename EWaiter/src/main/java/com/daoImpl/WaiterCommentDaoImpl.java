package com.daoImpl;

import com.dao.WaiterCommentDao;
import com.mappers.WaiterCommentMapper;
import com.model.WaiterComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class WaiterCommentDaoImpl implements WaiterCommentDao {

    @Autowired
    private WaiterCommentMapper waiterCommentMapper;

    @Override
    public List<WaiterComment> selectAll() {
        List<WaiterComment> waiterComments = waiterCommentMapper.selectAll();
        return waiterComments;
    }

    @Override
    public WaiterComment selectById(Integer id) {
        return waiterCommentMapper.selectById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return waiterCommentMapper.deleteById(id);
    }

    @Override
    public int insert(WaiterComment waiterComment) {
        return waiterCommentMapper.insert(waiterComment);
    }

    @Override
    public int update(WaiterComment waiterComment) {
        return waiterCommentMapper.update(waiterComment);
    }
}
