package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MuZhengxianPodao}.
 * </p>
 *
 * @author lycenway
 * @see MuZhengxianPodao
 * @generated
 */
public class MuZhengxianPodaoWrapper implements MuZhengxianPodao,
    ModelWrapper<MuZhengxianPodao> {
    private MuZhengxianPodao _muZhengxianPodao;

    public MuZhengxianPodaoWrapper(MuZhengxianPodao muZhengxianPodao) {
        _muZhengxianPodao = muZhengxianPodao;
    }

    @Override
    public Class<?> getModelClass() {
        return MuZhengxianPodao.class;
    }

    @Override
    public String getModelClassName() {
        return MuZhengxianPodao.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("hkey", getHkey());
        attributes.put("muZhengxianPodaoId", getMuZhengxianPodaoId());
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

        Long muZhengxianPodaoId = (Long) attributes.get("muZhengxianPodaoId");

        if (muZhengxianPodaoId != null) {
            setMuZhengxianPodaoId(muZhengxianPodaoId);
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
    * Returns the primary key of this Mgmt Unit of Zhengxian Podao.
    *
    * @return the primary key of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public long getPrimaryKey() {
        return _muZhengxianPodao.getPrimaryKey();
    }

    /**
    * Sets the primary key of this Mgmt Unit of Zhengxian Podao.
    *
    * @param primaryKey the primary key of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _muZhengxianPodao.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the hkey of this Mgmt Unit of Zhengxian Podao.
    *
    * @return the hkey of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public java.lang.String getHkey() {
        return _muZhengxianPodao.getHkey();
    }

    /**
    * Sets the hkey of this Mgmt Unit of Zhengxian Podao.
    *
    * @param hkey the hkey of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public void setHkey(java.lang.String hkey) {
        _muZhengxianPodao.setHkey(hkey);
    }

    /**
    * Returns the mu zhengxian podao ID of this Mgmt Unit of Zhengxian Podao.
    *
    * @return the mu zhengxian podao ID of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public long getMuZhengxianPodaoId() {
        return _muZhengxianPodao.getMuZhengxianPodaoId();
    }

    /**
    * Sets the mu zhengxian podao ID of this Mgmt Unit of Zhengxian Podao.
    *
    * @param muZhengxianPodaoId the mu zhengxian podao ID of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public void setMuZhengxianPodaoId(long muZhengxianPodaoId) {
        _muZhengxianPodao.setMuZhengxianPodaoId(muZhengxianPodaoId);
    }

    /**
    * Returns the group ID of this Mgmt Unit of Zhengxian Podao.
    *
    * @return the group ID of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public long getGroupId() {
        return _muZhengxianPodao.getGroupId();
    }

    /**
    * Sets the group ID of this Mgmt Unit of Zhengxian Podao.
    *
    * @param groupId the group ID of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public void setGroupId(long groupId) {
        _muZhengxianPodao.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this Mgmt Unit of Zhengxian Podao.
    *
    * @return the company ID of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public long getCompanyId() {
        return _muZhengxianPodao.getCompanyId();
    }

    /**
    * Sets the company ID of this Mgmt Unit of Zhengxian Podao.
    *
    * @param companyId the company ID of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public void setCompanyId(long companyId) {
        _muZhengxianPodao.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this Mgmt Unit of Zhengxian Podao.
    *
    * @return the user ID of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public long getUserId() {
        return _muZhengxianPodao.getUserId();
    }

    /**
    * Sets the user ID of this Mgmt Unit of Zhengxian Podao.
    *
    * @param userId the user ID of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public void setUserId(long userId) {
        _muZhengxianPodao.setUserId(userId);
    }

    /**
    * Returns the user uuid of this Mgmt Unit of Zhengxian Podao.
    *
    * @return the user uuid of this Mgmt Unit of Zhengxian Podao
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _muZhengxianPodao.getUserUuid();
    }

    /**
    * Sets the user uuid of this Mgmt Unit of Zhengxian Podao.
    *
    * @param userUuid the user uuid of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _muZhengxianPodao.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this Mgmt Unit of Zhengxian Podao.
    *
    * @return the user name of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public java.lang.String getUserName() {
        return _muZhengxianPodao.getUserName();
    }

    /**
    * Sets the user name of this Mgmt Unit of Zhengxian Podao.
    *
    * @param userName the user name of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _muZhengxianPodao.setUserName(userName);
    }

    /**
    * Returns the create date of this Mgmt Unit of Zhengxian Podao.
    *
    * @return the create date of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public java.util.Date getCreateDate() {
        return _muZhengxianPodao.getCreateDate();
    }

    /**
    * Sets the create date of this Mgmt Unit of Zhengxian Podao.
    *
    * @param createDate the create date of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _muZhengxianPodao.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this Mgmt Unit of Zhengxian Podao.
    *
    * @return the modified date of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _muZhengxianPodao.getModifiedDate();
    }

    /**
    * Sets the modified date of this Mgmt Unit of Zhengxian Podao.
    *
    * @param modifiedDate the modified date of this Mgmt Unit of Zhengxian Podao
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _muZhengxianPodao.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _muZhengxianPodao.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _muZhengxianPodao.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _muZhengxianPodao.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _muZhengxianPodao.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _muZhengxianPodao.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _muZhengxianPodao.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _muZhengxianPodao.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _muZhengxianPodao.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _muZhengxianPodao.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _muZhengxianPodao.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _muZhengxianPodao.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new MuZhengxianPodaoWrapper((MuZhengxianPodao) _muZhengxianPodao.clone());
    }

    @Override
    public int compareTo(
        com.lycenway.chr.backbone.model.MuZhengxianPodao muZhengxianPodao) {
        return _muZhengxianPodao.compareTo(muZhengxianPodao);
    }

    @Override
    public int hashCode() {
        return _muZhengxianPodao.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.MuZhengxianPodao> toCacheModel() {
        return _muZhengxianPodao.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.MuZhengxianPodao toEscapedModel() {
        return new MuZhengxianPodaoWrapper(_muZhengxianPodao.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.MuZhengxianPodao toUnescapedModel() {
        return new MuZhengxianPodaoWrapper(_muZhengxianPodao.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _muZhengxianPodao.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _muZhengxianPodao.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _muZhengxianPodao.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MuZhengxianPodaoWrapper)) {
            return false;
        }

        MuZhengxianPodaoWrapper muZhengxianPodaoWrapper = (MuZhengxianPodaoWrapper) obj;

        if (Validator.equals(_muZhengxianPodao,
                    muZhengxianPodaoWrapper._muZhengxianPodao)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public MuZhengxianPodao getWrappedMuZhengxianPodao() {
        return _muZhengxianPodao;
    }

    @Override
    public MuZhengxianPodao getWrappedModel() {
        return _muZhengxianPodao;
    }

    @Override
    public void resetOriginalValues() {
        _muZhengxianPodao.resetOriginalValues();
    }
}
