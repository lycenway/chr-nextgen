package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LOVMuType}.
 * </p>
 *
 * @author lycenway
 * @see LOVMuType
 * @generated
 */
public class LOVMuTypeWrapper implements LOVMuType, ModelWrapper<LOVMuType> {
    private LOVMuType _lovMuType;

    public LOVMuTypeWrapper(LOVMuType lovMuType) {
        _lovMuType = lovMuType;
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

    /**
    * Returns the primary key of this Lisf of Value Mgmt Unit Type.
    *
    * @return the primary key of this Lisf of Value Mgmt Unit Type
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _lovMuType.getPrimaryKey();
    }

    /**
    * Sets the primary key of this Lisf of Value Mgmt Unit Type.
    *
    * @param primaryKey the primary key of this Lisf of Value Mgmt Unit Type
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _lovMuType.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the code of this Lisf of Value Mgmt Unit Type.
    *
    * @return the code of this Lisf of Value Mgmt Unit Type
    */
    @Override
    public java.lang.String getCode() {
        return _lovMuType.getCode();
    }

    /**
    * Sets the code of this Lisf of Value Mgmt Unit Type.
    *
    * @param code the code of this Lisf of Value Mgmt Unit Type
    */
    @Override
    public void setCode(java.lang.String code) {
        _lovMuType.setCode(code);
    }

    /**
    * Returns the title of this Lisf of Value Mgmt Unit Type.
    *
    * @return the title of this Lisf of Value Mgmt Unit Type
    */
    @Override
    public java.lang.String getTitle() {
        return _lovMuType.getTitle();
    }

    /**
    * Sets the title of this Lisf of Value Mgmt Unit Type.
    *
    * @param title the title of this Lisf of Value Mgmt Unit Type
    */
    @Override
    public void setTitle(java.lang.String title) {
        _lovMuType.setTitle(title);
    }

    @Override
    public boolean isNew() {
        return _lovMuType.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _lovMuType.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _lovMuType.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _lovMuType.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _lovMuType.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _lovMuType.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _lovMuType.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _lovMuType.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _lovMuType.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _lovMuType.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _lovMuType.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LOVMuTypeWrapper((LOVMuType) _lovMuType.clone());
    }

    @Override
    public int compareTo(com.lycenway.chr.backbone.model.LOVMuType lovMuType) {
        return _lovMuType.compareTo(lovMuType);
    }

    @Override
    public int hashCode() {
        return _lovMuType.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.LOVMuType> toCacheModel() {
        return _lovMuType.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.LOVMuType toEscapedModel() {
        return new LOVMuTypeWrapper(_lovMuType.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.LOVMuType toUnescapedModel() {
        return new LOVMuTypeWrapper(_lovMuType.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _lovMuType.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _lovMuType.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lovMuType.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LOVMuTypeWrapper)) {
            return false;
        }

        LOVMuTypeWrapper lovMuTypeWrapper = (LOVMuTypeWrapper) obj;

        if (Validator.equals(_lovMuType, lovMuTypeWrapper._lovMuType)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public LOVMuType getWrappedLOVMuType() {
        return _lovMuType;
    }

    @Override
    public LOVMuType getWrappedModel() {
        return _lovMuType;
    }

    @Override
    public void resetOriginalValues() {
        _lovMuType.resetOriginalValues();
    }
}
