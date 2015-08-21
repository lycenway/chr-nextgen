package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MuInterrel}.
 * </p>
 *
 * @author lycenway
 * @see MuInterrel
 * @generated
 */
public class MuInterrelWrapper implements MuInterrel, ModelWrapper<MuInterrel> {
    private MuInterrel _muInterrel;

    public MuInterrelWrapper(MuInterrel muInterrel) {
        _muInterrel = muInterrel;
    }

    @Override
    public Class<?> getModelClass() {
        return MuInterrel.class;
    }

    @Override
    public String getModelClassName() {
        return MuInterrel.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("hkey", getHkey());
        attributes.put("par", getPar());
        attributes.put("type", getType());
        attributes.put("muInterrelId", getMuInterrelId());
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

        String type = (String) attributes.get("type");

        if (type != null) {
            setType(type);
        }

        Long muInterrelId = (Long) attributes.get("muInterrelId");

        if (muInterrelId != null) {
            setMuInterrelId(muInterrelId);
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
    * Returns the primary key of this Mgmt Unit Inter Relationship.
    *
    * @return the primary key of this Mgmt Unit Inter Relationship
    */
    @Override
    public long getPrimaryKey() {
        return _muInterrel.getPrimaryKey();
    }

    /**
    * Sets the primary key of this Mgmt Unit Inter Relationship.
    *
    * @param primaryKey the primary key of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _muInterrel.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the hkey of this Mgmt Unit Inter Relationship.
    *
    * @return the hkey of this Mgmt Unit Inter Relationship
    */
    @Override
    public java.lang.String getHkey() {
        return _muInterrel.getHkey();
    }

    /**
    * Sets the hkey of this Mgmt Unit Inter Relationship.
    *
    * @param hkey the hkey of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setHkey(java.lang.String hkey) {
        _muInterrel.setHkey(hkey);
    }

    /**
    * Returns the par of this Mgmt Unit Inter Relationship.
    *
    * @return the par of this Mgmt Unit Inter Relationship
    */
    @Override
    public java.lang.String getPar() {
        return _muInterrel.getPar();
    }

    /**
    * Sets the par of this Mgmt Unit Inter Relationship.
    *
    * @param par the par of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setPar(java.lang.String par) {
        _muInterrel.setPar(par);
    }

    /**
    * Returns the type of this Mgmt Unit Inter Relationship.
    *
    * @return the type of this Mgmt Unit Inter Relationship
    */
    @Override
    public java.lang.String getType() {
        return _muInterrel.getType();
    }

    /**
    * Sets the type of this Mgmt Unit Inter Relationship.
    *
    * @param type the type of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setType(java.lang.String type) {
        _muInterrel.setType(type);
    }

    /**
    * Returns the mu interrel ID of this Mgmt Unit Inter Relationship.
    *
    * @return the mu interrel ID of this Mgmt Unit Inter Relationship
    */
    @Override
    public long getMuInterrelId() {
        return _muInterrel.getMuInterrelId();
    }

    /**
    * Sets the mu interrel ID of this Mgmt Unit Inter Relationship.
    *
    * @param muInterrelId the mu interrel ID of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setMuInterrelId(long muInterrelId) {
        _muInterrel.setMuInterrelId(muInterrelId);
    }

    /**
    * Returns the group ID of this Mgmt Unit Inter Relationship.
    *
    * @return the group ID of this Mgmt Unit Inter Relationship
    */
    @Override
    public long getGroupId() {
        return _muInterrel.getGroupId();
    }

    /**
    * Sets the group ID of this Mgmt Unit Inter Relationship.
    *
    * @param groupId the group ID of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setGroupId(long groupId) {
        _muInterrel.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this Mgmt Unit Inter Relationship.
    *
    * @return the company ID of this Mgmt Unit Inter Relationship
    */
    @Override
    public long getCompanyId() {
        return _muInterrel.getCompanyId();
    }

    /**
    * Sets the company ID of this Mgmt Unit Inter Relationship.
    *
    * @param companyId the company ID of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setCompanyId(long companyId) {
        _muInterrel.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this Mgmt Unit Inter Relationship.
    *
    * @return the user ID of this Mgmt Unit Inter Relationship
    */
    @Override
    public long getUserId() {
        return _muInterrel.getUserId();
    }

    /**
    * Sets the user ID of this Mgmt Unit Inter Relationship.
    *
    * @param userId the user ID of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setUserId(long userId) {
        _muInterrel.setUserId(userId);
    }

    /**
    * Returns the user uuid of this Mgmt Unit Inter Relationship.
    *
    * @return the user uuid of this Mgmt Unit Inter Relationship
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muInterrel.getUserUuid();
    }

    /**
    * Sets the user uuid of this Mgmt Unit Inter Relationship.
    *
    * @param userUuid the user uuid of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _muInterrel.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this Mgmt Unit Inter Relationship.
    *
    * @return the user name of this Mgmt Unit Inter Relationship
    */
    @Override
    public java.lang.String getUserName() {
        return _muInterrel.getUserName();
    }

    /**
    * Sets the user name of this Mgmt Unit Inter Relationship.
    *
    * @param userName the user name of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _muInterrel.setUserName(userName);
    }

    /**
    * Returns the create date of this Mgmt Unit Inter Relationship.
    *
    * @return the create date of this Mgmt Unit Inter Relationship
    */
    @Override
    public java.util.Date getCreateDate() {
        return _muInterrel.getCreateDate();
    }

    /**
    * Sets the create date of this Mgmt Unit Inter Relationship.
    *
    * @param createDate the create date of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _muInterrel.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this Mgmt Unit Inter Relationship.
    *
    * @return the modified date of this Mgmt Unit Inter Relationship
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _muInterrel.getModifiedDate();
    }

    /**
    * Sets the modified date of this Mgmt Unit Inter Relationship.
    *
    * @param modifiedDate the modified date of this Mgmt Unit Inter Relationship
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _muInterrel.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _muInterrel.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _muInterrel.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _muInterrel.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _muInterrel.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _muInterrel.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _muInterrel.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _muInterrel.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _muInterrel.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _muInterrel.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _muInterrel.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _muInterrel.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new MuInterrelWrapper((MuInterrel) _muInterrel.clone());
    }

    @Override
    public int compareTo(com.lycenway.chr.backbone.model.MuInterrel muInterrel) {
        return _muInterrel.compareTo(muInterrel);
    }

    @Override
    public int hashCode() {
        return _muInterrel.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.MuInterrel> toCacheModel() {
        return _muInterrel.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.MuInterrel toEscapedModel() {
        return new MuInterrelWrapper(_muInterrel.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.MuInterrel toUnescapedModel() {
        return new MuInterrelWrapper(_muInterrel.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _muInterrel.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _muInterrel.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _muInterrel.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MuInterrelWrapper)) {
            return false;
        }

        MuInterrelWrapper muInterrelWrapper = (MuInterrelWrapper) obj;

        if (Validator.equals(_muInterrel, muInterrelWrapper._muInterrel)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public MuInterrel getWrappedMuInterrel() {
        return _muInterrel;
    }

    @Override
    public MuInterrel getWrappedModel() {
        return _muInterrel;
    }

    @Override
    public void resetOriginalValues() {
        _muInterrel.resetOriginalValues();
    }
}
