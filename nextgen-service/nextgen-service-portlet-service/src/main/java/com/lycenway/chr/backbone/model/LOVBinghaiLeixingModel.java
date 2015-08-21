package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LOVBinghaiLeixing service. Represents a row in the &quot;lov_binghai_leixing&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingImpl}.
 * </p>
 *
 * @author lycenway
 * @see LOVBinghaiLeixing
 * @see com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingImpl
 * @see com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingModelImpl
 * @generated
 */
public interface LOVBinghaiLeixingModel extends BaseModel<LOVBinghaiLeixing> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a List of Value Binghai Leixing - Case Type model instance should use the {@link LOVBinghaiLeixing} interface instead.
     */

    /**
     * Returns the primary key of this List of Value Binghai Leixing - Case Type.
     *
     * @return the primary key of this List of Value Binghai Leixing - Case Type
     */
    public String getPrimaryKey();

    /**
     * Sets the primary key of this List of Value Binghai Leixing - Case Type.
     *
     * @param primaryKey the primary key of this List of Value Binghai Leixing - Case Type
     */
    public void setPrimaryKey(String primaryKey);

    /**
     * Returns the code of this List of Value Binghai Leixing - Case Type.
     *
     * @return the code of this List of Value Binghai Leixing - Case Type
     */
    @AutoEscape
    public String getCode();

    /**
     * Sets the code of this List of Value Binghai Leixing - Case Type.
     *
     * @param code the code of this List of Value Binghai Leixing - Case Type
     */
    public void setCode(String code);

    /**
     * Returns the title of this List of Value Binghai Leixing - Case Type.
     *
     * @return the title of this List of Value Binghai Leixing - Case Type
     */
    @AutoEscape
    public String getTitle();

    /**
     * Sets the title of this List of Value Binghai Leixing - Case Type.
     *
     * @param title the title of this List of Value Binghai Leixing - Case Type
     */
    public void setTitle(String title);

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
        com.lycenway.chr.backbone.model.LOVBinghaiLeixing lovBinghaiLeixing);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.lycenway.chr.backbone.model.LOVBinghaiLeixing> toCacheModel();

    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing toEscapedModel();

    @Override
    public com.lycenway.chr.backbone.model.LOVBinghaiLeixing toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
