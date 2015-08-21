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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.lycenway.chr.backbone.NoSuchMuInterrelException;
import com.lycenway.chr.backbone.model.MuInterrel;
import com.lycenway.chr.backbone.model.impl.MuInterrelImpl;
import com.lycenway.chr.backbone.model.impl.MuInterrelModelImpl;
import com.lycenway.chr.backbone.service.persistence.MuInterrelPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the Mgmt Unit Inter Relationship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuInterrelPersistence
 * @see MuInterrelUtil
 * @generated
 */
public class MuInterrelPersistenceImpl extends BasePersistenceImpl<MuInterrel>
    implements MuInterrelPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link MuInterrelUtil} to access the Mgmt Unit Inter Relationship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = MuInterrelImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
            MuInterrelModelImpl.FINDER_CACHE_ENABLED, MuInterrelImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
            MuInterrelModelImpl.FINDER_CACHE_ENABLED, MuInterrelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
            MuInterrelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MUINTERREL = "SELECT muInterrel FROM MuInterrel muInterrel";
    private static final String _SQL_COUNT_MUINTERREL = "SELECT COUNT(muInterrel) FROM MuInterrel muInterrel";
    private static final String _ORDER_BY_ENTITY_ALIAS = "muInterrel.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MuInterrel exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(MuInterrelPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "type"
            });
    private static MuInterrel _nullMuInterrel = new MuInterrelImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<MuInterrel> toCacheModel() {
                return _nullMuInterrelCacheModel;
            }
        };

    private static CacheModel<MuInterrel> _nullMuInterrelCacheModel = new CacheModel<MuInterrel>() {
            @Override
            public MuInterrel toEntityModel() {
                return _nullMuInterrel;
            }
        };

    public MuInterrelPersistenceImpl() {
        setModelClass(MuInterrel.class);
    }

    /**
     * Caches the Mgmt Unit Inter Relationship in the entity cache if it is enabled.
     *
     * @param muInterrel the Mgmt Unit Inter Relationship
     */
    @Override
    public void cacheResult(MuInterrel muInterrel) {
        EntityCacheUtil.putResult(MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
            MuInterrelImpl.class, muInterrel.getPrimaryKey(), muInterrel);

        muInterrel.resetOriginalValues();
    }

    /**
     * Caches the Mgmt Unit Inter Relationships in the entity cache if it is enabled.
     *
     * @param muInterrels the Mgmt Unit Inter Relationships
     */
    @Override
    public void cacheResult(List<MuInterrel> muInterrels) {
        for (MuInterrel muInterrel : muInterrels) {
            if (EntityCacheUtil.getResult(
                        MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
                        MuInterrelImpl.class, muInterrel.getPrimaryKey()) == null) {
                cacheResult(muInterrel);
            } else {
                muInterrel.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all Mgmt Unit Inter Relationships.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(MuInterrelImpl.class.getName());
        }

        EntityCacheUtil.clearCache(MuInterrelImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the Mgmt Unit Inter Relationship.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(MuInterrel muInterrel) {
        EntityCacheUtil.removeResult(MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
            MuInterrelImpl.class, muInterrel.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<MuInterrel> muInterrels) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (MuInterrel muInterrel : muInterrels) {
            EntityCacheUtil.removeResult(MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
                MuInterrelImpl.class, muInterrel.getPrimaryKey());
        }
    }

    /**
     * Creates a new Mgmt Unit Inter Relationship with the primary key. Does not add the Mgmt Unit Inter Relationship to the database.
     *
     * @param muInterrelId the primary key for the new Mgmt Unit Inter Relationship
     * @return the new Mgmt Unit Inter Relationship
     */
    @Override
    public MuInterrel create(long muInterrelId) {
        MuInterrel muInterrel = new MuInterrelImpl();

        muInterrel.setNew(true);
        muInterrel.setPrimaryKey(muInterrelId);

        return muInterrel;
    }

    /**
     * Removes the Mgmt Unit Inter Relationship with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
     * @return the Mgmt Unit Inter Relationship that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuInterrelException if a Mgmt Unit Inter Relationship with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuInterrel remove(long muInterrelId)
        throws NoSuchMuInterrelException, SystemException {
        return remove((Serializable) muInterrelId);
    }

    /**
     * Removes the Mgmt Unit Inter Relationship with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the Mgmt Unit Inter Relationship
     * @return the Mgmt Unit Inter Relationship that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuInterrelException if a Mgmt Unit Inter Relationship with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuInterrel remove(Serializable primaryKey)
        throws NoSuchMuInterrelException, SystemException {
        Session session = null;

        try {
            session = openSession();

            MuInterrel muInterrel = (MuInterrel) session.get(MuInterrelImpl.class,
                    primaryKey);

            if (muInterrel == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchMuInterrelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(muInterrel);
        } catch (NoSuchMuInterrelException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected MuInterrel removeImpl(MuInterrel muInterrel)
        throws SystemException {
        muInterrel = toUnwrappedModel(muInterrel);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(muInterrel)) {
                muInterrel = (MuInterrel) session.get(MuInterrelImpl.class,
                        muInterrel.getPrimaryKeyObj());
            }

            if (muInterrel != null) {
                session.delete(muInterrel);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (muInterrel != null) {
            clearCache(muInterrel);
        }

        return muInterrel;
    }

    @Override
    public MuInterrel updateImpl(
        com.lycenway.chr.backbone.model.MuInterrel muInterrel)
        throws SystemException {
        muInterrel = toUnwrappedModel(muInterrel);

        boolean isNew = muInterrel.isNew();

        Session session = null;

        try {
            session = openSession();

            if (muInterrel.isNew()) {
                session.save(muInterrel);

                muInterrel.setNew(false);
            } else {
                session.merge(muInterrel);
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

        EntityCacheUtil.putResult(MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
            MuInterrelImpl.class, muInterrel.getPrimaryKey(), muInterrel);

        return muInterrel;
    }

    protected MuInterrel toUnwrappedModel(MuInterrel muInterrel) {
        if (muInterrel instanceof MuInterrelImpl) {
            return muInterrel;
        }

        MuInterrelImpl muInterrelImpl = new MuInterrelImpl();

        muInterrelImpl.setNew(muInterrel.isNew());
        muInterrelImpl.setPrimaryKey(muInterrel.getPrimaryKey());

        muInterrelImpl.setHkey(muInterrel.getHkey());
        muInterrelImpl.setPar(muInterrel.getPar());
        muInterrelImpl.setType(muInterrel.getType());
        muInterrelImpl.setMuInterrelId(muInterrel.getMuInterrelId());
        muInterrelImpl.setGroupId(muInterrel.getGroupId());
        muInterrelImpl.setCompanyId(muInterrel.getCompanyId());
        muInterrelImpl.setUserId(muInterrel.getUserId());
        muInterrelImpl.setUserName(muInterrel.getUserName());
        muInterrelImpl.setCreateDate(muInterrel.getCreateDate());
        muInterrelImpl.setModifiedDate(muInterrel.getModifiedDate());

        return muInterrelImpl;
    }

    /**
     * Returns the Mgmt Unit Inter Relationship with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit Inter Relationship
     * @return the Mgmt Unit Inter Relationship
     * @throws com.lycenway.chr.backbone.NoSuchMuInterrelException if a Mgmt Unit Inter Relationship with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuInterrel findByPrimaryKey(Serializable primaryKey)
        throws NoSuchMuInterrelException, SystemException {
        MuInterrel muInterrel = fetchByPrimaryKey(primaryKey);

        if (muInterrel == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchMuInterrelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return muInterrel;
    }

    /**
     * Returns the Mgmt Unit Inter Relationship with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuInterrelException} if it could not be found.
     *
     * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
     * @return the Mgmt Unit Inter Relationship
     * @throws com.lycenway.chr.backbone.NoSuchMuInterrelException if a Mgmt Unit Inter Relationship with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuInterrel findByPrimaryKey(long muInterrelId)
        throws NoSuchMuInterrelException, SystemException {
        return findByPrimaryKey((Serializable) muInterrelId);
    }

    /**
     * Returns the Mgmt Unit Inter Relationship with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit Inter Relationship
     * @return the Mgmt Unit Inter Relationship, or <code>null</code> if a Mgmt Unit Inter Relationship with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuInterrel fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        MuInterrel muInterrel = (MuInterrel) EntityCacheUtil.getResult(MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
                MuInterrelImpl.class, primaryKey);

        if (muInterrel == _nullMuInterrel) {
            return null;
        }

        if (muInterrel == null) {
            Session session = null;

            try {
                session = openSession();

                muInterrel = (MuInterrel) session.get(MuInterrelImpl.class,
                        primaryKey);

                if (muInterrel != null) {
                    cacheResult(muInterrel);
                } else {
                    EntityCacheUtil.putResult(MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
                        MuInterrelImpl.class, primaryKey, _nullMuInterrel);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(MuInterrelModelImpl.ENTITY_CACHE_ENABLED,
                    MuInterrelImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return muInterrel;
    }

    /**
     * Returns the Mgmt Unit Inter Relationship with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param muInterrelId the primary key of the Mgmt Unit Inter Relationship
     * @return the Mgmt Unit Inter Relationship, or <code>null</code> if a Mgmt Unit Inter Relationship with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuInterrel fetchByPrimaryKey(long muInterrelId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) muInterrelId);
    }

    /**
     * Returns all the Mgmt Unit Inter Relationships.
     *
     * @return the Mgmt Unit Inter Relationships
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuInterrel> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the Mgmt Unit Inter Relationships.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuInterrelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Unit Inter Relationships
     * @param end the upper bound of the range of Mgmt Unit Inter Relationships (not inclusive)
     * @return the range of Mgmt Unit Inter Relationships
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuInterrel> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the Mgmt Unit Inter Relationships.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuInterrelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Unit Inter Relationships
     * @param end the upper bound of the range of Mgmt Unit Inter Relationships (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of Mgmt Unit Inter Relationships
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuInterrel> findAll(int start, int end,
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

        List<MuInterrel> list = (List<MuInterrel>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MUINTERREL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MUINTERREL;

                if (pagination) {
                    sql = sql.concat(MuInterrelModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<MuInterrel>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<MuInterrel>(list);
                } else {
                    list = (List<MuInterrel>) QueryUtil.list(q, getDialect(),
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
     * Removes all the Mgmt Unit Inter Relationships from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (MuInterrel muInterrel : findAll()) {
            remove(muInterrel);
        }
    }

    /**
     * Returns the number of Mgmt Unit Inter Relationships.
     *
     * @return the number of Mgmt Unit Inter Relationships
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

                Query q = session.createQuery(_SQL_COUNT_MUINTERREL);

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

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the Mgmt Unit Inter Relationship persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.MuInterrel")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<MuInterrel>> listenersList = new ArrayList<ModelListener<MuInterrel>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<MuInterrel>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(MuInterrelImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
