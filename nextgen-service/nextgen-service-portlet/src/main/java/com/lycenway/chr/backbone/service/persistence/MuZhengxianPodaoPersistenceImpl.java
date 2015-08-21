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

import com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException;
import com.lycenway.chr.backbone.model.MuZhengxianPodao;
import com.lycenway.chr.backbone.model.impl.MuZhengxianPodaoImpl;
import com.lycenway.chr.backbone.model.impl.MuZhengxianPodaoModelImpl;
import com.lycenway.chr.backbone.service.persistence.MuZhengxianPodaoPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the Mgmt Unit of Zhengxian Podao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author lycenway
 * @see MuZhengxianPodaoPersistence
 * @see MuZhengxianPodaoUtil
 * @generated
 */
public class MuZhengxianPodaoPersistenceImpl extends BasePersistenceImpl<MuZhengxianPodao>
    implements MuZhengxianPodaoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link MuZhengxianPodaoUtil} to access the Mgmt Unit of Zhengxian Podao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = MuZhengxianPodaoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
            MuZhengxianPodaoModelImpl.FINDER_CACHE_ENABLED,
            MuZhengxianPodaoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
            MuZhengxianPodaoModelImpl.FINDER_CACHE_ENABLED,
            MuZhengxianPodaoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
            MuZhengxianPodaoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MUZHENGXIANPODAO = "SELECT muZhengxianPodao FROM MuZhengxianPodao muZhengxianPodao";
    private static final String _SQL_COUNT_MUZHENGXIANPODAO = "SELECT COUNT(muZhengxianPodao) FROM MuZhengxianPodao muZhengxianPodao";
    private static final String _ORDER_BY_ENTITY_ALIAS = "muZhengxianPodao.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MuZhengxianPodao exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(MuZhengxianPodaoPersistenceImpl.class);
    private static MuZhengxianPodao _nullMuZhengxianPodao = new MuZhengxianPodaoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<MuZhengxianPodao> toCacheModel() {
                return _nullMuZhengxianPodaoCacheModel;
            }
        };

    private static CacheModel<MuZhengxianPodao> _nullMuZhengxianPodaoCacheModel = new CacheModel<MuZhengxianPodao>() {
            @Override
            public MuZhengxianPodao toEntityModel() {
                return _nullMuZhengxianPodao;
            }
        };

    public MuZhengxianPodaoPersistenceImpl() {
        setModelClass(MuZhengxianPodao.class);
    }

    /**
     * Caches the Mgmt Unit of Zhengxian Podao in the entity cache if it is enabled.
     *
     * @param muZhengxianPodao the Mgmt Unit of Zhengxian Podao
     */
    @Override
    public void cacheResult(MuZhengxianPodao muZhengxianPodao) {
        EntityCacheUtil.putResult(MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
            MuZhengxianPodaoImpl.class, muZhengxianPodao.getPrimaryKey(),
            muZhengxianPodao);

        muZhengxianPodao.resetOriginalValues();
    }

    /**
     * Caches the Mgmt Unit of Zhengxian Podaos in the entity cache if it is enabled.
     *
     * @param muZhengxianPodaos the Mgmt Unit of Zhengxian Podaos
     */
    @Override
    public void cacheResult(List<MuZhengxianPodao> muZhengxianPodaos) {
        for (MuZhengxianPodao muZhengxianPodao : muZhengxianPodaos) {
            if (EntityCacheUtil.getResult(
                        MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
                        MuZhengxianPodaoImpl.class,
                        muZhengxianPodao.getPrimaryKey()) == null) {
                cacheResult(muZhengxianPodao);
            } else {
                muZhengxianPodao.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all Mgmt Unit of Zhengxian Podaos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(MuZhengxianPodaoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(MuZhengxianPodaoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the Mgmt Unit of Zhengxian Podao.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(MuZhengxianPodao muZhengxianPodao) {
        EntityCacheUtil.removeResult(MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
            MuZhengxianPodaoImpl.class, muZhengxianPodao.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<MuZhengxianPodao> muZhengxianPodaos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (MuZhengxianPodao muZhengxianPodao : muZhengxianPodaos) {
            EntityCacheUtil.removeResult(MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
                MuZhengxianPodaoImpl.class, muZhengxianPodao.getPrimaryKey());
        }
    }

    /**
     * Creates a new Mgmt Unit of Zhengxian Podao with the primary key. Does not add the Mgmt Unit of Zhengxian Podao to the database.
     *
     * @param muZhengxianPodaoId the primary key for the new Mgmt Unit of Zhengxian Podao
     * @return the new Mgmt Unit of Zhengxian Podao
     */
    @Override
    public MuZhengxianPodao create(long muZhengxianPodaoId) {
        MuZhengxianPodao muZhengxianPodao = new MuZhengxianPodaoImpl();

        muZhengxianPodao.setNew(true);
        muZhengxianPodao.setPrimaryKey(muZhengxianPodaoId);

        return muZhengxianPodao;
    }

    /**
     * Removes the Mgmt Unit of Zhengxian Podao with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param muZhengxianPodaoId the primary key of the Mgmt Unit of Zhengxian Podao
     * @return the Mgmt Unit of Zhengxian Podao that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuZhengxianPodao remove(long muZhengxianPodaoId)
        throws NoSuchMuZhengxianPodaoException, SystemException {
        return remove((Serializable) muZhengxianPodaoId);
    }

    /**
     * Removes the Mgmt Unit of Zhengxian Podao with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the Mgmt Unit of Zhengxian Podao
     * @return the Mgmt Unit of Zhengxian Podao that was removed
     * @throws com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuZhengxianPodao remove(Serializable primaryKey)
        throws NoSuchMuZhengxianPodaoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            MuZhengxianPodao muZhengxianPodao = (MuZhengxianPodao) session.get(MuZhengxianPodaoImpl.class,
                    primaryKey);

            if (muZhengxianPodao == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchMuZhengxianPodaoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(muZhengxianPodao);
        } catch (NoSuchMuZhengxianPodaoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected MuZhengxianPodao removeImpl(MuZhengxianPodao muZhengxianPodao)
        throws SystemException {
        muZhengxianPodao = toUnwrappedModel(muZhengxianPodao);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(muZhengxianPodao)) {
                muZhengxianPodao = (MuZhengxianPodao) session.get(MuZhengxianPodaoImpl.class,
                        muZhengxianPodao.getPrimaryKeyObj());
            }

            if (muZhengxianPodao != null) {
                session.delete(muZhengxianPodao);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (muZhengxianPodao != null) {
            clearCache(muZhengxianPodao);
        }

        return muZhengxianPodao;
    }

    @Override
    public MuZhengxianPodao updateImpl(
        com.lycenway.chr.backbone.model.MuZhengxianPodao muZhengxianPodao)
        throws SystemException {
        muZhengxianPodao = toUnwrappedModel(muZhengxianPodao);

        boolean isNew = muZhengxianPodao.isNew();

        Session session = null;

        try {
            session = openSession();

            if (muZhengxianPodao.isNew()) {
                session.save(muZhengxianPodao);

                muZhengxianPodao.setNew(false);
            } else {
                session.merge(muZhengxianPodao);
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

        EntityCacheUtil.putResult(MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
            MuZhengxianPodaoImpl.class, muZhengxianPodao.getPrimaryKey(),
            muZhengxianPodao);

        return muZhengxianPodao;
    }

    protected MuZhengxianPodao toUnwrappedModel(
        MuZhengxianPodao muZhengxianPodao) {
        if (muZhengxianPodao instanceof MuZhengxianPodaoImpl) {
            return muZhengxianPodao;
        }

        MuZhengxianPodaoImpl muZhengxianPodaoImpl = new MuZhengxianPodaoImpl();

        muZhengxianPodaoImpl.setNew(muZhengxianPodao.isNew());
        muZhengxianPodaoImpl.setPrimaryKey(muZhengxianPodao.getPrimaryKey());

        muZhengxianPodaoImpl.setHkey(muZhengxianPodao.getHkey());
        muZhengxianPodaoImpl.setMuZhengxianPodaoId(muZhengxianPodao.getMuZhengxianPodaoId());
        muZhengxianPodaoImpl.setGroupId(muZhengxianPodao.getGroupId());
        muZhengxianPodaoImpl.setCompanyId(muZhengxianPodao.getCompanyId());
        muZhengxianPodaoImpl.setUserId(muZhengxianPodao.getUserId());
        muZhengxianPodaoImpl.setUserName(muZhengxianPodao.getUserName());
        muZhengxianPodaoImpl.setCreateDate(muZhengxianPodao.getCreateDate());
        muZhengxianPodaoImpl.setModifiedDate(muZhengxianPodao.getModifiedDate());

        return muZhengxianPodaoImpl;
    }

    /**
     * Returns the Mgmt Unit of Zhengxian Podao with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit of Zhengxian Podao
     * @return the Mgmt Unit of Zhengxian Podao
     * @throws com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuZhengxianPodao findByPrimaryKey(Serializable primaryKey)
        throws NoSuchMuZhengxianPodaoException, SystemException {
        MuZhengxianPodao muZhengxianPodao = fetchByPrimaryKey(primaryKey);

        if (muZhengxianPodao == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchMuZhengxianPodaoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return muZhengxianPodao;
    }

    /**
     * Returns the Mgmt Unit of Zhengxian Podao with the primary key or throws a {@link com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException} if it could not be found.
     *
     * @param muZhengxianPodaoId the primary key of the Mgmt Unit of Zhengxian Podao
     * @return the Mgmt Unit of Zhengxian Podao
     * @throws com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuZhengxianPodao findByPrimaryKey(long muZhengxianPodaoId)
        throws NoSuchMuZhengxianPodaoException, SystemException {
        return findByPrimaryKey((Serializable) muZhengxianPodaoId);
    }

    /**
     * Returns the Mgmt Unit of Zhengxian Podao with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the Mgmt Unit of Zhengxian Podao
     * @return the Mgmt Unit of Zhengxian Podao, or <code>null</code> if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuZhengxianPodao fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        MuZhengxianPodao muZhengxianPodao = (MuZhengxianPodao) EntityCacheUtil.getResult(MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
                MuZhengxianPodaoImpl.class, primaryKey);

        if (muZhengxianPodao == _nullMuZhengxianPodao) {
            return null;
        }

        if (muZhengxianPodao == null) {
            Session session = null;

            try {
                session = openSession();

                muZhengxianPodao = (MuZhengxianPodao) session.get(MuZhengxianPodaoImpl.class,
                        primaryKey);

                if (muZhengxianPodao != null) {
                    cacheResult(muZhengxianPodao);
                } else {
                    EntityCacheUtil.putResult(MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
                        MuZhengxianPodaoImpl.class, primaryKey,
                        _nullMuZhengxianPodao);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(MuZhengxianPodaoModelImpl.ENTITY_CACHE_ENABLED,
                    MuZhengxianPodaoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return muZhengxianPodao;
    }

    /**
     * Returns the Mgmt Unit of Zhengxian Podao with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param muZhengxianPodaoId the primary key of the Mgmt Unit of Zhengxian Podao
     * @return the Mgmt Unit of Zhengxian Podao, or <code>null</code> if a Mgmt Unit of Zhengxian Podao with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MuZhengxianPodao fetchByPrimaryKey(long muZhengxianPodaoId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) muZhengxianPodaoId);
    }

    /**
     * Returns all the Mgmt Unit of Zhengxian Podaos.
     *
     * @return the Mgmt Unit of Zhengxian Podaos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuZhengxianPodao> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the Mgmt Unit of Zhengxian Podaos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuZhengxianPodaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Unit of Zhengxian Podaos
     * @param end the upper bound of the range of Mgmt Unit of Zhengxian Podaos (not inclusive)
     * @return the range of Mgmt Unit of Zhengxian Podaos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuZhengxianPodao> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the Mgmt Unit of Zhengxian Podaos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lycenway.chr.backbone.model.impl.MuZhengxianPodaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of Mgmt Unit of Zhengxian Podaos
     * @param end the upper bound of the range of Mgmt Unit of Zhengxian Podaos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of Mgmt Unit of Zhengxian Podaos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<MuZhengxianPodao> findAll(int start, int end,
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

        List<MuZhengxianPodao> list = (List<MuZhengxianPodao>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MUZHENGXIANPODAO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MUZHENGXIANPODAO;

                if (pagination) {
                    sql = sql.concat(MuZhengxianPodaoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<MuZhengxianPodao>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<MuZhengxianPodao>(list);
                } else {
                    list = (List<MuZhengxianPodao>) QueryUtil.list(q,
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
     * Removes all the Mgmt Unit of Zhengxian Podaos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (MuZhengxianPodao muZhengxianPodao : findAll()) {
            remove(muZhengxianPodao);
        }
    }

    /**
     * Returns the number of Mgmt Unit of Zhengxian Podaos.
     *
     * @return the number of Mgmt Unit of Zhengxian Podaos
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

                Query q = session.createQuery(_SQL_COUNT_MUZHENGXIANPODAO);

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
     * Initializes the Mgmt Unit of Zhengxian Podao persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lycenway.chr.backbone.model.MuZhengxianPodao")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<MuZhengxianPodao>> listenersList = new ArrayList<ModelListener<MuZhengxianPodao>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<MuZhengxianPodao>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(MuZhengxianPodaoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
