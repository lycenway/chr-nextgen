package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MuZhengxianPodaoLocalService}.
 *
 * @author lycenway
 * @see MuZhengxianPodaoLocalService
 * @generated
 */
public class MuZhengxianPodaoLocalServiceWrapper
    implements MuZhengxianPodaoLocalService,
        ServiceWrapper<MuZhengxianPodaoLocalService> {
    private MuZhengxianPodaoLocalService _muZhengxianPodaoLocalService;

    public MuZhengxianPodaoLocalServiceWrapper(
        MuZhengxianPodaoLocalService muZhengxianPodaoLocalService) {
        _muZhengxianPodaoLocalService = muZhengxianPodaoLocalService;
    }

    /**
    * Adds the Mgmt Unit of Zhengxian Podao to the database. Also notifies the appropriate model listeners.
    *
    * @param muZhengxianPodao the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuZhengxianPodao addMuZhengxianPodao(
        com.lycenway.chr.backbone.model.MuZhengxianPodao muZhengxianPodao)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muZhengxianPodaoLocalService.addMuZhengxianPodao(muZhengxianPodao);
    }

    /**
    * Creates a new Mgmt Unit of Zhengxian Podao with the primary key. Does not add the Mgmt Unit of Zhengxian Podao to the database.
    *
    * @param muZhengxianPodaoId the primary key for the new Mgmt Unit of Zhengxian Podao
    * @return the new Mgmt Unit of Zhengxian Podao
    */
    @Override
    public com.lycenway.chr.backbone.model.MuZhengxianPodao createMuZhengxianPodao(
        long muZhengxianPodaoId) {
        return _muZhengxianPodaoLocalService.createMuZhengxianPodao(muZhengxianPodaoId);
    }

    /**
    * Deletes the Mgmt Unit of Zhengxian Podao with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muZhengxianPodaoId the primary key of the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao that was removed
    * @throws PortalException if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuZhengxianPodao deleteMuZhengxianPodao(
        long muZhengxianPodaoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muZhengxianPodaoLocalService.deleteMuZhengxianPodao(muZhengxianPodaoId);
    }

    /**
    * Deletes the Mgmt Unit of Zhengxian Podao from the database. Also notifies the appropriate model listeners.
    *
    * @param muZhengxianPodao the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuZhengxianPodao deleteMuZhengxianPodao(
        com.lycenway.chr.backbone.model.MuZhengxianPodao muZhengxianPodao)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muZhengxianPodaoLocalService.deleteMuZhengxianPodao(muZhengxianPodao);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _muZhengxianPodaoLocalService.dynamicQuery();
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
        return _muZhengxianPodaoLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuZhengxianPodaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _muZhengxianPodaoLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuZhengxianPodaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _muZhengxianPodaoLocalService.dynamicQuery(dynamicQuery, start,
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
        return _muZhengxianPodaoLocalService.dynamicQueryCount(dynamicQuery);
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
        return _muZhengxianPodaoLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.lycenway.chr.backbone.model.MuZhengxianPodao fetchMuZhengxianPodao(
        long muZhengxianPodaoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muZhengxianPodaoLocalService.fetchMuZhengxianPodao(muZhengxianPodaoId);
    }

    /**
    * Returns the Mgmt Unit of Zhengxian Podao with the primary key.
    *
    * @param muZhengxianPodaoId the primary key of the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao
    * @throws PortalException if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuZhengxianPodao getMuZhengxianPodao(
        long muZhengxianPodaoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muZhengxianPodaoLocalService.getMuZhengxianPodao(muZhengxianPodaoId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _muZhengxianPodaoLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the Mgmt Unit of Zhengxian Podaos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuZhengxianPodaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit of Zhengxian Podaos
    * @param end the upper bound of the range of Mgmt Unit of Zhengxian Podaos (not inclusive)
    * @return the range of Mgmt Unit of Zhengxian Podaos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.lycenway.chr.backbone.model.MuZhengxianPodao> getMuZhengxianPodaos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muZhengxianPodaoLocalService.getMuZhengxianPodaos(start, end);
    }

    /**
    * Returns the number of Mgmt Unit of Zhengxian Podaos.
    *
    * @return the number of Mgmt Unit of Zhengxian Podaos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getMuZhengxianPodaosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muZhengxianPodaoLocalService.getMuZhengxianPodaosCount();
    }

    /**
    * Updates the Mgmt Unit of Zhengxian Podao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param muZhengxianPodao the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.MuZhengxianPodao updateMuZhengxianPodao(
        com.lycenway.chr.backbone.model.MuZhengxianPodao muZhengxianPodao)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muZhengxianPodaoLocalService.updateMuZhengxianPodao(muZhengxianPodao);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _muZhengxianPodaoLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _muZhengxianPodaoLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _muZhengxianPodaoLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MuZhengxianPodaoLocalService getWrappedMuZhengxianPodaoLocalService() {
        return _muZhengxianPodaoLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMuZhengxianPodaoLocalService(
        MuZhengxianPodaoLocalService muZhengxianPodaoLocalService) {
        _muZhengxianPodaoLocalService = muZhengxianPodaoLocalService;
    }

    @Override
    public MuZhengxianPodaoLocalService getWrappedService() {
        return _muZhengxianPodaoLocalService;
    }

    @Override
    public void setWrappedService(
        MuZhengxianPodaoLocalService muZhengxianPodaoLocalService) {
        _muZhengxianPodaoLocalService = muZhengxianPodaoLocalService;
    }
}
