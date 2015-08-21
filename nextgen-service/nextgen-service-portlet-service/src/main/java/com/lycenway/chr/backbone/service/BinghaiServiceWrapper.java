package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BinghaiService}.
 *
 * @author lycenway
 * @see BinghaiService
 * @generated
 */
public class BinghaiServiceWrapper implements BinghaiService,
    ServiceWrapper<BinghaiService> {
    private BinghaiService _binghaiService;

    public BinghaiServiceWrapper(BinghaiService binghaiService) {
        _binghaiService = binghaiService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _binghaiService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _binghaiService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _binghaiService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BinghaiService getWrappedBinghaiService() {
        return _binghaiService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBinghaiService(BinghaiService binghaiService) {
        _binghaiService = binghaiService;
    }

    @Override
    public BinghaiService getWrappedService() {
        return _binghaiService;
    }

    @Override
    public void setWrappedService(BinghaiService binghaiService) {
        _binghaiService = binghaiService;
    }
}
