package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.lycenway.chr.backbone.service.ClpSerializer;
import com.lycenway.chr.backbone.service.MuQuxianQujianLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MuQuxianQujianClp extends BaseModelImpl<MuQuxianQujian>
    implements MuQuxianQujian {
    private String _hkey;
    private long _muQuxianQujianId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _muQuxianQujianRemoteModel;
    private Class<?> _clpSerializerClass = com.lycenway.chr.backbone.service.ClpSerializer.class;

    public MuQuxianQujianClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return MuQuxianQujian.class;
    }

    @Override
    public String getModelClassName() {
        return MuQuxianQujian.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _muQuxianQujianId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setMuQuxianQujianId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _muQuxianQujianId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("hkey", getHkey());
        attributes.put("muQuxianQujianId", getMuQuxianQujianId());
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

        Long muQuxianQujianId = (Long) attributes.get("muQuxianQujianId");

        if (muQuxianQujianId != null) {
            setMuQuxianQujianId(muQuxianQujianId);
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

        if (_muQuxianQujianRemoteModel != null) {
            try {
                Class<?> clazz = _muQuxianQujianRemoteModel.getClass();

                Method method = clazz.getMethod("setHkey", String.class);

                method.invoke(_muQuxianQujianRemoteModel, hkey);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getMuQuxianQujianId() {
        return _muQuxianQujianId;
    }

    @Override
    public void setMuQuxianQujianId(long muQuxianQujianId) {
        _muQuxianQujianId = muQuxianQujianId;

        if (_muQuxianQujianRemoteModel != null) {
            try {
                Class<?> clazz = _muQuxianQujianRemoteModel.getClass();

                Method method = clazz.getMethod("setMuQuxianQujianId",
                        long.class);

                method.invoke(_muQuxianQujianRemoteModel, muQuxianQujianId);
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

        if (_muQuxianQujianRemoteModel != null) {
            try {
                Class<?> clazz = _muQuxianQujianRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_muQuxianQujianRemoteModel, groupId);
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

        if (_muQuxianQujianRemoteModel != null) {
            try {
                Class<?> clazz = _muQuxianQujianRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_muQuxianQujianRemoteModel, companyId);
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

        if (_muQuxianQujianRemoteModel != null) {
            try {
                Class<?> clazz = _muQuxianQujianRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_muQuxianQujianRemoteModel, userId);
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

        if (_muQuxianQujianRemoteModel != null) {
            try {
                Class<?> clazz = _muQuxianQujianRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_muQuxianQujianRemoteModel, userName);
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

        if (_muQuxianQujianRemoteModel != null) {
            try {
                Class<?> clazz = _muQuxianQujianRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_muQuxianQujianRemoteModel, createDate);
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

        if (_muQuxianQujianRemoteModel != null) {
            try {
                Class<?> clazz = _muQuxianQujianRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_muQuxianQujianRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getMuQuxianQujianRemoteModel() {
        return _muQuxianQujianRemoteModel;
    }

    public void setMuQuxianQujianRemoteModel(
        BaseModel<?> muQuxianQujianRemoteModel) {
        _muQuxianQujianRemoteModel = muQuxianQujianRemoteModel;
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

        Class<?> remoteModelClass = _muQuxianQujianRemoteModel.getClass();

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

        Object returnValue = method.invoke(_muQuxianQujianRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            MuQuxianQujianLocalServiceUtil.addMuQuxianQujian(this);
        } else {
            MuQuxianQujianLocalServiceUtil.updateMuQuxianQujian(this);
        }
    }

    @Override
    public MuQuxianQujian toEscapedModel() {
        return (MuQuxianQujian) ProxyUtil.newProxyInstance(MuQuxianQujian.class.getClassLoader(),
            new Class[] { MuQuxianQujian.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        MuQuxianQujianClp clone = new MuQuxianQujianClp();

        clone.setHkey(getHkey());
        clone.setMuQuxianQujianId(getMuQuxianQujianId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(MuQuxianQujian muQuxianQujian) {
        long primaryKey = muQuxianQujian.getPrimaryKey();

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

        if (!(obj instanceof MuQuxianQujianClp)) {
            return false;
        }

        MuQuxianQujianClp muQuxianQujian = (MuQuxianQujianClp) obj;

        long primaryKey = muQuxianQujian.getPrimaryKey();

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
        sb.append(", muQuxianQujianId=");
        sb.append(getMuQuxianQujianId());
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
        sb.append("com.lycenway.chr.backbone.model.MuQuxianQujian");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>hkey</column-name><column-value><![CDATA[");
        sb.append(getHkey());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>muQuxianQujianId</column-name><column-value><![CDATA[");
        sb.append(getMuQuxianQujianId());
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
