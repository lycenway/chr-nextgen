package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lycenway.chr.backbone.model.LOVBinghaiLeixing;

/**
 * The persistence interface for the List of Value Binghai Leixing - Case Type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see LOVBinghaiLeixingPersistenceImpl
 * @see LOVBinghaiLeixingUtil
 * @generated
 */
public interface LOVBinghaiLeixingPersistence extends BasePersistence<LOVBinghaiLeixing> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LOVBinghaiLeixingUtil} to access the List of Value Binghai Leixing - Case Type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the List of Value Binghai Leixing - Case Type in the entity cache if it is enabled.
    *
    * @param lovBinghaiLeixing the List of Value Binghai Leixing - Case Type
    */
    public void cacheResult(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing);

    /**
    * Caches the List of Value Binghai Leixing - Case Types in the entity cache if it is enabled.
    *
    * @param lovBinghaiLeixings the List of Value Binghai Leixing - Case Types
    */
    public void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> lovBinghaiLeixings);

    /**
    * Creates a new List of Value Binghai Leixing - Case Type with the primary key. Does not add the List of Value Binghai Leixing - Case Type to the database.
    *
    * @param code the primary key for the new List of Value Binghai Leixing - Case Type
    * @return the new List of Value Binghai Leixing - Case Type
    */
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing create(
        java.lang.String code);

    /**
    * Removes the List of Value Binghai Leixing - Case Type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param code the primary key of the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type that was removed
    * @throws com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing remove(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException;

    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing updateImpl(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the List of Value Binghai Leixing - Case Type with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException} if it could not be found.
    *
    * @param code the primary key of the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type
    * @throws com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing findByPrimaryKey(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException;

    /**
    * Returns the List of Value Binghai Leixing - Case Type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param code the primary key of the List of Value Binghai Leixing - Case Type
    * @return the List of Value Binghai Leixing - Case Type, or <code>null</code> if a List of Value Binghai Leixing - Case Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing fetchByPrimaryKey(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the List of Value Binghai Leixing - Case Types.
    *
    * @return the List of Value Binghai Leixing - Case Types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the List of Value Binghai Leixing - Case Types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of List of Value Binghai Leixing - Case Types.
    *
    * @return the number of List of Value Binghai Leixing - Case Types
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
