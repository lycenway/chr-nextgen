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

import com.lycenway.chr.backbone.NoSuchMuWufengXianluException;
import com.lycenway.chr.backbone.model.MuWufengXianlu;
import com.lycenway.chr.backbone.model.impl.MuWufengXianluImpl;
import com.lycenway.chr.backbone.model.impl.MuWufengXianluModelImpl;
import com.lycenway.chr.backbone.service.persistence.MuWufengXianluPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the Mgmt Unit of Wufeng Xianlu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuWufengXianluPersistence
 * @see MuWufengXianluUtil
 * @generated
 */
public class MuWufengXianluPersistenceImpl extends BasePersistenceImpl<MuWufengXianlu>
    implements MuWufengXianluPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link MuWufengXianluUtil} to access the Mgmt Unit of Wufeng Xianlu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = MuWufengXianluImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
            MuWufengXianluModelImpl.FINDER_CACHE_ENABLED,
            MuWufengXianluImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
            MuWufengXianluModelImpl.FINDER_CACHE_ENABLED,
            MuWufengXianluImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
            MuWufengXianluModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MUWUFENGXIANLU = "SELECT muWufengXianlu FROM MuWufengXianlu muWufengXianlu";
    private static final String _SQL_COUNT_MUWUFENGXIANLU = "SELECT COUNT(muWufengXianlu) FROM MuWufengXianlu muWufengXianlu";
    private static final String _ORDER_BY_ENTITY_ALIAS = "muWufengXianlu.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MuWufengXianlu exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(MuWufengXianluPersistenceImpl.class);
    private static MuWufengXianlu _nullMuWufengXianlu = new MuWufengXianluImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<MuWufengXianlu> toCacheModel() {
                return _nullMuWufengXianluCacheModel;
            }
        };

    private static CacheModel<MuWufengXianlu> _nullMuWufengXianluCacheModel = new CacheModel<MuWufengXianlu>() {
            @Override
            public MuWufengXianlu toEntityModel() {
                return _nullMuWufengXianlu;
            }
        };

    public MuWufengXianluPersistenceImpl() {
        setModelClass(MuWufengXianlu.class);
    }

    /**
     * Caches the Mgmt Unit of Wufeng Xianlu in the entity cache if it is enabled.
     *
     * @param muWufengXianlu the Mgmt Unit of Wufeng Xianlu
     */
    @Override
    public void cacheResult(MuWufengXianlu muWufengXianlu) {
        EntityCacheUtil.putResult(MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
            MuWufengXianluImpl.class, muWufengXianlu.getPrimaryKey(),
            muWufengXianlu);

        muWufengXianlu.resetOriginalValues();
    }

    /**
     * Caches the Mgmt Unit of Wufeng Xianlus in the entity cache if it is enabled.
     *
     * @param muWufengXianlus the Mgmt Unit of Wufeng Xianlus
     */
    @Override
    public void cacheResult(List<MuWufengXianlu> muWufengXianlus) {
        for (MuWufengXianlu muWufengXianlu : muWufengXianlus) {
            if (EntityCacheUtil.getResult(
                        MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
                        MuWufengXianluImpl.class, muWufengXianlu.getPrimaryKey()) == null) {
                cacheResult(muWufengXianlu);
            } else {
                muWufengXianlu.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all Mgmt Unit of Wufeng Xianlus.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(MuWufengXianluImpl.class.getName());
        }

        EntityCacheUtil.clearCache(MuWufengXianluImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the Mgmt Unit of Wufeng Xianlu.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(MuWufengXianlu muWufengXianlu) {
        EntityCacheUtil.removeResult(MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
            MuWufengXianluImpl.class, muWufengXianlu.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<MuWufengXianlu> muWufengXianlus) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (MuWufengXianlu muWufengXianlu : muWufengXianlus) {
            EntityCacheUtil.removeResult(MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
                MuWufengXianluImpl.class, muWufengXianlu.getPrimaryKey());
        }
    }

    /**
     * Creates a new Mgmt Unit of Wufeng Xianlu with the primary key. Does not add the Mgmt Unit of Wufeng Xianlu to the database.
     *
     * @param muWufengXianluId the primary key for the new Mgmt Unit of Wufeng Xianlu
     * @return the new Mgmt Unit of Wufeng Xianlu
     */
    @Override
    public MuWufengXianlu create(long muWufengXianluId) {
        MuWufengXianlu muWufengXianlu = new MuWufengXianluImpl();

        muWufengXianlu.setNew(true);
        muWufengXianlu.setPrimaryKey(muWufengXianluId);

        return muWufengXianlu;
    }

    /**
     * Removes the Mgmt Unit of Wufeng Xianlu with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
     * @return the Mgmt Unit of Wufeng Xianlu that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuWufengXianluException if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuWufengXianlu remove(long muWufengXianluId)
        throws NoSuchMuWufengXianluException, SystemException {
        return remove((Serializable) muWufengXianluId);
    }

    /**
     * Removes the Mgmt Unit of Wufeng Xianlu with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the Mgmt Unit of Wufeng Xianlu
     * @return the Mgmt Unit of Wufeng Xianlu that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuWufengXianluException if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuWufengXianlu remove(Serializable primaryKey)
        throws NoSuchMuWufengXianluException, SystemException {
        Session session = null;

        try {
            session = openSession();

            MuWufengXianlu muWufengXianlu = (MuWufengXianlu) session.get(MuWufengXianluImpl.class,
                    primaryKey);

            if (muWufengXianlu == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchMuWufengXianluException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(muWufengXianlu);
        } catch (NoSuchMuWufengXianluException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected MuWufengXianlu removeImpl(MuWufengXianlu muWufengXianlu)
        throws SystemException {
        muWufengXianlu = toUnwrappedModel(muWufengXianlu);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(muWufengXianlu)) {
                muWufengXianlu = (MuWufengXianlu) session.get(MuWufengXianluImpl.class,
                        muWufengXianlu.getPrimaryKeyObj());
            }

            if (muWufengXianlu != null) {
                session.delete(muWufengXianlu);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (muWufengXianlu != null) {
            clearCache(muWufengXianlu);
        }

        return muWufengXianlu;
    }

    @Override
    public MuWufengXianlu updateImpl(
        com.lycenway.chr.backbone.model.MuWufengXianlu muWufengXianlu)
        throws SystemException {
        muWufengXianlu = toUnwrappedModel(muWufengXianlu);

        boolean isNew = muWufengXianlu.isNew();

        Session session = null;

        try {
            session = openSession();

            if (muWufengXianlu.isNew()) {
                session.save(muWufengXianlu);

                muWufengXianlu.setNew(false);
            } else {
                session.merge(muWufengXianlu);
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

        EntityCacheUtil.putResult(MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
            MuWufengXianluImpl.class, muWufengXianlu.getPrimaryKey(),
            muWufengXianlu);

        return muWufengXianlu;
    }

    protected MuWufengXianlu toUnwrappedModel(MuWufengXianlu muWufengXianlu) {
        if (muWufengXianlu instanceof MuWufengXianluImpl) {
            return muWufengXianlu;
        }

        MuWufengXianluImpl muWufengXianluImpl = new MuWufengXianluImpl();

        muWufengXianluImpl.setNew(muWufengXianlu.isNew());
        muWufengXianluImpl.setPrimaryKey(muWufengXianlu.getPrimaryKey());

        muWufengXianluImpl.setHkey(muWufengXianlu.getHkey());
        muWufengXianluImpl.setMuWufengXianluId(muWufengXianlu.getMuWufengXianluId());
        muWufengXianluImpl.setGroupId(muWufengXianlu.getGroupId());
        muWufengXianluImpl.setCompanyId(muWufengXianlu.getCompanyId());
        muWufengXianluImpl.setUserId(muWufengXianlu.getUserId());
        muWufengXianluImpl.setUserName(muWufengXianlu.getUserName());
        muWufengXianluImpl.setCreateDate(muWufengXianlu.getCreateDate());
        muWufengXianluImpl.setModifiedDate(muWufengXianlu.getModifiedDate());

        return muWufengXianluImpl;
    }

    /**
     * Returns the Mgmt Unit of Wufeng Xianlu with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit of Wufeng Xianlu
     * @return the Mgmt Unit of Wufeng Xianlu
     * @throws com.lycenway.chr.backbone.NoSuchMuWufengXianluException if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuWufengXianlu findByPrimaryKey(Serializable primaryKey)
        throws NoSuchMuWufengXianluException, SystemException {
        MuWufengXianlu muWufengXianlu = fetchByPrimaryKey(primaryKey);

        if (muWufengXianlu == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchMuWufengXianluException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return muWufengXianlu;
    }

    /**
     * Returns the Mgmt Unit of Wufeng Xianlu with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuWufengXianluException} if it could not be found.
     *
     * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
     * @return the Mgmt Unit of Wufeng Xianlu
     * @throws com.lycenway.chr.backbone.NoSuchMuWufengXianluException if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuWufengXianlu findByPrimaryKey(long muWufengXianluId)
        throws NoSuchMuWufengXianluException, SystemException {
        return findByPrimaryKey((Serializable) muWufengXianluId);
    }

    /**
     * Returns the Mgmt Unit of Wufeng Xianlu with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit of Wufeng Xianlu
     * @return the Mgmt Unit of Wufeng Xianlu, or <code>null</code> if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuWufengXianlu fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        MuWufengXianlu muWufengXianlu = (MuWufengXianlu) EntityCacheUtil.getResult(MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
                MuWufengXianluImpl.class, primaryKey);

        if (muWufengXianlu == _nullMuWufengXianlu) {
            return null;
        }

        if (muWufengXianlu == null) {
            Session session = null;

            try {
                session = openSession();

                muWufengXianlu = (MuWufengXianlu) session.get(MuWufengXianluImpl.class,
                        primaryKey);

                if (muWufengXianlu != null) {
                    cacheResult(muWufengXianlu);
                } else {
                    EntityCacheUtil.putResult(MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
                        MuWufengXianluImpl.class, primaryKey,
                        _nullMuWufengXianlu);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(MuWufengXianluModelImpl.ENTITY_CACHE_ENABLED,
                    MuWufengXianluImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return muWufengXianlu;
    }

    /**
     * Returns the Mgmt Unit of Wufeng Xianlu with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param muWufengXianluId the primary key of the Mgmt Unit of Wufeng Xianlu
     * @return the Mgmt Unit of Wufeng Xianlu, or <code>null</code> if a Mgmt Unit of Wufeng Xianlu with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuWufengXianlu fetchByPrimaryKey(long muWufengXianluId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) muWufengXianluId);
    }

    /**
     * Returns all the Mgmt Unit of Wufeng Xianlus.
     *
     * @return the Mgmt Unit of Wufeng Xianlus
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuWufengXianlu> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the Mgmt Unit of Wufeng Xianlus.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuWufengXianluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Unit of Wufeng Xianlus
     * @param end the upper bound of the range of Mgmt Unit of Wufeng Xianlus (not inclusive)
     * @return the range of Mgmt Unit of Wufeng Xianlus
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuWufengXianlu> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the Mgmt Unit of Wufeng Xianlus.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuWufengXianluModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Unit of Wufeng Xianlus
     * @param end the upper bound of the range of Mgmt Unit of Wufeng Xianlus (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of Mgmt Unit of Wufeng Xianlus
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuWufengXianlu> findAll(int start, int end,
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

        List<MuWufengXianlu> list = (List<MuWufengXianlu>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MUWUFENGXIANLU);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MUWUFENGXIANLU;

                if (pagination) {
                    sql = sql.concat(MuWufengXianluModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<MuWufengXianlu>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<MuWufengXianlu>(list);
                } else {
                    list = (List<MuWufengXianlu>) QueryUtil.list(q,
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
     * Removes all the Mgmt Unit of Wufeng Xianlus from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (MuWufengXianlu muWufengXianlu : findAll()) {
            remove(muWufengXianlu);
        }
    }

    /**
     * Returns the number of Mgmt Unit of Wufeng Xianlus.
     *
     * @return the number of Mgmt Unit of Wufeng Xianlus
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

                Query q = session.createQuery(_SQL_COUNT_MUWUFENGXIANLU);

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
     * Initializes the Mgmt Unit of Wufeng Xianlu persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.MuWufengXianlu")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<MuWufengXianlu>> listenersList = new ArrayList<ModelListener<MuWufengXianlu>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<MuWufengXianlu>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(MuWufengXianluImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
