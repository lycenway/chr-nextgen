package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.lycenway.chr.backbone.model.BinghaiProof;

import java.util.List;

/**
 * The persistence utility for the Binghai Attachments Pictures service. This utility wraps {@link BinghaiProofPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see BinghaiProofPersistence
 * @see BinghaiProofPersistenceImpl
 * @generated
 */
public class BinghaiProofUtil {
    private static BinghaiProofPersistence _persistence;

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
    public static void clearCache(BinghaiProof binghaiProof) {
        getPersistence().clearCache(binghaiProof);
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
    public static List<BinghaiProof> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BinghaiProof> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BinghaiProof> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BinghaiProof update(BinghaiProof binghaiProof)
        throws SystemException {
        return getPersistence().update(binghaiProof);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BinghaiProof update(BinghaiProof binghaiProof,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(binghaiProof, serviceContext);
    }

    /**
    * Caches the Binghai Attachments Pictures in the entity cache if it is enabled.
    *
    * @param binghaiProof the Binghai Attachments Pictures
    */
    public static void cacheResult(
        com.lycenway.chr.backbone.model.BinghaiProof binghaiProof) {
        getPersistence().cacheResult(binghaiProof);
    }

    /**
    * Caches the Binghai Attachments Pictureses in the entity cache if it is enabled.
    *
    * @param binghaiProofs the Binghai Attachments Pictureses
    */
    public static void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.BinghaiProof> binghaiProofs) {
        getPersistence().cacheResult(binghaiProofs);
    }

    /**
    * Creates a new Binghai Attachments Pictures with the primary key. Does not add the Binghai Attachments Pictures to the database.
    *
    * @param binghaiProofId the primary key for the new Binghai Attachments Pictures
    * @return the new Binghai Attachments Pictures
    */
    public static com.lycenway.chr.backbone.model.BinghaiProof create(
        long binghaiProofId) {
        return getPersistence().create(binghaiProofId);
    }

    /**
    * Removes the Binghai Attachments Pictures with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiProofId the primary key of the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures that was removed
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiProofException if a Binghai Attachments Pictures with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiProof remove(
        long binghaiProofId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiProofException {
        return getPersistence().remove(binghaiProofId);
    }

    public static com.lycenway.chr.backbone.model.BinghaiProof updateImpl(
        com.lycenway.chr.backbone.model.BinghaiProof binghaiProof)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(binghaiProof);
    }

    /**
    * Returns the Binghai Attachments Pictures with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchBinghaiProofException} if it could not be found.
    *
    * @param binghaiProofId the primary key of the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiProofException if a Binghai Attachments Pictures with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiProof findByPrimaryKey(
        long binghaiProofId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiProofException {
        return getPersistence().findByPrimaryKey(binghaiProofId);
    }

    /**
    * Returns the Binghai Attachments Pictures with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param binghaiProofId the primary key of the Binghai Attachments Pictures
    * @return the Binghai Attachments Pictures, or <code>null</code> if a Binghai Attachments Pictures with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lycenway.chr.backbone.model.BinghaiProof fetchByPrimaryKey(
        long binghaiProofId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(binghaiProofId);
    }

    /**
    * Returns all the Binghai Attachments Pictureses.
    *
    * @return the Binghai Attachments Pictureses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lycenway.chr.backbone.model.BinghaiProof> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.lycenway.chr.backbone.model.BinghaiProof> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.lycenway.chr.backbone.model.BinghaiProof> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the Binghai Attachments Pictureses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of Binghai Attachments Pictureses.
    *
    * @return the number of Binghai Attachments Pictureses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BinghaiProofPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BinghaiProofPersistence) PortletBeanLocatorUtil.locate(com.lycenway.chr.backbone.service.ClpSerializer.getServletContextName(),
                    BinghaiProofPersistence.class.getName());

            ReferenceRegistry.registerReference(BinghaiProofUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BinghaiProofPersistence persistence) {
    }
}
