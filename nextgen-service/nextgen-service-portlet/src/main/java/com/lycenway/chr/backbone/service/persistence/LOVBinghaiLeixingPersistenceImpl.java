package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException;
import com.lycenway.chr.backbone.model.LOVBinghaiLeixing;
import com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingImpl;
import com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingModelImpl;
import com.lycenway.chr.backbone.service.persistence.LOVBinghaiLeixingPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the List of Value Binghai Leixing - Case Type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see LOVBinghaiLeixingPersistence
 * @see LOVBinghaiLeixingUtil
 * @generated
 */
public class LOVBinghaiLeixingPersistenceImpl extends BasePersistenceImpl<LOVBinghaiLeixing>
    implements LOVBinghaiLeixingPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LOVBinghaiLeixingUtil} to access the List of Value Binghai Leixing - Case Type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LOVBinghaiLeixingImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
            LOVBinghaiLeixingModelImpl.FINDER_CACHE_ENABLED,
            LOVBinghaiLeixingImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
            LOVBinghaiLeixingModelImpl.FINDER_CACHE_ENABLED,
            LOVBinghaiLeixingImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
            LOVBinghaiLeixingModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_LOVBINGHAILEIXING = "SELECT lovBinghaiLeixing FROM LOVBinghaiLeixing lovBinghaiLeixing";
    private static final String _SQL_COUNT_LOVBINGHAILEIXING = "SELECT COUNT(lovBinghaiLeixing) FROM LOVBinghaiLeixing lovBinghaiLeixing";
    private static final String _ORDER_BY_ENTITY_ALIAS = "lovBinghaiLeixing.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LOVBinghaiLeixing exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LOVBinghaiLeixingPersistenceImpl.class);
    private static LOVBinghaiLeixing _nullLOVBinghaiLeixing = new LOVBinghaiLeixingImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<LOVBinghaiLeixing> toCacheModel() {
                return _nullLOVBinghaiLeixingCacheModel;
            }
        };

    private static CacheModel<LOVBinghaiLeixing> _nullLOVBinghaiLeixingCacheModel =
        new CacheModel<LOVBinghaiLeixing>() {
            @Override
            public LOVBinghaiLeixing toEntityModel() {
                return _nullLOVBinghaiLeixing;
            }
        };

    public LOVBinghaiLeixingPersistenceImpl() {
        setModelClass(LOVBinghaiLeixing.class);
    }

    /**
     * Caches the List of Value Binghai Leixing - Case Type in the entity cache if it is enabled.
     *
     * @param lovBinghaiLeixing the List of Value Binghai Leixing - Case Type
     */
    @Override
    public void cacheResult(LOVBinghaiLeixing lovBinghaiLeixing) {
        EntityCacheUtil.putResult(LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
            LOVBinghaiLeixingImpl.class, lovBinghaiLeixing.getPrimaryKey(),
            lovBinghaiLeixing);

        lovBinghaiLeixing.resetOriginalValues();
    }

    /**
     * Caches the List of Value Binghai Leixing - Case Types in the entity cache if it is enabled.
     *
     * @param lovBinghaiLeixings the List of Value Binghai Leixing - Case Types
     */
    @Override
    public void cacheResult(List<LOVBinghaiLeixing> lovBinghaiLeixings) {
        for (LOVBinghaiLeixing lovBinghaiLeixing : lovBinghaiLeixings) {
            if (EntityCacheUtil.getResult(
                        LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
                        LOVBinghaiLeixingImpl.class,
                        lovBinghaiLeixing.getPrimaryKey()) == null) {
                cacheResult(lovBinghaiLeixing);
            } else {
                lovBinghaiLeixing.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all List of Value Binghai Leixing - Case Types.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LOVBinghaiLeixingImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LOVBinghaiLeixingImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the List of Value Binghai Leixing - Case Type.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(LOVBinghaiLeixing lovBinghaiLeixing) {
        EntityCacheUtil.removeResult(LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
            LOVBinghaiLeixingImpl.class, lovBinghaiLeixing.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<LOVBinghaiLeixing> lovBinghaiLeixings) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (LOVBinghaiLeixing lovBinghaiLeixing : lovBinghaiLeixings) {
            EntityCacheUtil.removeResult(LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
                LOVBinghaiLeixingImpl.class, lovBinghaiLeixing.getPrimaryKey());
        }
    }

    /**
     * Creates a new List of Value Binghai Leixing - Case Type with the primary key. Does not add the List of Value Binghai Leixing - Case Type to the database.
     *
     * @param code the primary key for the new List of Value Binghai Leixing - Case Type
     * @return the new List of Value Binghai Leixing - Case Type
     */
    @Override
    public LOVBinghaiLeixing create(String code) {
        LOVBinghaiLeixing lovBinghaiLeixing = new LOVBinghaiLeixingImpl();

        lovBinghaiLeixing.setNew(true);
        lovBinghaiLeixing.setPrimaryKey(code);

        return lovBinghaiLeixing;
    }

    /**
     * Removes the List of Value Binghai Leixing - Case Type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param code the primary key of the List of Value Binghai Leixing - Case Type
     * @return the List of Value Binghai Leixing - Case Type that was removed
     * @throws com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVBinghaiLeixing remove(String code)
        throws NoSuchLOVBinghaiLeixingException, SystemException {
        return remove((Serializable) code);
    }

    /**
     * Removes the List of Value Binghai Leixing - Case Type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the List of Value Binghai Leixing - Case Type
     * @return the List of Value Binghai Leixing - Case Type that was removed
     * @throws com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVBinghaiLeixing remove(Serializable primaryKey)
        throws NoSuchLOVBinghaiLeixingException, SystemException {
        Session session = null;

        try {
            session = openSession();

            LOVBinghaiLeixing lovBinghaiLeixing = (LOVBinghaiLeixing) session.get(LOVBinghaiLeixingImpl.class,
                    primaryKey);

            if (lovBinghaiLeixing == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLOVBinghaiLeixingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(lovBinghaiLeixing);
        } catch (NoSuchLOVBinghaiLeixingException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected LOVBinghaiLeixing removeImpl(LOVBinghaiLeixing lovBinghaiLeixing)
        throws SystemException {
        lovBinghaiLeixing = toUnwrappedModel(lovBinghaiLeixing);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(lovBinghaiLeixing)) {
                lovBinghaiLeixing = (LOVBinghaiLeixing) session.get(LOVBinghaiLeixingImpl.class,
                        lovBinghaiLeixing.getPrimaryKeyObj());
            }

            if (lovBinghaiLeixing != null) {
                session.delete(lovBinghaiLeixing);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (lovBinghaiLeixing != null) {
            clearCache(lovBinghaiLeixing);
        }

        return lovBinghaiLeixing;
    }

    @Override
    public LOVBinghaiLeixing updateImpl(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing)
        throws SystemException {
        lovBinghaiLeixing = toUnwrappedModel(lovBinghaiLeixing);

        boolean isNew = lovBinghaiLeixing.isNew();

        Session session = null;

        try {
            session = openSession();

            if (lovBinghaiLeixing.isNew()) {
                session.save(lovBinghaiLeixing);

                lovBinghaiLeixing.setNew(false);
            } else {
                session.merge(lovBinghaiLeixing);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
            LOVBinghaiLeixingImpl.class, lovBinghaiLeixing.getPrimaryKey(),
            lovBinghaiLeixing);

        return lovBinghaiLeixing;
    }

    protected LOVBinghaiLeixing toUnwrappedModel(
        LOVBinghaiLeixing lovBinghaiLeixing) {
        if (lovBinghaiLeixing instanceof LOVBinghaiLeixingImpl) {
            return lovBinghaiLeixing;
        }

        LOVBinghaiLeixingImpl lovBinghaiLeixingImpl = new LOVBinghaiLeixingImpl();

        lovBinghaiLeixingImpl.setNew(lovBinghaiLeixing.isNew());
        lovBinghaiLeixingImpl.setPrimaryKey(lovBinghaiLeixing.getPrimaryKey());

        lovBinghaiLeixingImpl.setCode(lovBinghaiLeixing.getCode());
        lovBinghaiLeixingImpl.setTitle(lovBinghaiLeixing.getTitle());

        return lovBinghaiLeixingImpl;
    }

    /**
     * Returns the List of Value Binghai Leixing - Case Type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the List of Value Binghai Leixing - Case Type
     * @return the List of Value Binghai Leixing - Case Type
     * @throws com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVBinghaiLeixing findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLOVBinghaiLeixingException, SystemException {
        LOVBinghaiLeixing lovBinghaiLeixing = fetchByPrimaryKey(primaryKey);

        if (lovBinghaiLeixing == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLOVBinghaiLeixingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return lovBinghaiLeixing;
    }

    /**
     * Returns the List of Value Binghai Leixing - Case Type with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException} if it could not be found.
     *
     * @param code the primary key of the List of Value Binghai Leixing - Case Type
     * @return the List of Value Binghai Leixing - Case Type
     * @throws com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException if a List of Value Binghai Leixing - Case Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVBinghaiLeixing findByPrimaryKey(String code)
        throws NoSuchLOVBinghaiLeixingException, SystemException {
        return findByPrimaryKey((Serializable) code);
    }

    /**
     * Returns the List of Value Binghai Leixing - Case Type with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the List of Value Binghai Leixing - Case Type
     * @return the List of Value Binghai Leixing - Case Type, or <code>null</code> if a List of Value Binghai Leixing - Case Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVBinghaiLeixing fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        LOVBinghaiLeixing lovBinghaiLeixing = (LOVBinghaiLeixing) EntityCacheUtil.getResult(LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
                LOVBinghaiLeixingImpl.class, primaryKey);

        if (lovBinghaiLeixing == _nullLOVBinghaiLeixing) {
            return null;
        }

        if (lovBinghaiLeixing == null) {
            Session session = null;

            try {
                session = openSession();

                lovBinghaiLeixing = (LOVBinghaiLeixing) session.get(LOVBinghaiLeixingImpl.class,
                        primaryKey);

                if (lovBinghaiLeixing != null) {
                    cacheResult(lovBinghaiLeixing);
                } else {
                    EntityCacheUtil.putResult(LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
                        LOVBinghaiLeixingImpl.class, primaryKey,
                        _nullLOVBinghaiLeixing);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LOVBinghaiLeixingModelImpl.ENTITY_CACHE_ENABLED,
                    LOVBinghaiLeixingImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return lovBinghaiLeixing;
    }

    /**
     * Returns the List of Value Binghai Leixing - Case Type with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param code the primary key of the List of Value Binghai Leixing - Case Type
     * @return the List of Value Binghai Leixing - Case Type, or <code>null</code> if a List of Value Binghai Leixing - Case Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVBinghaiLeixing fetchByPrimaryKey(String code)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) code);
    }

    /**
     * Returns all the List of Value Binghai Leixing - Case Types.
     *
     * @return the List of Value Binghai Leixing - Case Types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LOVBinghaiLeixing> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the List of Value Binghai Leixing - Case Types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of List of Value Binghai Leixing - Case Types
     * @param end the upper bound of the range of List of Value Binghai Leixing - Case Types (not inclusive)
     * @return the range of List of Value Binghai Leixing - Case Types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LOVBinghaiLeixing> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the List of Value Binghai Leixing - Case Types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of List of Value Binghai Leixing - Case Types
     * @param end the upper bound of the range of List of Value Binghai Leixing - Case Types (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of List of Value Binghai Leixing - Case Types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LOVBinghaiLeixing> findAll(int start, int end,
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

        List<LOVBinghaiLeixing> list = (List<LOVBinghaiLeixing>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LOVBINGHAILEIXING);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LOVBINGHAILEIXING;

                if (pagination) {
                    sql = sql.concat(LOVBinghaiLeixingModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<LOVBinghaiLeixing>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LOVBinghaiLeixing>(list);
                } else {
                    list = (List<LOVBinghaiLeixing>) QueryUtil.list(q,
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
     * Removes all the List of Value Binghai Leixing - Case Types from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (LOVBinghaiLeixing lovBinghaiLeixing : findAll()) {
            remove(lovBinghaiLeixing);
        }
    }

    /**
     * Returns the number of List of Value Binghai Leixing - Case Types.
     *
     * @return the number of List of Value Binghai Leixing - Case Types
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

                Query q = session.createQuery(_SQL_COUNT_LOVBINGHAILEIXING);

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
     * Initializes the List of Value Binghai Leixing - Case Type persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.LOVBinghaiLeixing")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<LOVBinghaiLeixing>> listenersList = new ArrayList<ModelListener<LOVBinghaiLeixing>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<LOVBinghaiLeixing>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LOVBinghaiLeixingImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
