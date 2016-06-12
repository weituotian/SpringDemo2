package com.weituotian.services;

import com.weituotian.model.ClazzEntity;

/**
 * Created by ange on 2016/6/6.
 */
public interface ClazzService {
    boolean addClazz();

    ClazzEntity findById(Object id);
}
