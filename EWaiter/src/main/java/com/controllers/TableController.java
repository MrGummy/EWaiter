//package com.controllers;
//
//import com.dao.TableDao;
//import com.google.gson.Gson;
//import com.model.Table;
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
//public class TableController
//{
//    @Autowired
//    private Gson gson;
//
//    @Autowired
//    private TableDao tableDao;
//
//    @RequestMapping("/table/selectAll")
//    @ResponseBody
//    public String selectAll()
//    {
//        return gson.toJson(tableDao.selectAll());
//    }
//
//    @RequestMapping("/table/selectById/{tableId}")
//    @ResponseBody
//    public String selectById(@PathVariable(value="tableId") int tableId)
//    {
//        return gson.toJson(tableDao.selectById(tableId));
//    }
//
//    @RequestMapping(value ="/table/deleteById/{tableId}",method  = RequestMethod.GET)
//    @ResponseBody
//    public String deleteById(@PathVariable(value="tableId") int tableId)
//    {
//        return tableDao.deleteById(tableId)+"";
//    }
//
//    @RequestMapping(value="/table/insertTable/{json}",method = RequestMethod.GET)
//    @ResponseBody
//    public String insert(@PathVariable(value="json") String json)
//    {
//        Table table = gson.fromJson(json,Table.class);
//        return tableDao.insert(table)+"";
//    }
//
//    @RequestMapping(value="/table/updateTable/{json}",method = RequestMethod.GET)
//    @ResponseBody
//    public String update(@PathVariable(value="json") String json)
//    {
//        Table table = gson.fromJson(json,Table.class);
//        return tableDao.update(table)+"";
//    }
//}