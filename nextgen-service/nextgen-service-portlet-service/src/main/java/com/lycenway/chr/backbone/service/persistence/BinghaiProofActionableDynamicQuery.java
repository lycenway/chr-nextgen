package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.BinghaiProof;
import com.lycenway.chr.backbone.service.BinghaiProofLocalServiceUtil;

/**
 * @author lycenway
 * @generated
 */
public abstract class BinghaiProofActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BinghaiProofActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BinghaiProofLocalServiceUtil.getService());
        setClass(BinghaiProof.class);

        setClassLoader(com.lycenway.chr.backbone.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("binghaiProofId");
    }
}
