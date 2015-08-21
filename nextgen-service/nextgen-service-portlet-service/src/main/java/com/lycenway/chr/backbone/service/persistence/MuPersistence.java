package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lycenway.chr.backbone.model.Mu;

/**
 * The persistence interface for the Mgmt Unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuPersistenceImpl
 * @see MuUtil
 * @generated
 */
public interface MuPersistence extends BasePersistence<Mu> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MuUtil} to access the Mgmt Unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the Mgmt Unit in the entity cache if it is enabled.
    *
    * @param mu the Mgmt Unit
    */
    public void cacheResult(com.lycenway.chr.backbone.model.Mu mu);

    /**
    * Caches the Mgmt Units in the entity cache if it is enabled.
    *
    * @param mus the Mgmt Units
    */
    public void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.Mu> mus);

    /**
    * Creates a new Mgmt Unit with the primary key. Does not add the Mgmt Unit to the database.
    *
    * @param muPK the primary key for the new Mgmt Unit
    * @return the new Mgmt Unit
    */
    public com.lycenway.chr.backbone.model.Mu create(MuPK muPK);

    /**
    * Removes the Mgmt Unit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muPK the primary key of the Mgmt Unit
    * @return the Mgmt Unit that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuException if a Mgmt Unit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Mu remove(MuPK muPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuException;

    public com.lycenway.chr.backbone.model.Mu updateImpl(
        com.lycenway.chr.backbone.model.Mu mu)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Mgmt Unit with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuException} if it could not be found.
    *
    * @param muPK the primary key of the Mgmt Unit
    * @return the Mgmt Unit
    * @throws com.lycenway.chr.backbone.NoSuchMuException if a Mgmt Unit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Mu findByPrimaryKey(MuPK muPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuException;

    /**
    * Returns the Mgmt Unit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muPK the primary key of the Mgmt Unit
    * @return the Mgmt Unit, or <code>null</code> if a Mgmt Unit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Mu fetchByPrimaryKey(MuPK muPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Mgmt Units.
    *
    * @return the Mgmt Units
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Mu> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.Mu> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.Mu> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the Mgmt Units from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Mgmt Units.
    *
    * @return the number of Mgmt Units
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
