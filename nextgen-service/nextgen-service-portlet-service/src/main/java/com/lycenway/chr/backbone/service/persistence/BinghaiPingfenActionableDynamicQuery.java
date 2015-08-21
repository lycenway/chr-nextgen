package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.BinghaiPingfen;
import com.lycenway.chr.backbone.service.BinghaiPingfenLocalServiceUtil;

/**
 * @author lycenway
 * @generated
 */
public abstract class BinghaiPingfenActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BinghaiPingfenActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BinghaiPingfenLocalServiceUtil.getService());
        setClass(BinghaiPingfen.class);

        setClassLoader(com.lycenway.chr.backbone.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("binghaiPingfenId");
    }
}
