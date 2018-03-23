//package com.controllers;
//
//import com.dao.CompanyDao;
//import com.google.gson.Gson;
//import com.model.Company;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//public class CompanyController
//{
//    @Autowired
//    private Gson gson;
//
//    @Autowired
//    private CompanyDao companyDao;
//
//    @RequestMapping("/company/selectAll")
//    @ResponseBody
//    public String selectAll()
//    {
//        return gson.toJson(companyDao.selectAll());
//    }
//
//    @RequestMapping("/company/selectById/{companyId}")
//    @ResponseBody
//    public String selectById(@PathVariable(value="companyId") int companyId)
//    {
//        return gson.toJson(companyDao.selectById(companyId));
//    }
//
//    @RequestMapping(value ="/company/deleteById/{companyId}",method  = RequestMethod.GET)
//    @ResponseBody
//    public String deleteById(@PathVariable(value="companyId") int companyId)
//    {
//        return companyDao.deleteById(companyId)+"";
//    }
//
//    @RequestMapping(value="/company/insertCompany/{json}",method = RequestMethod.GET)
//    @ResponseBody
//    public String insert(@PathVariable(value="json") String json)
//    {
//        Company company = gson.fromJson(json,Company.class);
//        return companyDao.insert(company)+"";
//    }
//
//    @RequestMapping(value="/company/updateCompany/{json}",method = RequestMethod.GET)
//    @ResponseBody
//    public String update(@PathVariable(value="json") String json)
//    {
//        Company company = gson.fromJson(json,Company.class);
//        return companyDao.update(company)+"";
//    }
//}
