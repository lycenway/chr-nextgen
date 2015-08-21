package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.MuExt;
import com.lycenway.chr.backbone.service.MuExtLocalServiceUtil;

/**
 * @author lycenway
 * @generated
 */
public abstract class MuExtActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MuExtActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MuExtLocalServiceUtil.getService());
        setClass(MuExt.class);

        setClassLoader(com.lycenway.chr.backbone.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("muExtId");
    }
}
