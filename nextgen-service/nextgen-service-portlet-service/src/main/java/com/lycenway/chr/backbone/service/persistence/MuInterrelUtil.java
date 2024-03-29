package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.lycenway.chr.backbone.model.MuInterrel;

import java.util.List;

/**
 * The persistence utility for the Mgmt Unit Inter Relationship service. This utility wraps {@link MuInterrelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuInterrelPersistence
 * @see MuInterrelPersistenceImpl
 * @generated
 */
public class MuInterrelUtil {
    private static MuInterrelPersistence _persistence;

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
    public static void clearCache(MuInterrel muInterrel) {
        getPersistence().clearCache(muInterrel);
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
    public static List<MuInterrel> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<MuInterrel> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<MuInterrel> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static MuInterrel update(MuInterrel muInterrel)
        throws SystemException {
        return getPersistence().update(muInterrel);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static MuInterrel update(MuInterrel muInterrel,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(muInterrel, serviceContext);
    }

    /**
    * Caches the Mgmt Unit Inter Relationship in the entity cache if it is enabled.
    *
    * @param muInterrel the Mgmt Unit Inter Relationship
    */
    public static void cacheResult(
        com.lycenway.chr.backbone.model.MuInterrel muInterrel) {
        getPersistence().cacheResult(muInterrel);
    }

    /**
    * Caches the Mgmt Unit Inter Relationships in the entity cache if it is enabled.
    *
    * @param muInterrels the Mgmt Unit Inter Relationships
    */
    public static void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.MuInterrel> muInterrels) {
        getPersistence().cacheResult(muInterrels);
    }

    /**
    * Creates a new Mgmt Unit Inter Relationship with the primary key. Does not add the Mgmt Unit Inter Relationship to the database.
    *
    * @param muInterrelId the primary key for the new Mgmt Unit Inter Relationship
    * @return the new Mgmt Unit Inter Relationship
    */
    public static com.lycenway.chr.backbone.model.MuInterrel create(
        long muInterrelId) {
        return getPersistence().create(muInterrelId);
    }

    /**
    * Removes the Mgmt Unit Inter Relationship with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuInterrelException if a Mgmt Unit Inter Relationship with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuInterrel remove(
        long muInterrelId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuInterrelException {
        return getPersistence().remove(muInterrelId);
    }

    public static com.lycenway.chr.backbone.model.MuInterrel updateImpl(
        com.lycenway.chr.backbone.model.MuInterrel muInterrel)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(muInterrel);
    }

    /**
    * Returns the Mgmt Unit Inter Relationship with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuInterrelException} if it could not be found.
    *
    * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship
    * @throws com.lycenway.chr.backbone.NoSuchMuInterrelException if a Mgmt Unit Inter Relationship with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuInterrel findByPrimaryKey(
        long muInterrelId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuInterrelException {
        return getPersistence().findByPrimaryKey(muInterrelId);
    }

    /**
    * Returns the Mgmt Unit Inter Relationship with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship, or <code>null</code> if a Mgmt Unit Inter Relationship with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuInterrel fetchByPrimaryKey(
        long muInterrelId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(muInterrelId);
    }

    /**
    * Returns all the Mgmt Unit Inter Relationships.
    *
    * @return the Mgmt Unit Inter Relationships
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuInterrel> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the Mgmt Unit Inter Relationships.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuInterrelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit Inter Relationships
    * @param end the upper bound of the range of Mgmt Unit Inter Relationships (not inclusive)
    * @return the range of Mgmt Unit Inter Relationships
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuInterrel> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the Mgmt Unit Inter Relationships.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuInterrelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit Inter Relationships
    * @param end the upper bound of the range of Mgmt Unit Inter Relationships (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Mgmt Unit Inter Relationships
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuInterrel> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the Mgmt Unit Inter Relationships from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of Mgmt Unit Inter Relationships.
    *
    * @return the number of Mgmt Unit Inter Relationships
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static MuInterrelPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MuInterrelPersistence) PortletBeanLocatorUtil.locate(com.lycenway.chr.backbone.service.ClpSerializer.getServletContextName(),
                    MuInterrelPersistence.class.getName());

            ReferenceRegistry.registerReference(MuInterrelUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(MuInterrelPersistence persistence) {
    }
}
