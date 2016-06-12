package com.weituotian.services.impl;

import com.weituotian.dao.ClazzDAO;
import com.weituotian.model.ClazzEntity;
import com.weituotian.services.ClazzService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by ange on 2016/6/6.
 */
@Transactional
@Service
public class ClazzServiceImpl implements ClazzService {

    @Resource
    ClazzDAO clazzDAO;

    @Override
    public boolean addClazz() {
        return clazzDAO.addClazz();
    }

    @Override
    public ClazzEntity findById(Object id) {
        return clazzDAO.findById(id);
    }
}
