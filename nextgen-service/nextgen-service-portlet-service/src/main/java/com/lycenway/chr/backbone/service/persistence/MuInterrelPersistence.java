package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lycenway.chr.backbone.model.MuInterrel;

/**
 * The persistence interface for the Mgmt Unit Inter Relationship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuInterrelPersistenceImpl
 * @see MuInterrelUtil
 * @generated
 */
public interface MuInterrelPersistence extends BasePersistence<MuInterrel> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MuInterrelUtil} to access the Mgmt Unit Inter Relationship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the Mgmt Unit Inter Relationship in the entity cache if it is enabled.
    *
    * @param muInterrel the Mgmt Unit Inter Relationship
    */
    public void cacheResult(
        com.lycenway.chr.backbone.model.MuInterrel muInterrel);

    /**
    * Caches the Mgmt Unit Inter Relationships in the entity cache if it is enabled.
    *
    * @param muInterrels the Mgmt Unit Inter Relationships
    */
    public void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.MuInterrel> muInterrels);

    /**
    * Creates a new Mgmt Unit Inter Relationship with the primary key. Does not add the Mgmt Unit Inter Relationship to the database.
    *
    * @param muInterrelId the primary key for the new Mgmt Unit Inter Relationship
    * @return the new Mgmt Unit Inter Relationship
    */
    public com.lycenway.chr.backbone.model.MuInterrel create(long muInterrelId);

    /**
    * Removes the Mgmt Unit Inter Relationship with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuInterrelException if a Mgmt Unit Inter Relationship with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuInterrel remove(long muInterrelId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuInterrelException;

    public com.lycenway.chr.backbone.model.MuInterrel updateImpl(
        com.lycenway.chr.backbone.model.MuInterrel muInterrel)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Mgmt Unit Inter Relationship with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuInterrelException} if it could not be found.
    *
    * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship
    * @throws com.lycenway.chr.backbone.NoSuchMuInterrelException if a Mgmt Unit Inter Relationship with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuInterrel findByPrimaryKey(
        long muInterrelId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuInterrelException;

    /**
    * Returns the Mgmt Unit Inter Relationship with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
    * @return the Mgmt Unit Inter Relationship, or <code>null</code> if a Mgmt Unit Inter Relationship with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuInterrel fetchByPrimaryKey(
        long muInterrelId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Mgmt Unit Inter Relationships.
    *
    * @return the Mgmt Unit Inter Relationships
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.MuInterrel> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.MuInterrel> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.MuInterrel> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the Mgmt Unit Inter Relationships from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Mgmt Unit Inter Relationships.
    *
    * @return the number of Mgmt Unit Inter Relationships
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
