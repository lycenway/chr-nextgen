package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BinghaiProofService}.
 *
 * @author lycenway
 * @see BinghaiProofService
 * @generated
 */
public class BinghaiProofServiceWrapper implements BinghaiProofService,
    ServiceWrapper<BinghaiProofService> {
    private BinghaiProofService _binghaiProofService;

    public BinghaiProofServiceWrapper(BinghaiProofService binghaiProofService) {
        _binghaiProofService = binghaiProofService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _binghaiProofService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _binghaiProofService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _binghaiProofService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BinghaiProofService getWrappedBinghaiProofService() {
        return _binghaiProofService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBinghaiProofService(
        BinghaiProofService binghaiProofService) {
        _binghaiProofService = binghaiProofService;
    }

    @Override
    public BinghaiProofService getWrappedService() {
        return _binghaiProofService;
    }

    @Override
    public void setWrappedService(BinghaiProofService binghaiProofService) {
        _binghaiProofService = binghaiProofService;
    }
}
