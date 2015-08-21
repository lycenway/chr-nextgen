package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.Binghai;
import com.lycenway.chr.backbone.service.BinghaiLocalServiceUtil;

/**
 * @author lycenway
 * @generated
 */
public abstract class BinghaiActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BinghaiActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BinghaiLocalServiceUtil.getService());
        setClass(Binghai.class);

        setClassLoader(com.lycenway.chr.backbone.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("binghaiId");
    }
}
