package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lycenway.chr.backbone.model.MuExt;

/**
 * The persistence interface for the Mgmt Unit Extended Attributes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuExtPersistenceImpl
 * @see MuExtUtil
 * @generated
 */
public interface MuExtPersistence extends BasePersistence<MuExt> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MuExtUtil} to access the Mgmt Unit Extended Attributes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the Mgmt Unit Extended Attributes in the entity cache if it is enabled.
    *
    * @param muExt the Mgmt Unit Extended Attributes
    */
    public void cacheResult(com.lycenway.chr.backbone.model.MuExt muExt);

    /**
    * Caches the Mgmt Unit Extended Attributeses in the entity cache if it is enabled.
    *
    * @param muExts the Mgmt Unit Extended Attributeses
    */
    public void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.MuExt> muExts);

    /**
    * Creates a new Mgmt Unit Extended Attributes with the primary key. Does not add the Mgmt Unit Extended Attributes to the database.
    *
    * @param muExtId the primary key for the new Mgmt Unit Extended Attributes
    * @return the new Mgmt Unit Extended Attributes
    */
    public com.lycenway.chr.backbone.model.MuExt create(long muExtId);

    /**
    * Removes the Mgmt Unit Extended Attributes with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muExtId the primary key of the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuExtException if a Mgmt Unit Extended Attributes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuExt remove(long muExtId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuExtException;

    public com.lycenway.chr.backbone.model.MuExt updateImpl(
        com.lycenway.chr.backbone.model.MuExt muExt)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Mgmt Unit Extended Attributes with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuExtException} if it could not be found.
    *
    * @param muExtId the primary key of the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes
    * @throws com.lycenway.chr.backbone.NoSuchMuExtException if a Mgmt Unit Extended Attributes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuExt findByPrimaryKey(long muExtId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuExtException;

    /**
    * Returns the Mgmt Unit Extended Attributes with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muExtId the primary key of the Mgmt Unit Extended Attributes
    * @return the Mgmt Unit Extended Attributes, or <code>null</code> if a Mgmt Unit Extended Attributes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuExt fetchByPrimaryKey(long muExtId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Mgmt Unit Extended Attributeses.
    *
    * @return the Mgmt Unit Extended Attributeses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.MuExt> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.MuExt> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.MuExt> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the Mgmt Unit Extended Attributeses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Mgmt Unit Extended Attributeses.
    *
    * @return the number of Mgmt Unit Extended Attributeses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
