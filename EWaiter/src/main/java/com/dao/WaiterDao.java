package com.dao;

import com.model.Waiter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WaiterDao
{
    List<Waiter> selectAll();
    Waiter selectById(Integer id);
    int deleteById(Integer id);
    int insert(Waiter waiter);
    int update(Waiter waiter);
}