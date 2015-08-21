package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BinghaiLocalService}.
 *
 * @author lycenway
 * @see BinghaiLocalService
 * @generated
 */
public class BinghaiLocalServiceWrapper implements BinghaiLocalService,
    ServiceWrapper<BinghaiLocalService> {
    private BinghaiLocalService _binghaiLocalService;

    public BinghaiLocalServiceWrapper(BinghaiLocalService binghaiLocalService) {
        _binghaiLocalService = binghaiLocalService;
    }

    /**
    * Adds the Binghai Case Weixiu Wenti to the database. Also notifies the appropriate model listeners.
    *
    * @param binghai the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.Binghai addBinghai(
        com.lycenway.chr.backbone.model.Binghai binghai)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.addBinghai(binghai);
    }

    /**
    * Creates a new Binghai Case Weixiu Wenti with the primary key. Does not add the Binghai Case Weixiu Wenti to the database.
    *
    * @param binghaiId the primary key for the new Binghai Case Weixiu Wenti
    * @return the new Binghai Case Weixiu Wenti
    */
    @Override
    public com.lycenway.chr.backbone.model.Binghai createBinghai(long binghaiId) {
        return _binghaiLocalService.createBinghai(binghaiId);
    }

    /**
    * Deletes the Binghai Case Weixiu Wenti with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiId the primary key of the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti that was removed
    * @throws PortalException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.Binghai deleteBinghai(long binghaiId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.deleteBinghai(binghaiId);
    }

    /**
    * Deletes the Binghai Case Weixiu Wenti from the database. Also notifies the appropriate model listeners.
    *
    * @param binghai the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.Binghai deleteBinghai(
        com.lycenway.chr.backbone.model.Binghai binghai)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.deleteBinghai(binghai);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _binghaiLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.lycenway.chr.backbone.model.Binghai fetchBinghai(long binghaiId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.fetchBinghai(binghaiId);
    }

    /**
    * Returns the Binghai Case Weixiu Wenti with the primary key.
    *
    * @param binghaiId the primary key of the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti
    * @throws PortalException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.Binghai getBinghai(long binghaiId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.getBinghai(binghaiId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the Binghai Case Weixiu Wentis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @return the range of Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> getBinghais(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.getBinghais(start, end);
    }

    /**
    * Returns the number of Binghai Case Weixiu Wentis.
    *
    * @return the number of Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBinghaisCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.getBinghaisCount();
    }

    /**
    * Updates the Binghai Case Weixiu Wenti in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param binghai the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.Binghai updateBinghai(
        com.lycenway.chr.backbone.model.Binghai binghai)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiLocalService.updateBinghai(binghai);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _binghaiLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _binghaiLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _binghaiLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BinghaiLocalService getWrappedBinghaiLocalService() {
        return _binghaiLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBinghaiLocalService(
        BinghaiLocalService binghaiLocalService) {
        _binghaiLocalService = binghaiLocalService;
    }

    @Override
    public BinghaiLocalService getWrappedService() {
        return _binghaiLocalService;
    }

    @Override
    public void setWrappedService(BinghaiLocalService binghaiLocalService) {
        _binghaiLocalService = binghaiLocalService;
    }
}
