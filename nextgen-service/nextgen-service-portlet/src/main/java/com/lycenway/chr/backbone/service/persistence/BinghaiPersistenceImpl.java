package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.lycenway.chr.backbone.NoSuchBinghaiException;
import com.lycenway.chr.backbone.model.Binghai;
import com.lycenway.chr.backbone.model.impl.BinghaiImpl;
import com.lycenway.chr.backbone.model.impl.BinghaiModelImpl;
import com.lycenway.chr.backbone.service.persistence.BinghaiPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the Binghai Case Weixiu Wenti service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see BinghaiPersistence
 * @see BinghaiUtil
 * @generated
 */
public class BinghaiPersistenceImpl extends BasePersistenceImpl<Binghai>
    implements BinghaiPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BinghaiUtil} to access the Binghai Case Weixiu Wenti persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BinghaiImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            BinghaiModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "binghai.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VISITED = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVisited",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VISITED =
        new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVisited",
            new String[] { String.class.getName() },
            BinghaiModelImpl.VISITEDON_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_VISITED = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVisited",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_VISITED_VISITEDON_1 = "binghai.visitedOn IS NULL";
    private static final String _FINDER_COLUMN_VISITED_VISITEDON_2 = "binghai.visitedOn = ?";
    private static final String _FINDER_COLUMN_VISITED_VISITEDON_3 = "(binghai.visitedOn IS NULL OR binghai.visitedOn = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_KOUFEN = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByKoufen",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_KOUFEN = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByKoufen",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_KOUFEN_KOUFEN_2 = "binghai.koufen >= ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VISITEDBY =
        new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByVisitedBy",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VISITEDBY =
        new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVisitedBy",
            new String[] { String.class.getName() },
            BinghaiModelImpl.VISITEDBY_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_VISITEDBY = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVisitedBy",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_VISITEDBY_VISITEDBY_1 = "binghai.visitedBy IS NULL";
    private static final String _FINDER_COLUMN_VISITEDBY_VISITEDBY_2 = "lower(binghai.visitedBy) = ?";
    private static final String _FINDER_COLUMN_VISITEDBY_VISITEDBY_3 = "(binghai.visitedBy IS NULL OR binghai.visitedBy = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LEIXING = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLeixing",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEIXING =
        new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLeixing",
            new String[] { String.class.getName() },
            BinghaiModelImpl.BINGHAILEIXING_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_LEIXING = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLeixing",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_LEIXING_BINGHAILEIXING_1 = "binghai.binghaiLeixing IS NULL";
    private static final String _FINDER_COLUMN_LEIXING_BINGHAILEIXING_2 = "binghai.binghaiLeixing = ?";
    private static final String _FINDER_COLUMN_LEIXING_BINGHAILEIXING_3 = "(binghai.binghaiLeixing IS NULL OR binghai.binghaiLeixing = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
        new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, BinghaiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
            new String[] { Long.class.getName() },
            BinghaiModelImpl.USERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_USERID_USERID_2 = "binghai.userId = ?";
    private static final String _SQL_SELECT_BINGHAI = "SELECT binghai FROM Binghai binghai";
    private static final String _SQL_SELECT_BINGHAI_WHERE = "SELECT binghai FROM Binghai binghai WHERE ";
    private static final String _SQL_COUNT_BINGHAI = "SELECT COUNT(binghai) FROM Binghai binghai";
    private static final String _SQL_COUNT_BINGHAI_WHERE = "SELECT COUNT(binghai) FROM Binghai binghai WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "binghai.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Binghai exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Binghai exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BinghaiPersistenceImpl.class);
    private static Binghai _nullBinghai = new BinghaiImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Binghai> toCacheModel() {
                return _nullBinghaiCacheModel;
            }
        };

    private static CacheModel<Binghai> _nullBinghaiCacheModel = new CacheModel<Binghai>() {
            @Override
            public Binghai toEntityModel() {
                return _nullBinghai;
            }
        };

    public BinghaiPersistenceImpl() {
        setModelClass(Binghai.class);
    }

    /**
     * Returns all the Binghai Case Weixiu Wentis where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Binghai> findByGroupId(long groupId) throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Binghai> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

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
    @Override
    public List<Binghai> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<Binghai> list = (List<Binghai>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Binghai binghai : list) {
                if ((groupId != binghai.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_BINGHAI_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BinghaiModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Binghai>(list);
                } else {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByGroupId_First(groupId, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Binghai> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByGroupId_Last(groupId, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<Binghai> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Binghai[] findByGroupId_PrevAndNext(long binghaiId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = findByPrimaryKey(binghaiId);

        Session session = null;

        try {
            session = openSession();

            Binghai[] array = new BinghaiImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, binghai, groupId,
                    orderByComparator, true);

            array[1] = binghai;

            array[2] = getByGroupId_PrevAndNext(session, binghai, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Binghai getByGroupId_PrevAndNext(Session session,
        Binghai binghai, long groupId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BINGHAI_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BinghaiModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(binghai);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Binghai> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the Binghai Case Weixiu Wentis where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (Binghai binghai : findByGroupId(groupId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(binghai);
        }
    }

    /**
     * Returns the number of Binghai Case Weixiu Wentis where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BINGHAI_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the Binghai Case Weixiu Wentis where visitedOn = &#63;.
     *
     * @param visitedOn the visited on
     * @return the matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Binghai> findByVisited(String visitedOn)
        throws SystemException {
        return findByVisited(visitedOn, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

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
    @Override
    public List<Binghai> findByVisited(String visitedOn, int start, int end)
        throws SystemException {
        return findByVisited(visitedOn, start, end, null);
    }

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
    @Override
    public List<Binghai> findByVisited(String visitedOn, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VISITED;
            finderArgs = new Object[] { visitedOn };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VISITED;
            finderArgs = new Object[] { visitedOn, start, end, orderByComparator };
        }

        List<Binghai> list = (List<Binghai>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Binghai binghai : list) {
                if (!Validator.equals(visitedOn, binghai.getVisitedOn())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_BINGHAI_WHERE);

            boolean bindVisitedOn = false;

            if (visitedOn == null) {
                query.append(_FINDER_COLUMN_VISITED_VISITEDON_1);
            } else if (visitedOn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_VISITED_VISITEDON_3);
            } else {
                bindVisitedOn = true;

                query.append(_FINDER_COLUMN_VISITED_VISITEDON_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BinghaiModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindVisitedOn) {
                    qPos.add(visitedOn);
                }

                if (!pagination) {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Binghai>(list);
                } else {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where visitedOn = &#63;.
     *
     * @param visitedOn the visited on
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByVisited_First(String visitedOn,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByVisited_First(visitedOn, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("visitedOn=");
        msg.append(visitedOn);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where visitedOn = &#63;.
     *
     * @param visitedOn the visited on
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByVisited_First(String visitedOn,
        OrderByComparator orderByComparator) throws SystemException {
        List<Binghai> list = findByVisited(visitedOn, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where visitedOn = &#63;.
     *
     * @param visitedOn the visited on
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByVisited_Last(String visitedOn,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByVisited_Last(visitedOn, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("visitedOn=");
        msg.append(visitedOn);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where visitedOn = &#63;.
     *
     * @param visitedOn the visited on
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByVisited_Last(String visitedOn,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByVisited(visitedOn);

        if (count == 0) {
            return null;
        }

        List<Binghai> list = findByVisited(visitedOn, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Binghai[] findByVisited_PrevAndNext(long binghaiId,
        String visitedOn, OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = findByPrimaryKey(binghaiId);

        Session session = null;

        try {
            session = openSession();

            Binghai[] array = new BinghaiImpl[3];

            array[0] = getByVisited_PrevAndNext(session, binghai, visitedOn,
                    orderByComparator, true);

            array[1] = binghai;

            array[2] = getByVisited_PrevAndNext(session, binghai, visitedOn,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Binghai getByVisited_PrevAndNext(Session session,
        Binghai binghai, String visitedOn, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BINGHAI_WHERE);

        boolean bindVisitedOn = false;

        if (visitedOn == null) {
            query.append(_FINDER_COLUMN_VISITED_VISITEDON_1);
        } else if (visitedOn.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_VISITED_VISITEDON_3);
        } else {
            bindVisitedOn = true;

            query.append(_FINDER_COLUMN_VISITED_VISITEDON_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BinghaiModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindVisitedOn) {
            qPos.add(visitedOn);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(binghai);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Binghai> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the Binghai Case Weixiu Wentis where visitedOn = &#63; from the database.
     *
     * @param visitedOn the visited on
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByVisited(String visitedOn) throws SystemException {
        for (Binghai binghai : findByVisited(visitedOn, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(binghai);
        }
    }

    /**
     * Returns the number of Binghai Case Weixiu Wentis where visitedOn = &#63;.
     *
     * @param visitedOn the visited on
     * @return the number of matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByVisited(String visitedOn) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_VISITED;

        Object[] finderArgs = new Object[] { visitedOn };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BINGHAI_WHERE);

            boolean bindVisitedOn = false;

            if (visitedOn == null) {
                query.append(_FINDER_COLUMN_VISITED_VISITEDON_1);
            } else if (visitedOn.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_VISITED_VISITEDON_3);
            } else {
                bindVisitedOn = true;

                query.append(_FINDER_COLUMN_VISITED_VISITEDON_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindVisitedOn) {
                    qPos.add(visitedOn);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the Binghai Case Weixiu Wentis where koufen &ge; &#63;.
     *
     * @param koufen the koufen
     * @return the matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Binghai> findByKoufen(int koufen) throws SystemException {
        return findByKoufen(koufen, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Binghai> findByKoufen(int koufen, int start, int end)
        throws SystemException {
        return findByKoufen(koufen, start, end, null);
    }

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
    @Override
    public List<Binghai> findByKoufen(int koufen, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_KOUFEN;
        finderArgs = new Object[] { koufen, start, end, orderByComparator };

        List<Binghai> list = (List<Binghai>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Binghai binghai : list) {
                if ((koufen > binghai.getKoufen())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_BINGHAI_WHERE);

            query.append(_FINDER_COLUMN_KOUFEN_KOUFEN_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BinghaiModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(koufen);

                if (!pagination) {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Binghai>(list);
                } else {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where koufen &ge; &#63;.
     *
     * @param koufen the koufen
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByKoufen_First(int koufen,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByKoufen_First(koufen, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("koufen=");
        msg.append(koufen);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where koufen &ge; &#63;.
     *
     * @param koufen the koufen
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByKoufen_First(int koufen,
        OrderByComparator orderByComparator) throws SystemException {
        List<Binghai> list = findByKoufen(koufen, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where koufen &ge; &#63;.
     *
     * @param koufen the koufen
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByKoufen_Last(int koufen,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByKoufen_Last(koufen, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("koufen=");
        msg.append(koufen);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where koufen &ge; &#63;.
     *
     * @param koufen the koufen
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByKoufen_Last(int koufen,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByKoufen(koufen);

        if (count == 0) {
            return null;
        }

        List<Binghai> list = findByKoufen(koufen, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Binghai[] findByKoufen_PrevAndNext(long binghaiId, int koufen,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = findByPrimaryKey(binghaiId);

        Session session = null;

        try {
            session = openSession();

            Binghai[] array = new BinghaiImpl[3];

            array[0] = getByKoufen_PrevAndNext(session, binghai, koufen,
                    orderByComparator, true);

            array[1] = binghai;

            array[2] = getByKoufen_PrevAndNext(session, binghai, koufen,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Binghai getByKoufen_PrevAndNext(Session session, Binghai binghai,
        int koufen, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BINGHAI_WHERE);

        query.append(_FINDER_COLUMN_KOUFEN_KOUFEN_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BinghaiModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(koufen);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(binghai);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Binghai> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the Binghai Case Weixiu Wentis where koufen &ge; &#63; from the database.
     *
     * @param koufen the koufen
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByKoufen(int koufen) throws SystemException {
        for (Binghai binghai : findByKoufen(koufen, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(binghai);
        }
    }

    /**
     * Returns the number of Binghai Case Weixiu Wentis where koufen &ge; &#63;.
     *
     * @param koufen the koufen
     * @return the number of matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByKoufen(int koufen) throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_KOUFEN;

        Object[] finderArgs = new Object[] { koufen };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BINGHAI_WHERE);

            query.append(_FINDER_COLUMN_KOUFEN_KOUFEN_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(koufen);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the Binghai Case Weixiu Wentis where visitedBy = &#63;.
     *
     * @param visitedBy the visited by
     * @return the matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Binghai> findByVisitedBy(String visitedBy)
        throws SystemException {
        return findByVisitedBy(visitedBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

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
    @Override
    public List<Binghai> findByVisitedBy(String visitedBy, int start, int end)
        throws SystemException {
        return findByVisitedBy(visitedBy, start, end, null);
    }

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
    @Override
    public List<Binghai> findByVisitedBy(String visitedBy, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VISITEDBY;
            finderArgs = new Object[] { visitedBy };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VISITEDBY;
            finderArgs = new Object[] { visitedBy, start, end, orderByComparator };
        }

        List<Binghai> list = (List<Binghai>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Binghai binghai : list) {
                if (!Validator.equals(visitedBy, binghai.getVisitedBy())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_BINGHAI_WHERE);

            boolean bindVisitedBy = false;

            if (visitedBy == null) {
                query.append(_FINDER_COLUMN_VISITEDBY_VISITEDBY_1);
            } else if (visitedBy.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_VISITEDBY_VISITEDBY_3);
            } else {
                bindVisitedBy = true;

                query.append(_FINDER_COLUMN_VISITEDBY_VISITEDBY_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BinghaiModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindVisitedBy) {
                    qPos.add(visitedBy.toLowerCase());
                }

                if (!pagination) {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Binghai>(list);
                } else {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where visitedBy = &#63;.
     *
     * @param visitedBy the visited by
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByVisitedBy_First(String visitedBy,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByVisitedBy_First(visitedBy, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("visitedBy=");
        msg.append(visitedBy);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where visitedBy = &#63;.
     *
     * @param visitedBy the visited by
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByVisitedBy_First(String visitedBy,
        OrderByComparator orderByComparator) throws SystemException {
        List<Binghai> list = findByVisitedBy(visitedBy, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where visitedBy = &#63;.
     *
     * @param visitedBy the visited by
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByVisitedBy_Last(String visitedBy,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByVisitedBy_Last(visitedBy, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("visitedBy=");
        msg.append(visitedBy);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where visitedBy = &#63;.
     *
     * @param visitedBy the visited by
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByVisitedBy_Last(String visitedBy,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByVisitedBy(visitedBy);

        if (count == 0) {
            return null;
        }

        List<Binghai> list = findByVisitedBy(visitedBy, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Binghai[] findByVisitedBy_PrevAndNext(long binghaiId,
        String visitedBy, OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = findByPrimaryKey(binghaiId);

        Session session = null;

        try {
            session = openSession();

            Binghai[] array = new BinghaiImpl[3];

            array[0] = getByVisitedBy_PrevAndNext(session, binghai, visitedBy,
                    orderByComparator, true);

            array[1] = binghai;

            array[2] = getByVisitedBy_PrevAndNext(session, binghai, visitedBy,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Binghai getByVisitedBy_PrevAndNext(Session session,
        Binghai binghai, String visitedBy, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BINGHAI_WHERE);

        boolean bindVisitedBy = false;

        if (visitedBy == null) {
            query.append(_FINDER_COLUMN_VISITEDBY_VISITEDBY_1);
        } else if (visitedBy.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_VISITEDBY_VISITEDBY_3);
        } else {
            bindVisitedBy = true;

            query.append(_FINDER_COLUMN_VISITEDBY_VISITEDBY_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BinghaiModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindVisitedBy) {
            qPos.add(visitedBy.toLowerCase());
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(binghai);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Binghai> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the Binghai Case Weixiu Wentis where visitedBy = &#63; from the database.
     *
     * @param visitedBy the visited by
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByVisitedBy(String visitedBy) throws SystemException {
        for (Binghai binghai : findByVisitedBy(visitedBy, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(binghai);
        }
    }

    /**
     * Returns the number of Binghai Case Weixiu Wentis where visitedBy = &#63;.
     *
     * @param visitedBy the visited by
     * @return the number of matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByVisitedBy(String visitedBy) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_VISITEDBY;

        Object[] finderArgs = new Object[] { visitedBy };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BINGHAI_WHERE);

            boolean bindVisitedBy = false;

            if (visitedBy == null) {
                query.append(_FINDER_COLUMN_VISITEDBY_VISITEDBY_1);
            } else if (visitedBy.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_VISITEDBY_VISITEDBY_3);
            } else {
                bindVisitedBy = true;

                query.append(_FINDER_COLUMN_VISITEDBY_VISITEDBY_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindVisitedBy) {
                    qPos.add(visitedBy.toLowerCase());
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the Binghai Case Weixiu Wentis where binghaiLeixing = &#63;.
     *
     * @param binghaiLeixing the binghai leixing
     * @return the matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Binghai> findByLeixing(String binghaiLeixing)
        throws SystemException {
        return findByLeixing(binghaiLeixing, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Binghai> findByLeixing(String binghaiLeixing, int start, int end)
        throws SystemException {
        return findByLeixing(binghaiLeixing, start, end, null);
    }

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
    @Override
    public List<Binghai> findByLeixing(String binghaiLeixing, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEIXING;
            finderArgs = new Object[] { binghaiLeixing };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LEIXING;
            finderArgs = new Object[] {
                    binghaiLeixing,
                    
                    start, end, orderByComparator
                };
        }

        List<Binghai> list = (List<Binghai>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Binghai binghai : list) {
                if (!Validator.equals(binghaiLeixing,
                            binghai.getBinghaiLeixing())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_BINGHAI_WHERE);

            boolean bindBinghaiLeixing = false;

            if (binghaiLeixing == null) {
                query.append(_FINDER_COLUMN_LEIXING_BINGHAILEIXING_1);
            } else if (binghaiLeixing.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_LEIXING_BINGHAILEIXING_3);
            } else {
                bindBinghaiLeixing = true;

                query.append(_FINDER_COLUMN_LEIXING_BINGHAILEIXING_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BinghaiModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindBinghaiLeixing) {
                    qPos.add(binghaiLeixing);
                }

                if (!pagination) {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Binghai>(list);
                } else {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where binghaiLeixing = &#63;.
     *
     * @param binghaiLeixing the binghai leixing
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByLeixing_First(String binghaiLeixing,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByLeixing_First(binghaiLeixing, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("binghaiLeixing=");
        msg.append(binghaiLeixing);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where binghaiLeixing = &#63;.
     *
     * @param binghaiLeixing the binghai leixing
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByLeixing_First(String binghaiLeixing,
        OrderByComparator orderByComparator) throws SystemException {
        List<Binghai> list = findByLeixing(binghaiLeixing, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where binghaiLeixing = &#63;.
     *
     * @param binghaiLeixing the binghai leixing
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByLeixing_Last(String binghaiLeixing,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByLeixing_Last(binghaiLeixing, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("binghaiLeixing=");
        msg.append(binghaiLeixing);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where binghaiLeixing = &#63;.
     *
     * @param binghaiLeixing the binghai leixing
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByLeixing_Last(String binghaiLeixing,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByLeixing(binghaiLeixing);

        if (count == 0) {
            return null;
        }

        List<Binghai> list = findByLeixing(binghaiLeixing, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Binghai[] findByLeixing_PrevAndNext(long binghaiId,
        String binghaiLeixing, OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = findByPrimaryKey(binghaiId);

        Session session = null;

        try {
            session = openSession();

            Binghai[] array = new BinghaiImpl[3];

            array[0] = getByLeixing_PrevAndNext(session, binghai,
                    binghaiLeixing, orderByComparator, true);

            array[1] = binghai;

            array[2] = getByLeixing_PrevAndNext(session, binghai,
                    binghaiLeixing, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Binghai getByLeixing_PrevAndNext(Session session,
        Binghai binghai, String binghaiLeixing,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BINGHAI_WHERE);

        boolean bindBinghaiLeixing = false;

        if (binghaiLeixing == null) {
            query.append(_FINDER_COLUMN_LEIXING_BINGHAILEIXING_1);
        } else if (binghaiLeixing.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_LEIXING_BINGHAILEIXING_3);
        } else {
            bindBinghaiLeixing = true;

            query.append(_FINDER_COLUMN_LEIXING_BINGHAILEIXING_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BinghaiModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindBinghaiLeixing) {
            qPos.add(binghaiLeixing);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(binghai);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Binghai> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the Binghai Case Weixiu Wentis where binghaiLeixing = &#63; from the database.
     *
     * @param binghaiLeixing the binghai leixing
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByLeixing(String binghaiLeixing)
        throws SystemException {
        for (Binghai binghai : findByLeixing(binghaiLeixing, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(binghai);
        }
    }

    /**
     * Returns the number of Binghai Case Weixiu Wentis where binghaiLeixing = &#63;.
     *
     * @param binghaiLeixing the binghai leixing
     * @return the number of matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByLeixing(String binghaiLeixing) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_LEIXING;

        Object[] finderArgs = new Object[] { binghaiLeixing };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BINGHAI_WHERE);

            boolean bindBinghaiLeixing = false;

            if (binghaiLeixing == null) {
                query.append(_FINDER_COLUMN_LEIXING_BINGHAILEIXING_1);
            } else if (binghaiLeixing.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_LEIXING_BINGHAILEIXING_3);
            } else {
                bindBinghaiLeixing = true;

                query.append(_FINDER_COLUMN_LEIXING_BINGHAILEIXING_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindBinghaiLeixing) {
                    qPos.add(binghaiLeixing);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the Binghai Case Weixiu Wentis where userId = &#63;.
     *
     * @param userId the user ID
     * @return the matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Binghai> findByUserId(long userId) throws SystemException {
        return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Binghai> findByUserId(long userId, int start, int end)
        throws SystemException {
        return findByUserId(userId, start, end, null);
    }

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
    @Override
    public List<Binghai> findByUserId(long userId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { userId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { userId, start, end, orderByComparator };
        }

        List<Binghai> list = (List<Binghai>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Binghai binghai : list) {
                if ((userId != binghai.getUserId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_BINGHAI_WHERE);

            query.append(_FINDER_COLUMN_USERID_USERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BinghaiModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                if (!pagination) {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Binghai>(list);
                } else {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByUserId_First(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByUserId_First(userId, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the first Binghai Case Weixiu Wenti in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByUserId_First(long userId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Binghai> list = findByUserId(userId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByUserId_Last(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByUserId_Last(userId, orderByComparator);

        if (binghai != null) {
            return binghai;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiException(msg.toString());
    }

    /**
     * Returns the last Binghai Case Weixiu Wenti in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Binghai Case Weixiu Wenti, or <code>null</code> if a matching Binghai Case Weixiu Wenti could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByUserId_Last(long userId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUserId(userId);

        if (count == 0) {
            return null;
        }

        List<Binghai> list = findByUserId(userId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public Binghai[] findByUserId_PrevAndNext(long binghaiId, long userId,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = findByPrimaryKey(binghaiId);

        Session session = null;

        try {
            session = openSession();

            Binghai[] array = new BinghaiImpl[3];

            array[0] = getByUserId_PrevAndNext(session, binghai, userId,
                    orderByComparator, true);

            array[1] = binghai;

            array[2] = getByUserId_PrevAndNext(session, binghai, userId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Binghai getByUserId_PrevAndNext(Session session, Binghai binghai,
        long userId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BINGHAI_WHERE);

        query.append(_FINDER_COLUMN_USERID_USERID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(BinghaiModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(binghai);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Binghai> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the Binghai Case Weixiu Wentis where userId = &#63; from the database.
     *
     * @param userId the user ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUserId(long userId) throws SystemException {
        for (Binghai binghai : findByUserId(userId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(binghai);
        }
    }

    /**
     * Returns the number of Binghai Case Weixiu Wentis where userId = &#63;.
     *
     * @param userId the user ID
     * @return the number of matching Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUserId(long userId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

        Object[] finderArgs = new Object[] { userId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_BINGHAI_WHERE);

            query.append(_FINDER_COLUMN_USERID_USERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the Binghai Case Weixiu Wenti in the entity cache if it is enabled.
     *
     * @param binghai the Binghai Case Weixiu Wenti
     */
    @Override
    public void cacheResult(Binghai binghai) {
        EntityCacheUtil.putResult(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiImpl.class, binghai.getPrimaryKey(), binghai);

        binghai.resetOriginalValues();
    }

    /**
     * Caches the Binghai Case Weixiu Wentis in the entity cache if it is enabled.
     *
     * @param binghais the Binghai Case Weixiu Wentis
     */
    @Override
    public void cacheResult(List<Binghai> binghais) {
        for (Binghai binghai : binghais) {
            if (EntityCacheUtil.getResult(
                        BinghaiModelImpl.ENTITY_CACHE_ENABLED,
                        BinghaiImpl.class, binghai.getPrimaryKey()) == null) {
                cacheResult(binghai);
            } else {
                binghai.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all Binghai Case Weixiu Wentis.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BinghaiImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BinghaiImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the Binghai Case Weixiu Wenti.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Binghai binghai) {
        EntityCacheUtil.removeResult(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiImpl.class, binghai.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Binghai> binghais) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Binghai binghai : binghais) {
            EntityCacheUtil.removeResult(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
                BinghaiImpl.class, binghai.getPrimaryKey());
        }
    }

    /**
     * Creates a new Binghai Case Weixiu Wenti with the primary key. Does not add the Binghai Case Weixiu Wenti to the database.
     *
     * @param binghaiId the primary key for the new Binghai Case Weixiu Wenti
     * @return the new Binghai Case Weixiu Wenti
     */
    @Override
    public Binghai create(long binghaiId) {
        Binghai binghai = new BinghaiImpl();

        binghai.setNew(true);
        binghai.setPrimaryKey(binghaiId);

        return binghai;
    }

    /**
     * Removes the Binghai Case Weixiu Wenti with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param binghaiId the primary key of the Binghai Case Weixiu Wenti
     * @return the Binghai Case Weixiu Wenti that was removed
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai remove(long binghaiId)
        throws NoSuchBinghaiException, SystemException {
        return remove((Serializable) binghaiId);
    }

    /**
     * Removes the Binghai Case Weixiu Wenti with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the Binghai Case Weixiu Wenti
     * @return the Binghai Case Weixiu Wenti that was removed
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai remove(Serializable primaryKey)
        throws NoSuchBinghaiException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Binghai binghai = (Binghai) session.get(BinghaiImpl.class,
                    primaryKey);

            if (binghai == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBinghaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(binghai);
        } catch (NoSuchBinghaiException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Binghai removeImpl(Binghai binghai) throws SystemException {
        binghai = toUnwrappedModel(binghai);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(binghai)) {
                binghai = (Binghai) session.get(BinghaiImpl.class,
                        binghai.getPrimaryKeyObj());
            }

            if (binghai != null) {
                session.delete(binghai);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (binghai != null) {
            clearCache(binghai);
        }

        return binghai;
    }

    @Override
    public Binghai updateImpl(com.lycenway.chr.backbone.model.Binghai binghai)
        throws SystemException {
        binghai = toUnwrappedModel(binghai);

        boolean isNew = binghai.isNew();

        BinghaiModelImpl binghaiModelImpl = (BinghaiModelImpl) binghai;

        Session session = null;

        try {
            session = openSession();

            if (binghai.isNew()) {
                session.save(binghai);

                binghai.setNew(false);
            } else {
                session.merge(binghai);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BinghaiModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((binghaiModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        binghaiModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { binghaiModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((binghaiModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VISITED.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        binghaiModelImpl.getOriginalVisitedOn()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VISITED, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VISITED,
                    args);

                args = new Object[] { binghaiModelImpl.getVisitedOn() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VISITED, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VISITED,
                    args);
            }

            if ((binghaiModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VISITEDBY.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        binghaiModelImpl.getOriginalVisitedBy()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VISITEDBY,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VISITEDBY,
                    args);

                args = new Object[] { binghaiModelImpl.getVisitedBy() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VISITEDBY,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VISITEDBY,
                    args);
            }

            if ((binghaiModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEIXING.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        binghaiModelImpl.getOriginalBinghaiLeixing()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LEIXING, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEIXING,
                    args);

                args = new Object[] { binghaiModelImpl.getBinghaiLeixing() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LEIXING, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LEIXING,
                    args);
            }

            if ((binghaiModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        binghaiModelImpl.getOriginalUserId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);

                args = new Object[] { binghaiModelImpl.getUserId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);
            }
        }

        EntityCacheUtil.putResult(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiImpl.class, binghai.getPrimaryKey(), binghai);

        return binghai;
    }

    protected Binghai toUnwrappedModel(Binghai binghai) {
        if (binghai instanceof BinghaiImpl) {
            return binghai;
        }

        BinghaiImpl binghaiImpl = new BinghaiImpl();

        binghaiImpl.setNew(binghai.isNew());
        binghaiImpl.setPrimaryKey(binghai.getPrimaryKey());

        binghaiImpl.setHkey(binghai.getHkey());
        binghaiImpl.setMuTitle(binghai.getMuTitle());
        binghaiImpl.setBuwei(binghai.getBuwei());
        binghaiImpl.setTab(binghai.getTab());
        binghaiImpl.setCName(binghai.getCName());
        binghaiImpl.setCId(binghai.getCId());
        binghaiImpl.setC1Name(binghai.getC1Name());
        binghaiImpl.setC1Id(binghai.getC1Id());
        binghaiImpl.setC2Name(binghai.getC2Name());
        binghaiImpl.setC2Id(binghai.getC2Id());
        binghaiImpl.setBinghaiLeixing(binghai.getBinghaiLeixing());
        binghaiImpl.setStageName(binghai.getStageName());
        binghaiImpl.setStageId(binghai.getStageId());
        binghaiImpl.setKoufen(binghai.getKoufen());
        binghaiImpl.setVisitContent(binghai.getVisitContent());
        binghaiImpl.setVisitedBy(binghai.getVisitedBy());
        binghaiImpl.setVisitedOn(binghai.getVisitedOn());
        binghaiImpl.setRevisitedBy(binghai.getRevisitedBy());
        binghaiImpl.setRevisitedOn(binghai.getRevisitedOn());
        binghaiImpl.setBinghaiShuzhi(binghai.getBinghaiShuzhi());
        binghaiImpl.setGongzuoliangAction(binghai.getGongzuoliangAction());
        binghaiImpl.setGongzuoliangName(binghai.getGongzuoliangName());
        binghaiImpl.setGongzuoliangUnit(binghai.getGongzuoliangUnit());
        binghaiImpl.setGongzuoliangTval(binghai.getGongzuoliangTval());
        binghaiImpl.setBinghaiId(binghai.getBinghaiId());
        binghaiImpl.setGroupId(binghai.getGroupId());
        binghaiImpl.setCompanyId(binghai.getCompanyId());
        binghaiImpl.setUserId(binghai.getUserId());
        binghaiImpl.setUserName(binghai.getUserName());
        binghaiImpl.setCreateDate(binghai.getCreateDate());
        binghaiImpl.setModifiedDate(binghai.getModifiedDate());
        binghaiImpl.setProofCount(binghai.getProofCount());
        binghaiImpl.setReferenceRadio(binghai.getReferenceRadio());
        binghaiImpl.setDaochaJson(binghai.getDaochaJson());

        return binghaiImpl;
    }

    /**
     * Returns the Binghai Case Weixiu Wenti with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the Binghai Case Weixiu Wenti
     * @return the Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBinghaiException, SystemException {
        Binghai binghai = fetchByPrimaryKey(primaryKey);

        if (binghai == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBinghaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return binghai;
    }

    /**
     * Returns the Binghai Case Weixiu Wenti with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchBinghaiException} if it could not be found.
     *
     * @param binghaiId the primary key of the Binghai Case Weixiu Wenti
     * @return the Binghai Case Weixiu Wenti
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiException if a Binghai Case Weixiu Wenti with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai findByPrimaryKey(long binghaiId)
        throws NoSuchBinghaiException, SystemException {
        return findByPrimaryKey((Serializable) binghaiId);
    }

    /**
     * Returns the Binghai Case Weixiu Wenti with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the Binghai Case Weixiu Wenti
     * @return the Binghai Case Weixiu Wenti, or <code>null</code> if a Binghai Case Weixiu Wenti with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Binghai binghai = (Binghai) EntityCacheUtil.getResult(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
                BinghaiImpl.class, primaryKey);

        if (binghai == _nullBinghai) {
            return null;
        }

        if (binghai == null) {
            Session session = null;

            try {
                session = openSession();

                binghai = (Binghai) session.get(BinghaiImpl.class, primaryKey);

                if (binghai != null) {
                    cacheResult(binghai);
                } else {
                    EntityCacheUtil.putResult(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
                        BinghaiImpl.class, primaryKey, _nullBinghai);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BinghaiModelImpl.ENTITY_CACHE_ENABLED,
                    BinghaiImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return binghai;
    }

    /**
     * Returns the Binghai Case Weixiu Wenti with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param binghaiId the primary key of the Binghai Case Weixiu Wenti
     * @return the Binghai Case Weixiu Wenti, or <code>null</code> if a Binghai Case Weixiu Wenti with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Binghai fetchByPrimaryKey(long binghaiId) throws SystemException {
        return fetchByPrimaryKey((Serializable) binghaiId);
    }

    /**
     * Returns all the Binghai Case Weixiu Wentis.
     *
     * @return the Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Binghai> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Binghai> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Binghai> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Binghai> list = (List<Binghai>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BINGHAI);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BINGHAI;

                if (pagination) {
                    sql = sql.concat(BinghaiModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Binghai>(list);
                } else {
                    list = (List<Binghai>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the Binghai Case Weixiu Wentis from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Binghai binghai : findAll()) {
            remove(binghai);
        }
    }

    /**
     * Returns the number of Binghai Case Weixiu Wentis.
     *
     * @return the number of Binghai Case Weixiu Wentis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_BINGHAI);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the Binghai Case Weixiu Wenti persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.Binghai")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Binghai>> listenersList = new ArrayList<ModelListener<Binghai>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Binghai>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BinghaiImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
