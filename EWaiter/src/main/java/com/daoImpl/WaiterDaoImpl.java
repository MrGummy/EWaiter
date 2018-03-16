package com.daoImpl;

import com.dao.WaiterDao;
import com.mappers.WaiterMapper;
import com.model.Waiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class WaiterDaoImpl implements WaiterDao {

    @Autowired
    private WaiterMapper waiterMapper;

    @Override
    public List<Waiter> selectAll() {
        List<Waiter> waiters = waiterMapper.selectAll();
        return waiters;
    }

    @Override
    public Waiter selectById(Integer id) {
        return waiterMapper.selectById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return waiterMapper.deleteById(id);
    }

    @Override
    public int insert(Waiter waiter) {
        return waiterMapper.insert(waiter);
    }

    @Override
    public int update(Waiter waiter) {
        return waiterMapper.update(waiter);
    }
}