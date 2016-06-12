package com.weituotian.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import javax.annotation.Resource;

/**
 * Created by ange on 2016/6/7.
 */
public class SuperDao {
    @Resource
    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

//    @Resource
//    HibernateTemplate hibernateTemplete;
//
//    public HibernateTemplate getHibernateTemplete() {
//        return hibernateTemplete;
//    }
//
//    public void setHibernateTemplete(HibernateTemplate hibernateTemplete) {
//        this.hibernateTemplete = hibernateTemplete;
//    }
}
