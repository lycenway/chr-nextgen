package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.MuWufengXianlu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MuWufengXianlu in entity cache.
 *
 * @author lycenway
 * @see MuWufengXianlu
 * @generated
 */
public class MuWufengXianluCacheModel implements CacheModel<MuWufengXianlu>,
    Externalizable {
    public String hkey;
    public long muWufengXianluId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{hkey=");
        sb.append(hkey);
        sb.append(", muWufengXianluId=");
        sb.append(muWufengXianluId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public MuWufengXianlu toEntityModel() {
        MuWufengXianluImpl muWufengXianluImpl = new MuWufengXianluImpl();

        if (hkey == null) {
            muWufengXianluImpl.setHkey(StringPool.BLANK);
        } else {
            muWufengXianluImpl.setHkey(hkey);
        }

        muWufengXianluImpl.setMuWufengXianluId(muWufengXianluId);
        muWufengXianluImpl.setGroupId(groupId);
        muWufengXianluImpl.setCompanyId(companyId);
        muWufengXianluImpl.setUserId(userId);

        if (userName == null) {
            muWufengXianluImpl.setUserName(StringPool.BLANK);
        } else {
            muWufengXianluImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            muWufengXianluImpl.setCreateDate(null);
        } else {
            muWufengXianluImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            muWufengXianluImpl.setModifiedDate(null);
        } else {
            muWufengXianluImpl.setModifiedDate(new Date(modifiedDate));
        }

        muWufengXianluImpl.resetOriginalValues();

        return muWufengXianluImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        hkey = objectInput.readUTF();
        muWufengXianluId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (hkey == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(hkey);
        }

        objectOutput.writeLong(muWufengXianluId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
