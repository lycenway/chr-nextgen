package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LOVBinghaiLeixingLocalService}.
 *
 * @author lycenway
 * @see LOVBinghaiLeixingLocalService
 * @generated
 */
public class LOVBinghaiLeixingLocalServiceWrapper
    implements LOVBinghaiLeixingLocalService,
        ServiceWrapper<LOVBinghaiLeixingLocalService> {
    private LOVBinghaiLeixingLocalService _lovBinghaiLeixingLocalService;

    public LOVBinghaiLeixingLocalServiceWrapper(
        LOVBinghaiLeixingLocalService lovBinghaiLeixingLocalService) {
        _lovBinghaiLeixingLocalService = lovBinghaiLeixingLocalService;
    }

    /**
    * Adds the List of Value Binghai Leixing - Case Type to the database. Also notifies the appropriate model listeners.
    *
    * @param lovBinghaiLeixing the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing addLOVBinghaiLeixing(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lovBinghaiLeixingLocalService.addLOVBinghaiLeixing(lovBinghaiLeixing);
    }

    /**
    * Creates a new List of Value Binghai Leixing - Case Type with the primary key. Does not add the List of Value Binghai Leixing - Case Type to the database.
    *
    * @param code the primary key for the new List of Value Binghai Leixing - Case Type
    * @return the new List of Value Binghai Leixing - Case Type
    */
    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing createLOVBinghaiLeixing(
        java.lang.String code) {
        return _lovBinghaiLeixingLocalService.createLOVBinghaiLeixing(code);
    }

    /**
    * Deletes the List of Value Binghai Leixing - Case Type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param code the primary key of the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type that was removed
    * @throws PortalException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing deleteLOVBinghaiLeixing(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lovBinghaiLeixingLocalService.deleteLOVBinghaiLeixing(code);
    }

    /**
    * Deletes the List of Value Binghai Leixing - Case Type from the database. Also notifies the appropriate model listeners.
    *
    * @param lovBinghaiLeixing the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing deleteLOVBinghaiLeixing(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lovBinghaiLeixingLocalService.deleteLOVBinghaiLeixing(lovBinghaiLeixing);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lovBinghaiLeixingLocalService.dynamicQuery();
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
        return _lovBinghaiLeixingLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _lovBinghaiLeixingLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _lovBinghaiLeixingLocalService.dynamicQuery(dynamicQuery, start,
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
        return _lovBinghaiLeixingLocalService.dynamicQueryCount(dynamicQuery);
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
        return _lovBinghaiLeixingLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing fetchLOVBinghaiLeixing(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lovBinghaiLeixingLocalService.fetchLOVBinghaiLeixing(code);
    }

    /**
    * Returns the List of Value Binghai Leixing - Case Type with the primary key.
    *
    * @param code the primary key of the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type
    * @throws PortalException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing getLOVBinghaiLeixing(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lovBinghaiLeixingLocalService.getLOVBinghaiLeixing(code);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lovBinghaiLeixingLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the List of Value Binghai Leixing - Case Types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of List of Value Binghai Leixing - Case Types
    * @param end the upper bound of the range of List of Value Binghai Leixing - Case Types (not inclusive)
    * @return the range of List of Value Binghai Leixing - Case Types
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> getLOVBinghaiLeixings(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lovBinghaiLeixingLocalService.getLOVBinghaiLeixings(start, end);
    }

    /**
    * Returns the number of List of Value Binghai Leixing - Case Types.
    *
    * @return the number of List of Value Binghai Leixing - Case Types
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLOVBinghaiLeixingsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lovBinghaiLeixingLocalService.getLOVBinghaiLeixingsCount();
    }

    /**
    * Updates the List of Value Binghai Leixing - Case Type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lovBinghaiLeixing the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing updateLOVBinghaiLeixing(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lovBinghaiLeixingLocalService.updateLOVBinghaiLeixing(lovBinghaiLeixing);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _lovBinghaiLeixingLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lovBinghaiLeixingLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lovBinghaiLeixingLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LOVBinghaiLeixingLocalService getWrappedLOVBinghaiLeixingLocalService() {
        return _lovBinghaiLeixingLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLOVBinghaiLeixingLocalService(
        LOVBinghaiLeixingLocalService lovBinghaiLeixingLocalService) {
        _lovBinghaiLeixingLocalService = lovBinghaiLeixingLocalService;
    }

    @Override
    public LOVBinghaiLeixingLocalService getWrappedService() {
        return _lovBinghaiLeixingLocalService;
    }

    @Override
    public void setWrappedService(
        LOVBinghaiLeixingLocalService lovBinghaiLeixingLocalService) {
        _lovBinghaiLeixingLocalService = lovBinghaiLeixingLocalService;
    }
}
