package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.lycenway.chr.backbone.model.LOVBinghaiLeixing;

import java.util.List;

/**
 * The persistence utility for the List of Value Binghai Leixing - Case Type service. This utility wraps {@link LOVBinghaiLeixingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see LOVBinghaiLeixingPersistence
 * @see LOVBinghaiLeixingPersistenceImpl
 * @generated
 */
public class LOVBinghaiLeixingUtil {
    private static LOVBinghaiLeixingPersistence _persistence;

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
    public static void clearCache(LOVBinghaiLeixing lovBinghaiLeixing) {
        getPersistence().clearCache(lovBinghaiLeixing);
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
    public static List<LOVBinghaiLeixing> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<LOVBinghaiLeixing> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<LOVBinghaiLeixing> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static LOVBinghaiLeixing update(LOVBinghaiLeixing lovBinghaiLeixing)
        throws SystemException {
        return getPersistence().update(lovBinghaiLeixing);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static LOVBinghaiLeixing update(
        LOVBinghaiLeixing lovBinghaiLeixing, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(lovBinghaiLeixing, serviceContext);
    }

    /**
    * Caches the List of Value Binghai Leixing - Case Type in the entity cache if it is enabled.
    *
    * @param lovBinghaiLeixing the List of Value Binghai Leixing - Case Type
    */
    public static void cacheResult(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing) {
        getPersistence().cacheResult(lovBinghaiLeixing);
    }

    /**
    * Caches the List of Value Binghai Leixing - Case Types in the entity cache if it is enabled.
    *
    * @param lovBinghaiLeixings the List of Value Binghai Leixing - Case Types
    */
    public static void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> lovBinghaiLeixings) {
        getPersistence().cacheResult(lovBinghaiLeixings);
    }

    /**
    * Creates a new List of Value Binghai Leixing - Case Type with the primary key. Does not add the List of Value Binghai Leixing - Case Type to the database.
    *
    * @param code the primary key for the new List of Value Binghai Leixing - Case Type
    * @return the new List of Value Binghai Leixing - Case Type
    */
    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing create(
        java.lang.String code) {
        return getPersistence().create(code);
    }

    /**
    * Removes the List of Value Binghai Leixing - Case Type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param code the primary key of the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type that was removed
    * @throws com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing remove(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException {
        return getPersistence().remove(code);
    }

    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing updateImpl(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(lovBinghaiLeixing);
    }

    /**
    * Returns the List of Value Binghai Leixing - Case Type with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException} if it could not be found.
    *
    * @param code the primary key of the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type
    * @throws com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing findByPrimaryKey(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException {
        return getPersistence().findByPrimaryKey(code);
    }

    /**
    * Returns the List of Value Binghai Leixing - Case Type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param code the primary key of the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type, or <code>null</code> if a List of Value Binghai Leixing - Case Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVBinghaiLeixing fetchByPrimaryKey(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(code);
    }

    /**
    * Returns all the List of Value Binghai Leixing - Case Types.
    *
    * @return the List of Value Binghai Leixing - Case Types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the List of Value Binghai Leixing - Case Types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of List of Value Binghai Leixing - Case Types
    * @param end the upper bound of the range of List of Value Binghai Leixing - Case Types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of List of Value Binghai Leixing - Case Types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the List of Value Binghai Leixing - Case Types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of List of Value Binghai Leixing - Case Types.
    *
    * @return the number of List of Value Binghai Leixing - Case Types
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LOVBinghaiLeixingPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LOVBinghaiLeixingPersistence) PortletBeanLocatorUtil.locate(com.lycenway.chr.backbone.service.ClpSerializer.getServletContextName(),
                    LOVBinghaiLeixingPersistence.class.getName());

            ReferenceRegistry.registerReference(LOVBinghaiLeixingUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LOVBinghaiLeixingPersistence persistence) {
    }
}
