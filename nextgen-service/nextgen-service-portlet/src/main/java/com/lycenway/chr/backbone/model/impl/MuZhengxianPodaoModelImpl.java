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

import com.lycenway.chr.backbone.model.MuZhengxianPodao;
import com.lycenway.chr.backbone.model.MuZhengxianPodaoModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the MuZhengxianPodao service. Represents a row in the &quot;base_mu_zhengxian_podao&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lycenway.chr.backbone.model.MuZhengxianPodaoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MuZhengxianPodaoImpl}.
 * </p>
 *
 * @author lycenway
 * @see MuZhengxianPodaoImpl
 * @see com.lycenway.chr.backbone.model.MuZhengxianPodao
 * @see com.lycenway.chr.backbone.model.MuZhengxianPodaoModel
 * @generated
 */
public class MuZhengxianPodaoModelImpl extends BaseModelImpl<MuZhengxianPodao>
    implements MuZhengxianPodaoModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a Mgmt Unit of Zhengxian Podao model instance should use the {@link com.lycenway.chr.backbone.model.MuZhengxianPodao} interface instead.
     */
    public static final String TABLE_NAME = "base_mu_zhengxian_podao";
    public static final Object[][] TABLE_COLUMNS = {
            { "hkey", Types.VARCHAR },
            { "muZhengxianPodaoId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table base_mu_zhengxian_podao (hkey VARCHAR(75) null,muZhengxianPodaoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
    public static final String TABLE_SQL_DROP = "drop table base_mu_zhengxian_podao";
    public static final String ORDER_BY_JPQL = " ORDER BY muZhengxianPodao.muZhengxianPodaoId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY base_mu_zhengxian_podao.muZhengxianPodaoId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.lycenway.chr.backbone.model.MuZhengxianPodao"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.lycenway.chr.backbone.model.MuZhengxianPodao"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.lycenway.chr.backbone.model.MuZhengxianPodao"));
    private static ClassLoader _classLoader = MuZhengxianPodao.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            MuZhengxianPodao.class
        };
    private String _hkey;
    private long _muZhengxianPodaoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private MuZhengxianPodao _escapedModel;

    public MuZhengxianPodaoModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _muZhengxianPodaoId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setMuZhengxianPodaoId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _muZhengxianPodaoId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return MuZhengxianPodao.class;
    }

    @Override
    public String getModelClassName() {
        return MuZhengxianPodao.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("hkey", getHkey());
        attributes.put("muZhengxianPodaoId", getMuZhengxianPodaoId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String hkey = (String) attributes.get("hkey");

        if (hkey != null) {
            setHkey(hkey);
        }

        Long muZhengxianPodaoId = (Long) attributes.get("muZhengxianPodaoId");

        if (muZhengxianPodaoId != null) {
            setMuZhengxianPodaoId(muZhengxianPodaoId);
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
    public long getMuZhengxianPodaoId() {
        return _muZhengxianPodaoId;
    }

    @Override
    public void setMuZhengxianPodaoId(long muZhengxianPodaoId) {
        _muZhengxianPodaoId = muZhengxianPodaoId;
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
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            MuZhengxianPodao.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public MuZhengxianPodao toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (MuZhengxianPodao) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        MuZhengxianPodaoImpl muZhengxianPodaoImpl = new MuZhengxianPodaoImpl();

        muZhengxianPodaoImpl.setHkey(getHkey());
        muZhengxianPodaoImpl.setMuZhengxianPodaoId(getMuZhengxianPodaoId());
        muZhengxianPodaoImpl.setGroupId(getGroupId());
        muZhengxianPodaoImpl.setCompanyId(getCompanyId());
        muZhengxianPodaoImpl.setUserId(getUserId());
        muZhengxianPodaoImpl.setUserName(getUserName());
        muZhengxianPodaoImpl.setCreateDate(getCreateDate());
        muZhengxianPodaoImpl.setModifiedDate(getModifiedDate());

        muZhengxianPodaoImpl.resetOriginalValues();

        return muZhengxianPodaoImpl;
    }

    @Override
    public int compareTo(MuZhengxianPodao muZhengxianPodao) {
        long primaryKey = muZhengxianPodao.getPrimaryKey();

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

        if (!(obj instanceof MuZhengxianPodao)) {
            return false;
        }

        MuZhengxianPodao muZhengxianPodao = (MuZhengxianPodao) obj;

        long primaryKey = muZhengxianPodao.getPrimaryKey();

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
    public CacheModel<MuZhengxianPodao> toCacheModel() {
        MuZhengxianPodaoCacheModel muZhengxianPodaoCacheModel = new MuZhengxianPodaoCacheModel();

        muZhengxianPodaoCacheModel.hkey = getHkey();

        String hkey = muZhengxianPodaoCacheModel.hkey;

        if ((hkey != null) && (hkey.length() == 0)) {
            muZhengxianPodaoCacheModel.hkey = null;
        }

        muZhengxianPodaoCacheModel.muZhengxianPodaoId = getMuZhengxianPodaoId();

        muZhengxianPodaoCacheModel.groupId = getGroupId();

        muZhengxianPodaoCacheModel.companyId = getCompanyId();

        muZhengxianPodaoCacheModel.userId = getUserId();

        muZhengxianPodaoCacheModel.userName = getUserName();

        String userName = muZhengxianPodaoCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            muZhengxianPodaoCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            muZhengxianPodaoCacheModel.createDate = createDate.getTime();
        } else {
            muZhengxianPodaoCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            muZhengxianPodaoCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            muZhengxianPodaoCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        return muZhengxianPodaoCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{hkey=");
        sb.append(getHkey());
        sb.append(", muZhengxianPodaoId=");
        sb.append(getMuZhengxianPodaoId());
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
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("com.lycenway.chr.backbone.model.MuZhengxianPodao");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>hkey</column-name><column-value><![CDATA[");
        sb.append(getHkey());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>muZhengxianPodaoId</column-name><column-value><![CDATA[");
        sb.append(getMuZhengxianPodaoId());
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

        sb.append("</model>");

        return sb.toString();
    }
}
