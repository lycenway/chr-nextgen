package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.lycenway.chr.backbone.service.BinghaiProofLocalServiceUtil;
import com.lycenway.chr.backbone.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BinghaiProofClp extends BaseModelImpl<BinghaiProof>
    implements BinghaiProof {
    private String _mime;
    private String _url;
    private String _binghaiId;
    private long _binghaiProofId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _binghaiProofRemoteModel;
    private Class<?> _clpSerializerClass = com.lycenway.chr.backbone.service.ClpSerializer.class;

    public BinghaiProofClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return BinghaiProof.class;
    }

    @Override
    public String getModelClassName() {
        return BinghaiProof.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _binghaiProofId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBinghaiProofId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _binghaiProofId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("mime", getMime());
        attributes.put("url", getUrl());
        attributes.put("binghaiId", getBinghaiId());
        attributes.put("binghaiProofId", getBinghaiProofId());
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
        String mime = (String) attributes.get("mime");

        if (mime != null) {
            setMime(mime);
        }

        String url = (String) attributes.get("url");

        if (url != null) {
            setUrl(url);
        }

        String binghaiId = (String) attributes.get("binghaiId");

        if (binghaiId != null) {
            setBinghaiId(binghaiId);
        }

        Long binghaiProofId = (Long) attributes.get("binghaiProofId");

        if (binghaiProofId != null) {
            setBinghaiProofId(binghaiProofId);
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
    public String getMime() {
        return _mime;
    }

    @Override
    public void setMime(String mime) {
        _mime = mime;

        if (_binghaiProofRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiProofRemoteModel.getClass();

                Method method = clazz.getMethod("setMime", String.class);

                method.invoke(_binghaiProofRemoteModel, mime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUrl() {
        return _url;
    }

    @Override
    public void setUrl(String url) {
        _url = url;

        if (_binghaiProofRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiProofRemoteModel.getClass();

                Method method = clazz.getMethod("setUrl", String.class);

                method.invoke(_binghaiProofRemoteModel, url);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBinghaiId() {
        return _binghaiId;
    }

    @Override
    public void setBinghaiId(String binghaiId) {
        _binghaiId = binghaiId;

        if (_binghaiProofRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiProofRemoteModel.getClass();

                Method method = clazz.getMethod("setBinghaiId", String.class);

                method.invoke(_binghaiProofRemoteModel, binghaiId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBinghaiProofId() {
        return _binghaiProofId;
    }

    @Override
    public void setBinghaiProofId(long binghaiProofId) {
        _binghaiProofId = binghaiProofId;

        if (_binghaiProofRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiProofRemoteModel.getClass();

                Method method = clazz.getMethod("setBinghaiProofId", long.class);

                method.invoke(_binghaiProofRemoteModel, binghaiProofId);
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

        if (_binghaiProofRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiProofRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_binghaiProofRemoteModel, groupId);
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

        if (_binghaiProofRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiProofRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_binghaiProofRemoteModel, companyId);
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

        if (_binghaiProofRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiProofRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_binghaiProofRemoteModel, userId);
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

        if (_binghaiProofRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiProofRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_binghaiProofRemoteModel, userName);
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

        if (_binghaiProofRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiProofRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_binghaiProofRemoteModel, createDate);
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

        if (_binghaiProofRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiProofRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_binghaiProofRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBinghaiProofRemoteModel() {
        return _binghaiProofRemoteModel;
    }

    public void setBinghaiProofRemoteModel(BaseModel<?> binghaiProofRemoteModel) {
        _binghaiProofRemoteModel = binghaiProofRemoteModel;
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

        Class<?> remoteModelClass = _binghaiProofRemoteModel.getClass();

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

        Object returnValue = method.invoke(_binghaiProofRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BinghaiProofLocalServiceUtil.addBinghaiProof(this);
        } else {
            BinghaiProofLocalServiceUtil.updateBinghaiProof(this);
        }
    }

    @Override
    public BinghaiProof toEscapedModel() {
        return (BinghaiProof) ProxyUtil.newProxyInstance(BinghaiProof.class.getClassLoader(),
            new Class[] { BinghaiProof.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BinghaiProofClp clone = new BinghaiProofClp();

        clone.setMime(getMime());
        clone.setUrl(getUrl());
        clone.setBinghaiId(getBinghaiId());
        clone.setBinghaiProofId(getBinghaiProofId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(BinghaiProof binghaiProof) {
        long primaryKey = binghaiProof.getPrimaryKey();

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

        if (!(obj instanceof BinghaiProofClp)) {
            return false;
        }

        BinghaiProofClp binghaiProof = (BinghaiProofClp) obj;

        long primaryKey = binghaiProof.getPrimaryKey();

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

        sb.append("{mime=");
        sb.append(getMime());
        sb.append(", url=");
        sb.append(getUrl());
        sb.append(", binghaiId=");
        sb.append(getBinghaiId());
        sb.append(", binghaiProofId=");
        sb.append(getBinghaiProofId());
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
        sb.append("com.lycenway.chr.backbone.model.BinghaiProof");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>mime</column-name><column-value><![CDATA[");
        sb.append(getMime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>url</column-name><column-value><![CDATA[");
        sb.append(getUrl());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>binghaiId</column-name><column-value><![CDATA[");
        sb.append(getBinghaiId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>binghaiProofId</column-name><column-value><![CDATA[");
        sb.append(getBinghaiProofId());
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
