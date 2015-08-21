package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MuQuxianQujianLocalService}.
 *
 * @author lycenway
 * @see MuQuxianQujianLocalService
 * @generated
 */
public class MuQuxianQujianLocalServiceWrapper
    implements MuQuxianQujianLocalService,
        ServiceWrapper<MuQuxianQujianLocalService> {
    private MuQuxianQujianLocalService _muQuxianQujianLocalService;

    public MuQuxianQujianLocalServiceWrapper(
        MuQuxianQujianLocalService muQuxianQujianLocalService) {
        _muQuxianQujianLocalService = muQuxianQujianLocalService;
    }

    /**
    * Adds the Mgmt Unit of Quxian Qujian to the database. Also notifies the appropriate model listeners.
    *
    * @param muQuxianQujian the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian addMuQuxianQujian(
        com.lycenway.chr.backbone.model.MuQuxianQujian muQuxianQujian)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muQuxianQujianLocalService.addMuQuxianQujian(muQuxianQujian);
    }

    /**
    * Creates a new Mgmt Unit of Quxian Qujian with the primary key. Does not add the Mgmt Unit of Quxian Qujian to the database.
    *
    * @param muQuxianQujianId the primary key for the new Mgmt Unit of Quxian Qujian
    * @return the new Mgmt Unit of Quxian Qujian
    */
    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian createMuQuxianQujian(
        long muQuxianQujianId) {
        return _muQuxianQujianLocalService.createMuQuxianQujian(muQuxianQujianId);
    }

    /**
    * Deletes the Mgmt Unit of Quxian Qujian with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian that was removed
    * @throws PortalException if a Mgmt Unit of Quxian Qujian with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian deleteMuQuxianQujian(
        long muQuxianQujianId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muQuxianQujianLocalService.deleteMuQuxianQujian(muQuxianQujianId);
    }

    /**
    * Deletes the Mgmt Unit of Quxian Qujian from the database. Also notifies the appropriate model listeners.
    *
    * @param muQuxianQujian the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian deleteMuQuxianQujian(
        com.lycenway.chr.backbone.model.MuQuxianQujian muQuxianQujian)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muQuxianQujianLocalService.deleteMuQuxianQujian(muQuxianQujian);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _muQuxianQujianLocalService.dynamicQuery();
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
        return _muQuxianQujianLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _muQuxianQujianLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _muQuxianQujianLocalService.dynamicQuery(dynamicQuery, start,
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
        return _muQuxianQujianLocalService.dynamicQueryCount(dynamicQuery);
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
        return _muQuxianQujianLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian fetchMuQuxianQujian(
        long muQuxianQujianId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muQuxianQujianLocalService.fetchMuQuxianQujian(muQuxianQujianId);
    }

    /**
    * Returns the Mgmt Unit of Quxian Qujian with the primary key.
    *
    * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian
    * @throws PortalException if a Mgmt Unit of Quxian Qujian with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian getMuQuxianQujian(
        long muQuxianQujianId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muQuxianQujianLocalService.getMuQuxianQujian(muQuxianQujianId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muQuxianQujianLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the Mgmt Unit of Quxian Qujians.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit of Quxian Qujians
    * @param end the upper bound of the range of Mgmt Unit of Quxian Qujians (not inclusive)
    * @return the range of Mgmt Unit of Quxian Qujians
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.lycenway.chr.backbone.model.MuQuxianQujian> getMuQuxianQujians(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muQuxianQujianLocalService.getMuQuxianQujians(start, end);
    }

    /**
    * Returns the number of Mgmt Unit of Quxian Qujians.
    *
    * @return the number of Mgmt Unit of Quxian Qujians
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getMuQuxianQujiansCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muQuxianQujianLocalService.getMuQuxianQujiansCount();
    }

    /**
    * Updates the Mgmt Unit of Quxian Qujian in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param muQuxianQujian the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian updateMuQuxianQujian(
        com.lycenway.chr.backbone.model.MuQuxianQujian muQuxianQujian)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muQuxianQujianLocalService.updateMuQuxianQujian(muQuxianQujian);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _muQuxianQujianLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _muQuxianQujianLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _muQuxianQujianLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MuQuxianQujianLocalService getWrappedMuQuxianQujianLocalService() {
        return _muQuxianQujianLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMuQuxianQujianLocalService(
        MuQuxianQujianLocalService muQuxianQujianLocalService) {
        _muQuxianQujianLocalService = muQuxianQujianLocalService;
    }

    @Override
    public MuQuxianQujianLocalService getWrappedService() {
        return _muQuxianQujianLocalService;
    }

    @Override
    public void setWrappedService(
        MuQuxianQujianLocalService muQuxianQujianLocalService) {
        _muQuxianQujianLocalService = muQuxianQujianLocalService;
    }
}
