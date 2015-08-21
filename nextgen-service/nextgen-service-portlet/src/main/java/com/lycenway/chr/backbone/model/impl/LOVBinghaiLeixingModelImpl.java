package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.lycenway.chr.backbone.model.LOVBinghaiLeixing;
import com.lycenway.chr.backbone.model.LOVBinghaiLeixingModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LOVBinghaiLeixing service. Represents a row in the &quot;lov_binghai_leixing&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lycenway.chr.backbone.model.LOVBinghaiLeixingModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LOVBinghaiLeixingImpl}.
 * </p>
 *
 * @author lycenway
 * @see LOVBinghaiLeixingImpl
 * @see com.lycenway.chr.backbone.model.LOVBinghaiLeixing
 * @see com.lycenway.chr.backbone.model.LOVBinghaiLeixingModel
 * @generated
 */
public class LOVBinghaiLeixingModelImpl extends BaseModelImpl<LOVBinghaiLeixing>
    implements LOVBinghaiLeixingModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a List of Value Binghai Leixing - Case Type model instance should use the {@link com.lycenway.chr.backbone.model.LOVBinghaiLeixing} interface instead.
     */
    public static final String TABLE_NAME = "lov_binghai_leixing";
    public static final Object[][] TABLE_COLUMNS = {
            { "code", Types.VARCHAR },
            { "title", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table lov_binghai_leixing (code VARCHAR(75) not null primary key,title VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table lov_binghai_leixing";
    public static final String ORDER_BY_JPQL = " ORDER BY lovBinghaiLeixing.code ASC";
    public static final String ORDER_BY_SQL = " ORDER BY lov_binghai_leixing.code ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.lycenway.chr.backbone.model.LOVBinghaiLeixing"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.lycenway.chr.backbone.model.LOVBinghaiLeixing"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.lycenway.chr.backbone.model.LOVBinghaiLeixing"));
    private static ClassLoader _classLoader = LOVBinghaiLeixing.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LOVBinghaiLeixing.class
        };
    private String _code;
    private String _title;
    private LOVBinghaiLeixing _escapedModel;

    public LOVBinghaiLeixingModelImpl() {
    }

    @Override
    public String getPrimaryKey() {
        return _code;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setCode(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _code;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return LOVBinghaiLeixing.class;
    }

    @Override
    public String getModelClassName() {
        return LOVBinghaiLeixing.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("code", getCode());
        attributes.put("title", getTitle());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String code = (String) attributes.get("code");

        if (code != null) {
            setCode(code);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }
    }

    @Override
    public String getCode() {
        if (_code == null) {
            return StringPool.BLANK;
        } else {
            return _code;
        }
    }

    @Override
    public void setCode(String code) {
        _code = code;
    }

    @Override
    public String getTitle() {
        if (_title == null) {
            return StringPool.BLANK;
        } else {
            return _title;
        }
    }

    @Override
    public void setTitle(String title) {
        _title = title;
    }

    @Override
    public LOVBinghaiLeixing toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LOVBinghaiLeixing) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LOVBinghaiLeixingImpl lovBinghaiLeixingImpl = new LOVBinghaiLeixingImpl();

        lovBinghaiLeixingImpl.setCode(getCode());
        lovBinghaiLeixingImpl.setTitle(getTitle());

        lovBinghaiLeixingImpl.resetOriginalValues();

        return lovBinghaiLeixingImpl;
    }

    @Override
    public int compareTo(LOVBinghaiLeixing lovBinghaiLeixing) {
        String primaryKey = lovBinghaiLeixing.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LOVBinghaiLeixing)) {
            return false;
        }

        LOVBinghaiLeixing lovBinghaiLeixing = (LOVBinghaiLeixing) obj;

        String primaryKey = lovBinghaiLeixing.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<LOVBinghaiLeixing> toCacheModel() {
        LOVBinghaiLeixingCacheModel lovBinghaiLeixingCacheModel = new LOVBinghaiLeixingCacheModel();

        lovBinghaiLeixingCacheModel.code = getCode();

        String code = lovBinghaiLeixingCacheModel.code;

        if ((code != null) && (code.length() == 0)) {
            lovBinghaiLeixingCacheModel.code = null;
        }

        lovBinghaiLeixingCacheModel.title = getTitle();

        String title = lovBinghaiLeixingCacheModel.title;

        if ((title != null) && (title.length() == 0)) {
            lovBinghaiLeixingCacheModel.title = null;
        }

        return lovBinghaiLeixingCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{code=");
        sb.append(getCode());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.lycenway.chr.backbone.model.LOVBinghaiLeixing");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>code</column-name><column-value><![CDATA[");
        sb.append(getCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}