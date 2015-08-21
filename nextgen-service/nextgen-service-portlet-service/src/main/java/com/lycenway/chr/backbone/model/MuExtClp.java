package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.lycenway.chr.backbone.service.ClpSerializer;
import com.lycenway.chr.backbone.service.MuExtLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MuExtClp extends BaseModelImpl<MuExt> implements MuExt {
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
    private BaseModel<?> _muExtRemoteModel;
    private Class<?> _clpSerializerClass = com.lycenway.chr.backbone.service.ClpSerializer.class;

    public MuExtClp() {
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
        return _hkey;
    }

    @Override
    public void setHkey(String hkey) {
        _hkey = hkey;

        if (_muExtRemoteModel != null) {
            try {
                Class<?> clazz = _muExtRemoteModel.getClass();

                Method method = clazz.getMethod("setHkey", String.class);

                method.invoke(_muExtRemoteModel, hkey);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getValue() {
        return _value;
    }

    @Override
    public void setValue(String value) {
        _value = value;

        if (_muExtRemoteModel != null) {
            try {
                Class<?> clazz = _muExtRemoteModel.getClass();

                Method method = clazz.getMethod("setValue", String.class);

                method.invoke(_muExtRemoteModel, value);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getMuExtId() {
        return _muExtId;
    }

    @Override
    public void setMuExtId(long muExtId) {
        _muExtId = muExtId;

        if (_muExtRemoteModel != null) {
            try {
                Class<?> clazz = _muExtRemoteModel.getClass();

                Method method = clazz.getMethod("setMuExtId", long.class);

                method.invoke(_muExtRemoteModel, muExtId);
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

        if (_muExtRemoteModel != null) {
            try {
                Class<?> clazz = _muExtRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_muExtRemoteModel, groupId);
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

        if (_muExtRemoteModel != null) {
            try {
                Class<?> clazz = _muExtRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_muExtRemoteModel, companyId);
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

        if (_muExtRemoteModel != null) {
            try {
                Class<?> clazz = _muExtRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_muExtRemoteModel, userId);
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

        if (_muExtRemoteModel != null) {
            try {
                Class<?> clazz = _muExtRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_muExtRemoteModel, userName);
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

        if (_muExtRemoteModel != null) {
            try {
                Class<?> clazz = _muExtRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_muExtRemoteModel, createDate);
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

        if (_muExtRemoteModel != null) {
            try {
                Class<?> clazz = _muExtRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_muExtRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKey() {
        return _key;
    }

    @Override
    public void setKey(String key) {
        _key = key;

        if (_muExtRemoteModel != null) {
            try {
                Class<?> clazz = _muExtRemoteModel.getClass();

                Method method = clazz.getMethod("setKey", String.class);

                method.invoke(_muExtRemoteModel, key);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getMuExtRemoteModel() {
        return _muExtRemoteModel;
    }

    public void setMuExtRemoteModel(BaseModel<?> muExtRemoteModel) {
        _muExtRemoteModel = muExtRemoteModel;
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

        Class<?> remoteModelClass = _muExtRemoteModel.getClass();

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

        Object returnValue = method.invoke(_muExtRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            MuExtLocalServiceUtil.addMuExt(this);
        } else {
            MuExtLocalServiceUtil.updateMuExt(this);
        }
    }

    @Override
    public MuExt toEscapedModel() {
        return (MuExt) ProxyUtil.newProxyInstance(MuExt.class.getClassLoader(),
            new Class[] { MuExt.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        MuExtClp clone = new MuExtClp();

        clone.setHkey(getHkey());
        clone.setValue(getValue());
        clone.setMuExtId(getMuExtId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setKey(getKey());

        return clone;
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

        if (!(obj instanceof MuExtClp)) {
            return false;
        }

        MuExtClp muExt = (MuExtClp) obj;

        long primaryKey = muExt.getPrimaryKey();

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
