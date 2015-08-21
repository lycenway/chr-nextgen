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
 * The base model interface for the MuExt service. Represents a row in the &quot;base_mu_ext&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lycenway.chr.backbone.model.impl.MuExtModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lycenway.chr.backbone.model.impl.MuExtImpl}.
 * </p>
 *
 * @author lycenway
 * @see MuExt
 * @see com.lycenway.chr.backbone.model.impl.MuExtImpl
 * @see com.lycenway.chr.backbone.model.impl.MuExtModelImpl
 * @generated
 */
public interface MuExtModel extends BaseModel<MuExt>, GroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a Mgmt Unit Extended Attributes model instance should use the {@link MuExt} interface instead.
     */

    /**
     * Returns the primary key of this Mgmt Unit Extended Attributes.
     *
     * @return the primary key of this Mgmt Unit Extended Attributes
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this Mgmt Unit Extended Attributes.
     *
     * @param primaryKey the primary key of this Mgmt Unit Extended Attributes
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the hkey of this Mgmt Unit Extended Attributes.
     *
     * @return the hkey of this Mgmt Unit Extended Attributes
     */
    @AutoEscape
    public String getHkey();

    /**
     * Sets the hkey of this Mgmt Unit Extended Attributes.
     *
     * @param hkey the hkey of this Mgmt Unit Extended Attributes
     */
    public void setHkey(String hkey);

    /**
     * Returns the value of this Mgmt Unit Extended Attributes.
     *
     * @return the value of this Mgmt Unit Extended Attributes
     */
    @AutoEscape
    public String getValue();

    /**
     * Sets the value of this Mgmt Unit Extended Attributes.
     *
     * @param value the value of this Mgmt Unit Extended Attributes
     */
    public void setValue(String value);

    /**
     * Returns the mu ext ID of this Mgmt Unit Extended Attributes.
     *
     * @return the mu ext ID of this Mgmt Unit Extended Attributes
     */
    public long getMuExtId();

    /**
     * Sets the mu ext ID of this Mgmt Unit Extended Attributes.
     *
     * @param muExtId the mu ext ID of this Mgmt Unit Extended Attributes
     */
    public void setMuExtId(long muExtId);

    /**
     * Returns the group ID of this Mgmt Unit Extended Attributes.
     *
     * @return the group ID of this Mgmt Unit Extended Attributes
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this Mgmt Unit Extended Attributes.
     *
     * @param groupId the group ID of this Mgmt Unit Extended Attributes
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this Mgmt Unit Extended Attributes.
     *
     * @return the company ID of this Mgmt Unit Extended Attributes
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this Mgmt Unit Extended Attributes.
     *
     * @param companyId the company ID of this Mgmt Unit Extended Attributes
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this Mgmt Unit Extended Attributes.
     *
     * @return the user ID of this Mgmt Unit Extended Attributes
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this Mgmt Unit Extended Attributes.
     *
     * @param userId the user ID of this Mgmt Unit Extended Attributes
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this Mgmt Unit Extended Attributes.
     *
     * @return the user uuid of this Mgmt Unit Extended Attributes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this Mgmt Unit Extended Attributes.
     *
     * @param userUuid the user uuid of this Mgmt Unit Extended Attributes
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this Mgmt Unit Extended Attributes.
     *
     * @return the user name of this Mgmt Unit Extended Attributes
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this Mgmt Unit Extended Attributes.
     *
     * @param userName the user name of this Mgmt Unit Extended Attributes
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this Mgmt Unit Extended Attributes.
     *
     * @return the create date of this Mgmt Unit Extended Attributes
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this Mgmt Unit Extended Attributes.
     *
     * @param createDate the create date of this Mgmt Unit Extended Attributes
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this Mgmt Unit Extended Attributes.
     *
     * @return the modified date of this Mgmt Unit Extended Attributes
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this Mgmt Unit Extended Attributes.
     *
     * @param modifiedDate the modified date of this Mgmt Unit Extended Attributes
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the key of this Mgmt Unit Extended Attributes.
     *
     * @return the key of this Mgmt Unit Extended Attributes
     */
    @AutoEscape
    public String getKey();

    /**
     * Sets the key of this Mgmt Unit Extended Attributes.
     *
     * @param key the key of this Mgmt Unit Extended Attributes
     */
    public void setKey(String key);

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
    public int compareTo(com.lycenway.chr.backbone.model.MuExt muExt);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.lycenway.chr.backbone.model.MuExt> toCacheModel();

    @Override
    public com.lycenway.chr.backbone.model.MuExt toEscapedModel();

    @Override
    public com.lycenway.chr.backbone.model.MuExt toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
