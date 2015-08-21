package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.MuInterrel;
import com.lycenway.chr.backbone.service.MuInterrelLocalServiceUtil;

/**
 * @author lycenway
 * @generated
 */
public abstract class MuInterrelActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MuInterrelActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MuInterrelLocalServiceUtil.getService());
        setClass(MuInterrel.class);

        setClassLoader(com.lycenway.chr.backbone.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("muInterrelId");
    }
}
