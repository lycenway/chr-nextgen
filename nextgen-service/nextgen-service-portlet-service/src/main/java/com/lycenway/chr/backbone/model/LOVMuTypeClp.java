package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.lycenway.chr.backbone.service.ClpSerializer;
import com.lycenway.chr.backbone.service.LOVMuTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class LOVMuTypeClp extends BaseModelImpl<LOVMuType> implements LOVMuType {
    private String _code;
    private String _title;
    private BaseModel<?> _lovMuTypeRemoteModel;
    private Class<?> _clpSerializerClass = com.lycenway.chr.backbone.service.ClpSerializer.class;

    public LOVMuTypeClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return LOVMuType.class;
    }

    @Override
    public String getModelClassName() {
        return LOVMuType.class.getName();
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
        return _code;
    }

    @Override
    public void setCode(String code) {
        _code = code;

        if (_lovMuTypeRemoteModel != null) {
            try {
                Class<?> clazz = _lovMuTypeRemoteModel.getClass();

                Method method = clazz.getMethod("setCode", String.class);

                method.invoke(_lovMuTypeRemoteModel, code);
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

        if (_lovMuTypeRemoteModel != null) {
            try {
                Class<?> clazz = _lovMuTypeRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_lovMuTypeRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLOVMuTypeRemoteModel() {
        return _lovMuTypeRemoteModel;
    }

    public void setLOVMuTypeRemoteModel(BaseModel<?> lovMuTypeRemoteModel) {
        _lovMuTypeRemoteModel = lovMuTypeRemoteModel;
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

        Class<?> remoteModelClass = _lovMuTypeRemoteModel.getClass();

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

        Object returnValue = method.invoke(_lovMuTypeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LOVMuTypeLocalServiceUtil.addLOVMuType(this);
        } else {
            LOVMuTypeLocalServiceUtil.updateLOVMuType(this);
        }
    }

    @Override
    public LOVMuType toEscapedModel() {
        return (LOVMuType) ProxyUtil.newProxyInstance(LOVMuType.class.getClassLoader(),
            new Class[] { LOVMuType.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LOVMuTypeClp clone = new LOVMuTypeClp();

        clone.setCode(getCode());
        clone.setTitle(getTitle());

        return clone;
    }

    @Override
    public int compareTo(LOVMuType lovMuType) {
        String primaryKey = lovMuType.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LOVMuTypeClp)) {
            return false;
        }

        LOVMuTypeClp lovMuType = (LOVMuTypeClp) obj;

        String primaryKey = lovMuType.getPrimaryKey();

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
        sb.append("com.lycenway.chr.backbone.model.LOVMuType");
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
