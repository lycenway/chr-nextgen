package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MuExt}.
 * </p>
 *
 * @author lycenway
 * @see MuExt
 * @generated
 */
public class MuExtWrapper implements MuExt, ModelWrapper<MuExt> {
    private MuExt _muExt;

    public MuExtWrapper(MuExt muExt) {
        _muExt = muExt;
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

    /**
    * Returns the primary key of this Mgmt Unit Extended Attributes.
    *
    * @return the primary key of this Mgmt Unit Extended Attributes
    */
    @Override
    public long getPrimaryKey() {
        return _muExt.getPrimaryKey();
    }

    /**
    * Sets the primary key of this Mgmt Unit Extended Attributes.
    *
    * @param primaryKey the primary key of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _muExt.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the hkey of this Mgmt Unit Extended Attributes.
    *
    * @return the hkey of this Mgmt Unit Extended Attributes
    */
    @Override
    public java.lang.String getHkey() {
        return _muExt.getHkey();
    }

    /**
    * Sets the hkey of this Mgmt Unit Extended Attributes.
    *
    * @param hkey the hkey of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setHkey(java.lang.String hkey) {
        _muExt.setHkey(hkey);
    }

    /**
    * Returns the value of this Mgmt Unit Extended Attributes.
    *
    * @return the value of this Mgmt Unit Extended Attributes
    */
    @Override
    public java.lang.String getValue() {
        return _muExt.getValue();
    }

    /**
    * Sets the value of this Mgmt Unit Extended Attributes.
    *
    * @param value the value of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setValue(java.lang.String value) {
        _muExt.setValue(value);
    }

    /**
    * Returns the mu ext ID of this Mgmt Unit Extended Attributes.
    *
    * @return the mu ext ID of this Mgmt Unit Extended Attributes
    */
    @Override
    public long getMuExtId() {
        return _muExt.getMuExtId();
    }

    /**
    * Sets the mu ext ID of this Mgmt Unit Extended Attributes.
    *
    * @param muExtId the mu ext ID of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setMuExtId(long muExtId) {
        _muExt.setMuExtId(muExtId);
    }

    /**
    * Returns the group ID of this Mgmt Unit Extended Attributes.
    *
    * @return the group ID of this Mgmt Unit Extended Attributes
    */
    @Override
    public long getGroupId() {
        return _muExt.getGroupId();
    }

    /**
    * Sets the group ID of this Mgmt Unit Extended Attributes.
    *
    * @param groupId the group ID of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setGroupId(long groupId) {
        _muExt.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this Mgmt Unit Extended Attributes.
    *
    * @return the company ID of this Mgmt Unit Extended Attributes
    */
    @Override
    public long getCompanyId() {
        return _muExt.getCompanyId();
    }

    /**
    * Sets the company ID of this Mgmt Unit Extended Attributes.
    *
    * @param companyId the company ID of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setCompanyId(long companyId) {
        _muExt.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this Mgmt Unit Extended Attributes.
    *
    * @return the user ID of this Mgmt Unit Extended Attributes
    */
    @Override
    public long getUserId() {
        return _muExt.getUserId();
    }

    /**
    * Sets the user ID of this Mgmt Unit Extended Attributes.
    *
    * @param userId the user ID of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setUserId(long userId) {
        _muExt.setUserId(userId);
    }

    /**
    * Returns the user uuid of this Mgmt Unit Extended Attributes.
    *
    * @return the user uuid of this Mgmt Unit Extended Attributes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muExt.getUserUuid();
    }

    /**
    * Sets the user uuid of this Mgmt Unit Extended Attributes.
    *
    * @param userUuid the user uuid of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _muExt.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this Mgmt Unit Extended Attributes.
    *
    * @return the user name of this Mgmt Unit Extended Attributes
    */
    @Override
    public java.lang.String getUserName() {
        return _muExt.getUserName();
    }

    /**
    * Sets the user name of this Mgmt Unit Extended Attributes.
    *
    * @param userName the user name of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _muExt.setUserName(userName);
    }

    /**
    * Returns the create date of this Mgmt Unit Extended Attributes.
    *
    * @return the create date of this Mgmt Unit Extended Attributes
    */
    @Override
    public java.util.Date getCreateDate() {
        return _muExt.getCreateDate();
    }

    /**
    * Sets the create date of this Mgmt Unit Extended Attributes.
    *
    * @param createDate the create date of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _muExt.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this Mgmt Unit Extended Attributes.
    *
    * @return the modified date of this Mgmt Unit Extended Attributes
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _muExt.getModifiedDate();
    }

    /**
    * Sets the modified date of this Mgmt Unit Extended Attributes.
    *
    * @param modifiedDate the modified date of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _muExt.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the key of this Mgmt Unit Extended Attributes.
    *
    * @return the key of this Mgmt Unit Extended Attributes
    */
    @Override
    public java.lang.String getKey() {
        return _muExt.getKey();
    }

    /**
    * Sets the key of this Mgmt Unit Extended Attributes.
    *
    * @param key the key of this Mgmt Unit Extended Attributes
    */
    @Override
    public void setKey(java.lang.String key) {
        _muExt.setKey(key);
    }

    @Override
    public boolean isNew() {
        return _muExt.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _muExt.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _muExt.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _muExt.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _muExt.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _muExt.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _muExt.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _muExt.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _muExt.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _muExt.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _muExt.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new MuExtWrapper((MuExt) _muExt.clone());
    }

    @Override
    public int compareTo(com.lycenway.chr.backbone.model.MuExt muExt) {
        return _muExt.compareTo(muExt);
    }

    @Override
    public int hashCode() {
        return _muExt.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.MuExt> toCacheModel() {
        return _muExt.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.MuExt toEscapedModel() {
        return new MuExtWrapper(_muExt.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.MuExt toUnescapedModel() {
        return new MuExtWrapper(_muExt.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _muExt.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _muExt.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _muExt.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MuExtWrapper)) {
            return false;
        }

        MuExtWrapper muExtWrapper = (MuExtWrapper) obj;

        if (Validator.equals(_muExt, muExtWrapper._muExt)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public MuExt getWrappedMuExt() {
        return _muExt;
    }

    @Override
    public MuExt getWrappedModel() {
        return _muExt;
    }

    @Override
    public void resetOriginalValues() {
        _muExt.resetOriginalValues();
    }
}
