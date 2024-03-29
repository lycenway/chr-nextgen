package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.BinghaiPingfen;
import com.lycenway.chr.backbone.service.BinghaiPingfenLocalServiceUtil;

/**
 * The extended model base implementation for the BinghaiPingfen service. Represents a row in the &quot;lov_binghai_pingfen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BinghaiPingfenImpl}.
 * </p>
 *
 * @author lycenway
 * @see BinghaiPingfenImpl
 * @see com.lycenway.chr.backbone.model.BinghaiPingfen
 * @generated
 */
public abstract class BinghaiPingfenBaseImpl extends BinghaiPingfenModelImpl
    implements BinghaiPingfen {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a binghai pingfen model instance should use the {@link BinghaiPingfen} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BinghaiPingfenLocalServiceUtil.addBinghaiPingfen(this);
        } else {
            BinghaiPingfenLocalServiceUtil.updateBinghaiPingfen(this);
        }
    }
}
