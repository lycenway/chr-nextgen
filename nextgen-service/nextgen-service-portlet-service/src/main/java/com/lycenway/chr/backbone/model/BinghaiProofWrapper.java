package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BinghaiProof}.
 * </p>
 *
 * @author lycenway
 * @see BinghaiProof
 * @generated
 */
public class BinghaiProofWrapper implements BinghaiProof,
    ModelWrapper<BinghaiProof> {
    private BinghaiProof _binghaiProof;

    public BinghaiProofWrapper(BinghaiProof binghaiProof) {
        _binghaiProof = binghaiProof;
    }

    @Override
    public Class<?> getModelClass() {
        return BinghaiProof.class;
    }

    @Override
    public String getModelClassName() {
        return BinghaiProof.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("mime", getMime());
        attributes.put("url", getUrl());
        attributes.put("binghaiId", getBinghaiId());
        attributes.put("binghaiProofId", getBinghaiProofId());
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
        String mime = (String) attributes.get("mime");

        if (mime != null) {
            setMime(mime);
        }

        String url = (String) attributes.get("url");

        if (url != null) {
            setUrl(url);
        }

        String binghaiId = (String) attributes.get("binghaiId");

        if (binghaiId != null) {
            setBinghaiId(binghaiId);
        }

        Long binghaiProofId = (Long) attributes.get("binghaiProofId");

        if (binghaiProofId != null) {
            setBinghaiProofId(binghaiProofId);
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
    * Returns the primary key of this Binghai Attachments Pictures.
    *
    * @return the primary key of this Binghai Attachments Pictures
    */
    @Override
    public long getPrimaryKey() {
        return _binghaiProof.getPrimaryKey();
    }

    /**
    * Sets the primary key of this Binghai Attachments Pictures.
    *
    * @param primaryKey the primary key of this Binghai Attachments Pictures
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _binghaiProof.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the mime of this Binghai Attachments Pictures.
    *
    * @return the mime of this Binghai Attachments Pictures
    */
    @Override
    public java.lang.String getMime() {
        return _binghaiProof.getMime();
    }

    /**
    * Sets the mime of this Binghai Attachments Pictures.
    *
    * @param mime the mime of this Binghai Attachments Pictures
    */
    @Override
    public void setMime(java.lang.String mime) {
        _binghaiProof.setMime(mime);
    }

    /**
    * Returns the url of this Binghai Attachments Pictures.
    *
    * @return the url of this Binghai Attachments Pictures
    */
    @Override
    public java.lang.String getUrl() {
        return _binghaiProof.getUrl();
    }

    /**
    * Sets the url of this Binghai Attachments Pictures.
    *
    * @param url the url of this Binghai Attachments Pictures
    */
    @Override
    public void setUrl(java.lang.String url) {
        _binghaiProof.setUrl(url);
    }

    /**
    * Returns the binghai ID of this Binghai Attachments Pictures.
    *
    * @return the binghai ID of this Binghai Attachments Pictures
    */
    @Override
    public java.lang.String getBinghaiId() {
        return _binghaiProof.getBinghaiId();
    }

    /**
    * Sets the binghai ID of this Binghai Attachments Pictures.
    *
    * @param binghaiId the binghai ID of this Binghai Attachments Pictures
    */
    @Override
    public void setBinghaiId(java.lang.String binghaiId) {
        _binghaiProof.setBinghaiId(binghaiId);
    }

    /**
    * Returns the binghai proof ID of this Binghai Attachments Pictures.
    *
    * @return the binghai proof ID of this Binghai Attachments Pictures
    */
    @Override
    public long getBinghaiProofId() {
        return _binghaiProof.getBinghaiProofId();
    }

    /**
    * Sets the binghai proof ID of this Binghai Attachments Pictures.
    *
    * @param binghaiProofId the binghai proof ID of this Binghai Attachments Pictures
    */
    @Override
    public void setBinghaiProofId(long binghaiProofId) {
        _binghaiProof.setBinghaiProofId(binghaiProofId);
    }

    /**
    * Returns the group ID of this Binghai Attachments Pictures.
    *
    * @return the group ID of this Binghai Attachments Pictures
    */
    @Override
    public long getGroupId() {
        return _binghaiProof.getGroupId();
    }

    /**
    * Sets the group ID of this Binghai Attachments Pictures.
    *
    * @param groupId the group ID of this Binghai Attachments Pictures
    */
    @Override
    public void setGroupId(long groupId) {
        _binghaiProof.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this Binghai Attachments Pictures.
    *
    * @return the company ID of this Binghai Attachments Pictures
    */
    @Override
    public long getCompanyId() {
        return _binghaiProof.getCompanyId();
    }

    /**
    * Sets the company ID of this Binghai Attachments Pictures.
    *
    * @param companyId the company ID of this Binghai Attachments Pictures
    */
    @Override
    public void setCompanyId(long companyId) {
        _binghaiProof.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this Binghai Attachments Pictures.
    *
    * @return the user ID of this Binghai Attachments Pictures
    */
    @Override
    public long getUserId() {
        return _binghaiProof.getUserId();
    }

    /**
    * Sets the user ID of this Binghai Attachments Pictures.
    *
    * @param userId the user ID of this Binghai Attachments Pictures
    */
    @Override
    public void setUserId(long userId) {
        _binghaiProof.setUserId(userId);
    }

    /**
    * Returns the user uuid of this Binghai Attachments Pictures.
    *
    * @return the user uuid of this Binghai Attachments Pictures
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiProof.getUserUuid();
    }

    /**
    * Sets the user uuid of this Binghai Attachments Pictures.
    *
    * @param userUuid the user uuid of this Binghai Attachments Pictures
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _binghaiProof.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this Binghai Attachments Pictures.
    *
    * @return the user name of this Binghai Attachments Pictures
    */
    @Override
    public java.lang.String getUserName() {
        return _binghaiProof.getUserName();
    }

    /**
    * Sets the user name of this Binghai Attachments Pictures.
    *
    * @param userName the user name of this Binghai Attachments Pictures
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _binghaiProof.setUserName(userName);
    }

    /**
    * Returns the create date of this Binghai Attachments Pictures.
    *
    * @return the create date of this Binghai Attachments Pictures
    */
    @Override
    public java.util.Date getCreateDate() {
        return _binghaiProof.getCreateDate();
    }

    /**
    * Sets the create date of this Binghai Attachments Pictures.
    *
    * @param createDate the create date of this Binghai Attachments Pictures
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _binghaiProof.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this Binghai Attachments Pictures.
    *
    * @return the modified date of this Binghai Attachments Pictures
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _binghaiProof.getModifiedDate();
    }

    /**
    * Sets the modified date of this Binghai Attachments Pictures.
    *
    * @param modifiedDate the modified date of this Binghai Attachments Pictures
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _binghaiProof.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _binghaiProof.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _binghaiProof.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _binghaiProof.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _binghaiProof.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _binghaiProof.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _binghaiProof.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _binghaiProof.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _binghaiProof.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _binghaiProof.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _binghaiProof.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _binghaiProof.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BinghaiProofWrapper((BinghaiProof) _binghaiProof.clone());
    }

    @Override
    public int compareTo(
        com.lycenway.chr.backbone.model.BinghaiProof binghaiProof) {
        return _binghaiProof.compareTo(binghaiProof);
    }

    @Override
    public int hashCode() {
        return _binghaiProof.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.BinghaiProof> toCacheModel() {
        return _binghaiProof.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.BinghaiProof toEscapedModel() {
        return new BinghaiProofWrapper(_binghaiProof.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.BinghaiProof toUnescapedModel() {
        return new BinghaiProofWrapper(_binghaiProof.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _binghaiProof.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _binghaiProof.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _binghaiProof.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BinghaiProofWrapper)) {
            return false;
        }

        BinghaiProofWrapper binghaiProofWrapper = (BinghaiProofWrapper) obj;

        if (Validator.equals(_binghaiProof, binghaiProofWrapper._binghaiProof)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BinghaiProof getWrappedBinghaiProof() {
        return _binghaiProof;
    }

    @Override
    public BinghaiProof getWrappedModel() {
        return _binghaiProof;
    }

    @Override
    public void resetOriginalValues() {
        _binghaiProof.resetOriginalValues();
    }
}
