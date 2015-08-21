package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MuWufengXianlu}.
 * </p>
 *
 * @author lycenway
 * @see MuWufengXianlu
 * @generated
 */
public class MuWufengXianluWrapper implements MuWufengXianlu,
    ModelWrapper<MuWufengXianlu> {
    private MuWufengXianlu _muWufengXianlu;

    public MuWufengXianluWrapper(MuWufengXianlu muWufengXianlu) {
        _muWufengXianlu = muWufengXianlu;
    }

    @Override
    public Class<?> getModelClass() {
        return MuWufengXianlu.class;
    }

    @Override
    public String getModelClassName() {
        return MuWufengXianlu.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("hkey", getHkey());
        attributes.put("muWufengXianluId", getMuWufengXianluId());
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

        Long muWufengXianluId = (Long) attributes.get("muWufengXianluId");

        if (muWufengXianluId != null) {
            setMuWufengXianluId(muWufengXianluId);
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
    * Returns the primary key of this Mgmt Unit of Wufeng Xianlu.
    *
    * @return the primary key of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public long getPrimaryKey() {
        return _muWufengXianlu.getPrimaryKey();
    }

    /**
    * Sets the primary key of this Mgmt Unit of Wufeng Xianlu.
    *
    * @param primaryKey the primary key of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _muWufengXianlu.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the hkey of this Mgmt Unit of Wufeng Xianlu.
    *
    * @return the hkey of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public java.lang.String getHkey() {
        return _muWufengXianlu.getHkey();
    }

    /**
    * Sets the hkey of this Mgmt Unit of Wufeng Xianlu.
    *
    * @param hkey the hkey of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public void setHkey(java.lang.String hkey) {
        _muWufengXianlu.setHkey(hkey);
    }

    /**
    * Returns the mu wufeng xianlu ID of this Mgmt Unit of Wufeng Xianlu.
    *
    * @return the mu wufeng xianlu ID of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public long getMuWufengXianluId() {
        return _muWufengXianlu.getMuWufengXianluId();
    }

    /**
    * Sets the mu wufeng xianlu ID of this Mgmt Unit of Wufeng Xianlu.
    *
    * @param muWufengXianluId the mu wufeng xianlu ID of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public void setMuWufengXianluId(long muWufengXianluId) {
        _muWufengXianlu.setMuWufengXianluId(muWufengXianluId);
    }

    /**
    * Returns the group ID of this Mgmt Unit of Wufeng Xianlu.
    *
    * @return the group ID of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public long getGroupId() {
        return _muWufengXianlu.getGroupId();
    }

    /**
    * Sets the group ID of this Mgmt Unit of Wufeng Xianlu.
    *
    * @param groupId the group ID of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public void setGroupId(long groupId) {
        _muWufengXianlu.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this Mgmt Unit of Wufeng Xianlu.
    *
    * @return the company ID of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public long getCompanyId() {
        return _muWufengXianlu.getCompanyId();
    }

    /**
    * Sets the company ID of this Mgmt Unit of Wufeng Xianlu.
    *
    * @param companyId the company ID of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public void setCompanyId(long companyId) {
        _muWufengXianlu.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this Mgmt Unit of Wufeng Xianlu.
    *
    * @return the user ID of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public long getUserId() {
        return _muWufengXianlu.getUserId();
    }

    /**
    * Sets the user ID of this Mgmt Unit of Wufeng Xianlu.
    *
    * @param userId the user ID of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public void setUserId(long userId) {
        _muWufengXianlu.setUserId(userId);
    }

    /**
    * Returns the user uuid of this Mgmt Unit of Wufeng Xianlu.
    *
    * @return the user uuid of this Mgmt Unit of Wufeng Xianlu
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muWufengXianlu.getUserUuid();
    }

    /**
    * Sets the user uuid of this Mgmt Unit of Wufeng Xianlu.
    *
    * @param userUuid the user uuid of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _muWufengXianlu.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this Mgmt Unit of Wufeng Xianlu.
    *
    * @return the user name of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public java.lang.String getUserName() {
        return _muWufengXianlu.getUserName();
    }

    /**
    * Sets the user name of this Mgmt Unit of Wufeng Xianlu.
    *
    * @param userName the user name of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _muWufengXianlu.setUserName(userName);
    }

    /**
    * Returns the create date of this Mgmt Unit of Wufeng Xianlu.
    *
    * @return the create date of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public java.util.Date getCreateDate() {
        return _muWufengXianlu.getCreateDate();
    }

    /**
    * Sets the create date of this Mgmt Unit of Wufeng Xianlu.
    *
    * @param createDate the create date of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _muWufengXianlu.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this Mgmt Unit of Wufeng Xianlu.
    *
    * @return the modified date of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _muWufengXianlu.getModifiedDate();
    }

    /**
    * Sets the modified date of this Mgmt Unit of Wufeng Xianlu.
    *
    * @param modifiedDate the modified date of this Mgmt Unit of Wufeng Xianlu
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _muWufengXianlu.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _muWufengXianlu.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _muWufengXianlu.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _muWufengXianlu.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _muWufengXianlu.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _muWufengXianlu.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _muWufengXianlu.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _muWufengXianlu.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _muWufengXianlu.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _muWufengXianlu.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _muWufengXianlu.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _muWufengXianlu.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new MuWufengXianluWrapper((MuWufengXianlu) _muWufengXianlu.clone());
    }

    @Override
    public int compareTo(
        com.lycenway.chr.backbone.model.MuWufengXianlu muWufengXianlu) {
        return _muWufengXianlu.compareTo(muWufengXianlu);
    }

    @Override
    public int hashCode() {
        return _muWufengXianlu.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.MuWufengXianlu> toCacheModel() {
        return _muWufengXianlu.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.MuWufengXianlu toEscapedModel() {
        return new MuWufengXianluWrapper(_muWufengXianlu.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.MuWufengXianlu toUnescapedModel() {
        return new MuWufengXianluWrapper(_muWufengXianlu.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _muWufengXianlu.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _muWufengXianlu.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _muWufengXianlu.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MuWufengXianluWrapper)) {
            return false;
        }

        MuWufengXianluWrapper muWufengXianluWrapper = (MuWufengXianluWrapper) obj;

        if (Validator.equals(_muWufengXianlu,
                    muWufengXianluWrapper._muWufengXianlu)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public MuWufengXianlu getWrappedMuWufengXianlu() {
        return _muWufengXianlu;
    }

    @Override
    public MuWufengXianlu getWrappedModel() {
        return _muWufengXianlu;
    }

    @Override
    public void resetOriginalValues() {
        _muWufengXianlu.resetOriginalValues();
    }
}
