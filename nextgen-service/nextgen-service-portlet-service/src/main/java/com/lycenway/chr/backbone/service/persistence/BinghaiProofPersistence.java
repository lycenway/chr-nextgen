package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lycenway.chr.backbone.model.BinghaiProof;

/**
 * The persistence interface for the Binghai Attachments Pictures service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see BinghaiProofPersistenceImpl
 * @see BinghaiProofUtil
 * @generated
 */
public interface BinghaiProofPersistence extends BasePersistence<BinghaiProof> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BinghaiProofUtil} to access the Binghai Attachments Pictures persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the Binghai Attachments Pictures in the entity cache if it is enabled.
    *
    * @param binghaiProof the Binghai Attachments Pictures
    */
    public void cacheResult(
        com.lycenway.chr.backbone.model.BinghaiProof binghaiProof);

    /**
    * Caches the Binghai Attachments Pictureses in the entity cache if it is enabled.
    *
    * @param binghaiProofs the Binghai Attachments Pictureses
    */
    public void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.BinghaiProof> binghaiProofs);

    /**
    * Creates a new Binghai Attachments Pictures with the primary key. Does not add the Binghai Attachments Pictures to the database.
    *
    * @param binghaiProofId the primary key for the new Binghai Attachments Pictures
    * @return the new Binghai Attachments Pictures
    */
    public com.lycenway.chr.backbone.model.BinghaiProof create(
        long binghaiProofId);

    /**
    * Removes the Binghai Attachments Pictures with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiProofId the primary key of the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures that was removed
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiProofException if a Binghai Attachments Pictures with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.BinghaiProof remove(
        long binghaiProofId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiProofException;

    public com.lycenway.chr.backbone.model.BinghaiProof updateImpl(
        com.lycenway.chr.backbone.model.BinghaiProof binghaiProof)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Binghai Attachments Pictures with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchBinghaiProofException} if it could not be found.
    *
    * @param binghaiProofId the primary key of the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiProofException if a Binghai Attachments Pictures with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.BinghaiProof findByPrimaryKey(
        long binghaiProofId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiProofException;

    /**
    * Returns the Binghai Attachments Pictures with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param binghaiProofId the primary key of the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures, or <code>null</code> if a Binghai Attachments Pictures with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.BinghaiProof fetchByPrimaryKey(
        long binghaiProofId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Binghai Attachments Pictureses.
    *
    * @return the Binghai Attachments Pictureses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiProof> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the Binghai Attachments Pictureses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Binghai Attachments Pictureses
    * @param end the upper bound of the range of Binghai Attachments Pictureses (not inclusive)
    * @return the range of Binghai Attachments Pictureses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiProof> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the Binghai Attachments Pictureses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiProofModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Binghai Attachments Pictureses
    * @param end the upper bound of the range of Binghai Attachments Pictureses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Binghai Attachments Pictureses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.BinghaiProof> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the Binghai Attachments Pictureses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Binghai Attachments Pictureses.
    *
    * @return the number of Binghai Attachments Pictureses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
