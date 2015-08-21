package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BinghaiPingfen}.
 * </p>
 *
 * @author lycenway
 * @see BinghaiPingfen
 * @generated
 */
public class BinghaiPingfenWrapper implements BinghaiPingfen,
    ModelWrapper<BinghaiPingfen> {
    private BinghaiPingfen _binghaiPingfen;

    public BinghaiPingfenWrapper(BinghaiPingfen binghaiPingfen) {
        _binghaiPingfen = binghaiPingfen;
    }

    @Override
    public Class<?> getModelClass() {
        return BinghaiPingfen.class;
    }

    @Override
    public String getModelClassName() {
        return BinghaiPingfen.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("binghaiPingfenId", getBinghaiPingfenId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("dalei", getDalei());
        attributes.put("vmin", getVmin());
        attributes.put("vmax", getVmax());
        attributes.put("xiangmu", getXiangmu());
        attributes.put("dengji", getDengji());
        attributes.put("dengji_min", getDengji_min());
        attributes.put("dengji_max", getDengji_max());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long binghaiPingfenId = (Long) attributes.get("binghaiPingfenId");

        if (binghaiPingfenId != null) {
            setBinghaiPingfenId(binghaiPingfenId);
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

        String dalei = (String) attributes.get("dalei");

        if (dalei != null) {
            setDalei(dalei);
        }

        Double vmin = (Double) attributes.get("vmin");

        if (vmin != null) {
            setVmin(vmin);
        }

        Double vmax = (Double) attributes.get("vmax");

        if (vmax != null) {
            setVmax(vmax);
        }

        String xiangmu = (String) attributes.get("xiangmu");

        if (xiangmu != null) {
            setXiangmu(xiangmu);
        }

        String dengji = (String) attributes.get("dengji");

        if (dengji != null) {
            setDengji(dengji);
        }

        Double dengji_min = (Double) attributes.get("dengji_min");

        if (dengji_min != null) {
            setDengji_min(dengji_min);
        }

        Double dengji_max = (Double) attributes.get("dengji_max");

        if (dengji_max != null) {
            setDengji_max(dengji_max);
        }
    }

    /**
    * Returns the primary key of this binghai pingfen.
    *
    * @return the primary key of this binghai pingfen
    */
    @Override
    public long getPrimaryKey() {
        return _binghaiPingfen.getPrimaryKey();
    }

    /**
    * Sets the primary key of this binghai pingfen.
    *
    * @param primaryKey the primary key of this binghai pingfen
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _binghaiPingfen.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the binghai pingfen ID of this binghai pingfen.
    *
    * @return the binghai pingfen ID of this binghai pingfen
    */
    @Override
    public long getBinghaiPingfenId() {
        return _binghaiPingfen.getBinghaiPingfenId();
    }

    /**
    * Sets the binghai pingfen ID of this binghai pingfen.
    *
    * @param binghaiPingfenId the binghai pingfen ID of this binghai pingfen
    */
    @Override
    public void setBinghaiPingfenId(long binghaiPingfenId) {
        _binghaiPingfen.setBinghaiPingfenId(binghaiPingfenId);
    }

    /**
    * Returns the group ID of this binghai pingfen.
    *
    * @return the group ID of this binghai pingfen
    */
    @Override
    public long getGroupId() {
        return _binghaiPingfen.getGroupId();
    }

    /**
    * Sets the group ID of this binghai pingfen.
    *
    * @param groupId the group ID of this binghai pingfen
    */
    @Override
    public void setGroupId(long groupId) {
        _binghaiPingfen.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this binghai pingfen.
    *
    * @return the company ID of this binghai pingfen
    */
    @Override
    public long getCompanyId() {
        return _binghaiPingfen.getCompanyId();
    }

    /**
    * Sets the company ID of this binghai pingfen.
    *
    * @param companyId the company ID of this binghai pingfen
    */
    @Override
    public void setCompanyId(long companyId) {
        _binghaiPingfen.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this binghai pingfen.
    *
    * @return the user ID of this binghai pingfen
    */
    @Override
    public long getUserId() {
        return _binghaiPingfen.getUserId();
    }

    /**
    * Sets the user ID of this binghai pingfen.
    *
    * @param userId the user ID of this binghai pingfen
    */
    @Override
    public void setUserId(long userId) {
        _binghaiPingfen.setUserId(userId);
    }

    /**
    * Returns the user uuid of this binghai pingfen.
    *
    * @return the user uuid of this binghai pingfen
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghaiPingfen.getUserUuid();
    }

    /**
    * Sets the user uuid of this binghai pingfen.
    *
    * @param userUuid the user uuid of this binghai pingfen
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _binghaiPingfen.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this binghai pingfen.
    *
    * @return the user name of this binghai pingfen
    */
    @Override
    public java.lang.String getUserName() {
        return _binghaiPingfen.getUserName();
    }

    /**
    * Sets the user name of this binghai pingfen.
    *
    * @param userName the user name of this binghai pingfen
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _binghaiPingfen.setUserName(userName);
    }

    /**
    * Returns the create date of this binghai pingfen.
    *
    * @return the create date of this binghai pingfen
    */
    @Override
    public java.util.Date getCreateDate() {
        return _binghaiPingfen.getCreateDate();
    }

    /**
    * Sets the create date of this binghai pingfen.
    *
    * @param createDate the create date of this binghai pingfen
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _binghaiPingfen.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this binghai pingfen.
    *
    * @return the modified date of this binghai pingfen
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _binghaiPingfen.getModifiedDate();
    }

    /**
    * Sets the modified date of this binghai pingfen.
    *
    * @param modifiedDate the modified date of this binghai pingfen
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _binghaiPingfen.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the dalei of this binghai pingfen.
    *
    * @return the dalei of this binghai pingfen
    */
    @Override
    public java.lang.String getDalei() {
        return _binghaiPingfen.getDalei();
    }

    /**
    * Sets the dalei of this binghai pingfen.
    *
    * @param dalei the dalei of this binghai pingfen
    */
    @Override
    public void setDalei(java.lang.String dalei) {
        _binghaiPingfen.setDalei(dalei);
    }

    /**
    * Returns the vmin of this binghai pingfen.
    *
    * @return the vmin of this binghai pingfen
    */
    @Override
    public double getVmin() {
        return _binghaiPingfen.getVmin();
    }

    /**
    * Sets the vmin of this binghai pingfen.
    *
    * @param vmin the vmin of this binghai pingfen
    */
    @Override
    public void setVmin(double vmin) {
        _binghaiPingfen.setVmin(vmin);
    }

    /**
    * Returns the vmax of this binghai pingfen.
    *
    * @return the vmax of this binghai pingfen
    */
    @Override
    public double getVmax() {
        return _binghaiPingfen.getVmax();
    }

    /**
    * Sets the vmax of this binghai pingfen.
    *
    * @param vmax the vmax of this binghai pingfen
    */
    @Override
    public void setVmax(double vmax) {
        _binghaiPingfen.setVmax(vmax);
    }

    /**
    * Returns the xiangmu of this binghai pingfen.
    *
    * @return the xiangmu of this binghai pingfen
    */
    @Override
    public java.lang.String getXiangmu() {
        return _binghaiPingfen.getXiangmu();
    }

    /**
    * Sets the xiangmu of this binghai pingfen.
    *
    * @param xiangmu the xiangmu of this binghai pingfen
    */
    @Override
    public void setXiangmu(java.lang.String xiangmu) {
        _binghaiPingfen.setXiangmu(xiangmu);
    }

    /**
    * Returns the dengji of this binghai pingfen.
    *
    * @return the dengji of this binghai pingfen
    */
    @Override
    public java.lang.String getDengji() {
        return _binghaiPingfen.getDengji();
    }

    /**
    * Sets the dengji of this binghai pingfen.
    *
    * @param dengji the dengji of this binghai pingfen
    */
    @Override
    public void setDengji(java.lang.String dengji) {
        _binghaiPingfen.setDengji(dengji);
    }

    /**
    * Returns the dengji_min of this binghai pingfen.
    *
    * @return the dengji_min of this binghai pingfen
    */
    @Override
    public double getDengji_min() {
        return _binghaiPingfen.getDengji_min();
    }

    /**
    * Sets the dengji_min of this binghai pingfen.
    *
    * @param dengji_min the dengji_min of this binghai pingfen
    */
    @Override
    public void setDengji_min(double dengji_min) {
        _binghaiPingfen.setDengji_min(dengji_min);
    }

    /**
    * Returns the dengji_max of this binghai pingfen.
    *
    * @return the dengji_max of this binghai pingfen
    */
    @Override
    public double getDengji_max() {
        return _binghaiPingfen.getDengji_max();
    }

    /**
    * Sets the dengji_max of this binghai pingfen.
    *
    * @param dengji_max the dengji_max of this binghai pingfen
    */
    @Override
    public void setDengji_max(double dengji_max) {
        _binghaiPingfen.setDengji_max(dengji_max);
    }

    @Override
    public boolean isNew() {
        return _binghaiPingfen.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _binghaiPingfen.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _binghaiPingfen.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _binghaiPingfen.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _binghaiPingfen.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _binghaiPingfen.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _binghaiPingfen.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _binghaiPingfen.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _binghaiPingfen.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _binghaiPingfen.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _binghaiPingfen.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BinghaiPingfenWrapper((BinghaiPingfen) _binghaiPingfen.clone());
    }

    @Override
    public int compareTo(
        com.lycenway.chr.backbone.model.BinghaiPingfen binghaiPingfen) {
        return _binghaiPingfen.compareTo(binghaiPingfen);
    }

    @Override
    public int hashCode() {
        return _binghaiPingfen.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.BinghaiPingfen> toCacheModel() {
        return _binghaiPingfen.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.BinghaiPingfen toEscapedModel() {
        return new BinghaiPingfenWrapper(_binghaiPingfen.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.BinghaiPingfen toUnescapedModel() {
        return new BinghaiPingfenWrapper(_binghaiPingfen.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _binghaiPingfen.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _binghaiPingfen.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _binghaiPingfen.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BinghaiPingfenWrapper)) {
            return false;
        }

        BinghaiPingfenWrapper binghaiPingfenWrapper = (BinghaiPingfenWrapper) obj;

        if (Validator.equals(_binghaiPingfen,
                    binghaiPingfenWrapper._binghaiPingfen)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BinghaiPingfen getWrappedBinghaiPingfen() {
        return _binghaiPingfen;
    }

    @Override
    public BinghaiPingfen getWrappedModel() {
        return _binghaiPingfen;
    }

    @Override
    public void resetOriginalValues() {
        _binghaiPingfen.resetOriginalValues();
    }
}
