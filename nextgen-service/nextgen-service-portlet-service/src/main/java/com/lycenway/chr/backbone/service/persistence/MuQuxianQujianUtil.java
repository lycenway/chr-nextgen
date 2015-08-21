package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.lycenway.chr.backbone.model.MuQuxianQujian;

import java.util.List;

/**
 * The persistence utility for the Mgmt Unit of Quxian Qujian service. This utility wraps {@link MuQuxianQujianPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuQuxianQujianPersistence
 * @see MuQuxianQujianPersistenceImpl
 * @generated
 */
public class MuQuxianQujianUtil {
    private static MuQuxianQujianPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(MuQuxianQujian muQuxianQujian) {
        getPersistence().clearCache(muQuxianQujian);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<MuQuxianQujian> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<MuQuxianQujian> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<MuQuxianQujian> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static MuQuxianQujian update(MuQuxianQujian muQuxianQujian)
        throws SystemException {
        return getPersistence().update(muQuxianQujian);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static MuQuxianQujian update(MuQuxianQujian muQuxianQujian,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(muQuxianQujian, serviceContext);
    }

    /**
    * Caches the Mgmt Unit of Quxian Qujian in the entity cache if it is enabled.
    *
    * @param muQuxianQujian the Mgmt Unit of Quxian Qujian
    */
    public static void cacheResult(
        com.lycenway.chr.backbone.model.MuQuxianQujian muQuxianQujian) {
        getPersistence().cacheResult(muQuxianQujian);
    }

    /**
    * Caches the Mgmt Unit of Quxian Qujians in the entity cache if it is enabled.
    *
    * @param muQuxianQujians the Mgmt Unit of Quxian Qujians
    */
    public static void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.MuQuxianQujian> muQuxianQujians) {
        getPersistence().cacheResult(muQuxianQujians);
    }

    /**
    * Creates a new Mgmt Unit of Quxian Qujian with the primary key. Does not add the Mgmt Unit of Quxian Qujian to the database.
    *
    * @param muQuxianQujianId the primary key for the new Mgmt Unit of Quxian Qujian
    * @return the new Mgmt Unit of Quxian Qujian
    */
    public static com.lycenway.chr.backbone.model.MuQuxianQujian create(
        long muQuxianQujianId) {
        return getPersistence().create(muQuxianQujianId);
    }

    /**
    * Removes the Mgmt Unit of Quxian Qujian with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuQuxianQujianException if a Mgmt Unit of Quxian Qujian with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuQuxianQujian remove(
        long muQuxianQujianId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuQuxianQujianException {
        return getPersistence().remove(muQuxianQujianId);
    }

    public static com.lycenway.chr.backbone.model.MuQuxianQujian updateImpl(
        com.lycenway.chr.backbone.model.MuQuxianQujian muQuxianQujian)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(muQuxianQujian);
    }

    /**
    * Returns the Mgmt Unit of Quxian Qujian with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuQuxianQujianException} if it could not be found.
    *
    * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian
    * @throws com.lycenway.chr.backbone.NoSuchMuQuxianQujianException if a Mgmt Unit of Quxian Qujian with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuQuxianQujian findByPrimaryKey(
        long muQuxianQujianId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuQuxianQujianException {
        return getPersistence().findByPrimaryKey(muQuxianQujianId);
    }

    /**
    * Returns the Mgmt Unit of Quxian Qujian with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian, or <code>null</code> if a Mgmt Unit of Quxian Qujian with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuQuxianQujian fetchByPrimaryKey(
        long muQuxianQujianId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(muQuxianQujianId);
    }

    /**
    * Returns all the Mgmt Unit of Quxian Qujians.
    *
    * @return the Mgmt Unit of Quxian Qujians
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuQuxianQujian> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.lycenway.chr.backbone.model.MuQuxianQujian> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the Mgmt Unit of Quxian Qujians.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit of Quxian Qujians
    * @param end the upper bound of the range of Mgmt Unit of Quxian Qujians (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Mgmt Unit of Quxian Qujians
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuQuxianQujian> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the Mgmt Unit of Quxian Qujians from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of Mgmt Unit of Quxian Qujians.
    *
    * @return the number of Mgmt Unit of Quxian Qujians
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static MuQuxianQujianPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MuQuxianQujianPersistence) PortletBeanLocatorUtil.locate(com.lycenway.chr.backbone.service.ClpSerializer.getServletContextName(),
                    MuQuxianQujianPersistence.class.getName());

            ReferenceRegistry.registerReference(MuQuxianQujianUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(MuQuxianQujianPersistence persistence) {
    }
}
