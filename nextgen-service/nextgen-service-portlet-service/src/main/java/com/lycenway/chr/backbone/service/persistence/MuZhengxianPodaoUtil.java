package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.lycenway.chr.backbone.model.MuZhengxianPodao;

import java.util.List;

/**
 * The persistence utility for the Mgmt Unit of Zhengxian Podao service. This utility wraps {@link MuZhengxianPodaoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuZhengxianPodaoPersistence
 * @see MuZhengxianPodaoPersistenceImpl
 * @generated
 */
public class MuZhengxianPodaoUtil {
    private static MuZhengxianPodaoPersistence _persistence;

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
    public static void clearCache(MuZhengxianPodao muZhengxianPodao) {
        getPersistence().clearCache(muZhengxianPodao);
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
    public static List<MuZhengxianPodao> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<MuZhengxianPodao> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<MuZhengxianPodao> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static MuZhengxianPodao update(MuZhengxianPodao muZhengxianPodao)
        throws SystemException {
        return getPersistence().update(muZhengxianPodao);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static MuZhengxianPodao update(MuZhengxianPodao muZhengxianPodao,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(muZhengxianPodao, serviceContext);
    }

    /**
    * Caches the Mgmt Unit of Zhengxian Podao in the entity cache if it is enabled.
    *
    * @param muZhengxianPodao the Mgmt Unit of Zhengxian Podao
    */
    public static void cacheResult(
        com.lycenway.chr.backbone.model.MuZhengxianPodao muZhengxianPodao) {
        getPersistence().cacheResult(muZhengxianPodao);
    }

    /**
    * Caches the Mgmt Unit of Zhengxian Podaos in the entity cache if it is enabled.
    *
    * @param muZhengxianPodaos the Mgmt Unit of Zhengxian Podaos
    */
    public static void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.MuZhengxianPodao> muZhengxianPodaos) {
        getPersistence().cacheResult(muZhengxianPodaos);
    }

    /**
    * Creates a new Mgmt Unit of Zhengxian Podao with the primary key. Does not add the Mgmt Unit of Zhengxian Podao to the database.
    *
    * @param muZhengxianPodaoId the primary key for the new Mgmt Unit of Zhengxian Podao
    * @return the new Mgmt Unit of Zhengxian Podao
    */
    public static com.lycenway.chr.backbone.model.MuZhengxianPodao create(
        long muZhengxianPodaoId) {
        return getPersistence().create(muZhengxianPodaoId);
    }

    /**
    * Removes the Mgmt Unit of Zhengxian Podao with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muZhengxianPodaoId the primary key of the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuZhengxianPodao remove(
        long muZhengxianPodaoId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException {
        return getPersistence().remove(muZhengxianPodaoId);
    }

    public static com.lycenway.chr.backbone.model.MuZhengxianPodao updateImpl(
        com.lycenway.chr.backbone.model.MuZhengxianPodao muZhengxianPodao)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(muZhengxianPodao);
    }

    /**
    * Returns the Mgmt Unit of Zhengxian Podao with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException} if it could not be found.
    *
    * @param muZhengxianPodaoId the primary key of the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao
    * @throws com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuZhengxianPodao findByPrimaryKey(
        long muZhengxianPodaoId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException {
        return getPersistence().findByPrimaryKey(muZhengxianPodaoId);
    }

    /**
    * Returns the Mgmt Unit of Zhengxian Podao with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muZhengxianPodaoId the primary key of the Mgmt Unit of Zhengxian Podao
    * @return the Mgmt Unit of Zhengxian Podao, or <code>null</code> if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.MuZhengxianPodao fetchByPrimaryKey(
        long muZhengxianPodaoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(muZhengxianPodaoId);
    }

    /**
    * Returns all the Mgmt Unit of Zhengxian Podaos.
    *
    * @return the Mgmt Unit of Zhengxian Podaos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuZhengxianPodao> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.lycenway.chr.backbone.model.MuZhengxianPodao> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the Mgmt Unit of Zhengxian Podaos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuZhengxianPodaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit of Zhengxian Podaos
    * @param end the upper bound of the range of Mgmt Unit of Zhengxian Podaos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Mgmt Unit of Zhengxian Podaos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.MuZhengxianPodao> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the Mgmt Unit of Zhengxian Podaos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of Mgmt Unit of Zhengxian Podaos.
    *
    * @return the number of Mgmt Unit of Zhengxian Podaos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static MuZhengxianPodaoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MuZhengxianPodaoPersistence) PortletBeanLocatorUtil.locate(com.lycenway.chr.backbone.service.ClpSerializer.getServletContextName(),
                    MuZhengxianPodaoPersistence.class.getName());

            ReferenceRegistry.registerReference(MuZhengxianPodaoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(MuZhengxianPodaoPersistence persistence) {
    }
}
