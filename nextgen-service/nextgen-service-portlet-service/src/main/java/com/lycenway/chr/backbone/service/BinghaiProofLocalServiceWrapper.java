package com.lycenway.chr.backbone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BinghaiProofLocalService}.
 *
 * @author lycenway
 * @see BinghaiProofLocalService
 * @generated
 */
public class BinghaiProofLocalServiceWrapper implements BinghaiProofLocalService,
    ServiceWrapper<BinghaiProofLocalService> {
    private BinghaiProofLocalService _binghaiProofLocalService;

    public BinghaiProofLocalServiceWrapper(
        BinghaiProofLocalService binghaiProofLocalService) {
        _binghaiProofLocalService = binghaiProofLocalService;
    }

    /**
    * Adds the Binghai Attachments Pictures to the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiProof the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiProof addBinghaiProof(
        com.lycenway.chr.backbone.model.BinghaiProof binghaiProof)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiProofLocalService.addBinghaiProof(binghaiProof);
    }

    /**
    * Creates a new Binghai Attachments Pictures with the primary key. Does not add the Binghai Attachments Pictures to the database.
    *
    * @param binghaiProofId the primary key for the new Binghai Attachments Pictures
    * @return the new Binghai Attachments Pictures
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiProof createBinghaiProof(
        long binghaiProofId) {
        return _binghaiProofLocalService.createBinghaiProof(binghaiProofId);
    }

    /**
    * Deletes the Binghai Attachments Pictures with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiProofId the primary key of the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures that was removed
    * @throws PortalException if a Binghai Attachments Pictures with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiProof deleteBinghaiProof(
        long binghaiProofId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _binghaiProofLocalService.deleteBinghaiProof(binghaiProofId);
    }

    /**
    * Deletes the Binghai Attachments Pictures from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiProof the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiProof deleteBinghaiProof(
        com.lycenway.chr.backbone.model.BinghaiProof binghaiProof)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiProofLocalService.deleteBinghaiProof(binghaiProof);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _binghaiProofLocalService.dynamicQuery();
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
        return _binghaiProofLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _binghaiProofLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _binghaiProofLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _binghaiProofLocalService.dynamicQueryCount(dynamicQuery);
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
        return _binghaiProofLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.lycenway.chr.backbone.model.BinghaiProof fetchBinghaiProof(
        long binghaiProofId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiProofLocalService.fetchBinghaiProof(binghaiProofId);
    }

    /**
    * Returns the Binghai Attachments Pictures with the primary key.
    *
    * @param binghaiProofId the primary key of the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures
    * @throws PortalException if a Binghai Attachments Pictures with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiProof getBinghaiProof(
        long binghaiProofId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _binghaiProofLocalService.getBinghaiProof(binghaiProofId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _binghaiProofLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the Binghai Attachments Pictureses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Binghai Attachments Pictureses
    * @param end the upper bound of the range of Binghai Attachments Pictureses (not inclusive)
    * @return the range of Binghai Attachments Pictureses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiProof> getBinghaiProofs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiProofLocalService.getBinghaiProofs(start, end);
    }

    /**
    * Returns the number of Binghai Attachments Pictureses.
    *
    * @return the number of Binghai Attachments Pictureses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBinghaiProofsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiProofLocalService.getBinghaiProofsCount();
    }

    /**
    * Updates the Binghai Attachments Pictures in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param binghaiProof the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.lycenway.chr.backbone.model.BinghaiProof updateBinghaiProof(
        com.lycenway.chr.backbone.model.BinghaiProof binghaiProof)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiProofLocalService.updateBinghaiProof(binghaiProof);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _binghaiProofLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _binghaiProofLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _binghaiProofLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BinghaiProofLocalService getWrappedBinghaiProofLocalService() {
        return _binghaiProofLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBinghaiProofLocalService(
        BinghaiProofLocalService binghaiProofLocalService) {
        _binghaiProofLocalService = binghaiProofLocalService;
    }

    @Override
    public BinghaiProofLocalService getWrappedService() {
        return _binghaiProofLocalService;
    }

    @Override
    public void setWrappedService(
        BinghaiProofLocalService binghaiProofLocalService) {
        _binghaiProofLocalService = binghaiProofLocalService;
    }
}
