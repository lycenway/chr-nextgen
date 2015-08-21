package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.lycenway.chr.backbone.model.Binghai;

/**
 * The persistence interface for the Binghai Case Weixiu Wenti service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see BinghaiPersistenceImpl
 * @see BinghaiUtil
 * @generated
 */
public interface BinghaiPersistence extends BasePersistence<Binghai> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BinghaiUtil} to access the Binghai Case Weixiu Wenti persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the Binghai Case Weixiu Wentis where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the Binghai Case Weixiu Wentis where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @return the range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the Binghai Case Weixiu Wentis where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Binghai Case Weixiu Wentis before and after the current Binghai Case Weixiu Wenti in the ordered set where groupId = &#63;.
    *
    * @param binghaiId the primary key of the current Binghai Case Weixiu Wenti
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai[] findByGroupId_PrevAndNext(
        long binghaiId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Removes all the Binghai Case Weixiu Wentis where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Binghai Case Weixiu Wentis where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Binghai Case Weixiu Wentis where visitedOn = &#63;.
    *
    * @param visitedOn the visited on
    * @return the matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByVisited(
        java.lang.String visitedOn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the Binghai Case Weixiu Wentis where visitedOn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param visitedOn the visited on
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @return the range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByVisited(
        java.lang.String visitedOn, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the Binghai Case Weixiu Wentis where visitedOn = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param visitedOn the visited on
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByVisited(
        java.lang.String visitedOn, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where visitedOn = &#63;.
    *
    * @param visitedOn the visited on
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByVisited_First(
        java.lang.String visitedOn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where visitedOn = &#63;.
    *
    * @param visitedOn the visited on
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByVisited_First(
        java.lang.String visitedOn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where visitedOn = &#63;.
    *
    * @param visitedOn the visited on
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByVisited_Last(
        java.lang.String visitedOn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where visitedOn = &#63;.
    *
    * @param visitedOn the visited on
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByVisited_Last(
        java.lang.String visitedOn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Binghai Case Weixiu Wentis before and after the current Binghai Case Weixiu Wenti in the ordered set where visitedOn = &#63;.
    *
    * @param binghaiId the primary key of the current Binghai Case Weixiu Wenti
    * @param visitedOn the visited on
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai[] findByVisited_PrevAndNext(
        long binghaiId, java.lang.String visitedOn,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Removes all the Binghai Case Weixiu Wentis where visitedOn = &#63; from the database.
    *
    * @param visitedOn the visited on
    * @throws SystemException if a system exception occurred
    */
    public void removeByVisited(java.lang.String visitedOn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Binghai Case Weixiu Wentis where visitedOn = &#63;.
    *
    * @param visitedOn the visited on
    * @return the number of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public int countByVisited(java.lang.String visitedOn)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Binghai Case Weixiu Wentis where koufen &ge; &#63;.
    *
    * @param koufen the koufen
    * @return the matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByKoufen(
        int koufen) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the Binghai Case Weixiu Wentis where koufen &ge; &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param koufen the koufen
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @return the range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByKoufen(
        int koufen, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the Binghai Case Weixiu Wentis where koufen &ge; &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param koufen the koufen
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByKoufen(
        int koufen, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where koufen &ge; &#63;.
    *
    * @param koufen the koufen
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByKoufen_First(
        int koufen,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where koufen &ge; &#63;.
    *
    * @param koufen the koufen
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByKoufen_First(
        int koufen,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where koufen &ge; &#63;.
    *
    * @param koufen the koufen
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByKoufen_Last(
        int koufen,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where koufen &ge; &#63;.
    *
    * @param koufen the koufen
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByKoufen_Last(
        int koufen,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Binghai Case Weixiu Wentis before and after the current Binghai Case Weixiu Wenti in the ordered set where koufen &ge; &#63;.
    *
    * @param binghaiId the primary key of the current Binghai Case Weixiu Wenti
    * @param koufen the koufen
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai[] findByKoufen_PrevAndNext(
        long binghaiId, int koufen,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Removes all the Binghai Case Weixiu Wentis where koufen &ge; &#63; from the database.
    *
    * @param koufen the koufen
    * @throws SystemException if a system exception occurred
    */
    public void removeByKoufen(int koufen)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Binghai Case Weixiu Wentis where koufen &ge; &#63;.
    *
    * @param koufen the koufen
    * @return the number of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public int countByKoufen(int koufen)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Binghai Case Weixiu Wentis where visitedBy = &#63;.
    *
    * @param visitedBy the visited by
    * @return the matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByVisitedBy(
        java.lang.String visitedBy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the Binghai Case Weixiu Wentis where visitedBy = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param visitedBy the visited by
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @return the range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByVisitedBy(
        java.lang.String visitedBy, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the Binghai Case Weixiu Wentis where visitedBy = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param visitedBy the visited by
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByVisitedBy(
        java.lang.String visitedBy, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where visitedBy = &#63;.
    *
    * @param visitedBy the visited by
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByVisitedBy_First(
        java.lang.String visitedBy,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where visitedBy = &#63;.
    *
    * @param visitedBy the visited by
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByVisitedBy_First(
        java.lang.String visitedBy,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where visitedBy = &#63;.
    *
    * @param visitedBy the visited by
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByVisitedBy_Last(
        java.lang.String visitedBy,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where visitedBy = &#63;.
    *
    * @param visitedBy the visited by
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByVisitedBy_Last(
        java.lang.String visitedBy,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Binghai Case Weixiu Wentis before and after the current Binghai Case Weixiu Wenti in the ordered set where visitedBy = &#63;.
    *
    * @param binghaiId the primary key of the current Binghai Case Weixiu Wenti
    * @param visitedBy the visited by
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai[] findByVisitedBy_PrevAndNext(
        long binghaiId, java.lang.String visitedBy,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Removes all the Binghai Case Weixiu Wentis where visitedBy = &#63; from the database.
    *
    * @param visitedBy the visited by
    * @throws SystemException if a system exception occurred
    */
    public void removeByVisitedBy(java.lang.String visitedBy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Binghai Case Weixiu Wentis where visitedBy = &#63;.
    *
    * @param visitedBy the visited by
    * @return the number of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public int countByVisitedBy(java.lang.String visitedBy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Binghai Case Weixiu Wentis where binghaiLeixing = &#63;.
    *
    * @param binghaiLeixing the binghai leixing
    * @return the matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByLeixing(
        java.lang.String binghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the Binghai Case Weixiu Wentis where binghaiLeixing = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param binghaiLeixing the binghai leixing
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @return the range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByLeixing(
        java.lang.String binghaiLeixing, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the Binghai Case Weixiu Wentis where binghaiLeixing = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param binghaiLeixing the binghai leixing
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByLeixing(
        java.lang.String binghaiLeixing, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where binghaiLeixing = &#63;.
    *
    * @param binghaiLeixing the binghai leixing
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByLeixing_First(
        java.lang.String binghaiLeixing,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where binghaiLeixing = &#63;.
    *
    * @param binghaiLeixing the binghai leixing
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByLeixing_First(
        java.lang.String binghaiLeixing,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where binghaiLeixing = &#63;.
    *
    * @param binghaiLeixing the binghai leixing
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByLeixing_Last(
        java.lang.String binghaiLeixing,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where binghaiLeixing = &#63;.
    *
    * @param binghaiLeixing the binghai leixing
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByLeixing_Last(
        java.lang.String binghaiLeixing,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Binghai Case Weixiu Wentis before and after the current Binghai Case Weixiu Wenti in the ordered set where binghaiLeixing = &#63;.
    *
    * @param binghaiId the primary key of the current Binghai Case Weixiu Wenti
    * @param binghaiLeixing the binghai leixing
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai[] findByLeixing_PrevAndNext(
        long binghaiId, java.lang.String binghaiLeixing,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Removes all the Binghai Case Weixiu Wentis where binghaiLeixing = &#63; from the database.
    *
    * @param binghaiLeixing the binghai leixing
    * @throws SystemException if a system exception occurred
    */
    public void removeByLeixing(java.lang.String binghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Binghai Case Weixiu Wentis where binghaiLeixing = &#63;.
    *
    * @param binghaiLeixing the binghai leixing
    * @return the number of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public int countByLeixing(java.lang.String binghaiLeixing)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Binghai Case Weixiu Wentis where userId = &#63;.
    *
    * @param userId the user ID
    * @return the matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByUserId(
        long userId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the Binghai Case Weixiu Wentis where userId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param userId the user ID
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @return the range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByUserId(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the Binghai Case Weixiu Wentis where userId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param userId the user ID
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findByUserId(
        long userId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByUserId_First(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the first Binghai Case Weixiu Wenti in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByUserId_First(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByUserId_Last(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the last Binghai Case Weixiu Wenti in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByUserId_Last(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Binghai Case Weixiu Wentis before and after the current Binghai Case Weixiu Wenti in the ordered set where userId = &#63;.
    *
    * @param binghaiId the primary key of the current Binghai Case Weixiu Wenti
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai[] findByUserId_PrevAndNext(
        long binghaiId, long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Removes all the Binghai Case Weixiu Wentis where userId = &#63; from the database.
    *
    * @param userId the user ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUserId(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Binghai Case Weixiu Wentis where userId = &#63;.
    *
    * @param userId the user ID
    * @return the number of matching Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public int countByUserId(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the Binghai Case Weixiu Wenti in the entity cache if it is enabled.
    *
    * @param binghai the Binghai Case Weixiu Wenti
    */
    public void cacheResult(com.lycenway.chr.backbone.model.Binghai binghai);

    /**
    * Caches the Binghai Case Weixiu Wentis in the entity cache if it is enabled.
    *
    * @param binghais the Binghai Case Weixiu Wentis
    */
    public void cacheResult(
        java.util.List<com.lycenway.chr.backbone.model.Binghai> binghais);

    /**
    * Creates a new Binghai Case Weixiu Wenti with the primary key. Does not add the Binghai Case Weixiu Wenti to the database.
    *
    * @param binghaiId the primary key for the new Binghai Case Weixiu Wenti
    * @return the new Binghai Case Weixiu Wenti
    */
    public com.lycenway.chr.backbone.model.Binghai create(long binghaiId);

    /**
    * Removes the Binghai Case Weixiu Wenti with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param binghaiId the primary key of the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti that was removed
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai remove(long binghaiId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    public com.lycenway.chr.backbone.model.Binghai updateImpl(
        com.lycenway.chr.backbone.model.Binghai binghai)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Binghai Case Weixiu Wenti with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchBinghaiException} if it could not be found.
    *
    * @param binghaiId the primary key of the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti
    * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai findByPrimaryKey(
        long binghaiId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.lycenway.chr.backbone.NoSuchBinghaiException;

    /**
    * Returns the Binghai Case Weixiu Wenti with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param binghaiId the primary key of the Binghai Case Weixiu Wenti
    * @return the Binghai Case Weixiu Wenti, or <code>null</code> if a Binghai Case Weixiu Wenti with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lycenway.chr.backbone.model.Binghai fetchByPrimaryKey(
        long binghaiId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the Binghai Case Weixiu Wentis.
    *
    * @return the Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the Binghai Case Weixiu Wentis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @return the range of Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the Binghai Case Weixiu Wentis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Binghai Case Weixiu Wentis
    * @param end the upper bound of the range of Binghai Case Weixiu Wentis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lycenway.chr.backbone.model.Binghai> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the Binghai Case Weixiu Wentis from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of Binghai Case Weixiu Wentis.
    *
    * @return the number of Binghai Case Weixiu Wentis
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
