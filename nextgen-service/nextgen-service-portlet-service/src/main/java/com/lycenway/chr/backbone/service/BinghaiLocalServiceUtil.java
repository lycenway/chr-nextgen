package com.lycenway.chr.backbone.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Binghai. This utility wraps
 * {@link com.lycenway.chr.backbone.service.impl.BinghaiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author lycenway
 * @see BinghaiLocalService
 * @see com.lycenway.chr.backbone.service.base.BinghaiLocalServiceBaseImpl
 * @see com.lycenway.chr.backbone.service.impl.BinghaiLocalServiceImpl
 * @generated
 */
public class BinghaiLocalServiceUtil {
    private static BinghaiLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.lycenway.chr.backbone.service.impl.BinghaiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the Binghai Case Weixiu Wenti to the database. Also notifies the appropriate model listeners.
    *
    * @param binghai the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.Binghai addBinghai(
        com.lycenway.chr.backbone.model.Binghai binghai)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBinghai(binghai);
    }

    /**
    * Creates a new Binghai Case Weixiu Wenti with the primary key. Does not add the Binghai Case Weixiu Wenti to the database.
    *
    * @param binghaiId the primary key for the new Binghai Case Weixiu Wenti
    * @return the new Binghai Case Weixiu Wenti
    */
    public static com.lycenway.chr.backbone.model.Binghai createBinghai(
        long binghaiId) {
        return getService().createBinghai(binghaiId);
    }

    /**
    * Deletes the Binghai Case Weixiu Wenti with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiId the primary key of the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti that was removed
    * @throws PortalException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.Binghai deleteBinghai(
        long binghaiId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBinghai(binghaiId);
    }

    /**
    * Deletes the Binghai Case Weixiu Wenti from the database. Also notifies the appropriate model listeners.
    *
    * @param binghai the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.Binghai deleteBinghai(
        com.lycenway.chr.backbone.model.Binghai binghai)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBinghai(binghai);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.lycenway.chr.backbone.model.Binghai fetchBinghai(
        long binghaiId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBinghai(binghaiId);
    }

    /**
    * Returns the Binghai Case Weixiu Wenti with the primary key.
    *
    * @param binghaiId the primary key of the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti
    * @throws PortalException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.Binghai getBinghai(
        long binghaiId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBinghai(binghaiId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.lycenway.chr.backbone.model.Binghai> getBinghais(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBinghais(start, end);
    }

    /**
    * Returns the number of Binghai Case Weixiu Wentis.
    *
    * @return the number of Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public static int getBinghaisCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBinghaisCount();
    }

    /**
    * Updates the Binghai Case Weixiu Wenti in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param binghai the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.Binghai updateBinghai(
        com.lycenway.chr.backbone.model.Binghai binghai)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBinghai(binghai);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static BinghaiLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BinghaiLocalService.class.getName());

            if (invokableLocalService instanceof BinghaiLocalService) {
                _service = (BinghaiLocalService) invokableLocalService;
            } else {
                _service = new BinghaiLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(BinghaiLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BinghaiLocalService service) {
    }
}
