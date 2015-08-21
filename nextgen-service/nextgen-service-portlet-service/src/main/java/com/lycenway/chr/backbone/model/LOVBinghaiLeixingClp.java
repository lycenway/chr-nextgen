package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.lycenway.chr.backbone.service.ClpSerializer;
import com.lycenway.chr.backbone.service.LOVBinghaiLeixingLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class LOVBinghaiLeixingClp extends BaseModelImpl<LOVBinghaiLeixing>
    implements LOVBinghaiLeixing {
    private String _code;
    private String _title;
    private BaseModel<?> _lovBinghaiLeixingRemoteModel;
    private Class<?> _clpSerializerClass = com.lycenway.chr.backbone.service.ClpSerializer.class;

    public LOVBinghaiLeixingClp() {
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

        if (_lovBinghaiLeixingRemoteModel != null) {
            try {
                Class<?> clazz = _lovBinghaiLeixingRemoteModel.getClass();

                Method method = clazz.getMethod("setCode", String.class);

                method.invoke(_lovBinghaiLeixingRemoteModel, code);
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

        if (_lovBinghaiLeixingRemoteModel != null) {
            try {
                Class<?> clazz = _lovBinghaiLeixingRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_lovBinghaiLeixingRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLOVBinghaiLeixingRemoteModel() {
        return _lovBinghaiLeixingRemoteModel;
    }

    public void setLOVBinghaiLeixingRemoteModel(
        BaseModel<?> lovBinghaiLeixingRemoteModel) {
        _lovBinghaiLeixingRemoteModel = lovBinghaiLeixingRemoteModel;
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

        Class<?> remoteModelClass = _lovBinghaiLeixingRemoteModel.getClass();

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

        Object returnValue = method.invoke(_lovBinghaiLeixingRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LOVBinghaiLeixingLocalServiceUtil.addLOVBinghaiLeixing(this);
        } else {
            LOVBinghaiLeixingLocalServiceUtil.updateLOVBinghaiLeixing(this);
        }
    }

    @Override
    public LOVBinghaiLeixing toEscapedModel() {
        return (LOVBinghaiLeixing) ProxyUtil.newProxyInstance(LOVBinghaiLeixing.class.getClassLoader(),
            new Class[] { LOVBinghaiLeixing.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LOVBinghaiLeixingClp clone = new LOVBinghaiLeixingClp();

        clone.setCode(getCode());
        clone.setTitle(getTitle());

        return clone;
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

        if (!(obj instanceof LOVBinghaiLeixingClp)) {
            return false;
        }

        LOVBinghaiLeixingClp lovBinghaiLeixing = (LOVBinghaiLeixingClp) obj;

        String primaryKey = lovBinghaiLeixing.getPrimaryKey();

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
