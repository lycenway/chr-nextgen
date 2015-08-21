package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.lycenway.chr.backbone.model.MuWufengXianlu;

import java.util.List;

/**
 * The persistence utility for the Mgmt Unit of Wufeng Xianlu service. This utility wraps {@link MuWufengXianluPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuWufengXianluPersistence
 * @see MuWufengXianluPersistenceImpl
 * @generated
 */
public class MuWufengXianluUtil {
    private static MuWufengXianluPersistence _persistence;

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
    public static void clearCache(MuWufengXianlu muWufengXianlu) {
        getPersistence().clearCache(muWufengXianlu);
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
    public static List<MuWufengXianlu> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<MuWufengXianlu> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<MuWufengXianlu> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static MuWufengXianlu update(MuWufengXianlu muWufengXianlu)
        throws SystemException {
        return getPersistence().update(muWufengXianlu);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static MuWufengXianlu update(MuWufengXianlu muWufengXianlu,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(muWufengXianlu, serviceContext);
    }

    /**
    * Caches the Mgmt Unit of Wufeng Xianlu in the entity cache if it is enabled.
    *
    * @param muWufengXianlu the Mgmt Unit of Wufeng Xianlu
    */
    public static void cacheResult(
        com.lycenway.chr.backbone.model.MuWufengXianlu muWufengXianlu) {
        getPersistence().cacheResult(muWufengXianlu);
    }

    /**
    * Caches the Mgmt Unit of Wufeng Xianlus in the entity cache if it is enabled.
    *
    * @param muWufengXianlus the Mgmt Unit of Wufeng Xianlus
    */
    public static void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.MuWufengXianlu> muWufengXianlus) {
        getPersistence().cacheResult(muWufengXianlus);
    }

    /**
    * Creates a new Mgmt Unit of Wufeng Xianlu with the primary key. Does not add the Mgmt Unit of Wufeng Xianlu to the database.
    *
    * @param muWufengXianluId the primary key for the new Mgmt Unit of Wufeng Xianlu
    * @return the new Mgmt Unit of Wufeng Xianlu
    */
    public static com.lycenway.chr.backbone.model.MuWufengXianlu create(
        long muWufengXianluId) {
        return getPersistence().create(muWufengXianluId);
    }

    /**
    * Removes the Mgmt Unit of Wufeng Xianlu with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuWufengXianluException if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuWufengXianlu remove(
        long muWufengXianluId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuWufengXianluException {
        return getPersistence().remove(muWufengXianluId);
    }

    public static com.lycenway.chr.backbone.model.MuWufengXianlu updateImpl(
        com.lycenway.chr.backbone.model.MuWufengXianlu muWufengXianlu)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(muWufengXianlu);
    }

    /**
    * Returns the Mgmt Unit of Wufeng Xianlu with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuWufengXianluException} if it could not be found.
    *
    * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu
    * @throws com.lycenway.chr.backbone.NoSuchMuWufengXianluException if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuWufengXianlu findByPrimaryKey(
        long muWufengXianluId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuWufengXianluException {
        return getPersistence().findByPrimaryKey(muWufengXianluId);
    }

    /**
    * Returns the Mgmt Unit of Wufeng Xianlu with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu, or <code>null</code> if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuWufengXianlu fetchByPrimaryKey(
        long muWufengXianluId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(muWufengXianluId);
    }

    /**
    * Returns all the Mgmt Unit of Wufeng Xianlus.
    *
    * @return the Mgmt Unit of Wufeng Xianlus
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuWufengXianlu> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.lycenway.chr.backbone.model.MuWufengXianlu> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the Mgmt Unit of Wufeng Xianlus.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuWufengXianluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit of Wufeng Xianlus
    * @param end the upper bound of the range of Mgmt Unit of Wufeng Xianlus (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Mgmt Unit of Wufeng Xianlus
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuWufengXianlu> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the Mgmt Unit of Wufeng Xianlus from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of Mgmt Unit of Wufeng Xianlus.
    *
    * @return the number of Mgmt Unit of Wufeng Xianlus
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static MuWufengXianluPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MuWufengXianluPersistence) PortletBeanLocatorUtil.locate(com.lycenway.chr.backbone.service.ClpSerializer.getServletContextName(),
                    MuWufengXianluPersistence.class.getName());

            ReferenceRegistry.registerReference(MuWufengXianluUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(MuWufengXianluPersistence persistence) {
    }
}
