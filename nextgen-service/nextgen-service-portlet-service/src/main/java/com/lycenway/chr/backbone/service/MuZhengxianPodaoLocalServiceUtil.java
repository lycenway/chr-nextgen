package com.lycenway.chr.backbone.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MuZhengxianPodao. This utility wraps
 * {@link com.lycenway.chr.backbone.service.impl.MuZhengxianPodaoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author lycenway
 * @see MuZhengxianPodaoLocalService
 * @see com.lycenway.chr.backbone.service.base.MuZhengxianPodaoLocalServiceBaseImpl
 * @see com.lycenway.chr.backbone.service.impl.MuZhengxianPodaoLocalServiceImpl
 * @generated
 */
public class MuZhengxianPodaoLocalServiceUtil {
    private static MuZhengxianPodaoLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.lycenway.chr.backbone.service.impl.MuZhengxianPodaoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the Mgmt Unit of Zhengxian Podao to the database. Also notifies the appropriate model listeners.
    *
    * @param muZhengxianPodao the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuZhengxianPodao addMuZhengxianPodao(
        com.lycenway.chr.backbone.model.MuZhengxianPodao muZhengxianPodao)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addMuZhengxianPodao(muZhengxianPodao);
    }

    /**
    * Creates a new Mgmt Unit of Zhengxian Podao with the primary key. Does not add the Mgmt Unit of Zhengxian Podao to the database.
    *
    * @param muZhengxianPodaoId the primary key for the new Mgmt Unit of Zhengxian Podao
    * @return the new Mgmt Unit of Zhengxian Podao
    */
    public static com.lycenway.chr.backbone.model.MuZhengxianPodao createMuZhengxianPodao(
        long muZhengxianPodaoId) {
        return getService().createMuZhengxianPodao(muZhengxianPodaoId);
    }

    /**
    * Deletes the Mgmt Unit of Zhengxian Podao with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muZhengxianPodaoId the primary key of the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao that was removed
    * @throws PortalException if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuZhengxianPodao deleteMuZhengxianPodao(
        long muZhengxianPodaoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteMuZhengxianPodao(muZhengxianPodaoId);
    }

    /**
    * Deletes the Mgmt Unit of Zhengxian Podao from the database. Also notifies the appropriate model listeners.
    *
    * @param muZhengxianPodao the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuZhengxianPodao deleteMuZhengxianPodao(
        com.lycenway.chr.backbone.model.MuZhengxianPodao muZhengxianPodao)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteMuZhengxianPodao(muZhengxianPodao);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuZhengxianPodaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.lycenway.chr.backbone.model.MuZhengxianPodao fetchMuZhengxianPodao(
        long muZhengxianPodaoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchMuZhengxianPodao(muZhengxianPodaoId);
    }

    /**
    * Returns the Mgmt Unit of Zhengxian Podao with the primary key.
    *
    * @param muZhengxianPodaoId the primary key of the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao
    * @throws PortalException if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuZhengxianPodao getMuZhengxianPodao(
        long muZhengxianPodaoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getMuZhengxianPodao(muZhengxianPodaoId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.lycenway.chr.backbone.model.MuZhengxianPodao> getMuZhengxianPodaos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getMuZhengxianPodaos(start, end);
    }

    /**
    * Returns the number of Mgmt Unit of Zhengxian Podaos.
    *
    * @return the number of Mgmt Unit of Zhengxian Podaos
    * @throws SystemException if a system exception occurred
    */
    public static int getMuZhengxianPodaosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getMuZhengxianPodaosCount();
    }

    /**
    * Updates the Mgmt Unit of Zhengxian Podao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param muZhengxianPodao the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuZhengxianPodao updateMuZhengxianPodao(
        com.lycenway.chr.backbone.model.MuZhengxianPodao muZhengxianPodao)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateMuZhengxianPodao(muZhengxianPodao);
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

    public static MuZhengxianPodaoLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    MuZhengxianPodaoLocalService.class.getName());

            if (invokableLocalService instanceof MuZhengxianPodaoLocalService) {
                _service = (MuZhengxianPodaoLocalService) invokableLocalService;
            } else {
                _service = new MuZhengxianPodaoLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(MuZhengxianPodaoLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(MuZhengxianPodaoLocalService service) {
    }
}
