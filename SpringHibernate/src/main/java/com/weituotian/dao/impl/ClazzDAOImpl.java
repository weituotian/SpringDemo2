package com.weituotian.dao.impl;

import com.weituotian.dao.ClazzDAO;
import com.weituotian.model.ClazzEntity;
import com.weituotian.model.StudentEntity;
import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by ange on 2016/6/6.
 */
@Repository
public class ClazzDAOImpl extends SuperDao implements ClazzDAO{

    static Logger logger = Logger.getLogger(ClazzDAOImpl.class.toString());

    @Override
    public boolean addClazz() {
        return false;
    }

    @Override
    public ClazzEntity findById(Object id) {
//        return this.currentSession().get(ClazzEntity.class, (Serializable) id);
        ClazzEntity clazzEntity = null;
        try {
            Session session=sessionFactory.getCurrentSession();
            clazzEntity = session.load(ClazzEntity.class, (Serializable) id);
            logger.info("id:" + id);
            session.close();
        } catch (DataAccessException e) {
            logger.info(e.toString());
        }
        return clazzEntity;

//        String sql = "from class where id=" + id;
//        List<?> list = this.getHibernateTemplate().find(sql);
//        return null;
    }
}
