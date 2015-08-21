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

import com.lycenway.chr.backbone.NoSuchBinghaiProofException;
import com.lycenway.chr.backbone.model.BinghaiProof;
import com.lycenway.chr.backbone.model.impl.BinghaiProofImpl;
import com.lycenway.chr.backbone.model.impl.BinghaiProofModelImpl;
import com.lycenway.chr.backbone.service.persistence.BinghaiProofPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the Binghai Attachments Pictures service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see BinghaiProofPersistence
 * @see BinghaiProofUtil
 * @generated
 */
public class BinghaiProofPersistenceImpl extends BasePersistenceImpl<BinghaiProof>
    implements BinghaiProofPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BinghaiProofUtil} to access the Binghai Attachments Pictures persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BinghaiProofImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiProofModelImpl.FINDER_CACHE_ENABLED, BinghaiProofImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiProofModelImpl.FINDER_CACHE_ENABLED, BinghaiProofImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiProofModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_BINGHAIPROOF = "SELECT binghaiProof FROM BinghaiProof binghaiProof";
    private static final String _SQL_COUNT_BINGHAIPROOF = "SELECT COUNT(binghaiProof) FROM BinghaiProof binghaiProof";
    private static final String _ORDER_BY_ENTITY_ALIAS = "binghaiProof.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BinghaiProof exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BinghaiProofPersistenceImpl.class);
    private static BinghaiProof _nullBinghaiProof = new BinghaiProofImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BinghaiProof> toCacheModel() {
                return _nullBinghaiProofCacheModel;
            }
        };

    private static CacheModel<BinghaiProof> _nullBinghaiProofCacheModel = new CacheModel<BinghaiProof>() {
            @Override
            public BinghaiProof toEntityModel() {
                return _nullBinghaiProof;
            }
        };

    public BinghaiProofPersistenceImpl() {
        setModelClass(BinghaiProof.class);
    }

    /**
     * Caches the Binghai Attachments Pictures in the entity cache if it is enabled.
     *
     * @param binghaiProof the Binghai Attachments Pictures
     */
    @Override
    public void cacheResult(BinghaiProof binghaiProof) {
        EntityCacheUtil.putResult(BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiProofImpl.class, binghaiProof.getPrimaryKey(), binghaiProof);

        binghaiProof.resetOriginalValues();
    }

    /**
     * Caches the Binghai Attachments Pictureses in the entity cache if it is enabled.
     *
     * @param binghaiProofs the Binghai Attachments Pictureses
     */
    @Override
    public void cacheResult(List<BinghaiProof> binghaiProofs) {
        for (BinghaiProof binghaiProof : binghaiProofs) {
            if (EntityCacheUtil.getResult(
                        BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
                        BinghaiProofImpl.class, binghaiProof.getPrimaryKey()) == null) {
                cacheResult(binghaiProof);
            } else {
                binghaiProof.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all Binghai Attachments Pictureses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BinghaiProofImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BinghaiProofImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the Binghai Attachments Pictures.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BinghaiProof binghaiProof) {
        EntityCacheUtil.removeResult(BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiProofImpl.class, binghaiProof.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BinghaiProof> binghaiProofs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BinghaiProof binghaiProof : binghaiProofs) {
            EntityCacheUtil.removeResult(BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
                BinghaiProofImpl.class, binghaiProof.getPrimaryKey());
        }
    }

    /**
     * Creates a new Binghai Attachments Pictures with the primary key. Does not add the Binghai Attachments Pictures to the database.
     *
     * @param binghaiProofId the primary key for the new Binghai Attachments Pictures
     * @return the new Binghai Attachments Pictures
     */
    @Override
    public BinghaiProof create(long binghaiProofId) {
        BinghaiProof binghaiProof = new BinghaiProofImpl();

        binghaiProof.setNew(true);
        binghaiProof.setPrimaryKey(binghaiProofId);

        return binghaiProof;
    }

    /**
     * Removes the Binghai Attachments Pictures with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param binghaiProofId the primary key of the Binghai Attachments Pictures
     * @return the Binghai Attachments Pictures that was removed
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiProofException if a Binghai Attachments Pictures with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiProof remove(long binghaiProofId)
        throws NoSuchBinghaiProofException, SystemException {
        return remove((Serializable) binghaiProofId);
    }

    /**
     * Removes the Binghai Attachments Pictures with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the Binghai Attachments Pictures
     * @return the Binghai Attachments Pictures that was removed
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiProofException if a Binghai Attachments Pictures with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiProof remove(Serializable primaryKey)
        throws NoSuchBinghaiProofException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BinghaiProof binghaiProof = (BinghaiProof) session.get(BinghaiProofImpl.class,
                    primaryKey);

            if (binghaiProof == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBinghaiProofException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(binghaiProof);
        } catch (NoSuchBinghaiProofException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BinghaiProof removeImpl(BinghaiProof binghaiProof)
        throws SystemException {
        binghaiProof = toUnwrappedModel(binghaiProof);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(binghaiProof)) {
                binghaiProof = (BinghaiProof) session.get(BinghaiProofImpl.class,
                        binghaiProof.getPrimaryKeyObj());
            }

            if (binghaiProof != null) {
                session.delete(binghaiProof);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (binghaiProof != null) {
            clearCache(binghaiProof);
        }

        return binghaiProof;
    }

    @Override
    public BinghaiProof updateImpl(
        com.lycenway.chr.backbone.model.BinghaiProof binghaiProof)
        throws SystemException {
        binghaiProof = toUnwrappedModel(binghaiProof);

        boolean isNew = binghaiProof.isNew();

        Session session = null;

        try {
            session = openSession();

            if (binghaiProof.isNew()) {
                session.save(binghaiProof);

                binghaiProof.setNew(false);
            } else {
                session.merge(binghaiProof);
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

        EntityCacheUtil.putResult(BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
            BinghaiProofImpl.class, binghaiProof.getPrimaryKey(), binghaiProof);

        return binghaiProof;
    }

    protected BinghaiProof toUnwrappedModel(BinghaiProof binghaiProof) {
        if (binghaiProof instanceof BinghaiProofImpl) {
            return binghaiProof;
        }

        BinghaiProofImpl binghaiProofImpl = new BinghaiProofImpl();

        binghaiProofImpl.setNew(binghaiProof.isNew());
        binghaiProofImpl.setPrimaryKey(binghaiProof.getPrimaryKey());

        binghaiProofImpl.setMime(binghaiProof.getMime());
        binghaiProofImpl.setUrl(binghaiProof.getUrl());
        binghaiProofImpl.setBinghaiId(binghaiProof.getBinghaiId());
        binghaiProofImpl.setBinghaiProofId(binghaiProof.getBinghaiProofId());
        binghaiProofImpl.setGroupId(binghaiProof.getGroupId());
        binghaiProofImpl.setCompanyId(binghaiProof.getCompanyId());
        binghaiProofImpl.setUserId(binghaiProof.getUserId());
        binghaiProofImpl.setUserName(binghaiProof.getUserName());
        binghaiProofImpl.setCreateDate(binghaiProof.getCreateDate());
        binghaiProofImpl.setModifiedDate(binghaiProof.getModifiedDate());

        return binghaiProofImpl;
    }

    /**
     * Returns the Binghai Attachments Pictures with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the Binghai Attachments Pictures
     * @return the Binghai Attachments Pictures
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiProofException if a Binghai Attachments Pictures with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiProof findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBinghaiProofException, SystemException {
        BinghaiProof binghaiProof = fetchByPrimaryKey(primaryKey);

        if (binghaiProof == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBinghaiProofException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return binghaiProof;
    }

    /**
     * Returns the Binghai Attachments Pictures with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchBinghaiProofException} if it could not be found.
     *
     * @param binghaiProofId the primary key of the Binghai Attachments Pictures
     * @return the Binghai Attachments Pictures
     * @throws com.lycenway.chr.backbone.NoSuchBinghaiProofException if a Binghai Attachments Pictures with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiProof findByPrimaryKey(long binghaiProofId)
        throws NoSuchBinghaiProofException, SystemException {
        return findByPrimaryKey((Serializable) binghaiProofId);
    }

    /**
     * Returns the Binghai Attachments Pictures with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the Binghai Attachments Pictures
     * @return the Binghai Attachments Pictures, or <code>null</code> if a Binghai Attachments Pictures with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiProof fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BinghaiProof binghaiProof = (BinghaiProof) EntityCacheUtil.getResult(BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
                BinghaiProofImpl.class, primaryKey);

        if (binghaiProof == _nullBinghaiProof) {
            return null;
        }

        if (binghaiProof == null) {
            Session session = null;

            try {
                session = openSession();

                binghaiProof = (BinghaiProof) session.get(BinghaiProofImpl.class,
                        primaryKey);

                if (binghaiProof != null) {
                    cacheResult(binghaiProof);
                } else {
                    EntityCacheUtil.putResult(BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
                        BinghaiProofImpl.class, primaryKey, _nullBinghaiProof);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BinghaiProofModelImpl.ENTITY_CACHE_ENABLED,
                    BinghaiProofImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return binghaiProof;
    }

    /**
     * Returns the Binghai Attachments Pictures with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param binghaiProofId the primary key of the Binghai Attachments Pictures
     * @return the Binghai Attachments Pictures, or <code>null</code> if a Binghai Attachments Pictures with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BinghaiProof fetchByPrimaryKey(long binghaiProofId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) binghaiProofId);
    }

    /**
     * Returns all the Binghai Attachments Pictureses.
     *
     * @return the Binghai Attachments Pictureses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BinghaiProof> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<BinghaiProof> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<BinghaiProof> findAll(int start, int end,
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

        List<BinghaiProof> list = (List<BinghaiProof>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BINGHAIPROOF);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BINGHAIPROOF;

                if (pagination) {
                    sql = sql.concat(BinghaiProofModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BinghaiProof>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BinghaiProof>(list);
                } else {
                    list = (List<BinghaiProof>) QueryUtil.list(q, getDialect(),
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
     * Removes all the Binghai Attachments Pictureses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BinghaiProof binghaiProof : findAll()) {
            remove(binghaiProof);
        }
    }

    /**
     * Returns the number of Binghai Attachments Pictureses.
     *
     * @return the number of Binghai Attachments Pictureses
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

                Query q = session.createQuery(_SQL_COUNT_BINGHAIPROOF);

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
     * Initializes the Binghai Attachments Pictures persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.BinghaiProof")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BinghaiProof>> listenersList = new ArrayList<ModelListener<BinghaiProof>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BinghaiProof>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BinghaiProofImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
