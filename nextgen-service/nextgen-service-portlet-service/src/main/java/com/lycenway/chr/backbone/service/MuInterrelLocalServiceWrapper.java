package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MuInterrelLocalService}.
 *
 * @author lycenway
 * @see MuInterrelLocalService
 * @generated
 */
public class MuInterrelLocalServiceWrapper implements MuInterrelLocalService,
    ServiceWrapper<MuInterrelLocalService> {
    private MuInterrelLocalService _muInterrelLocalService;

    public MuInterrelLocalServiceWrapper(
        MuInterrelLocalService muInterrelLocalService) {
        _muInterrelLocalService = muInterrelLocalService;
    }

    /**
    * Adds the Mgmt Unit Inter Relationship to the database. Also notifies the appropriate model listeners.
    *
    * @param muInterrel the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuInterrel addMuInterrel(
        com.lycenway.chr.backbone.model.MuInterrel muInterrel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muInterrelLocalService.addMuInterrel(muInterrel);
    }

    /**
    * Creates a new Mgmt Unit Inter Relationship with the primary key. Does not add the Mgmt Unit Inter Relationship to the database.
    *
    * @param muInterrelId the primary key for the new Mgmt Unit Inter Relationship
    * @return the new Mgmt Unit Inter Relationship
    */
    @Override
    public com.lycenway.chr.backbone.model.MuInterrel createMuInterrel(
        long muInterrelId) {
        return _muInterrelLocalService.createMuInterrel(muInterrelId);
    }

    /**
    * Deletes the Mgmt Unit Inter Relationship with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship that was removed
    * @throws PortalException if a Mgmt Unit Inter Relationship with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuInterrel deleteMuInterrel(
        long muInterrelId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muInterrelLocalService.deleteMuInterrel(muInterrelId);
    }

    /**
    * Deletes the Mgmt Unit Inter Relationship from the database. Also notifies the appropriate model listeners.
    *
    * @param muInterrel the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuInterrel deleteMuInterrel(
        com.lycenway.chr.backbone.model.MuInterrel muInterrel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muInterrelLocalService.deleteMuInterrel(muInterrel);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _muInterrelLocalService.dynamicQuery();
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
        return _muInterrelLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuInterrelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _muInterrelLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuInterrelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _muInterrelLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _muInterrelLocalService.dynamicQueryCount(dynamicQuery);
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
        return _muInterrelLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.lycenway.chr.backbone.model.MuInterrel fetchMuInterrel(
        long muInterrelId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muInterrelLocalService.fetchMuInterrel(muInterrelId);
    }

    /**
    * Returns the Mgmt Unit Inter Relationship with the primary key.
    *
    * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship
    * @throws PortalException if a Mgmt Unit Inter Relationship with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuInterrel getMuInterrel(
        long muInterrelId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muInterrelLocalService.getMuInterrel(muInterrelId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muInterrelLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the Mgmt Unit Inter Relationships.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuInterrelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit Inter Relationships
    * @param end the upper bound of the range of Mgmt Unit Inter Relationships (not inclusive)
    * @return the range of Mgmt Unit Inter Relationships
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.lycenway.chr.backbone.model.MuInterrel> getMuInterrels(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muInterrelLocalService.getMuInterrels(start, end);
    }

    /**
    * Returns the number of Mgmt Unit Inter Relationships.
    *
    * @return the number of Mgmt Unit Inter Relationships
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getMuInterrelsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muInterrelLocalService.getMuInterrelsCount();
    }

    /**
    * Updates the Mgmt Unit Inter Relationship in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param muInterrel the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuInterrel updateMuInterrel(
        com.lycenway.chr.backbone.model.MuInterrel muInterrel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muInterrelLocalService.updateMuInterrel(muInterrel);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _muInterrelLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _muInterrelLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _muInterrelLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MuInterrelLocalService getWrappedMuInterrelLocalService() {
        return _muInterrelLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMuInterrelLocalService(
        MuInterrelLocalService muInterrelLocalService) {
        _muInterrelLocalService = muInterrelLocalService;
    }

    @Override
    public MuInterrelLocalService getWrappedService() {
        return _muInterrelLocalService;
    }

    @Override
    public void setWrappedService(MuInterrelLocalService muInterrelLocalService) {
        _muInterrelLocalService = muInterrelLocalService;
    }
}