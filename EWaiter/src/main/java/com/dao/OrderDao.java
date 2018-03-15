package com.dao;

import com.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderDao
{
    List<Order> selectAll();
    Order selectById(Integer id);
    int deleteById(Integer id);
    int insert(Order order);
    int update(Order order);
}
