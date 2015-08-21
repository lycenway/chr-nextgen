package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LOVBinghaiLeixing}.
 * </p>
 *
 * @author lycenway
 * @see LOVBinghaiLeixing
 * @generated
 */
public class LOVBinghaiLeixingWrapper implements LOVBinghaiLeixing,
    ModelWrapper<LOVBinghaiLeixing> {
    private LOVBinghaiLeixing _lovBinghaiLeixing;

    public LOVBinghaiLeixingWrapper(LOVBinghaiLeixing lovBinghaiLeixing) {
        _lovBinghaiLeixing = lovBinghaiLeixing;
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
    * Returns the primary key of this List of Value Binghai Leixing - Case Type.
    *
    * @return the primary key of this List of Value Binghai Leixing - Case Type
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _lovBinghaiLeixing.getPrimaryKey();
    }

    /**
    * Sets the primary key of this List of Value Binghai Leixing - Case Type.
    *
    * @param primaryKey the primary key of this List of Value Binghai Leixing - Case Type
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _lovBinghaiLeixing.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the code of this List of Value Binghai Leixing - Case Type.
    *
    * @return the code of this List of Value Binghai Leixing - Case Type
    */
    @Override
    public java.lang.String getCode() {
        return _lovBinghaiLeixing.getCode();
    }

    /**
    * Sets the code of this List of Value Binghai Leixing - Case Type.
    *
    * @param code the code of this List of Value Binghai Leixing - Case Type
    */
    @Override
    public void setCode(java.lang.String code) {
        _lovBinghaiLeixing.setCode(code);
    }

    /**
    * Returns the title of this List of Value Binghai Leixing - Case Type.
    *
    * @return the title of this List of Value Binghai Leixing - Case Type
    */
    @Override
    public java.lang.String getTitle() {
        return _lovBinghaiLeixing.getTitle();
    }

    /**
    * Sets the title of this List of Value Binghai Leixing - Case Type.
    *
    * @param title the title of this List of Value Binghai Leixing - Case Type
    */
    @Override
    public void setTitle(java.lang.String title) {
        _lovBinghaiLeixing.setTitle(title);
    }

    @Override
    public boolean isNew() {
        return _lovBinghaiLeixing.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _lovBinghaiLeixing.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _lovBinghaiLeixing.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _lovBinghaiLeixing.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _lovBinghaiLeixing.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _lovBinghaiLeixing.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _lovBinghaiLeixing.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _lovBinghaiLeixing.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _lovBinghaiLeixing.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _lovBinghaiLeixing.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _lovBinghaiLeixing.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LOVBinghaiLeixingWrapper((LOVBinghaiLeixing) _lovBinghaiLeixing.clone());
    }

    @Override
    public int compareTo(
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing) {
        return _lovBinghaiLeixing.compareTo(lovBinghaiLeixing);
    }

    @Override
    public int hashCode() {
        return _lovBinghaiLeixing.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> toCacheModel() {
        return _lovBinghaiLeixing.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing toEscapedModel() {
        return new LOVBinghaiLeixingWrapper(_lovBinghaiLeixing.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing toUnescapedModel() {
        return new LOVBinghaiLeixingWrapper(_lovBinghaiLeixing.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _lovBinghaiLeixing.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _lovBinghaiLeixing.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lovBinghaiLeixing.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LOVBinghaiLeixingWrapper)) {
            return false;
        }

        LOVBinghaiLeixingWrapper lovBinghaiLeixingWrapper = (LOVBinghaiLeixingWrapper) obj;

        if (Validator.equals(_lovBinghaiLeixing,
                    lovBinghaiLeixingWrapper._lovBinghaiLeixing)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public LOVBinghaiLeixing getWrappedLOVBinghaiLeixing() {
        return _lovBinghaiLeixing;
    }

    @Override
    public LOVBinghaiLeixing getWrappedModel() {
        return _lovBinghaiLeixing;
    }

    @Override
    public void resetOriginalValues() {
        _lovBinghaiLeixing.resetOriginalValues();
    }
}
