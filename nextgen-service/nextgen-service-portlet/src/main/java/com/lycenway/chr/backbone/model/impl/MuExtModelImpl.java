package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.lycenway.chr.backbone.model.MuExt;
import com.lycenway.chr.backbone.model.MuExtModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the MuExt service. Represents a row in the &quot;base_mu_ext&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lycenway.chr.backbone.model.MuExtModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MuExtImpl}.
 * </p>
 *
 * @author lycenway
 * @see MuExtImpl
 * @see com.lycenway.chr.backbone.model.MuExt
 * @see com.lycenway.chr.backbone.model.MuExtModel
 * @generated
 */
public class MuExtModelImpl extends BaseModelImpl<MuExt> implements MuExtModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a Mgmt Unit Extended Attributes model instance should use the {@link com.lycenway.chr.backbone.model.MuExt} interface instead.
     */
    public static final String TABLE_NAME = "base_mu_ext";
    public static final Object[][] TABLE_COLUMNS = {
            { "hkey", Types.VARCHAR },
            { "value", Types.VARCHAR },
            { "muExtId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "key_", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table base_mu_ext (hkey VARCHAR(75) null,value VARCHAR(75) null,muExtId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,key_ VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table base_mu_ext";
    public static final String ORDER_BY_JPQL = " ORDER BY muExt.muExtId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY base_mu_ext.muExtId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.lycenway.chr.backbone.model.MuExt"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.lycenway.chr.backbone.model.MuExt"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.lycenway.chr.backbone.model.MuExt"));
    private static ClassLoader _classLoader = MuExt.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { MuExt.class };
    private String _hkey;
    private String _value;
    private long _muExtId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _key;
    private MuExt _escapedModel;

    public MuExtModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _muExtId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setMuExtId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _muExtId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return MuExt.class;
    }

    @Override
    public String getModelClassName() {
        return MuExt.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("hkey", getHkey());
        attributes.put("value", getValue());
        attributes.put("muExtId", getMuExtId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("key", getKey());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String hkey = (String) attributes.get("hkey");

        if (hkey != null) {
            setHkey(hkey);
        }

        String value = (String) attributes.get("value");

        if (value != null) {
            setValue(value);
        }

        Long muExtId = (Long) attributes.get("muExtId");

        if (muExtId != null) {
            setMuExtId(muExtId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String key = (String) attributes.get("key");

        if (key != null) {
            setKey(key);
        }
    }

    @Override
    public String getHkey() {
        if (_hkey == null) {
            return StringPool.BLANK;
        } else {
            return _hkey;
        }
    }

    @Override
    public void setHkey(String hkey) {
        _hkey = hkey;
    }

    @Override
    public String getValue() {
        if (_value == null) {
            return StringPool.BLANK;
        } else {
            return _value;
        }
    }

    @Override
    public void setValue(String value) {
        _value = value;
    }

    @Override
    public long getMuExtId() {
        return _muExtId;
    }

    @Override
    public void setMuExtId(long muExtId) {
        _muExtId = muExtId;
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @Override
    public String getKey() {
        if (_key == null) {
            return StringPool.BLANK;
        } else {
            return _key;
        }
    }

    @Override
    public void setKey(String key) {
        _key = key;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            MuExt.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public MuExt toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (MuExt) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        MuExtImpl muExtImpl = new MuExtImpl();

        muExtImpl.setHkey(getHkey());
        muExtImpl.setValue(getValue());
        muExtImpl.setMuExtId(getMuExtId());
        muExtImpl.setGroupId(getGroupId());
        muExtImpl.setCompanyId(getCompanyId());
        muExtImpl.setUserId(getUserId());
        muExtImpl.setUserName(getUserName());
        muExtImpl.setCreateDate(getCreateDate());
        muExtImpl.setModifiedDate(getModifiedDate());
        muExtImpl.setKey(getKey());

        muExtImpl.resetOriginalValues();

        return muExtImpl;
    }

    @Override
    public int compareTo(MuExt muExt) {
        long primaryKey = muExt.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MuExt)) {
            return false;
        }

        MuExt muExt = (MuExt) obj;

        long primaryKey = muExt.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<MuExt> toCacheModel() {
        MuExtCacheModel muExtCacheModel = new MuExtCacheModel();

        muExtCacheModel.hkey = getHkey();

        String hkey = muExtCacheModel.hkey;

        if ((hkey != null) && (hkey.length() == 0)) {
            muExtCacheModel.hkey = null;
        }

        muExtCacheModel.value = getValue();

        String value = muExtCacheModel.value;

        if ((value != null) && (value.length() == 0)) {
            muExtCacheModel.value = null;
        }

        muExtCacheModel.muExtId = getMuExtId();

        muExtCacheModel.groupId = getGroupId();

        muExtCacheModel.companyId = getCompanyId();

        muExtCacheModel.userId = getUserId();

        muExtCacheModel.userName = getUserName();

        String userName = muExtCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            muExtCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            muExtCacheModel.createDate = createDate.getTime();
        } else {
            muExtCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            muExtCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            muExtCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        muExtCacheModel.key = getKey();

        String key = muExtCacheModel.key;

        if ((key != null) && (key.length() == 0)) {
            muExtCacheModel.key = null;
        }

        return muExtCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{hkey=");
        sb.append(getHkey());
        sb.append(", value=");
        sb.append(getValue());
        sb.append(", muExtId=");
        sb.append(getMuExtId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", key=");
        sb.append(getKey());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.lycenway.chr.backbone.model.MuExt");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>hkey</column-name><column-value><![CDATA[");
        sb.append(getHkey());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>value</column-name><column-value><![CDATA[");
        sb.append(getValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>muExtId</column-name><column-value><![CDATA[");
        sb.append(getMuExtId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>key</column-name><column-value><![CDATA[");
        sb.append(getKey());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
