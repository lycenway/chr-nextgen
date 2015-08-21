package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lycenway.chr.backbone.model.MuWufengXianlu;

/**
 * The persistence interface for the Mgmt Unit of Wufeng Xianlu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuWufengXianluPersistenceImpl
 * @see MuWufengXianluUtil
 * @generated
 */
public interface MuWufengXianluPersistence extends BasePersistence<MuWufengXianlu> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MuWufengXianluUtil} to access the Mgmt Unit of Wufeng Xianlu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the Mgmt Unit of Wufeng Xianlu in the entity cache if it is enabled.
    *
    * @param muWufengXianlu the Mgmt Unit of Wufeng Xianlu
    */
    public void cacheResult(
        com.lycenway.chr.backbone.model.MuWufengXianlu muWufengXianlu);

    /**
    * Caches the Mgmt Unit of Wufeng Xianlus in the entity cache if it is enabled.
    *
    * @param muWufengXianlus the Mgmt Unit of Wufeng Xianlus
    */
    public void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.MuWufengXianlu> muWufengXianlus);

    /**
    * Creates a new Mgmt Unit of Wufeng Xianlu with the primary key. Does not add the Mgmt Unit of Wufeng Xianlu to the database.
    *
    * @param muWufengXianluId the primary key for the new Mgmt Unit of Wufeng Xianlu
    * @return the new Mgmt Unit of Wufeng Xianlu
    */
    public com.lycenway.chr.backbone.model.MuWufengXianlu create(
        long muWufengXianluId);

    /**
    * Removes the Mgmt Unit of Wufeng Xianlu with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu that was removed
    * @throws com.lycenway.chr.backbone.NoSuchMuWufengXianluException if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuWufengXianlu remove(
        long muWufengXianluId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuWufengXianluException;

    public com.lycenway.chr.backbone.model.MuWufengXianlu updateImpl(
        com.lycenway.chr.backbone.model.MuWufengXianlu muWufengXianlu)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Mgmt Unit of Wufeng Xianlu with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuWufengXianluException} if it could not be found.
    *
    * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu
    * @throws com.lycenway.chr.backbone.NoSuchMuWufengXianluException if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuWufengXianlu findByPrimaryKey(
        long muWufengXianluId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchMuWufengXianluException;

    /**
    * Returns the Mgmt Unit of Wufeng Xianlu with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
    * @return the Mgmt Unit of Wufeng Xianlu, or <code>null</code> if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.MuWufengXianlu fetchByPrimaryKey(
        long muWufengXianluId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Mgmt Unit of Wufeng Xianlus.
    *
    * @return the Mgmt Unit of Wufeng Xianlus
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.MuWufengXianlu> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.MuWufengXianlu> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lycenway.chr.backbone.model.MuWufengXianlu> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the Mgmt Unit of Wufeng Xianlus from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Mgmt Unit of Wufeng Xianlus.
    *
    * @return the number of Mgmt Unit of Wufeng Xianlus
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
