package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.lycenway.chr.backbone.service.ClpSerializer;
import com.lycenway.chr.backbone.service.MuZhengxianPodaoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MuZhengxianPodaoClp extends BaseModelImpl<MuZhengxianPodao>
    implements MuZhengxianPodao {
    private String _hkey;
    private long _muZhengxianPodaoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _muZhengxianPodaoRemoteModel;
    private Class<?> _clpSerializerClass = com.lycenway.chr.backbone.service.ClpSerializer.class;

    public MuZhengxianPodaoClp() {
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
        return _hkey;
    }

    @Override
    public void setHkey(String hkey) {
        _hkey = hkey;

        if (_muZhengxianPodaoRemoteModel != null) {
            try {
                Class<?> clazz = _muZhengxianPodaoRemoteModel.getClass();

                Method method = clazz.getMethod("setHkey", String.class);

                method.invoke(_muZhengxianPodaoRemoteModel, hkey);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getMuZhengxianPodaoId() {
        return _muZhengxianPodaoId;
    }

    @Override
    public void setMuZhengxianPodaoId(long muZhengxianPodaoId) {
        _muZhengxianPodaoId = muZhengxianPodaoId;

        if (_muZhengxianPodaoRemoteModel != null) {
            try {
                Class<?> clazz = _muZhengxianPodaoRemoteModel.getClass();

                Method method = clazz.getMethod("setMuZhengxianPodaoId",
                        long.class);

                method.invoke(_muZhengxianPodaoRemoteModel, muZhengxianPodaoId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_muZhengxianPodaoRemoteModel != null) {
            try {
                Class<?> clazz = _muZhengxianPodaoRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_muZhengxianPodaoRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_muZhengxianPodaoRemoteModel != null) {
            try {
                Class<?> clazz = _muZhengxianPodaoRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_muZhengxianPodaoRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_muZhengxianPodaoRemoteModel != null) {
            try {
                Class<?> clazz = _muZhengxianPodaoRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_muZhengxianPodaoRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
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
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_muZhengxianPodaoRemoteModel != null) {
            try {
                Class<?> clazz = _muZhengxianPodaoRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_muZhengxianPodaoRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_muZhengxianPodaoRemoteModel != null) {
            try {
                Class<?> clazz = _muZhengxianPodaoRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_muZhengxianPodaoRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_muZhengxianPodaoRemoteModel != null) {
            try {
                Class<?> clazz = _muZhengxianPodaoRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_muZhengxianPodaoRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getMuZhengxianPodaoRemoteModel() {
        return _muZhengxianPodaoRemoteModel;
    }

    public void setMuZhengxianPodaoRemoteModel(
        BaseModel<?> muZhengxianPodaoRemoteModel) {
        _muZhengxianPodaoRemoteModel = muZhengxianPodaoRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _muZhengxianPodaoRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_muZhengxianPodaoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            MuZhengxianPodaoLocalServiceUtil.addMuZhengxianPodao(this);
        } else {
            MuZhengxianPodaoLocalServiceUtil.updateMuZhengxianPodao(this);
        }
    }

    @Override
    public MuZhengxianPodao toEscapedModel() {
        return (MuZhengxianPodao) ProxyUtil.newProxyInstance(MuZhengxianPodao.class.getClassLoader(),
            new Class[] { MuZhengxianPodao.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        MuZhengxianPodaoClp clone = new MuZhengxianPodaoClp();

        clone.setHkey(getHkey());
        clone.setMuZhengxianPodaoId(getMuZhengxianPodaoId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
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

        if (!(obj instanceof MuZhengxianPodaoClp)) {
            return false;
        }

        MuZhengxianPodaoClp muZhengxianPodao = (MuZhengxianPodaoClp) obj;

        long primaryKey = muZhengxianPodao.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
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
