package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Mu}.
 * </p>
 *
 * @author lycenway
 * @see Mu
 * @generated
 */
public class MuWrapper implements Mu, ModelWrapper<Mu> {
    private Mu _mu;

    public MuWrapper(Mu mu) {
        _mu = mu;
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

    /**
    * Returns the primary key of this Mgmt Unit.
    *
    * @return the primary key of this Mgmt Unit
    */
    @Override
    public com.lycenway.chr.backbone.service.persistence.MuPK getPrimaryKey() {
        return _mu.getPrimaryKey();
    }

    /**
    * Sets the primary key of this Mgmt Unit.
    *
    * @param primaryKey the primary key of this Mgmt Unit
    */
    @Override
    public void setPrimaryKey(
        com.lycenway.chr.backbone.service.persistence.MuPK primaryKey) {
        _mu.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the hkey of this Mgmt Unit.
    *
    * @return the hkey of this Mgmt Unit
    */
    @Override
    public java.lang.String getHkey() {
        return _mu.getHkey();
    }

    /**
    * Sets the hkey of this Mgmt Unit.
    *
    * @param hkey the hkey of this Mgmt Unit
    */
    @Override
    public void setHkey(java.lang.String hkey) {
        _mu.setHkey(hkey);
    }

    /**
    * Returns the par of this Mgmt Unit.
    *
    * @return the par of this Mgmt Unit
    */
    @Override
    public java.lang.String getPar() {
        return _mu.getPar();
    }

    /**
    * Sets the par of this Mgmt Unit.
    *
    * @param par the par of this Mgmt Unit
    */
    @Override
    public void setPar(java.lang.String par) {
        _mu.setPar(par);
    }

    /**
    * Returns the title of this Mgmt Unit.
    *
    * @return the title of this Mgmt Unit
    */
    @Override
    public java.lang.String getTitle() {
        return _mu.getTitle();
    }

    /**
    * Sets the title of this Mgmt Unit.
    *
    * @param title the title of this Mgmt Unit
    */
    @Override
    public void setTitle(java.lang.String title) {
        _mu.setTitle(title);
    }

    /**
    * Returns the mu ID of this Mgmt Unit.
    *
    * @return the mu ID of this Mgmt Unit
    */
    @Override
    public long getMuId() {
        return _mu.getMuId();
    }

    /**
    * Sets the mu ID of this Mgmt Unit.
    *
    * @param muId the mu ID of this Mgmt Unit
    */
    @Override
    public void setMuId(long muId) {
        _mu.setMuId(muId);
    }

    /**
    * Returns the group ID of this Mgmt Unit.
    *
    * @return the group ID of this Mgmt Unit
    */
    @Override
    public long getGroupId() {
        return _mu.getGroupId();
    }

    /**
    * Sets the group ID of this Mgmt Unit.
    *
    * @param groupId the group ID of this Mgmt Unit
    */
    @Override
    public void setGroupId(long groupId) {
        _mu.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this Mgmt Unit.
    *
    * @return the company ID of this Mgmt Unit
    */
    @Override
    public long getCompanyId() {
        return _mu.getCompanyId();
    }

    /**
    * Sets the company ID of this Mgmt Unit.
    *
    * @param companyId the company ID of this Mgmt Unit
    */
    @Override
    public void setCompanyId(long companyId) {
        _mu.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this Mgmt Unit.
    *
    * @return the user ID of this Mgmt Unit
    */
    @Override
    public long getUserId() {
        return _mu.getUserId();
    }

    /**
    * Sets the user ID of this Mgmt Unit.
    *
    * @param userId the user ID of this Mgmt Unit
    */
    @Override
    public void setUserId(long userId) {
        _mu.setUserId(userId);
    }

    /**
    * Returns the user uuid of this Mgmt Unit.
    *
    * @return the user uuid of this Mgmt Unit
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _mu.getUserUuid();
    }

    /**
    * Sets the user uuid of this Mgmt Unit.
    *
    * @param userUuid the user uuid of this Mgmt Unit
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _mu.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this Mgmt Unit.
    *
    * @return the user name of this Mgmt Unit
    */
    @Override
    public java.lang.String getUserName() {
        return _mu.getUserName();
    }

    /**
    * Sets the user name of this Mgmt Unit.
    *
    * @param userName the user name of this Mgmt Unit
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _mu.setUserName(userName);
    }

    /**
    * Returns the create date of this Mgmt Unit.
    *
    * @return the create date of this Mgmt Unit
    */
    @Override
    public java.util.Date getCreateDate() {
        return _mu.getCreateDate();
    }

    /**
    * Sets the create date of this Mgmt Unit.
    *
    * @param createDate the create date of this Mgmt Unit
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _mu.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this Mgmt Unit.
    *
    * @return the modified date of this Mgmt Unit
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _mu.getModifiedDate();
    }

    /**
    * Sets the modified date of this Mgmt Unit.
    *
    * @param modifiedDate the modified date of this Mgmt Unit
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _mu.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _mu.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _mu.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _mu.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _mu.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _mu.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _mu.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _mu.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _mu.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _mu.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _mu.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _mu.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new MuWrapper((Mu) _mu.clone());
    }

    @Override
    public int compareTo(com.lycenway.chr.backbone.model.Mu mu) {
        return _mu.compareTo(mu);
    }

    @Override
    public int hashCode() {
        return _mu.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.Mu> toCacheModel() {
        return _mu.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.Mu toEscapedModel() {
        return new MuWrapper(_mu.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.Mu toUnescapedModel() {
        return new MuWrapper(_mu.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _mu.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _mu.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _mu.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MuWrapper)) {
            return false;
        }

        MuWrapper muWrapper = (MuWrapper) obj;

        if (Validator.equals(_mu, muWrapper._mu)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Mu getWrappedMu() {
        return _mu;
    }

    @Override
    public Mu getWrappedModel() {
        return _mu;
    }

    @Override
    public void resetOriginalValues() {
        _mu.resetOriginalValues();
    }
}
