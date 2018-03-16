package com.daoImpl;

import com.dao.OrderDao;
import com.mappers.OrderMapper;
import com.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectAll() {
        List<Order> orders = orderMapper.selectAll();
        return orders;
    }

    @Override
    public Order selectById(Integer id) {
        return orderMapper.selectById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return orderMapper.deleteById(id);
    }

    @Override
    public int insert(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public int update(Order order) {
        return orderMapper.update(order);
    }
}
