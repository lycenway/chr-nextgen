package com.lycenway.chr.backbone.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MuWufengXianlu. This utility wraps
 * {@link com.lycenway.chr.backbone.service.impl.MuWufengXianluLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author lycenway
 * @see MuWufengXianluLocalService
 * @see com.lycenway.chr.backbone.service.base.MuWufengXianluLocalServiceBaseImpl
 * @see com.lycenway.chr.backbone.service.impl.MuWufengXianluLocalServiceImpl
 * @generated
 */
public class MuWufengXianluLocalServiceUtil {
    private static MuWufengXianluLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.lycenway.chr.backbone.service.impl.MuWufengXianluLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the Mgmt Unit of Wufeng Xianlu to the database. Also notifies the appropriate model listeners.
    *
    * @param muWufengXianlu the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuWufengXianlu addMuWufengXianlu(
        com.lycenway.chr.backbone.model.MuWufengXianlu muWufengXianlu)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addMuWufengXianlu(muWufengXianlu);
    }

    /**
    * Creates a new Mgmt Unit of Wufeng Xianlu with the primary key. Does not add the Mgmt Unit of Wufeng Xianlu to the database.
    *
    * @param muWufengXianluId the primary key for the new Mgmt Unit of Wufeng Xianlu
    * @return the new Mgmt Unit of Wufeng Xianlu
    */
    public static com.lycenway.chr.backbone.model.MuWufengXianlu createMuWufengXianlu(
        long muWufengXianluId) {
        return getService().createMuWufengXianlu(muWufengXianluId);
    }

    /**
    * Deletes the Mgmt Unit of Wufeng Xianlu with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu that was removed
    * @throws PortalException if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuWufengXianlu deleteMuWufengXianlu(
        long muWufengXianluId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteMuWufengXianlu(muWufengXianluId);
    }

    /**
    * Deletes the Mgmt Unit of Wufeng Xianlu from the database. Also notifies the appropriate model listeners.
    *
    * @param muWufengXianlu the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuWufengXianlu deleteMuWufengXianlu(
        com.lycenway.chr.backbone.model.MuWufengXianlu muWufengXianlu)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteMuWufengXianlu(muWufengXianlu);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuWufengXianluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuWufengXianluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.lycenway.chr.backbone.model.MuWufengXianlu fetchMuWufengXianlu(
        long muWufengXianluId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchMuWufengXianlu(muWufengXianluId);
    }

    /**
    * Returns the Mgmt Unit of Wufeng Xianlu with the primary key.
    *
    * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu
    * @throws PortalException if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuWufengXianlu getMuWufengXianlu(
        long muWufengXianluId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getMuWufengXianlu(muWufengXianluId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the Mgmt Unit of Wufeng Xianlus.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuWufengXianluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit of Wufeng Xianlus
    * @param end the upper bound of the range of Mgmt Unit of Wufeng Xianlus (not inclusive)
    * @return the range of Mgmt Unit of Wufeng Xianlus
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuWufengXianlu> getMuWufengXianlus(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getMuWufengXianlus(start, end);
    }

    /**
    * Returns the number of Mgmt Unit of Wufeng Xianlus.
    *
    * @return the number of Mgmt Unit of Wufeng Xianlus
    * @throws SystemException if a system exception occurred
    */
    public static int getMuWufengXianlusCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getMuWufengXianlusCount();
    }

    /**
    * Updates the Mgmt Unit of Wufeng Xianlu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param muWufengXianlu the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuWufengXianlu updateMuWufengXianlu(
        com.lycenway.chr.backbone.model.MuWufengXianlu muWufengXianlu)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateMuWufengXianlu(muWufengXianlu);
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

    public static MuWufengXianluLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    MuWufengXianluLocalService.class.getName());

            if (invokableLocalService instanceof MuWufengXianluLocalService) {
                _service = (MuWufengXianluLocalService) invokableLocalService;
            } else {
                _service = new MuWufengXianluLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(MuWufengXianluLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(MuWufengXianluLocalService service) {
    }
}
