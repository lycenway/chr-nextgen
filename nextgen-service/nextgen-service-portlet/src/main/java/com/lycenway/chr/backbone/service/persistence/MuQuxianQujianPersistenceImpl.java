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

import com.lycenway.chr.backbone.NoSuchMuQuxianQujianException;
import com.lycenway.chr.backbone.model.MuQuxianQujian;
import com.lycenway.chr.backbone.model.impl.MuQuxianQujianImpl;
import com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl;
import com.lycenway.chr.backbone.service.persistence.MuQuxianQujianPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the Mgmt Unit of Quxian Qujian service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuQuxianQujianPersistence
 * @see MuQuxianQujianUtil
 * @generated
 */
public class MuQuxianQujianPersistenceImpl extends BasePersistenceImpl<MuQuxianQujian>
    implements MuQuxianQujianPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link MuQuxianQujianUtil} to access the Mgmt Unit of Quxian Qujian persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = MuQuxianQujianImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
            MuQuxianQujianModelImpl.FINDER_CACHE_ENABLED,
            MuQuxianQujianImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
            MuQuxianQujianModelImpl.FINDER_CACHE_ENABLED,
            MuQuxianQujianImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
            MuQuxianQujianModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MUQUXIANQUJIAN = "SELECT muQuxianQujian FROM MuQuxianQujian muQuxianQujian";
    private static final String _SQL_COUNT_MUQUXIANQUJIAN = "SELECT COUNT(muQuxianQujian) FROM MuQuxianQujian muQuxianQujian";
    private static final String _ORDER_BY_ENTITY_ALIAS = "muQuxianQujian.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MuQuxianQujian exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(MuQuxianQujianPersistenceImpl.class);
    private static MuQuxianQujian _nullMuQuxianQujian = new MuQuxianQujianImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<MuQuxianQujian> toCacheModel() {
                return _nullMuQuxianQujianCacheModel;
            }
        };

    private static CacheModel<MuQuxianQujian> _nullMuQuxianQujianCacheModel = new CacheModel<MuQuxianQujian>() {
            @Override
            public MuQuxianQujian toEntityModel() {
                return _nullMuQuxianQujian;
            }
        };

    public MuQuxianQujianPersistenceImpl() {
        setModelClass(MuQuxianQujian.class);
    }

    /**
     * Caches the Mgmt Unit of Quxian Qujian in the entity cache if it is enabled.
     *
     * @param muQuxianQujian the Mgmt Unit of Quxian Qujian
     */
    @Override
    public void cacheResult(MuQuxianQujian muQuxianQujian) {
        EntityCacheUtil.putResult(MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
            MuQuxianQujianImpl.class, muQuxianQujian.getPrimaryKey(),
            muQuxianQujian);

        muQuxianQujian.resetOriginalValues();
    }

    /**
     * Caches the Mgmt Unit of Quxian Qujians in the entity cache if it is enabled.
     *
     * @param muQuxianQujians the Mgmt Unit of Quxian Qujians
     */
    @Override
    public void cacheResult(List<MuQuxianQujian> muQuxianQujians) {
        for (MuQuxianQujian muQuxianQujian : muQuxianQujians) {
            if (EntityCacheUtil.getResult(
                        MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
                        MuQuxianQujianImpl.class, muQuxianQujian.getPrimaryKey()) == null) {
                cacheResult(muQuxianQujian);
            } else {
                muQuxianQujian.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all Mgmt Unit of Quxian Qujians.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(MuQuxianQujianImpl.class.getName());
        }

        EntityCacheUtil.clearCache(MuQuxianQujianImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the Mgmt Unit of Quxian Qujian.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(MuQuxianQujian muQuxianQujian) {
        EntityCacheUtil.removeResult(MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
            MuQuxianQujianImpl.class, muQuxianQujian.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<MuQuxianQujian> muQuxianQujians) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (MuQuxianQujian muQuxianQujian : muQuxianQujians) {
            EntityCacheUtil.removeResult(MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
                MuQuxianQujianImpl.class, muQuxianQujian.getPrimaryKey());
        }
    }

    /**
     * Creates a new Mgmt Unit of Quxian Qujian with the primary key. Does not add the Mgmt Unit of Quxian Qujian to the database.
     *
     * @param muQuxianQujianId the primary key for the new Mgmt Unit of Quxian Qujian
     * @return the new Mgmt Unit of Quxian Qujian
     */
    @Override
    public MuQuxianQujian create(long muQuxianQujianId) {
        MuQuxianQujian muQuxianQujian = new MuQuxianQujianImpl();

        muQuxianQujian.setNew(true);
        muQuxianQujian.setPrimaryKey(muQuxianQujianId);

        return muQuxianQujian;
    }

    /**
     * Removes the Mgmt Unit of Quxian Qujian with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
     * @return the Mgmt Unit of Quxian Qujian that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuQuxianQujianException if a Mgmt Unit of Quxian Qujian with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuQuxianQujian remove(long muQuxianQujianId)
        throws NoSuchMuQuxianQujianException, SystemException {
        return remove((Serializable) muQuxianQujianId);
    }

    /**
     * Removes the Mgmt Unit of Quxian Qujian with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the Mgmt Unit of Quxian Qujian
     * @return the Mgmt Unit of Quxian Qujian that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuQuxianQujianException if a Mgmt Unit of Quxian Qujian with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuQuxianQujian remove(Serializable primaryKey)
        throws NoSuchMuQuxianQujianException, SystemException {
        Session session = null;

        try {
            session = openSession();

            MuQuxianQujian muQuxianQujian = (MuQuxianQujian) session.get(MuQuxianQujianImpl.class,
                    primaryKey);

            if (muQuxianQujian == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchMuQuxianQujianException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(muQuxianQujian);
        } catch (NoSuchMuQuxianQujianException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected MuQuxianQujian removeImpl(MuQuxianQujian muQuxianQujian)
        throws SystemException {
        muQuxianQujian = toUnwrappedModel(muQuxianQujian);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(muQuxianQujian)) {
                muQuxianQujian = (MuQuxianQujian) session.get(MuQuxianQujianImpl.class,
                        muQuxianQujian.getPrimaryKeyObj());
            }

            if (muQuxianQujian != null) {
                session.delete(muQuxianQujian);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (muQuxianQujian != null) {
            clearCache(muQuxianQujian);
        }

        return muQuxianQujian;
    }

    @Override
    public MuQuxianQujian updateImpl(
        com.lycenway.chr.backbone.model.MuQuxianQujian muQuxianQujian)
        throws SystemException {
        muQuxianQujian = toUnwrappedModel(muQuxianQujian);

        boolean isNew = muQuxianQujian.isNew();

        Session session = null;

        try {
            session = openSession();

            if (muQuxianQujian.isNew()) {
                session.save(muQuxianQujian);

                muQuxianQujian.setNew(false);
            } else {
                session.merge(muQuxianQujian);
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

        EntityCacheUtil.putResult(MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
            MuQuxianQujianImpl.class, muQuxianQujian.getPrimaryKey(),
            muQuxianQujian);

        return muQuxianQujian;
    }

    protected MuQuxianQujian toUnwrappedModel(MuQuxianQujian muQuxianQujian) {
        if (muQuxianQujian instanceof MuQuxianQujianImpl) {
            return muQuxianQujian;
        }

        MuQuxianQujianImpl muQuxianQujianImpl = new MuQuxianQujianImpl();

        muQuxianQujianImpl.setNew(muQuxianQujian.isNew());
        muQuxianQujianImpl.setPrimaryKey(muQuxianQujian.getPrimaryKey());

        muQuxianQujianImpl.setHkey(muQuxianQujian.getHkey());
        muQuxianQujianImpl.setMuQuxianQujianId(muQuxianQujian.getMuQuxianQujianId());
        muQuxianQujianImpl.setGroupId(muQuxianQujian.getGroupId());
        muQuxianQujianImpl.setCompanyId(muQuxianQujian.getCompanyId());
        muQuxianQujianImpl.setUserId(muQuxianQujian.getUserId());
        muQuxianQujianImpl.setUserName(muQuxianQujian.getUserName());
        muQuxianQujianImpl.setCreateDate(muQuxianQujian.getCreateDate());
        muQuxianQujianImpl.setModifiedDate(muQuxianQujian.getModifiedDate());

        return muQuxianQujianImpl;
    }

    /**
     * Returns the Mgmt Unit of Quxian Qujian with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit of Quxian Qujian
     * @return the Mgmt Unit of Quxian Qujian
     * @throws com.lycenway.chr.backbone.NoSuchMuQuxianQujianException if a Mgmt Unit of Quxian Qujian with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuQuxianQujian findByPrimaryKey(Serializable primaryKey)
        throws NoSuchMuQuxianQujianException, SystemException {
        MuQuxianQujian muQuxianQujian = fetchByPrimaryKey(primaryKey);

        if (muQuxianQujian == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchMuQuxianQujianException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return muQuxianQujian;
    }

    /**
     * Returns the Mgmt Unit of Quxian Qujian with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuQuxianQujianException} if it could not be found.
     *
     * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
     * @return the Mgmt Unit of Quxian Qujian
     * @throws com.lycenway.chr.backbone.NoSuchMuQuxianQujianException if a Mgmt Unit of Quxian Qujian with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuQuxianQujian findByPrimaryKey(long muQuxianQujianId)
        throws NoSuchMuQuxianQujianException, SystemException {
        return findByPrimaryKey((Serializable) muQuxianQujianId);
    }

    /**
     * Returns the Mgmt Unit of Quxian Qujian with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit of Quxian Qujian
     * @return the Mgmt Unit of Quxian Qujian, or <code>null</code> if a Mgmt Unit of Quxian Qujian with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuQuxianQujian fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        MuQuxianQujian muQuxianQujian = (MuQuxianQujian) EntityCacheUtil.getResult(MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
                MuQuxianQujianImpl.class, primaryKey);

        if (muQuxianQujian == _nullMuQuxianQujian) {
            return null;
        }

        if (muQuxianQujian == null) {
            Session session = null;

            try {
                session = openSession();

                muQuxianQujian = (MuQuxianQujian) session.get(MuQuxianQujianImpl.class,
                        primaryKey);

                if (muQuxianQujian != null) {
                    cacheResult(muQuxianQujian);
                } else {
                    EntityCacheUtil.putResult(MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
                        MuQuxianQujianImpl.class, primaryKey,
                        _nullMuQuxianQujian);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(MuQuxianQujianModelImpl.ENTITY_CACHE_ENABLED,
                    MuQuxianQujianImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return muQuxianQujian;
    }

    /**
     * Returns the Mgmt Unit of Quxian Qujian with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param muQuxianQujianId the primary key of the Mgmt Unit of Quxian Qujian
     * @return the Mgmt Unit of Quxian Qujian, or <code>null</code> if a Mgmt Unit of Quxian Qujian with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuQuxianQujian fetchByPrimaryKey(long muQuxianQujianId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) muQuxianQujianId);
    }

    /**
     * Returns all the Mgmt Unit of Quxian Qujians.
     *
     * @return the Mgmt Unit of Quxian Qujians
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuQuxianQujian> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the Mgmt Unit of Quxian Qujians.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Unit of Quxian Qujians
     * @param end the upper bound of the range of Mgmt Unit of Quxian Qujians (not inclusive)
     * @return the range of Mgmt Unit of Quxian Qujians
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuQuxianQujian> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the Mgmt Unit of Quxian Qujians.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Unit of Quxian Qujians
     * @param end the upper bound of the range of Mgmt Unit of Quxian Qujians (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of Mgmt Unit of Quxian Qujians
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuQuxianQujian> findAll(int start, int end,
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

        List<MuQuxianQujian> list = (List<MuQuxianQujian>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MUQUXIANQUJIAN);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MUQUXIANQUJIAN;

                if (pagination) {
                    sql = sql.concat(MuQuxianQujianModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<MuQuxianQujian>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<MuQuxianQujian>(list);
                } else {
                    list = (List<MuQuxianQujian>) QueryUtil.list(q,
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
     * Removes all the Mgmt Unit of Quxian Qujians from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (MuQuxianQujian muQuxianQujian : findAll()) {
            remove(muQuxianQujian);
        }
    }

    /**
     * Returns the number of Mgmt Unit of Quxian Qujians.
     *
     * @return the number of Mgmt Unit of Quxian Qujians
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

                Query q = session.createQuery(_SQL_COUNT_MUQUXIANQUJIAN);

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
     * Initializes the Mgmt Unit of Quxian Qujian persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.MuQuxianQujian")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<MuQuxianQujian>> listenersList = new ArrayList<ModelListener<MuQuxianQujian>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<MuQuxianQujian>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(MuQuxianQujianImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
