package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.lycenway.chr.backbone.model.MuExt;

import java.util.List;

/**
 * The persistence utility for the Mgmt Unit Extended Attributes service. This utility wraps {@link MuExtPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuExtPersistence
 * @see MuExtPersistenceImpl
 * @generated
 */
public class MuExtUtil {
    private static MuExtPersistence _persistence;

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
    public static void clearCache(MuExt muExt) {
        getPersistence().clearCache(muExt);
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
    public static List<MuExt> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<MuExt> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<MuExt> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static MuExt update(MuExt muExt) throws SystemException {
        return getPersistence().update(muExt);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static MuExt update(MuExt muExt, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(muExt, serviceContext);
    }

    /**
    * Caches the Mgmt Unit Extended Attributes in the entity cache if it is enabled.
    *
    * @param muExt the Mgmt Unit Extended Attributes
    */
    public static void cacheResult(com.lycenway.chr.backbone.model.MuExt muExt) {
        getPersistence().cacheResult(muExt);
    }

    /**
    * Caches the Mgmt Unit Extended Attributeses in the entity cache if it is enabled.
    *
    * @param muExts the Mgmt Unit Extended Attributeses
    */
    public static void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.MuExt> muExts) {
        getPersistence().cacheResult(muExts);
    }

    /**
    * Creates a new Mgmt Unit Extended Attributes with the primary key. Does not add the Mgmt Unit Extended Attributes to the database.
    *
    * @param muExtId the primary key for the new Mgmt Unit Extended Attributes
    * @return the new Mgmt Unit Extended Attributes
    */
    public static com.lycenway.chr.backbone.model.MuExt create(long muExtId) {
        return getPersistence().create(muExtId);
    }

    /**
    * Removes the Mgmt Unit Extended Attributes with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muExtId the primary key of the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuExtException if a Mgmt Unit Extended Attributes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuExt remove(long muExtId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuExtException {
        return getPersistence().remove(muExtId);
    }

    public static com.lycenway.chr.backbone.model.MuExt updateImpl(
        com.lycenway.chr.backbone.model.MuExt muExt)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(muExt);
    }

    /**
    * Returns the Mgmt Unit Extended Attributes with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuExtException} if it could not be found.
    *
    * @param muExtId the primary key of the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes
    * @throws com.lycenway.chr.backbone.NoSuchMuExtException if a Mgmt Unit Extended Attributes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuExt findByPrimaryKey(
        long muExtId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuExtException {
        return getPersistence().findByPrimaryKey(muExtId);
    }

    /**
    * Returns the Mgmt Unit Extended Attributes with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muExtId the primary key of the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes, or <code>null</code> if a Mgmt Unit Extended Attributes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuExt fetchByPrimaryKey(
        long muExtId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(muExtId);
    }

    /**
    * Returns all the Mgmt Unit Extended Attributeses.
    *
    * @return the Mgmt Unit Extended Attributeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuExt> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the Mgmt Unit Extended Attributeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit Extended Attributeses
    * @param end the upper bound of the range of Mgmt Unit Extended Attributeses (not inclusive)
    * @return the range of Mgmt Unit Extended Attributeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuExt> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the Mgmt Unit Extended Attributeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit Extended Attributeses
    * @param end the upper bound of the range of Mgmt Unit Extended Attributeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Mgmt Unit Extended Attributeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuExt> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the Mgmt Unit Extended Attributeses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of Mgmt Unit Extended Attributeses.
    *
    * @return the number of Mgmt Unit Extended Attributeses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static MuExtPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MuExtPersistence) PortletBeanLocatorUtil.locate(com.lycenway.chr.backbone.service.ClpSerializer.getServletContextName(),
                    MuExtPersistence.class.getName());

            ReferenceRegistry.registerReference(MuExtUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(MuExtPersistence persistence) {
    }
}