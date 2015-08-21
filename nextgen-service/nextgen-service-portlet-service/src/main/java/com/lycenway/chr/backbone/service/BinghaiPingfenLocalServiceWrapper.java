package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BinghaiPingfenLocalService}.
 *
 * @author lycenway
 * @see BinghaiPingfenLocalService
 * @generated
 */
public class BinghaiPingfenLocalServiceWrapper
    implements BinghaiPingfenLocalService,
        ServiceWrapper<BinghaiPingfenLocalService> {
    private BinghaiPingfenLocalService _binghaiPingfenLocalService;

    public BinghaiPingfenLocalServiceWrapper(
        BinghaiPingfenLocalService binghaiPingfenLocalService) {
        _binghaiPingfenLocalService = binghaiPingfenLocalService;
    }

    /**
    * Adds the binghai pingfen to the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiPingfen the binghai pingfen
    * @return the binghai pingfen that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiPingfen addBinghaiPingfen(
        com.lycenway.chr.backbone.model.BinghaiPingfen binghaiPingfen)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiPingfenLocalService.addBinghaiPingfen(binghaiPingfen);
    }

    /**
    * Creates a new binghai pingfen with the primary key. Does not add the binghai pingfen to the database.
    *
    * @param binghaiPingfenId the primary key for the new binghai pingfen
    * @return the new binghai pingfen
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiPingfen createBinghaiPingfen(
        long binghaiPingfenId) {
        return _binghaiPingfenLocalService.createBinghaiPingfen(binghaiPingfenId);
    }

    /**
    * Deletes the binghai pingfen with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiPingfenId the primary key of the binghai pingfen
    * @return the binghai pingfen that was removed
    * @throws PortalException if a binghai pingfen with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiPingfen deleteBinghaiPingfen(
        long binghaiPingfenId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _binghaiPingfenLocalService.deleteBinghaiPingfen(binghaiPingfenId);
    }

    /**
    * Deletes the binghai pingfen from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiPingfen the binghai pingfen
    * @return the binghai pingfen that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiPingfen deleteBinghaiPingfen(
        com.lycenway.chr.backbone.model.BinghaiPingfen binghaiPingfen)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiPingfenLocalService.deleteBinghaiPingfen(binghaiPingfen);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _binghaiPingfenLocalService.dynamicQuery();
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
        return _binghaiPingfenLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _binghaiPingfenLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _binghaiPingfenLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _binghaiPingfenLocalService.dynamicQueryCount(dynamicQuery);
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
        return _binghaiPingfenLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.lycenway.chr.backbone.model.BinghaiPingfen fetchBinghaiPingfen(
        long binghaiPingfenId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiPingfenLocalService.fetchBinghaiPingfen(binghaiPingfenId);
    }

    /**
    * Returns the binghai pingfen with the primary key.
    *
    * @param binghaiPingfenId the primary key of the binghai pingfen
    * @return the binghai pingfen
    * @throws PortalException if a binghai pingfen with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiPingfen getBinghaiPingfen(
        long binghaiPingfenId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _binghaiPingfenLocalService.getBinghaiPingfen(binghaiPingfenId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _binghaiPingfenLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the binghai pingfens.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of binghai pingfens
    * @param end the upper bound of the range of binghai pingfens (not inclusive)
    * @return the range of binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> getBinghaiPingfens(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiPingfenLocalService.getBinghaiPingfens(start, end);
    }

    /**
    * Returns the number of binghai pingfens.
    *
    * @return the number of binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBinghaiPingfensCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiPingfenLocalService.getBinghaiPingfensCount();
    }

    /**
    * Updates the binghai pingfen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param binghaiPingfen the binghai pingfen
    * @return the binghai pingfen that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiPingfen updateBinghaiPingfen(
        com.lycenway.chr.backbone.model.BinghaiPingfen binghaiPingfen)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiPingfenLocalService.updateBinghaiPingfen(binghaiPingfen);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _binghaiPingfenLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _binghaiPingfenLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _binghaiPingfenLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BinghaiPingfenLocalService getWrappedBinghaiPingfenLocalService() {
        return _binghaiPingfenLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBinghaiPingfenLocalService(
        BinghaiPingfenLocalService binghaiPingfenLocalService) {
        _binghaiPingfenLocalService = binghaiPingfenLocalService;
    }

    @Override
    public BinghaiPingfenLocalService getWrappedService() {
        return _binghaiPingfenLocalService;
    }

    @Override
    public void setWrappedService(
        BinghaiPingfenLocalService binghaiPingfenLocalService) {
        _binghaiPingfenLocalService = binghaiPingfenLocalService;
    }
}
