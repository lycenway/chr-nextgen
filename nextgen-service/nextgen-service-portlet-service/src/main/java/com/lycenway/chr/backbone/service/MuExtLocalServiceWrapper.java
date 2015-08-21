package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MuExtLocalService}.
 *
 * @author lycenway
 * @see MuExtLocalService
 * @generated
 */
public class MuExtLocalServiceWrapper implements MuExtLocalService,
    ServiceWrapper<MuExtLocalService> {
    private MuExtLocalService _muExtLocalService;

    public MuExtLocalServiceWrapper(MuExtLocalService muExtLocalService) {
        _muExtLocalService = muExtLocalService;
    }

    /**
    * Adds the Mgmt Unit Extended Attributes to the database. Also notifies the appropriate model listeners.
    *
    * @param muExt the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuExt addMuExt(
        com.lycenway.chr.backbone.model.MuExt muExt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muExtLocalService.addMuExt(muExt);
    }

    /**
    * Creates a new Mgmt Unit Extended Attributes with the primary key. Does not add the Mgmt Unit Extended Attributes to the database.
    *
    * @param muExtId the primary key for the new Mgmt Unit Extended Attributes
    * @return the new Mgmt Unit Extended Attributes
    */
    @Override
    public com.lycenway.chr.backbone.model.MuExt createMuExt(long muExtId) {
        return _muExtLocalService.createMuExt(muExtId);
    }

    /**
    * Deletes the Mgmt Unit Extended Attributes with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muExtId the primary key of the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes that was removed
    * @throws PortalException if a Mgmt Unit Extended Attributes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuExt deleteMuExt(long muExtId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muExtLocalService.deleteMuExt(muExtId);
    }

    /**
    * Deletes the Mgmt Unit Extended Attributes from the database. Also notifies the appropriate model listeners.
    *
    * @param muExt the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuExt deleteMuExt(
        com.lycenway.chr.backbone.model.MuExt muExt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muExtLocalService.deleteMuExt(muExt);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _muExtLocalService.dynamicQuery();
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
        return _muExtLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _muExtLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _muExtLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _muExtLocalService.dynamicQueryCount(dynamicQuery);
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
        return _muExtLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.lycenway.chr.backbone.model.MuExt fetchMuExt(long muExtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muExtLocalService.fetchMuExt(muExtId);
    }

    /**
    * Returns the Mgmt Unit Extended Attributes with the primary key.
    *
    * @param muExtId the primary key of the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes
    * @throws PortalException if a Mgmt Unit Extended Attributes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuExt getMuExt(long muExtId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muExtLocalService.getMuExt(muExtId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muExtLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the Mgmt Unit Extended Attributeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit Extended Attributeses
    * @param end the upper bound of the range of Mgmt Unit Extended Attributeses (not inclusive)
    * @return the range of Mgmt Unit Extended Attributeses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.lycenway.chr.backbone.model.MuExt> getMuExts(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muExtLocalService.getMuExts(start, end);
    }

    /**
    * Returns the number of Mgmt Unit Extended Attributeses.
    *
    * @return the number of Mgmt Unit Extended Attributeses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getMuExtsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muExtLocalService.getMuExtsCount();
    }

    /**
    * Updates the Mgmt Unit Extended Attributes in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param muExt the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuExt updateMuExt(
        com.lycenway.chr.backbone.model.MuExt muExt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muExtLocalService.updateMuExt(muExt);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _muExtLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _muExtLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _muExtLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MuExtLocalService getWrappedMuExtLocalService() {
        return _muExtLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMuExtLocalService(MuExtLocalService muExtLocalService) {
        _muExtLocalService = muExtLocalService;
    }

    @Override
    public MuExtLocalService getWrappedService() {
        return _muExtLocalService;
    }

    @Override
    public void setWrappedService(MuExtLocalService muExtLocalService) {
        _muExtLocalService = muExtLocalService;
    }
}
