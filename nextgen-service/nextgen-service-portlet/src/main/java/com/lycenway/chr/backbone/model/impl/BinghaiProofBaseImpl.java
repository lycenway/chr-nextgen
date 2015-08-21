package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.lycenway.chr.backbone.model.BinghaiProof;
import com.lycenway.chr.backbone.service.BinghaiProofLocalServiceUtil;

/**
 * The extended model base implementation for the BinghaiProof service. Represents a row in the &quot;base_binghai_proof&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BinghaiProofImpl}.
 * </p>
 *
 * @author lycenway
 * @see BinghaiProofImpl
 * @see com.lycenway.chr.backbone.model.BinghaiProof
 * @generated
 */
public abstract class BinghaiProofBaseImpl extends BinghaiProofModelImpl
    implements BinghaiProof {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a Binghai Attachments Pictures model instance should use the {@link BinghaiProof} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BinghaiProofLocalServiceUtil.addBinghaiProof(this);
        } else {
            BinghaiProofLocalServiceUtil.updateBinghaiProof(this);
        }
    }
}