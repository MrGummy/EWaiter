//package com.controllers;
//
//import com.daoImpl.CategoryDaoImpl;
//import com.daoImpl.CompanyDaoImpl;
//import com.model.Category;
//import com.model.Company;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import java.util.List;
//
//@Controller
//public class HomeController
//{
//    @Autowired
//    private CompanyDaoImpl companyDao;
//
//    @RequestMapping("/")
//    public String index(Model companyModel)
//    {
//        List<Company> companies = companyDao.selectAll();
//        companyModel.addAttribute("companies", companies);
//        return "home";
//    }
//
//}
