package com.daoImpl;

import com.dao.TableDao;
import com.mappers.TableMapper;
import com.model.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TableDaoImpl implements TableDao {

    @Autowired
    private TableMapper tableMapper;

    @Override
    public List<Table> selectAll() {
        List<Table> tables = tableMapper.selectAll();
        return tables;
    }

    @Override
    public Table selectById(Integer id) {
        return tableMapper.selectById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return tableMapper.deleteById(id);
    }

    @Override
    public int insert(Table table) {
        return tableMapper.insert(table);
    }

    @Override
    public int update(Table table) {
        return tableMapper.update(table);
    }
}
