package com.daoImpl;

import com.dao.MenuDao;
import com.mappers.MenuMapper;
import com.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class MenuDaoImpl implements MenuDao {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> selectAll() {
        List<Menu> menus = menuMapper.selectAll();
        return menus;
    }

    @Override
    public Menu selectById(Integer id) {
        return menuMapper.selectById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return menuMapper.deleteById(id);
    }

    @Override
    public List<Menu> selectByCompanyId(Integer id) {
        return menuMapper.selectByCompanyId(id);
    }

    @Override
    public int insert(Menu menu) {
        return menuMapper.insert(menu);
    }

    @Override
    public int update(Menu menu) {
        return menuMapper.update(menu);
    }
}