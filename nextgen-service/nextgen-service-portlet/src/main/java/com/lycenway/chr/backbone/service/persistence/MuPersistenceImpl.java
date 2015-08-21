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

import com.lycenway.chr.backbone.NoSuchMuException;
import com.lycenway.chr.backbone.model.Mu;
import com.lycenway.chr.backbone.model.impl.MuImpl;
import com.lycenway.chr.backbone.model.impl.MuModelImpl;
import com.lycenway.chr.backbone.service.persistence.MuPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the Mgmt Unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuPersistence
 * @see MuUtil
 * @generated
 */
public class MuPersistenceImpl extends BasePersistenceImpl<Mu>
    implements MuPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link MuUtil} to access the Mgmt Unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = MuImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MuModelImpl.ENTITY_CACHE_ENABLED,
            MuModelImpl.FINDER_CACHE_ENABLED, MuImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MuModelImpl.ENTITY_CACHE_ENABLED,
            MuModelImpl.FINDER_CACHE_ENABLED, MuImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MuModelImpl.ENTITY_CACHE_ENABLED,
            MuModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MU = "SELECT mu FROM Mu mu";
    private static final String _SQL_COUNT_MU = "SELECT COUNT(mu) FROM Mu mu";
    private static final String _ORDER_BY_ENTITY_ALIAS = "mu.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Mu exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(MuPersistenceImpl.class);
    private static Mu _nullMu = new MuImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Mu> toCacheModel() {
                return _nullMuCacheModel;
            }
        };

    private static CacheModel<Mu> _nullMuCacheModel = new CacheModel<Mu>() {
            @Override
            public Mu toEntityModel() {
                return _nullMu;
            }
        };

    public MuPersistenceImpl() {
        setModelClass(Mu.class);
    }

    /**
     * Caches the Mgmt Unit in the entity cache if it is enabled.
     *
     * @param mu the Mgmt Unit
     */
    @Override
    public void cacheResult(Mu mu) {
        EntityCacheUtil.putResult(MuModelImpl.ENTITY_CACHE_ENABLED,
            MuImpl.class, mu.getPrimaryKey(), mu);

        mu.resetOriginalValues();
    }

    /**
     * Caches the Mgmt Units in the entity cache if it is enabled.
     *
     * @param mus the Mgmt Units
     */
    @Override
    public void cacheResult(List<Mu> mus) {
        for (Mu mu : mus) {
            if (EntityCacheUtil.getResult(MuModelImpl.ENTITY_CACHE_ENABLED,
                        MuImpl.class, mu.getPrimaryKey()) == null) {
                cacheResult(mu);
            } else {
                mu.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all Mgmt Units.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(MuImpl.class.getName());
        }

        EntityCacheUtil.clearCache(MuImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the Mgmt Unit.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Mu mu) {
        EntityCacheUtil.removeResult(MuModelImpl.ENTITY_CACHE_ENABLED,
            MuImpl.class, mu.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Mu> mus) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Mu mu : mus) {
            EntityCacheUtil.removeResult(MuModelImpl.ENTITY_CACHE_ENABLED,
                MuImpl.class, mu.getPrimaryKey());
        }
    }

    /**
     * Creates a new Mgmt Unit with the primary key. Does not add the Mgmt Unit to the database.
     *
     * @param muPK the primary key for the new Mgmt Unit
     * @return the new Mgmt Unit
     */
    @Override
    public Mu create(MuPK muPK) {
        Mu mu = new MuImpl();

        mu.setNew(true);
        mu.setPrimaryKey(muPK);

        return mu;
    }

    /**
     * Removes the Mgmt Unit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param muPK the primary key of the Mgmt Unit
     * @return the Mgmt Unit that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuException if a Mgmt Unit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Mu remove(MuPK muPK) throws NoSuchMuException, SystemException {
        return remove((Serializable) muPK);
    }

    /**
     * Removes the Mgmt Unit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the Mgmt Unit
     * @return the Mgmt Unit that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuException if a Mgmt Unit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Mu remove(Serializable primaryKey)
        throws NoSuchMuException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Mu mu = (Mu) session.get(MuImpl.class, primaryKey);

            if (mu == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchMuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(mu);
        } catch (NoSuchMuException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Mu removeImpl(Mu mu) throws SystemException {
        mu = toUnwrappedModel(mu);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(mu)) {
                mu = (Mu) session.get(MuImpl.class, mu.getPrimaryKeyObj());
            }

            if (mu != null) {
                session.delete(mu);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (mu != null) {
            clearCache(mu);
        }

        return mu;
    }

    @Override
    public Mu updateImpl(com.lycenway.chr.backbone.model.Mu mu)
        throws SystemException {
        mu = toUnwrappedModel(mu);

        boolean isNew = mu.isNew();

        Session session = null;

        try {
            session = openSession();

            if (mu.isNew()) {
                session.save(mu);

                mu.setNew(false);
            } else {
                session.merge(mu);
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

        EntityCacheUtil.putResult(MuModelImpl.ENTITY_CACHE_ENABLED,
            MuImpl.class, mu.getPrimaryKey(), mu);

        return mu;
    }

    protected Mu toUnwrappedModel(Mu mu) {
        if (mu instanceof MuImpl) {
            return mu;
        }

        MuImpl muImpl = new MuImpl();

        muImpl.setNew(mu.isNew());
        muImpl.setPrimaryKey(mu.getPrimaryKey());

        muImpl.setHkey(mu.getHkey());
        muImpl.setPar(mu.getPar());
        muImpl.setTitle(mu.getTitle());
        muImpl.setMuId(mu.getMuId());
        muImpl.setGroupId(mu.getGroupId());
        muImpl.setCompanyId(mu.getCompanyId());
        muImpl.setUserId(mu.getUserId());
        muImpl.setUserName(mu.getUserName());
        muImpl.setCreateDate(mu.getCreateDate());
        muImpl.setModifiedDate(mu.getModifiedDate());

        return muImpl;
    }

    /**
     * Returns the Mgmt Unit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit
     * @return the Mgmt Unit
     * @throws com.lycenway.chr.backbone.NoSuchMuException if a Mgmt Unit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Mu findByPrimaryKey(Serializable primaryKey)
        throws NoSuchMuException, SystemException {
        Mu mu = fetchByPrimaryKey(primaryKey);

        if (mu == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchMuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return mu;
    }

    /**
     * Returns the Mgmt Unit with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuException} if it could not be found.
     *
     * @param muPK the primary key of the Mgmt Unit
     * @return the Mgmt Unit
     * @throws com.lycenway.chr.backbone.NoSuchMuException if a Mgmt Unit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Mu findByPrimaryKey(MuPK muPK)
        throws NoSuchMuException, SystemException {
        return findByPrimaryKey((Serializable) muPK);
    }

    /**
     * Returns the Mgmt Unit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit
     * @return the Mgmt Unit, or <code>null</code> if a Mgmt Unit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Mu fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Mu mu = (Mu) EntityCacheUtil.getResult(MuModelImpl.ENTITY_CACHE_ENABLED,
                MuImpl.class, primaryKey);

        if (mu == _nullMu) {
            return null;
        }

        if (mu == null) {
            Session session = null;

            try {
                session = openSession();

                mu = (Mu) session.get(MuImpl.class, primaryKey);

                if (mu != null) {
                    cacheResult(mu);
                } else {
                    EntityCacheUtil.putResult(MuModelImpl.ENTITY_CACHE_ENABLED,
                        MuImpl.class, primaryKey, _nullMu);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(MuModelImpl.ENTITY_CACHE_ENABLED,
                    MuImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return mu;
    }

    /**
     * Returns the Mgmt Unit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param muPK the primary key of the Mgmt Unit
     * @return the Mgmt Unit, or <code>null</code> if a Mgmt Unit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Mu fetchByPrimaryKey(MuPK muPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) muPK);
    }

    /**
     * Returns all the Mgmt Units.
     *
     * @return the Mgmt Units
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Mu> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the Mgmt Units.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Units
     * @param end the upper bound of the range of Mgmt Units (not inclusive)
     * @return the range of Mgmt Units
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Mu> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the Mgmt Units.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Units
     * @param end the upper bound of the range of Mgmt Units (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of Mgmt Units
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Mu> findAll(int start, int end,
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

        List<Mu> list = (List<Mu>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MU);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MU;

                if (pagination) {
                    sql = sql.concat(MuModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Mu>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Mu>(list);
                } else {
                    list = (List<Mu>) QueryUtil.list(q, getDialect(), start, end);
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
     * Removes all the Mgmt Units from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Mu mu : findAll()) {
            remove(mu);
        }
    }

    /**
     * Returns the number of Mgmt Units.
     *
     * @return the number of Mgmt Units
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

                Query q = session.createQuery(_SQL_COUNT_MU);

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
     * Initializes the Mgmt Unit persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.Mu")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Mu>> listenersList = new ArrayList<ModelListener<Mu>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Mu>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(MuImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
