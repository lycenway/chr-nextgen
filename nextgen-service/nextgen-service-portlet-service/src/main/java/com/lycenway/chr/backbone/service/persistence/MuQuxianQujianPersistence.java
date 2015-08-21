package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lycenway.chr.backbone.model.MuQuxianQujian;

/**
 * The persistence interface for the Mgmt Unit of Quxian Qujian service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuQuxianQujianPersistenceImpl
 * @see MuQuxianQujianUtil
 * @generated
 */
public interface MuQuxianQujianPersistence extends BasePersistence<MuQuxianQujian> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MuQuxianQujianUtil} to access the Mgmt Unit of Quxian Qujian persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the Mgmt Unit of Quxian Qujian in the entity cache if it is enabled.
    *
    * @param muQuxianQujian the Mgmt Unit of Quxian Qujian
    */
    public void cacheResult(
        com.lycenway.chr.backbone.model.MuQuxianQujian muQuxianQujian);

    /**
    * Caches the Mgmt Unit of Quxian Qujians in the entity cache if it is enabled.
    *
    * @param muQuxianQujians the Mgmt Unit of Quxian Qujians
    */
    public void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.MuQuxianQujian> muQuxianQujians);

    /**
    * Creates a new Mgmt Unit of Quxian Qujian with the primary key. Does not add the Mgmt Unit of Quxian Qujian to the database.
    *
    * @param muQuxianQujianId the primary key for the new Mgmt Unit of Quxian Qujian
    * @return the new Mgmt Unit of Quxian Qujian
    */
    public com.lycenway.chr.backbone.model.MuQuxianQujian create(
        long muQuxianQujianId);

    /**
    * Removes the Mgmt Unit of Quxian Qujian with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuQuxianQujianException if a Mgmt Unit of Quxian Qujian with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuQuxianQujian remove(
        long muQuxianQujianId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuQuxianQujianException;

    public com.lycenway.chr.backbone.model.MuQuxianQujian updateImpl(
        com.lycenway.chr.backbone.model.MuQuxianQujian muQuxianQujian)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Mgmt Unit of Quxian Qujian with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuQuxianQujianException} if it could not be found.
    *
    * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian
    * @throws com.lycenway.chr.backbone.NoSuchMuQuxianQujianException if a Mgmt Unit of Quxian Qujian with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuQuxianQujian findByPrimaryKey(
        long muQuxianQujianId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuQuxianQujianException;

    /**
    * Returns the Mgmt Unit of Quxian Qujian with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
    * @return the Mgmt Unit of Quxian Qujian, or <code>null</code> if a Mgmt Unit of Quxian Qujian with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuQuxianQujian fetchByPrimaryKey(
        long muQuxianQujianId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Mgmt Unit of Quxian Qujians.
    *
    * @return the Mgmt Unit of Quxian Qujians
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.MuQuxianQujian> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the Mgmt Unit of Quxian Qujians.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit of Quxian Qujians
    * @param end the upper bound of the range of Mgmt Unit of Quxian Qujians (not inclusive)
    * @return the range of Mgmt Unit of Quxian Qujians
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.MuQuxianQujian> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the Mgmt Unit of Quxian Qujians.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Mgmt Unit of Quxian Qujians
    * @param end the upper bound of the range of Mgmt Unit of Quxian Qujians (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Mgmt Unit of Quxian Qujians
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.MuQuxianQujian> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the Mgmt Unit of Quxian Qujians from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Mgmt Unit of Quxian Qujians.
    *
    * @return the number of Mgmt Unit of Quxian Qujians
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
