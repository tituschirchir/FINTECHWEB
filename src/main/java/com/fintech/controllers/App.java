package com.fintech.controllers;

import com.fintech.model.User;
import com.fintech.utility.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by titus.chirchir12 on 9/13/2015.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hibernate one to one (XML mapping)");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        /*Stock stock = new Stock();

        stock.setStockCode("444");
        stock.setStockName("Rachel Manning");

        StockDetail stockDetail = new StockDetail();
        stockDetail.setCompName("Rachel Rich");
        stockDetail.setCompDesc("Best Person in the world");
        stockDetail.setRemark("Very Special");
        stockDetail.setListedDate(new Date());

        stock.setStockDetail(stockDetail);
        stockDetail.setStock(stock);

        session.save(stock);*/

        User rachel = new User();
        rachel.setFirstName("Rachel");
        rachel.setLastName("Manning");
        rachel.setUserName("rmanning08");
        rachel.setPassword("sherocks");
        session.save(rachel);

        session.getTransaction().commit();

        System.out.println("Done");
    }
}