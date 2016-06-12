package com.weituotian.dao;

import com.weituotian.model.ClazzEntity;
import org.springframework.stereotype.Component;

/**
 * Created by ange on 2016/6/6.
 */
@Component
public interface ClazzDAO  {
    boolean addClazz();

    ClazzEntity findById(Object id);
}
