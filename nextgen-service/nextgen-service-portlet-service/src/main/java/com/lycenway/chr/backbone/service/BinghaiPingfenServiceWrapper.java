package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BinghaiPingfenService}.
 *
 * @author lycenway
 * @see BinghaiPingfenService
 * @generated
 */
public class BinghaiPingfenServiceWrapper implements BinghaiPingfenService,
    ServiceWrapper<BinghaiPingfenService> {
    private BinghaiPingfenService _binghaiPingfenService;

    public BinghaiPingfenServiceWrapper(
        BinghaiPingfenService binghaiPingfenService) {
        _binghaiPingfenService = binghaiPingfenService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _binghaiPingfenService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _binghaiPingfenService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _binghaiPingfenService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BinghaiPingfenService getWrappedBinghaiPingfenService() {
        return _binghaiPingfenService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBinghaiPingfenService(
        BinghaiPingfenService binghaiPingfenService) {
        _binghaiPingfenService = binghaiPingfenService;
    }

    @Override
    public BinghaiPingfenService getWrappedService() {
        return _binghaiPingfenService;
    }

    @Override
    public void setWrappedService(BinghaiPingfenService binghaiPingfenService) {
        _binghaiPingfenService = binghaiPingfenService;
    }
}
