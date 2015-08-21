package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MuQuxianQujian}.
 * </p>
 *
 * @author lycenway
 * @see MuQuxianQujian
 * @generated
 */
public class MuQuxianQujianWrapper implements MuQuxianQujian,
    ModelWrapper<MuQuxianQujian> {
    private MuQuxianQujian _muQuxianQujian;

    public MuQuxianQujianWrapper(MuQuxianQujian muQuxianQujian) {
        _muQuxianQujian = muQuxianQujian;
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

    /**
    * Returns the primary key of this Mgmt Unit of Quxian Qujian.
    *
    * @return the primary key of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public long getPrimaryKey() {
        return _muQuxianQujian.getPrimaryKey();
    }

    /**
    * Sets the primary key of this Mgmt Unit of Quxian Qujian.
    *
    * @param primaryKey the primary key of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _muQuxianQujian.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the hkey of this Mgmt Unit of Quxian Qujian.
    *
    * @return the hkey of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public java.lang.String getHkey() {
        return _muQuxianQujian.getHkey();
    }

    /**
    * Sets the hkey of this Mgmt Unit of Quxian Qujian.
    *
    * @param hkey the hkey of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public void setHkey(java.lang.String hkey) {
        _muQuxianQujian.setHkey(hkey);
    }

    /**
    * Returns the mu quxian qujian ID of this Mgmt Unit of Quxian Qujian.
    *
    * @return the mu quxian qujian ID of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public long getMuQuxianQujianId() {
        return _muQuxianQujian.getMuQuxianQujianId();
    }

    /**
    * Sets the mu quxian qujian ID of this Mgmt Unit of Quxian Qujian.
    *
    * @param muQuxianQujianId the mu quxian qujian ID of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public void setMuQuxianQujianId(long muQuxianQujianId) {
        _muQuxianQujian.setMuQuxianQujianId(muQuxianQujianId);
    }

    /**
    * Returns the group ID of this Mgmt Unit of Quxian Qujian.
    *
    * @return the group ID of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public long getGroupId() {
        return _muQuxianQujian.getGroupId();
    }

    /**
    * Sets the group ID of this Mgmt Unit of Quxian Qujian.
    *
    * @param groupId the group ID of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public void setGroupId(long groupId) {
        _muQuxianQujian.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this Mgmt Unit of Quxian Qujian.
    *
    * @return the company ID of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public long getCompanyId() {
        return _muQuxianQujian.getCompanyId();
    }

    /**
    * Sets the company ID of this Mgmt Unit of Quxian Qujian.
    *
    * @param companyId the company ID of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public void setCompanyId(long companyId) {
        _muQuxianQujian.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this Mgmt Unit of Quxian Qujian.
    *
    * @return the user ID of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public long getUserId() {
        return _muQuxianQujian.getUserId();
    }

    /**
    * Sets the user ID of this Mgmt Unit of Quxian Qujian.
    *
    * @param userId the user ID of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public void setUserId(long userId) {
        _muQuxianQujian.setUserId(userId);
    }

    /**
    * Returns the user uuid of this Mgmt Unit of Quxian Qujian.
    *
    * @return the user uuid of this Mgmt Unit of Quxian Qujian
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muQuxianQujian.getUserUuid();
    }

    /**
    * Sets the user uuid of this Mgmt Unit of Quxian Qujian.
    *
    * @param userUuid the user uuid of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _muQuxianQujian.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this Mgmt Unit of Quxian Qujian.
    *
    * @return the user name of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public java.lang.String getUserName() {
        return _muQuxianQujian.getUserName();
    }

    /**
    * Sets the user name of this Mgmt Unit of Quxian Qujian.
    *
    * @param userName the user name of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _muQuxianQujian.setUserName(userName);
    }

    /**
    * Returns the create date of this Mgmt Unit of Quxian Qujian.
    *
    * @return the create date of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public java.util.Date getCreateDate() {
        return _muQuxianQujian.getCreateDate();
    }

    /**
    * Sets the create date of this Mgmt Unit of Quxian Qujian.
    *
    * @param createDate the create date of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _muQuxianQujian.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this Mgmt Unit of Quxian Qujian.
    *
    * @return the modified date of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _muQuxianQujian.getModifiedDate();
    }

    /**
    * Sets the modified date of this Mgmt Unit of Quxian Qujian.
    *
    * @param modifiedDate the modified date of this Mgmt Unit of Quxian Qujian
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _muQuxianQujian.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _muQuxianQujian.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _muQuxianQujian.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _muQuxianQujian.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _muQuxianQujian.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _muQuxianQujian.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _muQuxianQujian.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _muQuxianQujian.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _muQuxianQujian.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _muQuxianQujian.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _muQuxianQujian.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _muQuxianQujian.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new MuQuxianQujianWrapper((MuQuxianQujian) _muQuxianQujian.clone());
    }

    @Override
    public int compareTo(
        com.lycenway.chr.backbone.model.MuQuxianQujian muQuxianQujian) {
        return _muQuxianQujian.compareTo(muQuxianQujian);
    }

    @Override
    public int hashCode() {
        return _muQuxianQujian.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.MuQuxianQujian> toCacheModel() {
        return _muQuxianQujian.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian toEscapedModel() {
        return new MuQuxianQujianWrapper(_muQuxianQujian.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian toUnescapedModel() {
        return new MuQuxianQujianWrapper(_muQuxianQujian.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _muQuxianQujian.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _muQuxianQujian.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _muQuxianQujian.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MuQuxianQujianWrapper)) {
            return false;
        }

        MuQuxianQujianWrapper muQuxianQujianWrapper = (MuQuxianQujianWrapper) obj;

        if (Validator.equals(_muQuxianQujian,
                    muQuxianQujianWrapper._muQuxianQujian)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public MuQuxianQujian getWrappedMuQuxianQujian() {
        return _muQuxianQujian;
    }

    @Override
    public MuQuxianQujian getWrappedModel() {
        return _muQuxianQujian;
    }

    @Override
    public void resetOriginalValues() {
        _muQuxianQujian.resetOriginalValues();
    }
}
