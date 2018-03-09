package com.controllers;

import com.dao.CategoryDao;
import com.google.gson.Gson;
import com.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController
{
    @Autowired
    private Gson gson;

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping("/category/selectAll")
    @ResponseBody
    public String selectAll()
    {
        return gson.toJson(categoryDao.selectAll());
    }

    @RequestMapping(value ="/category/deleteById/{categoryId}",method  = RequestMethod.GET)
    @ResponseBody
    public String deleteById(@PathVariable(value="categoryId") int categoryId)
    {
        return categoryDao.deleteById(categoryId)+"";
    }

    @RequestMapping(value="/category/insertCategory/{json}",method = RequestMethod.GET)
    @ResponseBody
    public String insert(@PathVariable(value="json") String json)
    {
        Category category = gson.fromJson(json,Category.class);
        return categoryDao.insert(category)+"";
    }

    @RequestMapping(value="/category/insertCategory/{json}",method = RequestMethod.GET)
    @ResponseBody
    public String update(@PathVariable(value="json") String json)
    {
        Category category = gson.fromJson(json,Category.class);
        return categoryDao.update(category)+"";
    }
}
