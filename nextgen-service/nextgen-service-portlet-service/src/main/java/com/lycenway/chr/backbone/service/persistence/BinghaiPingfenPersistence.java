package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lycenway.chr.backbone.model.BinghaiPingfen;

/**
 * The persistence interface for the binghai pingfen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see BinghaiPingfenPersistenceImpl
 * @see BinghaiPingfenUtil
 * @generated
 */
public interface BinghaiPingfenPersistence extends BasePersistence<BinghaiPingfen> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BinghaiPingfenUtil} to access the binghai pingfen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

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
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findBydalei_xiangmu(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findBydalei_xiangmu(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findBydalei_xiangmu(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lycenway.chr.backbone.model.BinghaiPingfen findBydalei_xiangmu_First(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiPingfenException;

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
    public com.lycenway.chr.backbone.model.BinghaiPingfen fetchBydalei_xiangmu_First(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lycenway.chr.backbone.model.BinghaiPingfen findBydalei_xiangmu_Last(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiPingfenException;

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
    public com.lycenway.chr.backbone.model.BinghaiPingfen fetchBydalei_xiangmu_Last(
        java.lang.String dalei, double vmin, double vmax,
        java.lang.String xiangmu, double dengji_min, double dengji_max,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lycenway.chr.backbone.model.BinghaiPingfen[] findBydalei_xiangmu_PrevAndNext(
        long binghaiPingfenId, java.lang.String dalei, double vmin,
        double vmax, java.lang.String xiangmu, double dengji_min,
        double dengji_max,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiPingfenException;

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
    public void removeBydalei_xiangmu(java.lang.String dalei, double vmin,
        double vmax, java.lang.String xiangmu, double dengji_min,
        double dengji_max)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public int countBydalei_xiangmu(java.lang.String dalei, double vmin,
        double vmax, java.lang.String xiangmu, double dengji_min,
        double dengji_max)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the binghai pingfen in the entity cache if it is enabled.
    *
    * @param binghaiPingfen the binghai pingfen
    */
    public void cacheResult(
        com.lycenway.chr.backbone.model.BinghaiPingfen binghaiPingfen);

    /**
    * Caches the binghai pingfens in the entity cache if it is enabled.
    *
    * @param binghaiPingfens the binghai pingfens
    */
    public void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> binghaiPingfens);

    /**
    * Creates a new binghai pingfen with the primary key. Does not add the binghai pingfen to the database.
    *
    * @param binghaiPingfenId the primary key for the new binghai pingfen
    * @return the new binghai pingfen
    */
    public com.lycenway.chr.backbone.model.BinghaiPingfen create(
        long binghaiPingfenId);

    /**
    * Removes the binghai pingfen with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiPingfenId the primary key of the binghai pingfen
    * @return the binghai pingfen that was removed
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a binghai pingfen with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.BinghaiPingfen remove(
        long binghaiPingfenId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiPingfenException;

    public com.lycenway.chr.backbone.model.BinghaiPingfen updateImpl(
        com.lycenway.chr.backbone.model.BinghaiPingfen binghaiPingfen)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the binghai pingfen with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchBinghaiPingfenException} if it could not be found.
    *
    * @param binghaiPingfenId the primary key of the binghai pingfen
    * @return the binghai pingfen
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a binghai pingfen with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.BinghaiPingfen findByPrimaryKey(
        long binghaiPingfenId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiPingfenException;

    /**
    * Returns the binghai pingfen with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param binghaiPingfenId the primary key of the binghai pingfen
    * @return the binghai pingfen, or <code>null</code> if a binghai pingfen with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.BinghaiPingfen fetchByPrimaryKey(
        long binghaiPingfenId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the binghai pingfens.
    *
    * @return the binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiPingfen> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the binghai pingfens from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of binghai pingfens.
    *
    * @return the number of binghai pingfens
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
