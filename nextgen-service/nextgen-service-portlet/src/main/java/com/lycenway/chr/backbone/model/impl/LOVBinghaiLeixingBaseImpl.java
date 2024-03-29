package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.LOVBinghaiLeixing;
import com.lycenway.chr.backbone.service.LOVBinghaiLeixingLocalServiceUtil;

/**
 * The extended model base implementation for the LOVBinghaiLeixing service. Represents a row in the &quot;lov_binghai_leixing&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LOVBinghaiLeixingImpl}.
 * </p>
 *
 * @author lycenway
 * @see LOVBinghaiLeixingImpl
 * @see com.lycenway.chr.backbone.model.LOVBinghaiLeixing
 * @generated
 */
public abstract class LOVBinghaiLeixingBaseImpl
    extends LOVBinghaiLeixingModelImpl implements LOVBinghaiLeixing {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a List of Value Binghai Leixing - Case Type model instance should use the {@link LOVBinghaiLeixing} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LOVBinghaiLeixingLocalServiceUtil.addLOVBinghaiLeixing(this);
        } else {
            LOVBinghaiLeixingLocalServiceUtil.updateLOVBinghaiLeixing(this);
        }
    }
}
