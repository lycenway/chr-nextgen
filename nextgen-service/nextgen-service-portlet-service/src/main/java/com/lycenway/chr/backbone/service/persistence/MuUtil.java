package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.lycenway.chr.backbone.model.Mu;

import java.util.List;

/**
 * The persistence utility for the Mgmt Unit service. This utility wraps {@link MuPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuPersistence
 * @see MuPersistenceImpl
 * @generated
 */
public class MuUtil {
    private static MuPersistence _persistence;

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
    public static void clearCache(Mu mu) {
        getPersistence().clearCache(mu);
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
    public static List<Mu> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Mu> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Mu> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Mu update(Mu mu) throws SystemException {
        return getPersistence().update(mu);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Mu update(Mu mu, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(mu, serviceContext);
    }

    /**
    * Caches the Mgmt Unit in the entity cache if it is enabled.
    *
    * @param mu the Mgmt Unit
    */
    public static void cacheResult(com.lycenway.chr.backbone.model.Mu mu) {
        getPersistence().cacheResult(mu);
    }

    /**
    * Caches the Mgmt Units in the entity cache if it is enabled.
    *
    * @param mus the Mgmt Units
    */
    public static void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.Mu> mus) {
        getPersistence().cacheResult(mus);
    }

    /**
    * Creates a new Mgmt Unit with the primary key. Does not add the Mgmt Unit to the database.
    *
    * @param muPK the primary key for the new Mgmt Unit
    * @return the new Mgmt Unit
    */
    public static com.lycenway.chr.backbone.model.Mu create(MuPK muPK) {
        return getPersistence().create(muPK);
    }

    /**
    * Removes the Mgmt Unit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muPK the primary key of the Mgmt Unit
    * @return the Mgmt Unit that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuException if a Mgmt Unit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.Mu remove(MuPK muPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuException {
        return getPersistence().remove(muPK);
    }

    public static com.lycenway.chr.backbone.model.Mu updateImpl(
        com.lycenway.chr.backbone.model.Mu mu)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(mu);
    }

    /**
    * Returns the Mgmt Unit with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuException} if it could not be found.
    *
    * @param muPK the primary key of the Mgmt Unit
    * @return the Mgmt Unit
    * @throws com.lycenway.chr.backbone.NoSuchMuException if a Mgmt Unit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.Mu findByPrimaryKey(MuPK muPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuException {
        return getPersistence().findByPrimaryKey(muPK);
    }

    /**
    * Returns the Mgmt Unit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muPK the primary key of the Mgmt Unit
    * @return the Mgmt Unit, or <code>null</code> if a Mgmt Unit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.Mu fetchByPrimaryKey(
        MuPK muPK) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(muPK);
    }

    /**
    * Returns all the Mgmt Units.
    *
    * @return the Mgmt Units
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.Mu> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the Mgmt Units.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Units
    * @param end the upper bound of the range of Mgmt Units (not inclusive)
    * @return the range of Mgmt Units
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.Mu> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the Mgmt Units.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Units
    * @param end the upper bound of the range of Mgmt Units (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Mgmt Units
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.Mu> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the Mgmt Units from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of Mgmt Units.
    *
    * @return the number of Mgmt Units
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static MuPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MuPersistence) PortletBeanLocatorUtil.locate(com.lycenway.chr.backbone.service.ClpSerializer.getServletContextName(),
                    MuPersistence.class.getName());

            ReferenceRegistry.registerReference(MuUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(MuPersistence persistence) {
    }
}
