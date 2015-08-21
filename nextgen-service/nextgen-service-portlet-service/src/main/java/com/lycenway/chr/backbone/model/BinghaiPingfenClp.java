package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.lycenway.chr.backbone.service.BinghaiPingfenLocalServiceUtil;
import com.lycenway.chr.backbone.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BinghaiPingfenClp extends BaseModelImpl<BinghaiPingfen>
    implements BinghaiPingfen {
    private long _binghaiPingfenId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _dalei;
    private double _vmin;
    private double _vmax;
    private String _xiangmu;
    private String _dengji;
    private double _dengji_min;
    private double _dengji_max;
    private BaseModel<?> _binghaiPingfenRemoteModel;
    private Class<?> _clpSerializerClass = com.lycenway.chr.backbone.service.ClpSerializer.class;

    public BinghaiPingfenClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return BinghaiPingfen.class;
    }

    @Override
    public String getModelClassName() {
        return BinghaiPingfen.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _binghaiPingfenId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBinghaiPingfenId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _binghaiPingfenId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("binghaiPingfenId", getBinghaiPingfenId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("dalei", getDalei());
        attributes.put("vmin", getVmin());
        attributes.put("vmax", getVmax());
        attributes.put("xiangmu", getXiangmu());
        attributes.put("dengji", getDengji());
        attributes.put("dengji_min", getDengji_min());
        attributes.put("dengji_max", getDengji_max());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long binghaiPingfenId = (Long) attributes.get("binghaiPingfenId");

        if (binghaiPingfenId != null) {
            setBinghaiPingfenId(binghaiPingfenId);
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

        String dalei = (String) attributes.get("dalei");

        if (dalei != null) {
            setDalei(dalei);
        }

        Double vmin = (Double) attributes.get("vmin");

        if (vmin != null) {
            setVmin(vmin);
        }

        Double vmax = (Double) attributes.get("vmax");

        if (vmax != null) {
            setVmax(vmax);
        }

        String xiangmu = (String) attributes.get("xiangmu");

        if (xiangmu != null) {
            setXiangmu(xiangmu);
        }

        String dengji = (String) attributes.get("dengji");

        if (dengji != null) {
            setDengji(dengji);
        }

        Double dengji_min = (Double) attributes.get("dengji_min");

        if (dengji_min != null) {
            setDengji_min(dengji_min);
        }

        Double dengji_max = (Double) attributes.get("dengji_max");

        if (dengji_max != null) {
            setDengji_max(dengji_max);
        }
    }

    @Override
    public long getBinghaiPingfenId() {
        return _binghaiPingfenId;
    }

    @Override
    public void setBinghaiPingfenId(long binghaiPingfenId) {
        _binghaiPingfenId = binghaiPingfenId;

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setBinghaiPingfenId",
                        long.class);

                method.invoke(_binghaiPingfenRemoteModel, binghaiPingfenId);
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

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_binghaiPingfenRemoteModel, groupId);
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

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_binghaiPingfenRemoteModel, companyId);
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

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_binghaiPingfenRemoteModel, userId);
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

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_binghaiPingfenRemoteModel, userName);
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

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_binghaiPingfenRemoteModel, createDate);
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

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_binghaiPingfenRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDalei() {
        return _dalei;
    }

    @Override
    public void setDalei(String dalei) {
        _dalei = dalei;

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setDalei", String.class);

                method.invoke(_binghaiPingfenRemoteModel, dalei);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getVmin() {
        return _vmin;
    }

    @Override
    public void setVmin(double vmin) {
        _vmin = vmin;

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setVmin", double.class);

                method.invoke(_binghaiPingfenRemoteModel, vmin);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getVmax() {
        return _vmax;
    }

    @Override
    public void setVmax(double vmax) {
        _vmax = vmax;

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setVmax", double.class);

                method.invoke(_binghaiPingfenRemoteModel, vmax);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getXiangmu() {
        return _xiangmu;
    }

    @Override
    public void setXiangmu(String xiangmu) {
        _xiangmu = xiangmu;

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setXiangmu", String.class);

                method.invoke(_binghaiPingfenRemoteModel, xiangmu);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDengji() {
        return _dengji;
    }

    @Override
    public void setDengji(String dengji) {
        _dengji = dengji;

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setDengji", String.class);

                method.invoke(_binghaiPingfenRemoteModel, dengji);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getDengji_min() {
        return _dengji_min;
    }

    @Override
    public void setDengji_min(double dengji_min) {
        _dengji_min = dengji_min;

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setDengji_min", double.class);

                method.invoke(_binghaiPingfenRemoteModel, dengji_min);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getDengji_max() {
        return _dengji_max;
    }

    @Override
    public void setDengji_max(double dengji_max) {
        _dengji_max = dengji_max;

        if (_binghaiPingfenRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiPingfenRemoteModel.getClass();

                Method method = clazz.getMethod("setDengji_max", double.class);

                method.invoke(_binghaiPingfenRemoteModel, dengji_max);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBinghaiPingfenRemoteModel() {
        return _binghaiPingfenRemoteModel;
    }

    public void setBinghaiPingfenRemoteModel(
        BaseModel<?> binghaiPingfenRemoteModel) {
        _binghaiPingfenRemoteModel = binghaiPingfenRemoteModel;
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

        Class<?> remoteModelClass = _binghaiPingfenRemoteModel.getClass();

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

        Object returnValue = method.invoke(_binghaiPingfenRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BinghaiPingfenLocalServiceUtil.addBinghaiPingfen(this);
        } else {
            BinghaiPingfenLocalServiceUtil.updateBinghaiPingfen(this);
        }
    }

    @Override
    public BinghaiPingfen toEscapedModel() {
        return (BinghaiPingfen) ProxyUtil.newProxyInstance(BinghaiPingfen.class.getClassLoader(),
            new Class[] { BinghaiPingfen.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BinghaiPingfenClp clone = new BinghaiPingfenClp();

        clone.setBinghaiPingfenId(getBinghaiPingfenId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setDalei(getDalei());
        clone.setVmin(getVmin());
        clone.setVmax(getVmax());
        clone.setXiangmu(getXiangmu());
        clone.setDengji(getDengji());
        clone.setDengji_min(getDengji_min());
        clone.setDengji_max(getDengji_max());

        return clone;
    }

    @Override
    public int compareTo(BinghaiPingfen binghaiPingfen) {
        long primaryKey = binghaiPingfen.getPrimaryKey();

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

        if (!(obj instanceof BinghaiPingfenClp)) {
            return false;
        }

        BinghaiPingfenClp binghaiPingfen = (BinghaiPingfenClp) obj;

        long primaryKey = binghaiPingfen.getPrimaryKey();

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
        StringBundler sb = new StringBundler(29);

        sb.append("{binghaiPingfenId=");
        sb.append(getBinghaiPingfenId());
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
        sb.append(", dalei=");
        sb.append(getDalei());
        sb.append(", vmin=");
        sb.append(getVmin());
        sb.append(", vmax=");
        sb.append(getVmax());
        sb.append(", xiangmu=");
        sb.append(getXiangmu());
        sb.append(", dengji=");
        sb.append(getDengji());
        sb.append(", dengji_min=");
        sb.append(getDengji_min());
        sb.append(", dengji_max=");
        sb.append(getDengji_max());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("com.lycenway.chr.backbone.model.BinghaiPingfen");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>binghaiPingfenId</column-name><column-value><![CDATA[");
        sb.append(getBinghaiPingfenId());
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
            "<column><column-name>dalei</column-name><column-value><![CDATA[");
        sb.append(getDalei());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>vmin</column-name><column-value><![CDATA[");
        sb.append(getVmin());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>vmax</column-name><column-value><![CDATA[");
        sb.append(getVmax());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>xiangmu</column-name><column-value><![CDATA[");
        sb.append(getXiangmu());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dengji</column-name><column-value><![CDATA[");
        sb.append(getDengji());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dengji_min</column-name><column-value><![CDATA[");
        sb.append(getDengji_min());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dengji_max</column-name><column-value><![CDATA[");
        sb.append(getDengji_max());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
