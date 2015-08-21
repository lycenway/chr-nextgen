package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.MuZhengxianPodao;
import com.lycenway.chr.backbone.service.MuZhengxianPodaoLocalServiceUtil;

/**
 * @author lycenway
 * @generated
 */
public abstract class MuZhengxianPodaoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MuZhengxianPodaoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MuZhengxianPodaoLocalServiceUtil.getService());
        setClass(MuZhengxianPodao.class);

        setClassLoader(com.lycenway.chr.backbone.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("muZhengxianPodaoId");
    }
}
