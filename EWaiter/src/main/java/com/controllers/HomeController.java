package com.controllers;

import com.dao.CategoryDaoImpl;
import com.dao.CompanyDaoImpl;
import com.model.Category;
import com.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class HomeController
{
    @Autowired
    private CompanyDaoImpl companyDao;

    @RequestMapping("/")
    public String index0(Model companyModel)
    {
        List<Company> companies = companyDao.selectAll();
        companyModel.addAttribute("companies", companies);
        return "home";
    }

    @Autowired
    private CategoryDaoImpl categoryDao;

    @RequestMapping("/")
    public String index1(Model categoryModel)
    {
        List<Category> categories = categoryDao.selectAll();
        categoryModel.addAttribute("companies", categories);
        return "home";
    }
}
