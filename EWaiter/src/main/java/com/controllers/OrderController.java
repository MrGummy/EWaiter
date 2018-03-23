//package com.controllers;
//
//import com.dao.OrderDao;
//import com.google.gson.Gson;
//import com.model.Order;
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
//public class OrderController
//{
//    @Autowired
//    private Gson gson;
//
//    @Autowired
//    private OrderDao orderDao;
//
//    @RequestMapping("/order/selectAll")
//    @ResponseBody
//    public String selectAll()
//    {
//        return gson.toJson(orderDao.selectAll());
//    }
//
//    @RequestMapping("/order/selectById/{orderId}")
//    @ResponseBody
//    public String selectById(@PathVariable(value="orderId") int orderId)
//    {
//        return gson.toJson(orderDao.selectById(orderId));
//    }
//
//    @RequestMapping(value ="/order/deleteById/{orderId}",method  = RequestMethod.GET)
//    @ResponseBody
//    public String deleteById(@PathVariable(value="orderId") int orderId)
//    {
//        return orderDao.deleteById(orderId)+"";
//    }
//
//    @RequestMapping(value="/order/insertOrder/{json}",method = RequestMethod.GET)
//    @ResponseBody
//    public String insert(@PathVariable(value="json") String json)
//    {
//        Order order = gson.fromJson(json,Order.class);
//        return orderDao.insert(order)+"";
//    }
//
//    @RequestMapping(value="/order/updateOrder/{json}",method = RequestMethod.GET)
//    @ResponseBody
//    public String update(@PathVariable(value="json") String json)
//    {
//        Order order = gson.fromJson(json,Order.class);
//        return orderDao.update(order)+"";
//    }
//}
