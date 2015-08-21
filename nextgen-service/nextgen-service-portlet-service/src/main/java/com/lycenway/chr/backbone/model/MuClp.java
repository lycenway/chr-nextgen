package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.lycenway.chr.backbone.service.ClpSerializer;
import com.lycenway.chr.backbone.service.MuLocalServiceUtil;
import com.lycenway.chr.backbone.service.persistence.MuPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MuClp extends BaseModelImpl<Mu> implements Mu {
    private String _hkey;
    private String _par;
    private String _title;
    private long _muId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _muRemoteModel;
    private Class<?> _clpSerializerClass = com.lycenway.chr.backbone.service.ClpSerializer.class;

    public MuClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Mu.class;
    }

    @Override
    public String getModelClassName() {
        return Mu.class.getName();
    }

    @Override
    public MuPK getPrimaryKey() {
        return new MuPK(_hkey, _muId);
    }

    @Override
    public void setPrimaryKey(MuPK primaryKey) {
        setHkey(primaryKey.hkey);
        setMuId(primaryKey.muId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new MuPK(_hkey, _muId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((MuPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("hkey", getHkey());
        attributes.put("par", getPar());
        attributes.put("title", getTitle());
        attributes.put("muId", getMuId());
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

        String par = (String) attributes.get("par");

        if (par != null) {
            setPar(par);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        Long muId = (Long) attributes.get("muId");

        if (muId != null) {
            setMuId(muId);
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

        if (_muRemoteModel != null) {
            try {
                Class<?> clazz = _muRemoteModel.getClass();

                Method method = clazz.getMethod("setHkey", String.class);

                method.invoke(_muRemoteModel, hkey);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPar() {
        return _par;
    }

    @Override
    public void setPar(String par) {
        _par = par;

        if (_muRemoteModel != null) {
            try {
                Class<?> clazz = _muRemoteModel.getClass();

                Method method = clazz.getMethod("setPar", String.class);

                method.invoke(_muRemoteModel, par);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;

        if (_muRemoteModel != null) {
            try {
                Class<?> clazz = _muRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_muRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getMuId() {
        return _muId;
    }

    @Override
    public void setMuId(long muId) {
        _muId = muId;

        if (_muRemoteModel != null) {
            try {
                Class<?> clazz = _muRemoteModel.getClass();

                Method method = clazz.getMethod("setMuId", long.class);

                method.invoke(_muRemoteModel, muId);
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

        if (_muRemoteModel != null) {
            try {
                Class<?> clazz = _muRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_muRemoteModel, groupId);
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

        if (_muRemoteModel != null) {
            try {
                Class<?> clazz = _muRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_muRemoteModel, companyId);
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

        if (_muRemoteModel != null) {
            try {
                Class<?> clazz = _muRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_muRemoteModel, userId);
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

        if (_muRemoteModel != null) {
            try {
                Class<?> clazz = _muRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_muRemoteModel, userName);
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

        if (_muRemoteModel != null) {
            try {
                Class<?> clazz = _muRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_muRemoteModel, createDate);
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

        if (_muRemoteModel != null) {
            try {
                Class<?> clazz = _muRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_muRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getMuRemoteModel() {
        return _muRemoteModel;
    }

    public void setMuRemoteModel(BaseModel<?> muRemoteModel) {
        _muRemoteModel = muRemoteModel;
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

        Class<?> remoteModelClass = _muRemoteModel.getClass();

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

        Object returnValue = method.invoke(_muRemoteModel, remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            MuLocalServiceUtil.addMu(this);
        } else {
            MuLocalServiceUtil.updateMu(this);
        }
    }

    @Override
    public Mu toEscapedModel() {
        return (Mu) ProxyUtil.newProxyInstance(Mu.class.getClassLoader(),
            new Class[] { Mu.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        MuClp clone = new MuClp();

        clone.setHkey(getHkey());
        clone.setPar(getPar());
        clone.setTitle(getTitle());
        clone.setMuId(getMuId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(Mu mu) {
        MuPK primaryKey = mu.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MuClp)) {
            return false;
        }

        MuClp mu = (MuClp) obj;

        MuPK primaryKey = mu.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{hkey=");
        sb.append(getHkey());
        sb.append(", par=");
        sb.append(getPar());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", muId=");
        sb.append(getMuId());
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
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.lycenway.chr.backbone.model.Mu");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>hkey</column-name><column-value><![CDATA[");
        sb.append(getHkey());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>par</column-name><column-value><![CDATA[");
        sb.append(getPar());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>muId</column-name><column-value><![CDATA[");
        sb.append(getMuId());
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
