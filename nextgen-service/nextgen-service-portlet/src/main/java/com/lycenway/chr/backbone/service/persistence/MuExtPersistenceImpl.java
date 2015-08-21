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

import com.lycenway.chr.backbone.NoSuchMuExtException;
import com.lycenway.chr.backbone.model.MuExt;
import com.lycenway.chr.backbone.model.impl.MuExtImpl;
import com.lycenway.chr.backbone.model.impl.MuExtModelImpl;
import com.lycenway.chr.backbone.service.persistence.MuExtPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the Mgmt Unit Extended Attributes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuExtPersistence
 * @see MuExtUtil
 * @generated
 */
public class MuExtPersistenceImpl extends BasePersistenceImpl<MuExt>
    implements MuExtPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link MuExtUtil} to access the Mgmt Unit Extended Attributes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = MuExtImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MuExtModelImpl.ENTITY_CACHE_ENABLED,
            MuExtModelImpl.FINDER_CACHE_ENABLED, MuExtImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MuExtModelImpl.ENTITY_CACHE_ENABLED,
            MuExtModelImpl.FINDER_CACHE_ENABLED, MuExtImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MuExtModelImpl.ENTITY_CACHE_ENABLED,
            MuExtModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MUEXT = "SELECT muExt FROM MuExt muExt";
    private static final String _SQL_COUNT_MUEXT = "SELECT COUNT(muExt) FROM MuExt muExt";
    private static final String _ORDER_BY_ENTITY_ALIAS = "muExt.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MuExt exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(MuExtPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "key"
            });
    private static MuExt _nullMuExt = new MuExtImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<MuExt> toCacheModel() {
                return _nullMuExtCacheModel;
            }
        };

    private static CacheModel<MuExt> _nullMuExtCacheModel = new CacheModel<MuExt>() {
            @Override
            public MuExt toEntityModel() {
                return _nullMuExt;
            }
        };

    public MuExtPersistenceImpl() {
        setModelClass(MuExt.class);
    }

    /**
     * Caches the Mgmt Unit Extended Attributes in the entity cache if it is enabled.
     *
     * @param muExt the Mgmt Unit Extended Attributes
     */
    @Override
    public void cacheResult(MuExt muExt) {
        EntityCacheUtil.putResult(MuExtModelImpl.ENTITY_CACHE_ENABLED,
            MuExtImpl.class, muExt.getPrimaryKey(), muExt);

        muExt.resetOriginalValues();
    }

    /**
     * Caches the Mgmt Unit Extended Attributeses in the entity cache if it is enabled.
     *
     * @param muExts the Mgmt Unit Extended Attributeses
     */
    @Override
    public void cacheResult(List<MuExt> muExts) {
        for (MuExt muExt : muExts) {
            if (EntityCacheUtil.getResult(MuExtModelImpl.ENTITY_CACHE_ENABLED,
                        MuExtImpl.class, muExt.getPrimaryKey()) == null) {
                cacheResult(muExt);
            } else {
                muExt.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all Mgmt Unit Extended Attributeses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(MuExtImpl.class.getName());
        }

        EntityCacheUtil.clearCache(MuExtImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the Mgmt Unit Extended Attributes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(MuExt muExt) {
        EntityCacheUtil.removeResult(MuExtModelImpl.ENTITY_CACHE_ENABLED,
            MuExtImpl.class, muExt.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<MuExt> muExts) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (MuExt muExt : muExts) {
            EntityCacheUtil.removeResult(MuExtModelImpl.ENTITY_CACHE_ENABLED,
                MuExtImpl.class, muExt.getPrimaryKey());
        }
    }

    /**
     * Creates a new Mgmt Unit Extended Attributes with the primary key. Does not add the Mgmt Unit Extended Attributes to the database.
     *
     * @param muExtId the primary key for the new Mgmt Unit Extended Attributes
     * @return the new Mgmt Unit Extended Attributes
     */
    @Override
    public MuExt create(long muExtId) {
        MuExt muExt = new MuExtImpl();

        muExt.setNew(true);
        muExt.setPrimaryKey(muExtId);

        return muExt;
    }

    /**
     * Removes the Mgmt Unit Extended Attributes with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param muExtId the primary key of the Mgmt Unit Extended Attributes
     * @return the Mgmt Unit Extended Attributes that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuExtException if a Mgmt Unit Extended Attributes with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuExt remove(long muExtId)
        throws NoSuchMuExtException, SystemException {
        return remove((Serializable) muExtId);
    }

    /**
     * Removes the Mgmt Unit Extended Attributes with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the Mgmt Unit Extended Attributes
     * @return the Mgmt Unit Extended Attributes that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuExtException if a Mgmt Unit Extended Attributes with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuExt remove(Serializable primaryKey)
        throws NoSuchMuExtException, SystemException {
        Session session = null;

        try {
            session = openSession();

            MuExt muExt = (MuExt) session.get(MuExtImpl.class, primaryKey);

            if (muExt == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchMuExtException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(muExt);
        } catch (NoSuchMuExtException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected MuExt removeImpl(MuExt muExt) throws SystemException {
        muExt = toUnwrappedModel(muExt);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(muExt)) {
                muExt = (MuExt) session.get(MuExtImpl.class,
                        muExt.getPrimaryKeyObj());
            }

            if (muExt != null) {
                session.delete(muExt);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (muExt != null) {
            clearCache(muExt);
        }

        return muExt;
    }

    @Override
    public MuExt updateImpl(com.lycenway.chr.backbone.model.MuExt muExt)
        throws SystemException {
        muExt = toUnwrappedModel(muExt);

        boolean isNew = muExt.isNew();

        Session session = null;

        try {
            session = openSession();

            if (muExt.isNew()) {
                session.save(muExt);

                muExt.setNew(false);
            } else {
                session.merge(muExt);
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

        EntityCacheUtil.putResult(MuExtModelImpl.ENTITY_CACHE_ENABLED,
            MuExtImpl.class, muExt.getPrimaryKey(), muExt);

        return muExt;
    }

    protected MuExt toUnwrappedModel(MuExt muExt) {
        if (muExt instanceof MuExtImpl) {
            return muExt;
        }

        MuExtImpl muExtImpl = new MuExtImpl();

        muExtImpl.setNew(muExt.isNew());
        muExtImpl.setPrimaryKey(muExt.getPrimaryKey());

        muExtImpl.setHkey(muExt.getHkey());
        muExtImpl.setValue(muExt.getValue());
        muExtImpl.setMuExtId(muExt.getMuExtId());
        muExtImpl.setGroupId(muExt.getGroupId());
        muExtImpl.setCompanyId(muExt.getCompanyId());
        muExtImpl.setUserId(muExt.getUserId());
        muExtImpl.setUserName(muExt.getUserName());
        muExtImpl.setCreateDate(muExt.getCreateDate());
        muExtImpl.setModifiedDate(muExt.getModifiedDate());
        muExtImpl.setKey(muExt.getKey());

        return muExtImpl;
    }

    /**
     * Returns the Mgmt Unit Extended Attributes with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit Extended Attributes
     * @return the Mgmt Unit Extended Attributes
     * @throws com.lycenway.chr.backbone.NoSuchMuExtException if a Mgmt Unit Extended Attributes with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuExt findByPrimaryKey(Serializable primaryKey)
        throws NoSuchMuExtException, SystemException {
        MuExt muExt = fetchByPrimaryKey(primaryKey);

        if (muExt == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchMuExtException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return muExt;
    }

    /**
     * Returns the Mgmt Unit Extended Attributes with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuExtException} if it could not be found.
     *
     * @param muExtId the primary key of the Mgmt Unit Extended Attributes
     * @return the Mgmt Unit Extended Attributes
     * @throws com.lycenway.chr.backbone.NoSuchMuExtException if a Mgmt Unit Extended Attributes with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuExt findByPrimaryKey(long muExtId)
        throws NoSuchMuExtException, SystemException {
        return findByPrimaryKey((Serializable) muExtId);
    }

    /**
     * Returns the Mgmt Unit Extended Attributes with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit Extended Attributes
     * @return the Mgmt Unit Extended Attributes, or <code>null</code> if a Mgmt Unit Extended Attributes with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuExt fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        MuExt muExt = (MuExt) EntityCacheUtil.getResult(MuExtModelImpl.ENTITY_CACHE_ENABLED,
                MuExtImpl.class, primaryKey);

        if (muExt == _nullMuExt) {
            return null;
        }

        if (muExt == null) {
            Session session = null;

            try {
                session = openSession();

                muExt = (MuExt) session.get(MuExtImpl.class, primaryKey);

                if (muExt != null) {
                    cacheResult(muExt);
                } else {
                    EntityCacheUtil.putResult(MuExtModelImpl.ENTITY_CACHE_ENABLED,
                        MuExtImpl.class, primaryKey, _nullMuExt);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(MuExtModelImpl.ENTITY_CACHE_ENABLED,
                    MuExtImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return muExt;
    }

    /**
     * Returns the Mgmt Unit Extended Attributes with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param muExtId the primary key of the Mgmt Unit Extended Attributes
     * @return the Mgmt Unit Extended Attributes, or <code>null</code> if a Mgmt Unit Extended Attributes with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuExt fetchByPrimaryKey(long muExtId) throws SystemException {
        return fetchByPrimaryKey((Serializable) muExtId);
    }

    /**
     * Returns all the Mgmt Unit Extended Attributeses.
     *
     * @return the Mgmt Unit Extended Attributeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuExt> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the Mgmt Unit Extended Attributeses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Unit Extended Attributeses
     * @param end the upper bound of the range of Mgmt Unit Extended Attributeses (not inclusive)
     * @return the range of Mgmt Unit Extended Attributeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuExt> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the Mgmt Unit Extended Attributeses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Unit Extended Attributeses
     * @param end the upper bound of the range of Mgmt Unit Extended Attributeses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of Mgmt Unit Extended Attributeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuExt> findAll(int start, int end,
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

        List<MuExt> list = (List<MuExt>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MUEXT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MUEXT;

                if (pagination) {
                    sql = sql.concat(MuExtModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<MuExt>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<MuExt>(list);
                } else {
                    list = (List<MuExt>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the Mgmt Unit Extended Attributeses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (MuExt muExt : findAll()) {
            remove(muExt);
        }
    }

    /**
     * Returns the number of Mgmt Unit Extended Attributeses.
     *
     * @return the number of Mgmt Unit Extended Attributeses
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

                Query q = session.createQuery(_SQL_COUNT_MUEXT);

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
     * Initializes the Mgmt Unit Extended Attributes persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.MuExt")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<MuExt>> listenersList = new ArrayList<ModelListener<MuExt>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<MuExt>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(MuExtImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
