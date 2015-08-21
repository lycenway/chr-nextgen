package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.lycenway.chr.backbone.model.LOVMuType;

import java.util.List;

/**
 * The persistence utility for the Lisf of Value Mgmt Unit Type service. This utility wraps {@link LOVMuTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see LOVMuTypePersistence
 * @see LOVMuTypePersistenceImpl
 * @generated
 */
public class LOVMuTypeUtil {
    private static LOVMuTypePersistence _persistence;

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
    public static void clearCache(LOVMuType lovMuType) {
        getPersistence().clearCache(lovMuType);
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
    public static List<LOVMuType> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<LOVMuType> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<LOVMuType> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static LOVMuType update(LOVMuType lovMuType)
        throws SystemException {
        return getPersistence().update(lovMuType);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static LOVMuType update(LOVMuType lovMuType,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(lovMuType, serviceContext);
    }

    /**
    * Caches the Lisf of Value Mgmt Unit Type in the entity cache if it is enabled.
    *
    * @param lovMuType the Lisf of Value Mgmt Unit Type
    */
    public static void cacheResult(
        com.lycenway.chr.backbone.model.LOVMuType lovMuType) {
        getPersistence().cacheResult(lovMuType);
    }

    /**
    * Caches the Lisf of Value Mgmt Unit Types in the entity cache if it is enabled.
    *
    * @param lovMuTypes the Lisf of Value Mgmt Unit Types
    */
    public static void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.LOVMuType> lovMuTypes) {
        getPersistence().cacheResult(lovMuTypes);
    }

    /**
    * Creates a new Lisf of Value Mgmt Unit Type with the primary key. Does not add the Lisf of Value Mgmt Unit Type to the database.
    *
    * @param code the primary key for the new Lisf of Value Mgmt Unit Type
    * @return the new Lisf of Value Mgmt Unit Type
    */
    public static com.lycenway.chr.backbone.model.LOVMuType create(
        java.lang.String code) {
        return getPersistence().create(code);
    }

    /**
    * Removes the Lisf of Value Mgmt Unit Type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param code the primary key of the Lisf of Value Mgmt Unit Type
    * @return the Lisf of Value Mgmt Unit Type that was removed
    * @throws com.lycenway.chr.backbone.NoSuchLOVMuTypeException if a Lisf of Value Mgmt Unit Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVMuType remove(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchLOVMuTypeException {
        return getPersistence().remove(code);
    }

    public static com.lycenway.chr.backbone.model.LOVMuType updateImpl(
        com.lycenway.chr.backbone.model.LOVMuType lovMuType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(lovMuType);
    }

    /**
    * Returns the Lisf of Value Mgmt Unit Type with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchLOVMuTypeException} if it could not be found.
    *
    * @param code the primary key of the Lisf of Value Mgmt Unit Type
    * @return the Lisf of Value Mgmt Unit Type
    * @throws com.lycenway.chr.backbone.NoSuchLOVMuTypeException if a Lisf of Value Mgmt Unit Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVMuType findByPrimaryKey(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchLOVMuTypeException {
        return getPersistence().findByPrimaryKey(code);
    }

    /**
    * Returns the Lisf of Value Mgmt Unit Type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param code the primary key of the Lisf of Value Mgmt Unit Type
    * @return the Lisf of Value Mgmt Unit Type, or <code>null</code> if a Lisf of Value Mgmt Unit Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.LOVMuType fetchByPrimaryKey(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(code);
    }

    /**
    * Returns all the Lisf of Value Mgmt Unit Types.
    *
    * @return the Lisf of Value Mgmt Unit Types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.LOVMuType> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the Lisf of Value Mgmt Unit Types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVMuTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Lisf of Value Mgmt Unit Types
    * @param end the upper bound of the range of Lisf of Value Mgmt Unit Types (not inclusive)
    * @return the range of Lisf of Value Mgmt Unit Types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.LOVMuType> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the Lisf of Value Mgmt Unit Types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVMuTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Lisf of Value Mgmt Unit Types
    * @param end the upper bound of the range of Lisf of Value Mgmt Unit Types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Lisf of Value Mgmt Unit Types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.LOVMuType> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the Lisf of Value Mgmt Unit Types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of Lisf of Value Mgmt Unit Types.
    *
    * @return the number of Lisf of Value Mgmt Unit Types
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LOVMuTypePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LOVMuTypePersistence) PortletBeanLocatorUtil.locate(com.lycenway.chr.backbone.service.ClpSerializer.getServletContextName(),
                    LOVMuTypePersistence.class.getName());

            ReferenceRegistry.registerReference(LOVMuTypeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LOVMuTypePersistence persistence) {
    }
}
