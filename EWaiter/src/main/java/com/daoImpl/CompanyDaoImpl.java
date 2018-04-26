package com.daoImpl;

import com.dao.CompanyDao;
import com.mappers.CompanyMapper;
import com.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CompanyDaoImpl implements CompanyDao {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public List<Company> selectAll() {
        List<Company> companies = companyMapper.selectAll();
        return companies;
    }


    @Override
    public Company selectById(Integer id) {
        return companyMapper.selectById(id);
    }

    @Override
    public int deleteById(Integer id) {
        return companyMapper.deleteById(id);
    }

    @Override
    public int insert(Company company) {
        return companyMapper.insert(company);
    }

    @Override
    public int update(Company company) {
        return companyMapper.update(company);
    }
}
