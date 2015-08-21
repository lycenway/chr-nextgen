package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.MuWufengXianlu;
import com.lycenway.chr.backbone.service.MuWufengXianluLocalServiceUtil;

/**
 * @author lycenway
 * @generated
 */
public abstract class MuWufengXianluActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MuWufengXianluActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MuWufengXianluLocalServiceUtil.getService());
        setClass(MuWufengXianlu.class);

        setClassLoader(com.lycenway.chr.backbone.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("muWufengXianluId");
    }
}
