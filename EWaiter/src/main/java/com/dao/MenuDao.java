package com.dao;

import com.model.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuDao
{
    List<Menu> selectAll();
    Menu selectById(Integer id);
    List<Menu> selectByCompanyId(Integer id);
    int deleteById(Integer id);
    int insert(Menu menu);
    int update(Menu menu);
}
