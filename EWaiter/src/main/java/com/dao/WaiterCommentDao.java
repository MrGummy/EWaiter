package com.dao;

import com.model.WaiterComment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WaiterCommentDao
{
    List<WaiterComment> selectAll();
    WaiterComment selectById(Integer id);
//    int deleteById(Integer id);
//    int insert(WaiterComment waiterComment);
//    int update(WaiterComment waiterComment);
}
