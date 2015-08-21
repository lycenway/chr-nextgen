package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.lycenway.chr.backbone.model.BinghaiPingfen;

import java.util.List;

/**
 * The persistence utility for the binghai pingfen service. This utility wraps {@link BinghaiPingfenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see BinghaiPingfenPersistence
 * @see BinghaiPingfenPersistenceImpl
 * @generated
 */
public class BinghaiPingfenUtil {
    private static BinghaiPingfenPersistence _persistence;

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
    public static void clearCache(BinghaiPingfen binghaiPingfen) {
        getPersistence().clearCache(binghaiPingfen);
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
    public static List<BinghaiPingfen> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BinghaiPingfen> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BinghaiPingfen> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BinghaiPingfen update(BinghaiPingfen binghaiPingfen)
        throws SystemException {
        return getPersistence().update(binghaiPingfen);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BinghaiPingfen update(BinghaiPingfen binghaiPingfen,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(binghaiPingfen, serviceContext);
    }

    /**
    * Returns all the binghai pingfens where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
    *
    * @param dalei the dalei
    * @param vmin the vmin
    * @param vmax the vmax
    * @param xiangmu the xiangmu
    * @param dengji_min the dengji_min
    * @param dengji_max the dengji_max
    * @return the matching binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findBydalei_xiangmu(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBydalei_xiangmu(dalei, vmin, vmax, xiangmu, dengji_min,
            dengji_max);
    }

    /**
    * Returns a range of all the binghai pingfens where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dalei the dalei
    * @param vmin the vmin
    * @param vmax the vmax
    * @param xiangmu the xiangmu
    * @param dengji_min the dengji_min
    * @param dengji_max the dengji_max
    * @param start the lower bound of the range of binghai pingfens
    * @param end the upper bound of the range of binghai pingfens (not inclusive)
    * @return the range of matching binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findBydalei_xiangmu(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBydalei_xiangmu(dalei, vmin, vmax, xiangmu, dengji_min,
            dengji_max, start, end);
    }

    /**
    * Returns an ordered range of all the binghai pingfens where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dalei the dalei
    * @param vmin the vmin
    * @param vmax the vmax
    * @param xiangmu the xiangmu
    * @param dengji_min the dengji_min
    * @param dengji_max the dengji_max
    * @param start the lower bound of the range of binghai pingfens
    * @param end the upper bound of the range of binghai pingfens (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findBydalei_xiangmu(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBydalei_xiangmu(dalei, vmin, vmax, xiangmu, dengji_min,
            dengji_max, start, end, orderByComparator);
    }

    /**
    * Returns the first binghai pingfen in the ordered set where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
    *
    * @param dalei the dalei
    * @param vmin the vmin
    * @param vmax the vmax
    * @param xiangmu the xiangmu
    * @param dengji_min the dengji_min
    * @param dengji_max the dengji_max
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching binghai pingfen
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a matching binghai pingfen could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiPingfen findBydalei_xiangmu_First(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiPingfenException {
        return getPersistence()
                   .findBydalei_xiangmu_First(dalei, vmin, vmax, xiangmu,
            dengji_min, dengji_max, orderByComparator);
    }

    /**
    * Returns the first binghai pingfen in the ordered set where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
    *
    * @param dalei the dalei
    * @param vmin the vmin
    * @param vmax the vmax
    * @param xiangmu the xiangmu
    * @param dengji_min the dengji_min
    * @param dengji_max the dengji_max
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching binghai pingfen, or <code>null</code> if a matching binghai pingfen could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiPingfen fetchBydalei_xiangmu_First(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBydalei_xiangmu_First(dalei, vmin, vmax, xiangmu,
            dengji_min, dengji_max, orderByComparator);
    }

    /**
    * Returns the last binghai pingfen in the ordered set where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
    *
    * @param dalei the dalei
    * @param vmin the vmin
    * @param vmax the vmax
    * @param xiangmu the xiangmu
    * @param dengji_min the dengji_min
    * @param dengji_max the dengji_max
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching binghai pingfen
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a matching binghai pingfen could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiPingfen findBydalei_xiangmu_Last(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiPingfenException {
        return getPersistence()
                   .findBydalei_xiangmu_Last(dalei, vmin, vmax, xiangmu,
            dengji_min, dengji_max, orderByComparator);
    }

    /**
    * Returns the last binghai pingfen in the ordered set where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
    *
    * @param dalei the dalei
    * @param vmin the vmin
    * @param vmax the vmax
    * @param xiangmu the xiangmu
    * @param dengji_min the dengji_min
    * @param dengji_max the dengji_max
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching binghai pingfen, or <code>null</code> if a matching binghai pingfen could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiPingfen fetchBydalei_xiangmu_Last(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBydalei_xiangmu_Last(dalei, vmin, vmax, xiangmu,
            dengji_min, dengji_max, orderByComparator);
    }

    /**
    * Returns the binghai pingfens before and after the current binghai pingfen in the ordered set where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
    *
    * @param binghaiPingfenId the primary key of the current binghai pingfen
    * @param dalei the dalei
    * @param vmin the vmin
    * @param vmax the vmax
    * @param xiangmu the xiangmu
    * @param dengji_min the dengji_min
    * @param dengji_max the dengji_max
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next binghai pingfen
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a binghai pingfen with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiPingfen[] findBydalei_xiangmu_PrevAndNext(
        long binghaiPingfenId, java.lang.String dalei, double vmin,
        double vmax, java.lang.String xiangmu, double dengji_min,
        double dengji_max,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiPingfenException {
        return getPersistence()
                   .findBydalei_xiangmu_PrevAndNext(binghaiPingfenId, dalei,
            vmin, vmax, xiangmu, dengji_min, dengji_max, orderByComparator);
    }

    /**
    * Removes all the binghai pingfens where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63; from the database.
    *
    * @param dalei the dalei
    * @param vmin the vmin
    * @param vmax the vmax
    * @param xiangmu the xiangmu
    * @param dengji_min the dengji_min
    * @param dengji_max the dengji_max
    * @throws SystemException if a system exception occurred
    */
    public static void removeBydalei_xiangmu(java.lang.String dalei,
        double vmin, double vmax, java.lang.String xiangmu, double dengji_min,
        double dengji_max)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence()
            .removeBydalei_xiangmu(dalei, vmin, vmax, xiangmu, dengji_min,
            dengji_max);
    }

    /**
    * Returns the number of binghai pingfens where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
    *
    * @param dalei the dalei
    * @param vmin the vmin
    * @param vmax the vmax
    * @param xiangmu the xiangmu
    * @param dengji_min the dengji_min
    * @param dengji_max the dengji_max
    * @return the number of matching binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    public static int countBydalei_xiangmu(java.lang.String dalei, double vmin,
        double vmax, java.lang.String xiangmu, double dengji_min,
        double dengji_max)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countBydalei_xiangmu(dalei, vmin, vmax, xiangmu,
            dengji_min, dengji_max);
    }

    /**
    * Caches the binghai pingfen in the entity cache if it is enabled.
    *
    * @param binghaiPingfen the binghai pingfen
    */
    public static void cacheResult(
        com.lycenway.chr.backbone.model.BinghaiPingfen binghaiPingfen) {
        getPersistence().cacheResult(binghaiPingfen);
    }

    /**
    * Caches the binghai pingfens in the entity cache if it is enabled.
    *
    * @param binghaiPingfens the binghai pingfens
    */
    public static void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> binghaiPingfens) {
        getPersistence().cacheResult(binghaiPingfens);
    }

    /**
    * Creates a new binghai pingfen with the primary key. Does not add the binghai pingfen to the database.
    *
    * @param binghaiPingfenId the primary key for the new binghai pingfen
    * @return the new binghai pingfen
    */
    public static com.lycenway.chr.backbone.model.BinghaiPingfen create(
        long binghaiPingfenId) {
        return getPersistence().create(binghaiPingfenId);
    }

    /**
    * Removes the binghai pingfen with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiPingfenId the primary key of the binghai pingfen
    * @return the binghai pingfen that was removed
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a binghai pingfen with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiPingfen remove(
        long binghaiPingfenId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiPingfenException {
        return getPersistence().remove(binghaiPingfenId);
    }

    public static com.lycenway.chr.backbone.model.BinghaiPingfen updateImpl(
        com.lycenway.chr.backbone.model.BinghaiPingfen binghaiPingfen)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(binghaiPingfen);
    }

    /**
    * Returns the binghai pingfen with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchBinghaiPingfenException} if it could not be found.
    *
    * @param binghaiPingfenId the primary key of the binghai pingfen
    * @return the binghai pingfen
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a binghai pingfen with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiPingfen findByPrimaryKey(
        long binghaiPingfenId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiPingfenException {
        return getPersistence().findByPrimaryKey(binghaiPingfenId);
    }

    /**
    * Returns the binghai pingfen with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param binghaiPingfenId the primary key of the binghai pingfen
    * @return the binghai pingfen, or <code>null</code> if a binghai pingfen with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiPingfen fetchByPrimaryKey(
        long binghaiPingfenId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(binghaiPingfenId);
    }

    /**
    * Returns all the binghai pingfens.
    *
    * @return the binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the binghai pingfens.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of binghai pingfens
    * @param end the upper bound of the range of binghai pingfens (not inclusive)
    * @return the range of binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the binghai pingfens.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of binghai pingfens
    * @param end the upper bound of the range of binghai pingfens (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the binghai pingfens from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of binghai pingfens.
    *
    * @return the number of binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BinghaiPingfenPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BinghaiPingfenPersistence) PortletBeanLocatorUtil.locate(com.lycenway.chr.backbone.service.ClpSerializer.getServletContextName(),
                    BinghaiPingfenPersistence.class.getName());

            ReferenceRegistry.registerReference(BinghaiPingfenUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BinghaiPingfenPersistence persistence) {
    }
}
