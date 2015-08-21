package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lycenway.chr.backbone.model.LOVMuType;

/**
 * The persistence interface for the Lisf of Value Mgmt Unit Type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see LOVMuTypePersistenceImpl
 * @see LOVMuTypeUtil
 * @generated
 */
public interface LOVMuTypePersistence extends BasePersistence<LOVMuType> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LOVMuTypeUtil} to access the Lisf of Value Mgmt Unit Type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the Lisf of Value Mgmt Unit Type in the entity cache if it is enabled.
    *
    * @param lovMuType the Lisf of Value Mgmt Unit Type
    */
    public void cacheResult(com.lycenway.chr.backbone.model.LOVMuType lovMuType);

    /**
    * Caches the Lisf of Value Mgmt Unit Types in the entity cache if it is enabled.
    *
    * @param lovMuTypes the Lisf of Value Mgmt Unit Types
    */
    public void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.LOVMuType> lovMuTypes);

    /**
    * Creates a new Lisf of Value Mgmt Unit Type with the primary key. Does not add the Lisf of Value Mgmt Unit Type to the database.
    *
    * @param code the primary key for the new Lisf of Value Mgmt Unit Type
    * @return the new Lisf of Value Mgmt Unit Type
    */
    public com.lycenway.chr.backbone.model.LOVMuType create(
        java.lang.String code);

    /**
    * Removes the Lisf of Value Mgmt Unit Type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param code the primary key of the Lisf of Value Mgmt Unit Type
    * @return the Lisf of Value Mgmt Unit Type that was removed
    * @throws com.lycenway.chr.backbone.NoSuchLOVMuTypeException if a Lisf of Value Mgmt Unit Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.LOVMuType remove(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchLOVMuTypeException;

    public com.lycenway.chr.backbone.model.LOVMuType updateImpl(
        com.lycenway.chr.backbone.model.LOVMuType lovMuType)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Lisf of Value Mgmt Unit Type with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchLOVMuTypeException} if it could not be found.
    *
    * @param code the primary key of the Lisf of Value Mgmt Unit Type
    * @return the Lisf of Value Mgmt Unit Type
    * @throws com.lycenway.chr.backbone.NoSuchLOVMuTypeException if a Lisf of Value Mgmt Unit Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.LOVMuType findByPrimaryKey(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchLOVMuTypeException;

    /**
    * Returns the Lisf of Value Mgmt Unit Type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param code the primary key of the Lisf of Value Mgmt Unit Type
    * @return the Lisf of Value Mgmt Unit Type, or <code>null</code> if a Lisf of Value Mgmt Unit Type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.LOVMuType fetchByPrimaryKey(
        java.lang.String code)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Lisf of Value Mgmt Unit Types.
    *
    * @return the Lisf of Value Mgmt Unit Types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.LOVMuType> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the Lisf of Value Mgmt Unit Types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVMuTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Lisf of Value Mgmt Unit Types
    * @param end the upper bound of the range of Lisf of Value Mgmt Unit Types (not inclusive)
    * @return the range of Lisf of Value Mgmt Unit Types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.LOVMuType> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the Lisf of Value Mgmt Unit Types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVMuTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Lisf of Value Mgmt Unit Types
    * @param end the upper bound of the range of Lisf of Value Mgmt Unit Types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Lisf of Value Mgmt Unit Types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.LOVMuType> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the Lisf of Value Mgmt Unit Types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Lisf of Value Mgmt Unit Types.
    *
    * @return the number of Lisf of Value Mgmt Unit Types
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
