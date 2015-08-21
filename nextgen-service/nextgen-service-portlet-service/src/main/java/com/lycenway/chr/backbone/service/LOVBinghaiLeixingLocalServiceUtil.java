package com.lycenway.chr.backbone.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LOVBinghaiLeixing. This utility wraps
 * {@link com.lycenway.chr.backbone.service.impl.LOVBinghaiLeixingLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author lycenway
 * @see LOVBinghaiLeixingLocalService
 * @see com.lycenway.chr.backbone.service.base.LOVBinghaiLeixingLocalServiceBaseImpl
 * @see com.lycenway.chr.backbone.service.impl.LOVBinghaiLeixingLocalServiceImpl
 * @generated
 */
public class LOVBinghaiLeixingLocalServiceUtil {
    private static LOVBinghaiLeixingLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.lycenway.chr.backbone.service.impl.LOVBinghaiLeixingLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the List of Value Binghai Leixing - Case Type to the database. Also notifies the appropriate model listeners.
    *
    * @param lovBinghaiLeixing the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing addLOVBinghaiLeixing(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLOVBinghaiLeixing(lovBinghaiLeixing);
    }

    /**
    * Creates a new List of Value Binghai Leixing - Case Type with the primary key. Does not add the List of Value Binghai Leixing - Case Type to the database.
    *
    * @param code the primary key for the new List of Value Binghai Leixing - Case Type
    * @return the new List of Value Binghai Leixing - Case Type
    */
    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing createLOVBinghaiLeixing(
        java.lang.String code) {
        return getService().createLOVBinghaiLeixing(code);
    }

    /**
    * Deletes the List of Value Binghai Leixing - Case Type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param code the primary key of the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type that was removed
    * @throws PortalException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing deleteLOVBinghaiLeixing(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLOVBinghaiLeixing(code);
    }

    /**
    * Deletes the List of Value Binghai Leixing - Case Type from the database. Also notifies the appropriate model listeners.
    *
    * @param lovBinghaiLeixing the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing deleteLOVBinghaiLeixing(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLOVBinghaiLeixing(lovBinghaiLeixing);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing fetchLOVBinghaiLeixing(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLOVBinghaiLeixing(code);
    }

    /**
    * Returns the List of Value Binghai Leixing - Case Type with the primary key.
    *
    * @param code the primary key of the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type
    * @throws PortalException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing getLOVBinghaiLeixing(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLOVBinghaiLeixing(code);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> getLOVBinghaiLeixings(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLOVBinghaiLeixings(start, end);
    }

    /**
    * Returns the number of List of Value Binghai Leixing - Case Types.
    *
    * @return the number of List of Value Binghai Leixing - Case Types
    * @throws SystemException if a system exception occurred
    */
    public static int getLOVBinghaiLeixingsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLOVBinghaiLeixingsCount();
    }

    /**
    * Updates the List of Value Binghai Leixing - Case Type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lovBinghaiLeixing the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing updateLOVBinghaiLeixing(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLOVBinghaiLeixing(lovBinghaiLeixing);
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

    public static LOVBinghaiLeixingLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LOVBinghaiLeixingLocalService.class.getName());

            if (invokableLocalService instanceof LOVBinghaiLeixingLocalService) {
                _service = (LOVBinghaiLeixingLocalService) invokableLocalService;
            } else {
                _service = new LOVBinghaiLeixingLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LOVBinghaiLeixingLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(LOVBinghaiLeixingLocalService service) {
    }
}
