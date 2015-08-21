package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.Binghai;
import com.lycenway.chr.backbone.service.BinghaiLocalServiceUtil;

/**
 * The extended model base implementation for the Binghai service. Represents a row in the &quot;base_binghai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BinghaiImpl}.
 * </p>
 *
 * @author lycenway
 * @see BinghaiImpl
 * @see com.lycenway.chr.backbone.model.Binghai
 * @generated
 */
public abstract class BinghaiBaseImpl extends BinghaiModelImpl
    implements Binghai {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a Binghai Case Weixiu Wenti model instance should use the {@link Binghai} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BinghaiLocalServiceUtil.addBinghai(this);
        } else {
            BinghaiLocalServiceUtil.updateBinghai(this);
        }
    }
}
