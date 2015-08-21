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

import com.lycenway.chr.backbone.NoSuchBinghaiPingfenException;
import com.lycenway.chr.backbone.model.BinghaiPingfen;
import com.lycenway.chr.backbone.model.impl.BinghaiPingfenImpl;
import com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl;
import com.lycenway.chr.backbone.service.persistence.BinghaiPingfenPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the binghai pingfen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see BinghaiPingfenPersistence
 * @see BinghaiPingfenUtil
 * @generated
 */
public class BinghaiPingfenPersistenceImpl extends BasePersistenceImpl<BinghaiPingfen>
    implements BinghaiPingfenPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BinghaiPingfenUtil} to access the binghai pingfen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BinghaiPingfenImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiPingfenModelImpl.FINDER_CACHE_ENABLED,
            BinghaiPingfenImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiPingfenModelImpl.FINDER_CACHE_ENABLED,
            BinghaiPingfenImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiPingfenModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DALEI_XIANGMU =
        new FinderPath(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiPingfenModelImpl.FINDER_CACHE_ENABLED,
            BinghaiPingfenImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findBydalei_xiangmu",
            new String[] {
                String.class.getName(), Double.class.getName(),
                Double.class.getName(), String.class.getName(),
                Double.class.getName(), Double.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_DALEI_XIANGMU =
        new FinderPath(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiPingfenModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countBydalei_xiangmu",
            new String[] {
                String.class.getName(), Double.class.getName(),
                Double.class.getName(), String.class.getName(),
                Double.class.getName(), Double.class.getName()
            });
    private static final String _FINDER_COLUMN_DALEI_XIANGMU_DALEI_1 = "binghaiPingfen.dalei IS NULL AND ";
    private static final String _FINDER_COLUMN_DALEI_XIANGMU_DALEI_2 = "binghaiPingfen.dalei = ? AND ";
    private static final String _FINDER_COLUMN_DALEI_XIANGMU_DALEI_3 = "(binghaiPingfen.dalei IS NULL OR binghaiPingfen.dalei = '') AND ";
    private static final String _FINDER_COLUMN_DALEI_XIANGMU_VMIN_2 = "binghaiPingfen.vmin < ? AND ";
    private static final String _FINDER_COLUMN_DALEI_XIANGMU_VMAX_2 = "binghaiPingfen.vmax >= ? AND ";
    private static final String _FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_1 = "binghaiPingfen.xiangmu IS NULL AND ";
    private static final String _FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_2 = "binghaiPingfen.xiangmu = ? AND ";
    private static final String _FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_3 = "(binghaiPingfen.xiangmu IS NULL OR binghaiPingfen.xiangmu = '') AND ";
    private static final String _FINDER_COLUMN_DALEI_XIANGMU_DENGJI_MIN_2 = "binghaiPingfen.dengji_min <= ? AND ";
    private static final String _FINDER_COLUMN_DALEI_XIANGMU_DENGJI_MAX_2 = "binghaiPingfen.dengji_max >= ?";
    private static final String _SQL_SELECT_BINGHAIPINGFEN = "SELECT binghaiPingfen FROM BinghaiPingfen binghaiPingfen";
    private static final String _SQL_SELECT_BINGHAIPINGFEN_WHERE = "SELECT binghaiPingfen FROM BinghaiPingfen binghaiPingfen WHERE ";
    private static final String _SQL_COUNT_BINGHAIPINGFEN = "SELECT COUNT(binghaiPingfen) FROM BinghaiPingfen binghaiPingfen";
    private static final String _SQL_COUNT_BINGHAIPINGFEN_WHERE = "SELECT COUNT(binghaiPingfen) FROM BinghaiPingfen binghaiPingfen WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "binghaiPingfen.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BinghaiPingfen exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BinghaiPingfen exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BinghaiPingfenPersistenceImpl.class);
    private static BinghaiPingfen _nullBinghaiPingfen = new BinghaiPingfenImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BinghaiPingfen> toCacheModel() {
                return _nullBinghaiPingfenCacheModel;
            }
        };

    private static CacheModel<BinghaiPingfen> _nullBinghaiPingfenCacheModel = new CacheModel<BinghaiPingfen>() {
            @Override
            public BinghaiPingfen toEntityModel() {
                return _nullBinghaiPingfen;
            }
        };

    public BinghaiPingfenPersistenceImpl() {
        setModelClass(BinghaiPingfen.class);
    }

    /**
     * Returns all the binghai pingfens where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
     *
     * @param dalei the dalei
     * @param vmin the vmin
     * @param vmax the vmax
     * @param xiangmu the xiangmu
     * @param dengji_min the dengji_min
     * @param dengji_max the dengji_max
     * @return the matching binghai pingfens
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BinghaiPingfen> findBydalei_xiangmu(String dalei, double vmin,
        double vmax, String xiangmu, double dengji_min, double dengji_max)
        throws SystemException {
        return findBydalei_xiangmu(dalei, vmin, vmax, xiangmu, dengji_min,
            dengji_max, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the binghai pingfens where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dalei the dalei
     * @param vmin the vmin
     * @param vmax the vmax
     * @param xiangmu the xiangmu
     * @param dengji_min the dengji_min
     * @param dengji_max the dengji_max
     * @param start the lower bound of the range of binghai pingfens
     * @param end the upper bound of the range of binghai pingfens (not inclusive)
     * @return the range of matching binghai pingfens
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BinghaiPingfen> findBydalei_xiangmu(String dalei, double vmin,
        double vmax, String xiangmu, double dengji_min, double dengji_max,
        int start, int end) throws SystemException {
        return findBydalei_xiangmu(dalei, vmin, vmax, xiangmu, dengji_min,
            dengji_max, start, end, null);
    }

    /**
     * Returns an ordered range of all the binghai pingfens where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dalei the dalei
     * @param vmin the vmin
     * @param vmax the vmax
     * @param xiangmu the xiangmu
     * @param dengji_min the dengji_min
     * @param dengji_max the dengji_max
     * @param start the lower bound of the range of binghai pingfens
     * @param end the upper bound of the range of binghai pingfens (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching binghai pingfens
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BinghaiPingfen> findBydalei_xiangmu(String dalei, double vmin,
        double vmax, String xiangmu, double dengji_min, double dengji_max,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DALEI_XIANGMU;
        finderArgs = new Object[] {
                dalei, vmin, vmax, xiangmu, dengji_min, dengji_max,
                
                start, end, orderByComparator
            };

        List<BinghaiPingfen> list = (List<BinghaiPingfen>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (BinghaiPingfen binghaiPingfen : list) {
                if (!Validator.equals(dalei, binghaiPingfen.getDalei()) ||
                        (vmin <= binghaiPingfen.getVmin()) ||
                        (vmax > binghaiPingfen.getVmax()) ||
                        !Validator.equals(xiangmu, binghaiPingfen.getXiangmu()) ||
                        (dengji_min < binghaiPingfen.getDengji_min()) ||
                        (dengji_max > binghaiPingfen.getDengji_max())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(8 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(8);
            }

            query.append(_SQL_SELECT_BINGHAIPINGFEN_WHERE);

            boolean bindDalei = false;

            if (dalei == null) {
                query.append(_FINDER_COLUMN_DALEI_XIANGMU_DALEI_1);
            } else if (dalei.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DALEI_XIANGMU_DALEI_3);
            } else {
                bindDalei = true;

                query.append(_FINDER_COLUMN_DALEI_XIANGMU_DALEI_2);
            }

            query.append(_FINDER_COLUMN_DALEI_XIANGMU_VMIN_2);

            query.append(_FINDER_COLUMN_DALEI_XIANGMU_VMAX_2);

            boolean bindXiangmu = false;

            if (xiangmu == null) {
                query.append(_FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_1);
            } else if (xiangmu.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_3);
            } else {
                bindXiangmu = true;

                query.append(_FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_2);
            }

            query.append(_FINDER_COLUMN_DALEI_XIANGMU_DENGJI_MIN_2);

            query.append(_FINDER_COLUMN_DALEI_XIANGMU_DENGJI_MAX_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(BinghaiPingfenModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDalei) {
                    qPos.add(dalei);
                }

                qPos.add(vmin);

                qPos.add(vmax);

                if (bindXiangmu) {
                    qPos.add(xiangmu);
                }

                qPos.add(dengji_min);

                qPos.add(dengji_max);

                if (!pagination) {
                    list = (List<BinghaiPingfen>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BinghaiPingfen>(list);
                } else {
                    list = (List<BinghaiPingfen>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first binghai pingfen in the ordered set where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
     *
     * @param dalei the dalei
     * @param vmin the vmin
     * @param vmax the vmax
     * @param xiangmu the xiangmu
     * @param dengji_min the dengji_min
     * @param dengji_max the dengji_max
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching binghai pingfen
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a matching binghai pingfen could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen findBydalei_xiangmu_First(String dalei, double vmin,
        double vmax, String xiangmu, double dengji_min, double dengji_max,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiPingfenException, SystemException {
        BinghaiPingfen binghaiPingfen = fetchBydalei_xiangmu_First(dalei, vmin,
                vmax, xiangmu, dengji_min, dengji_max, orderByComparator);

        if (binghaiPingfen != null) {
            return binghaiPingfen;
        }

        StringBundler msg = new StringBundler(14);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dalei=");
        msg.append(dalei);

        msg.append(", vmin=");
        msg.append(vmin);

        msg.append(", vmax=");
        msg.append(vmax);

        msg.append(", xiangmu=");
        msg.append(xiangmu);

        msg.append(", dengji_min=");
        msg.append(dengji_min);

        msg.append(", dengji_max=");
        msg.append(dengji_max);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiPingfenException(msg.toString());
    }

    /**
     * Returns the first binghai pingfen in the ordered set where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
     *
     * @param dalei the dalei
     * @param vmin the vmin
     * @param vmax the vmax
     * @param xiangmu the xiangmu
     * @param dengji_min the dengji_min
     * @param dengji_max the dengji_max
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching binghai pingfen, or <code>null</code> if a matching binghai pingfen could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen fetchBydalei_xiangmu_First(String dalei, double vmin,
        double vmax, String xiangmu, double dengji_min, double dengji_max,
        OrderByComparator orderByComparator) throws SystemException {
        List<BinghaiPingfen> list = findBydalei_xiangmu(dalei, vmin, vmax,
                xiangmu, dengji_min, dengji_max, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last binghai pingfen in the ordered set where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
     *
     * @param dalei the dalei
     * @param vmin the vmin
     * @param vmax the vmax
     * @param xiangmu the xiangmu
     * @param dengji_min the dengji_min
     * @param dengji_max the dengji_max
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching binghai pingfen
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a matching binghai pingfen could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen findBydalei_xiangmu_Last(String dalei, double vmin,
        double vmax, String xiangmu, double dengji_min, double dengji_max,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiPingfenException, SystemException {
        BinghaiPingfen binghaiPingfen = fetchBydalei_xiangmu_Last(dalei, vmin,
                vmax, xiangmu, dengji_min, dengji_max, orderByComparator);

        if (binghaiPingfen != null) {
            return binghaiPingfen;
        }

        StringBundler msg = new StringBundler(14);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("dalei=");
        msg.append(dalei);

        msg.append(", vmin=");
        msg.append(vmin);

        msg.append(", vmax=");
        msg.append(vmax);

        msg.append(", xiangmu=");
        msg.append(xiangmu);

        msg.append(", dengji_min=");
        msg.append(dengji_min);

        msg.append(", dengji_max=");
        msg.append(dengji_max);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchBinghaiPingfenException(msg.toString());
    }

    /**
     * Returns the last binghai pingfen in the ordered set where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
     *
     * @param dalei the dalei
     * @param vmin the vmin
     * @param vmax the vmax
     * @param xiangmu the xiangmu
     * @param dengji_min the dengji_min
     * @param dengji_max the dengji_max
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching binghai pingfen, or <code>null</code> if a matching binghai pingfen could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen fetchBydalei_xiangmu_Last(String dalei, double vmin,
        double vmax, String xiangmu, double dengji_min, double dengji_max,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBydalei_xiangmu(dalei, vmin, vmax, xiangmu,
                dengji_min, dengji_max);

        if (count == 0) {
            return null;
        }

        List<BinghaiPingfen> list = findBydalei_xiangmu(dalei, vmin, vmax,
                xiangmu, dengji_min, dengji_max, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the binghai pingfens before and after the current binghai pingfen in the ordered set where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
     *
     * @param binghaiPingfenId the primary key of the current binghai pingfen
     * @param dalei the dalei
     * @param vmin the vmin
     * @param vmax the vmax
     * @param xiangmu the xiangmu
     * @param dengji_min the dengji_min
     * @param dengji_max the dengji_max
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next binghai pingfen
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a binghai pingfen with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen[] findBydalei_xiangmu_PrevAndNext(
        long binghaiPingfenId, String dalei, double vmin, double vmax,
        String xiangmu, double dengji_min, double dengji_max,
        OrderByComparator orderByComparator)
        throws NoSuchBinghaiPingfenException, SystemException {
        BinghaiPingfen binghaiPingfen = findByPrimaryKey(binghaiPingfenId);

        Session session = null;

        try {
            session = openSession();

            BinghaiPingfen[] array = new BinghaiPingfenImpl[3];

            array[0] = getBydalei_xiangmu_PrevAndNext(session, binghaiPingfen,
                    dalei, vmin, vmax, xiangmu, dengji_min, dengji_max,
                    orderByComparator, true);

            array[1] = binghaiPingfen;

            array[2] = getBydalei_xiangmu_PrevAndNext(session, binghaiPingfen,
                    dalei, vmin, vmax, xiangmu, dengji_min, dengji_max,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected BinghaiPingfen getBydalei_xiangmu_PrevAndNext(Session session,
        BinghaiPingfen binghaiPingfen, String dalei, double vmin, double vmax,
        String xiangmu, double dengji_min, double dengji_max,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_BINGHAIPINGFEN_WHERE);

        boolean bindDalei = false;

        if (dalei == null) {
            query.append(_FINDER_COLUMN_DALEI_XIANGMU_DALEI_1);
        } else if (dalei.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_DALEI_XIANGMU_DALEI_3);
        } else {
            bindDalei = true;

            query.append(_FINDER_COLUMN_DALEI_XIANGMU_DALEI_2);
        }

        query.append(_FINDER_COLUMN_DALEI_XIANGMU_VMIN_2);

        query.append(_FINDER_COLUMN_DALEI_XIANGMU_VMAX_2);

        boolean bindXiangmu = false;

        if (xiangmu == null) {
            query.append(_FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_1);
        } else if (xiangmu.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_3);
        } else {
            bindXiangmu = true;

            query.append(_FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_2);
        }

        query.append(_FINDER_COLUMN_DALEI_XIANGMU_DENGJI_MIN_2);

        query.append(_FINDER_COLUMN_DALEI_XIANGMU_DENGJI_MAX_2);

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
            query.append(BinghaiPingfenModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindDalei) {
            qPos.add(dalei);
        }

        qPos.add(vmin);

        qPos.add(vmax);

        if (bindXiangmu) {
            qPos.add(xiangmu);
        }

        qPos.add(dengji_min);

        qPos.add(dengji_max);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(binghaiPingfen);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<BinghaiPingfen> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the binghai pingfens where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63; from the database.
     *
     * @param dalei the dalei
     * @param vmin the vmin
     * @param vmax the vmax
     * @param xiangmu the xiangmu
     * @param dengji_min the dengji_min
     * @param dengji_max the dengji_max
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBydalei_xiangmu(String dalei, double vmin, double vmax,
        String xiangmu, double dengji_min, double dengji_max)
        throws SystemException {
        for (BinghaiPingfen binghaiPingfen : findBydalei_xiangmu(dalei, vmin,
                vmax, xiangmu, dengji_min, dengji_max, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(binghaiPingfen);
        }
    }

    /**
     * Returns the number of binghai pingfens where dalei = &#63; and vmin &lt; &#63; and vmax &ge; &#63; and xiangmu = &#63; and dengji_min &le; &#63; and dengji_max &ge; &#63;.
     *
     * @param dalei the dalei
     * @param vmin the vmin
     * @param vmax the vmax
     * @param xiangmu the xiangmu
     * @param dengji_min the dengji_min
     * @param dengji_max the dengji_max
     * @return the number of matching binghai pingfens
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBydalei_xiangmu(String dalei, double vmin, double vmax,
        String xiangmu, double dengji_min, double dengji_max)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_DALEI_XIANGMU;

        Object[] finderArgs = new Object[] {
                dalei, vmin, vmax, xiangmu, dengji_min, dengji_max
            };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(7);

            query.append(_SQL_COUNT_BINGHAIPINGFEN_WHERE);

            boolean bindDalei = false;

            if (dalei == null) {
                query.append(_FINDER_COLUMN_DALEI_XIANGMU_DALEI_1);
            } else if (dalei.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DALEI_XIANGMU_DALEI_3);
            } else {
                bindDalei = true;

                query.append(_FINDER_COLUMN_DALEI_XIANGMU_DALEI_2);
            }

            query.append(_FINDER_COLUMN_DALEI_XIANGMU_VMIN_2);

            query.append(_FINDER_COLUMN_DALEI_XIANGMU_VMAX_2);

            boolean bindXiangmu = false;

            if (xiangmu == null) {
                query.append(_FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_1);
            } else if (xiangmu.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_3);
            } else {
                bindXiangmu = true;

                query.append(_FINDER_COLUMN_DALEI_XIANGMU_XIANGMU_2);
            }

            query.append(_FINDER_COLUMN_DALEI_XIANGMU_DENGJI_MIN_2);

            query.append(_FINDER_COLUMN_DALEI_XIANGMU_DENGJI_MAX_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDalei) {
                    qPos.add(dalei);
                }

                qPos.add(vmin);

                qPos.add(vmax);

                if (bindXiangmu) {
                    qPos.add(xiangmu);
                }

                qPos.add(dengji_min);

                qPos.add(dengji_max);

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
     * Caches the binghai pingfen in the entity cache if it is enabled.
     *
     * @param binghaiPingfen the binghai pingfen
     */
    @Override
    public void cacheResult(BinghaiPingfen binghaiPingfen) {
        EntityCacheUtil.putResult(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiPingfenImpl.class, binghaiPingfen.getPrimaryKey(),
            binghaiPingfen);

        binghaiPingfen.resetOriginalValues();
    }

    /**
     * Caches the binghai pingfens in the entity cache if it is enabled.
     *
     * @param binghaiPingfens the binghai pingfens
     */
    @Override
    public void cacheResult(List<BinghaiPingfen> binghaiPingfens) {
        for (BinghaiPingfen binghaiPingfen : binghaiPingfens) {
            if (EntityCacheUtil.getResult(
                        BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
                        BinghaiPingfenImpl.class, binghaiPingfen.getPrimaryKey()) == null) {
                cacheResult(binghaiPingfen);
            } else {
                binghaiPingfen.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all binghai pingfens.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BinghaiPingfenImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BinghaiPingfenImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the binghai pingfen.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BinghaiPingfen binghaiPingfen) {
        EntityCacheUtil.removeResult(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiPingfenImpl.class, binghaiPingfen.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BinghaiPingfen> binghaiPingfens) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BinghaiPingfen binghaiPingfen : binghaiPingfens) {
            EntityCacheUtil.removeResult(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
                BinghaiPingfenImpl.class, binghaiPingfen.getPrimaryKey());
        }
    }

    /**
     * Creates a new binghai pingfen with the primary key. Does not add the binghai pingfen to the database.
     *
     * @param binghaiPingfenId the primary key for the new binghai pingfen
     * @return the new binghai pingfen
     */
    @Override
    public BinghaiPingfen create(long binghaiPingfenId) {
        BinghaiPingfen binghaiPingfen = new BinghaiPingfenImpl();

        binghaiPingfen.setNew(true);
        binghaiPingfen.setPrimaryKey(binghaiPingfenId);

        return binghaiPingfen;
    }

    /**
     * Removes the binghai pingfen with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param binghaiPingfenId the primary key of the binghai pingfen
     * @return the binghai pingfen that was removed
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a binghai pingfen with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen remove(long binghaiPingfenId)
        throws NoSuchBinghaiPingfenException, SystemException {
        return remove((Serializable) binghaiPingfenId);
    }

    /**
     * Removes the binghai pingfen with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the binghai pingfen
     * @return the binghai pingfen that was removed
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a binghai pingfen with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen remove(Serializable primaryKey)
        throws NoSuchBinghaiPingfenException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BinghaiPingfen binghaiPingfen = (BinghaiPingfen) session.get(BinghaiPingfenImpl.class,
                    primaryKey);

            if (binghaiPingfen == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBinghaiPingfenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(binghaiPingfen);
        } catch (NoSuchBinghaiPingfenException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BinghaiPingfen removeImpl(BinghaiPingfen binghaiPingfen)
        throws SystemException {
        binghaiPingfen = toUnwrappedModel(binghaiPingfen);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(binghaiPingfen)) {
                binghaiPingfen = (BinghaiPingfen) session.get(BinghaiPingfenImpl.class,
                        binghaiPingfen.getPrimaryKeyObj());
            }

            if (binghaiPingfen != null) {
                session.delete(binghaiPingfen);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (binghaiPingfen != null) {
            clearCache(binghaiPingfen);
        }

        return binghaiPingfen;
    }

    @Override
    public BinghaiPingfen updateImpl(
        com.lycenway.chr.backbone.model.BinghaiPingfen binghaiPingfen)
        throws SystemException {
        binghaiPingfen = toUnwrappedModel(binghaiPingfen);

        boolean isNew = binghaiPingfen.isNew();

        Session session = null;

        try {
            session = openSession();

            if (binghaiPingfen.isNew()) {
                session.save(binghaiPingfen);

                binghaiPingfen.setNew(false);
            } else {
                session.merge(binghaiPingfen);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !BinghaiPingfenModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiPingfenImpl.class, binghaiPingfen.getPrimaryKey(),
            binghaiPingfen);

        return binghaiPingfen;
    }

    protected BinghaiPingfen toUnwrappedModel(BinghaiPingfen binghaiPingfen) {
        if (binghaiPingfen instanceof BinghaiPingfenImpl) {
            return binghaiPingfen;
        }

        BinghaiPingfenImpl binghaiPingfenImpl = new BinghaiPingfenImpl();

        binghaiPingfenImpl.setNew(binghaiPingfen.isNew());
        binghaiPingfenImpl.setPrimaryKey(binghaiPingfen.getPrimaryKey());

        binghaiPingfenImpl.setBinghaiPingfenId(binghaiPingfen.getBinghaiPingfenId());
        binghaiPingfenImpl.setGroupId(binghaiPingfen.getGroupId());
        binghaiPingfenImpl.setCompanyId(binghaiPingfen.getCompanyId());
        binghaiPingfenImpl.setUserId(binghaiPingfen.getUserId());
        binghaiPingfenImpl.setUserName(binghaiPingfen.getUserName());
        binghaiPingfenImpl.setCreateDate(binghaiPingfen.getCreateDate());
        binghaiPingfenImpl.setModifiedDate(binghaiPingfen.getModifiedDate());
        binghaiPingfenImpl.setDalei(binghaiPingfen.getDalei());
        binghaiPingfenImpl.setVmin(binghaiPingfen.getVmin());
        binghaiPingfenImpl.setVmax(binghaiPingfen.getVmax());
        binghaiPingfenImpl.setXiangmu(binghaiPingfen.getXiangmu());
        binghaiPingfenImpl.setDengji(binghaiPingfen.getDengji());
        binghaiPingfenImpl.setDengji_min(binghaiPingfen.getDengji_min());
        binghaiPingfenImpl.setDengji_max(binghaiPingfen.getDengji_max());

        return binghaiPingfenImpl;
    }

    /**
     * Returns the binghai pingfen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the binghai pingfen
     * @return the binghai pingfen
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a binghai pingfen with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBinghaiPingfenException, SystemException {
        BinghaiPingfen binghaiPingfen = fetchByPrimaryKey(primaryKey);

        if (binghaiPingfen == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBinghaiPingfenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return binghaiPingfen;
    }

    /**
     * Returns the binghai pingfen with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchBinghaiPingfenException} if it could not be found.
     *
     * @param binghaiPingfenId the primary key of the binghai pingfen
     * @return the binghai pingfen
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiPingfenException if a binghai pingfen with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen findByPrimaryKey(long binghaiPingfenId)
        throws NoSuchBinghaiPingfenException, SystemException {
        return findByPrimaryKey((Serializable) binghaiPingfenId);
    }

    /**
     * Returns the binghai pingfen with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the binghai pingfen
     * @return the binghai pingfen, or <code>null</code> if a binghai pingfen with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BinghaiPingfen binghaiPingfen = (BinghaiPingfen) EntityCacheUtil.getResult(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
                BinghaiPingfenImpl.class, primaryKey);

        if (binghaiPingfen == _nullBinghaiPingfen) {
            return null;
        }

        if (binghaiPingfen == null) {
            Session session = null;

            try {
                session = openSession();

                binghaiPingfen = (BinghaiPingfen) session.get(BinghaiPingfenImpl.class,
                        primaryKey);

                if (binghaiPingfen != null) {
                    cacheResult(binghaiPingfen);
                } else {
                    EntityCacheUtil.putResult(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
                        BinghaiPingfenImpl.class, primaryKey,
                        _nullBinghaiPingfen);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BinghaiPingfenModelImpl.ENTITY_CACHE_ENABLED,
                    BinghaiPingfenImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return binghaiPingfen;
    }

    /**
     * Returns the binghai pingfen with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param binghaiPingfenId the primary key of the binghai pingfen
     * @return the binghai pingfen, or <code>null</code> if a binghai pingfen with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiPingfen fetchByPrimaryKey(long binghaiPingfenId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) binghaiPingfenId);
    }

    /**
     * Returns all the binghai pingfens.
     *
     * @return the binghai pingfens
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BinghaiPingfen> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the binghai pingfens.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of binghai pingfens
     * @param end the upper bound of the range of binghai pingfens (not inclusive)
     * @return the range of binghai pingfens
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BinghaiPingfen> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the binghai pingfens.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.BinghaiPingfenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of binghai pingfens
     * @param end the upper bound of the range of binghai pingfens (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of binghai pingfens
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BinghaiPingfen> findAll(int start, int end,
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

        List<BinghaiPingfen> list = (List<BinghaiPingfen>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BINGHAIPINGFEN);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BINGHAIPINGFEN;

                if (pagination) {
                    sql = sql.concat(BinghaiPingfenModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BinghaiPingfen>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BinghaiPingfen>(list);
                } else {
                    list = (List<BinghaiPingfen>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the binghai pingfens from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BinghaiPingfen binghaiPingfen : findAll()) {
            remove(binghaiPingfen);
        }
    }

    /**
     * Returns the number of binghai pingfens.
     *
     * @return the number of binghai pingfens
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

                Query q = session.createQuery(_SQL_COUNT_BINGHAIPINGFEN);

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
     * Initializes the binghai pingfen persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.BinghaiPingfen")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BinghaiPingfen>> listenersList = new ArrayList<ModelListener<BinghaiPingfen>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BinghaiPingfen>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BinghaiPingfenImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
