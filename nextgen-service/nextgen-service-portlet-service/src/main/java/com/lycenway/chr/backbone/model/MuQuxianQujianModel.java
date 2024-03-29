package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MuQuxianQujian service. Represents a row in the &quot;base_mu_quxian_qujian&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lycenway.chr.backbone.model.impl.MuQuxianQujianImpl}.
 * </p>
 *
 * @author lycenway
 * @see MuQuxianQujian
 * @see com.lycenway.chr.backbone.model.impl.MuQuxianQujianImpl
 * @see com.lycenway.chr.backbone.model.impl.MuQuxianQujianModelImpl
 * @generated
 */
public interface MuQuxianQujianModel extends BaseModel<MuQuxianQujian>,
    GroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a Mgmt Unit of Quxian Qujian model instance should use the {@link MuQuxianQujian} interface instead.
     */

    /**
     * Returns the primary key of this Mgmt Unit of Quxian Qujian.
     *
     * @return the primary key of this Mgmt Unit of Quxian Qujian
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this Mgmt Unit of Quxian Qujian.
     *
     * @param primaryKey the primary key of this Mgmt Unit of Quxian Qujian
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the hkey of this Mgmt Unit of Quxian Qujian.
     *
     * @return the hkey of this Mgmt Unit of Quxian Qujian
     */
    @AutoEscape
    public String getHkey();

    /**
     * Sets the hkey of this Mgmt Unit of Quxian Qujian.
     *
     * @param hkey the hkey of this Mgmt Unit of Quxian Qujian
     */
    public void setHkey(String hkey);

    /**
     * Returns the mu quxian qujian ID of this Mgmt Unit of Quxian Qujian.
     *
     * @return the mu quxian qujian ID of this Mgmt Unit of Quxian Qujian
     */
    public long getMuQuxianQujianId();

    /**
     * Sets the mu quxian qujian ID of this Mgmt Unit of Quxian Qujian.
     *
     * @param muQuxianQujianId the mu quxian qujian ID of this Mgmt Unit of Quxian Qujian
     */
    public void setMuQuxianQujianId(long muQuxianQujianId);

    /**
     * Returns the group ID of this Mgmt Unit of Quxian Qujian.
     *
     * @return the group ID of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this Mgmt Unit of Quxian Qujian.
     *
     * @param groupId the group ID of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this Mgmt Unit of Quxian Qujian.
     *
     * @return the company ID of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this Mgmt Unit of Quxian Qujian.
     *
     * @param companyId the company ID of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this Mgmt Unit of Quxian Qujian.
     *
     * @return the user ID of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this Mgmt Unit of Quxian Qujian.
     *
     * @param userId the user ID of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this Mgmt Unit of Quxian Qujian.
     *
     * @return the user uuid of this Mgmt Unit of Quxian Qujian
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this Mgmt Unit of Quxian Qujian.
     *
     * @param userUuid the user uuid of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this Mgmt Unit of Quxian Qujian.
     *
     * @return the user name of this Mgmt Unit of Quxian Qujian
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this Mgmt Unit of Quxian Qujian.
     *
     * @param userName the user name of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this Mgmt Unit of Quxian Qujian.
     *
     * @return the create date of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this Mgmt Unit of Quxian Qujian.
     *
     * @param createDate the create date of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this Mgmt Unit of Quxian Qujian.
     *
     * @return the modified date of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this Mgmt Unit of Quxian Qujian.
     *
     * @param modifiedDate the modified date of this Mgmt Unit of Quxian Qujian
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        com.lycenway.chr.backbone.model.MuQuxianQujian muQuxianQujian);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.lycenway.chr.backbone.model.MuQuxianQujian> toCacheModel();

    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian toEscapedModel();

    @Override
    public com.lycenway.chr.backbone.model.MuQuxianQujian toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
