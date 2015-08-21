package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.MuQuxianQujian;
import com.lycenway.chr.backbone.service.MuQuxianQujianLocalServiceUtil;

/**
 * @author lycenway
 * @generated
 */
public abstract class MuQuxianQujianActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MuQuxianQujianActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MuQuxianQujianLocalServiceUtil.getService());
        setClass(MuQuxianQujian.class);

        setClassLoader(com.lycenway.chr.backbone.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("muQuxianQujianId");
    }
}
