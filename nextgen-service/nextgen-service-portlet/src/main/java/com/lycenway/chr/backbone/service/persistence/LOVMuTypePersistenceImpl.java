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

import com.lycenway.chr.backbone.NoSuchLOVMuTypeException;
import com.lycenway.chr.backbone.model.LOVMuType;
import com.lycenway.chr.backbone.model.impl.LOVMuTypeImpl;
import com.lycenway.chr.backbone.model.impl.LOVMuTypeModelImpl;
import com.lycenway.chr.backbone.service.persistence.LOVMuTypePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the Lisf of Value Mgmt Unit Type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see LOVMuTypePersistence
 * @see LOVMuTypeUtil
 * @generated
 */
public class LOVMuTypePersistenceImpl extends BasePersistenceImpl<LOVMuType>
    implements LOVMuTypePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LOVMuTypeUtil} to access the Lisf of Value Mgmt Unit Type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LOVMuTypeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
            LOVMuTypeModelImpl.FINDER_CACHE_ENABLED, LOVMuTypeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
            LOVMuTypeModelImpl.FINDER_CACHE_ENABLED, LOVMuTypeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
            LOVMuTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_LOVMUTYPE = "SELECT lovMuType FROM LOVMuType lovMuType";
    private static final String _SQL_COUNT_LOVMUTYPE = "SELECT COUNT(lovMuType) FROM LOVMuType lovMuType";
    private static final String _ORDER_BY_ENTITY_ALIAS = "lovMuType.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LOVMuType exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LOVMuTypePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "code"
            });
    private static LOVMuType _nullLOVMuType = new LOVMuTypeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<LOVMuType> toCacheModel() {
                return _nullLOVMuTypeCacheModel;
            }
        };

    private static CacheModel<LOVMuType> _nullLOVMuTypeCacheModel = new CacheModel<LOVMuType>() {
            @Override
            public LOVMuType toEntityModel() {
                return _nullLOVMuType;
            }
        };

    public LOVMuTypePersistenceImpl() {
        setModelClass(LOVMuType.class);
    }

    /**
     * Caches the Lisf of Value Mgmt Unit Type in the entity cache if it is enabled.
     *
     * @param lovMuType the Lisf of Value Mgmt Unit Type
     */
    @Override
    public void cacheResult(LOVMuType lovMuType) {
        EntityCacheUtil.putResult(LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
            LOVMuTypeImpl.class, lovMuType.getPrimaryKey(), lovMuType);

        lovMuType.resetOriginalValues();
    }

    /**
     * Caches the Lisf of Value Mgmt Unit Types in the entity cache if it is enabled.
     *
     * @param lovMuTypes the Lisf of Value Mgmt Unit Types
     */
    @Override
    public void cacheResult(List<LOVMuType> lovMuTypes) {
        for (LOVMuType lovMuType : lovMuTypes) {
            if (EntityCacheUtil.getResult(
                        LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
                        LOVMuTypeImpl.class, lovMuType.getPrimaryKey()) == null) {
                cacheResult(lovMuType);
            } else {
                lovMuType.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all Lisf of Value Mgmt Unit Types.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LOVMuTypeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LOVMuTypeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the Lisf of Value Mgmt Unit Type.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(LOVMuType lovMuType) {
        EntityCacheUtil.removeResult(LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
            LOVMuTypeImpl.class, lovMuType.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<LOVMuType> lovMuTypes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (LOVMuType lovMuType : lovMuTypes) {
            EntityCacheUtil.removeResult(LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
                LOVMuTypeImpl.class, lovMuType.getPrimaryKey());
        }
    }

    /**
     * Creates a new Lisf of Value Mgmt Unit Type with the primary key. Does not add the Lisf of Value Mgmt Unit Type to the database.
     *
     * @param code the primary key for the new Lisf of Value Mgmt Unit Type
     * @return the new Lisf of Value Mgmt Unit Type
     */
    @Override
    public LOVMuType create(String code) {
        LOVMuType lovMuType = new LOVMuTypeImpl();

        lovMuType.setNew(true);
        lovMuType.setPrimaryKey(code);

        return lovMuType;
    }

    /**
     * Removes the Lisf of Value Mgmt Unit Type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param code the primary key of the Lisf of Value Mgmt Unit Type
     * @return the Lisf of Value Mgmt Unit Type that was removed
     * @throws com.lycenway.chr.backbone.NoSuchLOVMuTypeException if a Lisf of Value Mgmt Unit Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVMuType remove(String code)
        throws NoSuchLOVMuTypeException, SystemException {
        return remove((Serializable) code);
    }

    /**
     * Removes the Lisf of Value Mgmt Unit Type with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the Lisf of Value Mgmt Unit Type
     * @return the Lisf of Value Mgmt Unit Type that was removed
     * @throws com.lycenway.chr.backbone.NoSuchLOVMuTypeException if a Lisf of Value Mgmt Unit Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVMuType remove(Serializable primaryKey)
        throws NoSuchLOVMuTypeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            LOVMuType lovMuType = (LOVMuType) session.get(LOVMuTypeImpl.class,
                    primaryKey);

            if (lovMuType == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLOVMuTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(lovMuType);
        } catch (NoSuchLOVMuTypeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected LOVMuType removeImpl(LOVMuType lovMuType)
        throws SystemException {
        lovMuType = toUnwrappedModel(lovMuType);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(lovMuType)) {
                lovMuType = (LOVMuType) session.get(LOVMuTypeImpl.class,
                        lovMuType.getPrimaryKeyObj());
            }

            if (lovMuType != null) {
                session.delete(lovMuType);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (lovMuType != null) {
            clearCache(lovMuType);
        }

        return lovMuType;
    }

    @Override
    public LOVMuType updateImpl(
        com.lycenway.chr.backbone.model.LOVMuType lovMuType)
        throws SystemException {
        lovMuType = toUnwrappedModel(lovMuType);

        boolean isNew = lovMuType.isNew();

        Session session = null;

        try {
            session = openSession();

            if (lovMuType.isNew()) {
                session.save(lovMuType);

                lovMuType.setNew(false);
            } else {
                session.merge(lovMuType);
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

        EntityCacheUtil.putResult(LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
            LOVMuTypeImpl.class, lovMuType.getPrimaryKey(), lovMuType);

        return lovMuType;
    }

    protected LOVMuType toUnwrappedModel(LOVMuType lovMuType) {
        if (lovMuType instanceof LOVMuTypeImpl) {
            return lovMuType;
        }

        LOVMuTypeImpl lovMuTypeImpl = new LOVMuTypeImpl();

        lovMuTypeImpl.setNew(lovMuType.isNew());
        lovMuTypeImpl.setPrimaryKey(lovMuType.getPrimaryKey());

        lovMuTypeImpl.setCode(lovMuType.getCode());
        lovMuTypeImpl.setTitle(lovMuType.getTitle());

        return lovMuTypeImpl;
    }

    /**
     * Returns the Lisf of Value Mgmt Unit Type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the Lisf of Value Mgmt Unit Type
     * @return the Lisf of Value Mgmt Unit Type
     * @throws com.lycenway.chr.backbone.NoSuchLOVMuTypeException if a Lisf of Value Mgmt Unit Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVMuType findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLOVMuTypeException, SystemException {
        LOVMuType lovMuType = fetchByPrimaryKey(primaryKey);

        if (lovMuType == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLOVMuTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return lovMuType;
    }

    /**
     * Returns the Lisf of Value Mgmt Unit Type with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchLOVMuTypeException} if it could not be found.
     *
     * @param code the primary key of the Lisf of Value Mgmt Unit Type
     * @return the Lisf of Value Mgmt Unit Type
     * @throws com.lycenway.chr.backbone.NoSuchLOVMuTypeException if a Lisf of Value Mgmt Unit Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVMuType findByPrimaryKey(String code)
        throws NoSuchLOVMuTypeException, SystemException {
        return findByPrimaryKey((Serializable) code);
    }

    /**
     * Returns the Lisf of Value Mgmt Unit Type with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the Lisf of Value Mgmt Unit Type
     * @return the Lisf of Value Mgmt Unit Type, or <code>null</code> if a Lisf of Value Mgmt Unit Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVMuType fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        LOVMuType lovMuType = (LOVMuType) EntityCacheUtil.getResult(LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
                LOVMuTypeImpl.class, primaryKey);

        if (lovMuType == _nullLOVMuType) {
            return null;
        }

        if (lovMuType == null) {
            Session session = null;

            try {
                session = openSession();

                lovMuType = (LOVMuType) session.get(LOVMuTypeImpl.class,
                        primaryKey);

                if (lovMuType != null) {
                    cacheResult(lovMuType);
                } else {
                    EntityCacheUtil.putResult(LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
                        LOVMuTypeImpl.class, primaryKey, _nullLOVMuType);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LOVMuTypeModelImpl.ENTITY_CACHE_ENABLED,
                    LOVMuTypeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return lovMuType;
    }

    /**
     * Returns the Lisf of Value Mgmt Unit Type with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param code the primary key of the Lisf of Value Mgmt Unit Type
     * @return the Lisf of Value Mgmt Unit Type, or <code>null</code> if a Lisf of Value Mgmt Unit Type with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public LOVMuType fetchByPrimaryKey(String code) throws SystemException {
        return fetchByPrimaryKey((Serializable) code);
    }

    /**
     * Returns all the Lisf of Value Mgmt Unit Types.
     *
     * @return the Lisf of Value Mgmt Unit Types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LOVMuType> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the Lisf of Value Mgmt Unit Types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVMuTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Lisf of Value Mgmt Unit Types
     * @param end the upper bound of the range of Lisf of Value Mgmt Unit Types (not inclusive)
     * @return the range of Lisf of Value Mgmt Unit Types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LOVMuType> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the Lisf of Value Mgmt Unit Types.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.LOVMuTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Lisf of Value Mgmt Unit Types
     * @param end the upper bound of the range of Lisf of Value Mgmt Unit Types (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of Lisf of Value Mgmt Unit Types
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<LOVMuType> findAll(int start, int end,
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

        List<LOVMuType> list = (List<LOVMuType>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LOVMUTYPE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LOVMUTYPE;

                if (pagination) {
                    sql = sql.concat(LOVMuTypeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<LOVMuType>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<LOVMuType>(list);
                } else {
                    list = (List<LOVMuType>) QueryUtil.list(q, getDialect(),
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
     * Removes all the Lisf of Value Mgmt Unit Types from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (LOVMuType lovMuType : findAll()) {
            remove(lovMuType);
        }
    }

    /**
     * Returns the number of Lisf of Value Mgmt Unit Types.
     *
     * @return the number of Lisf of Value Mgmt Unit Types
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

                Query q = session.createQuery(_SQL_COUNT_LOVMUTYPE);

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
     * Initializes the Lisf of Value Mgmt Unit Type persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.LOVMuType")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<LOVMuType>> listenersList = new ArrayList<ModelListener<LOVMuType>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<LOVMuType>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LOVMuTypeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
