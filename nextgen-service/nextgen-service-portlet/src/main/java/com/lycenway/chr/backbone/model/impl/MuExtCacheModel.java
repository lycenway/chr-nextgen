package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.MuExt;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MuExt in entity cache.
 *
 * @author lycenway
 * @see MuExt
 * @generated
 */
public class MuExtCacheModel implements CacheModel<MuExt>, Externalizable {
    public String hkey;
    public String value;
    public long muExtId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String key;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{hkey=");
        sb.append(hkey);
        sb.append(", value=");
        sb.append(value);
        sb.append(", muExtId=");
        sb.append(muExtId);
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
        sb.append(", key=");
        sb.append(key);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public MuExt toEntityModel() {
        MuExtImpl muExtImpl = new MuExtImpl();

        if (hkey == null) {
            muExtImpl.setHkey(StringPool.BLANK);
        } else {
            muExtImpl.setHkey(hkey);
        }

        if (value == null) {
            muExtImpl.setValue(StringPool.BLANK);
        } else {
            muExtImpl.setValue(value);
        }

        muExtImpl.setMuExtId(muExtId);
        muExtImpl.setGroupId(groupId);
        muExtImpl.setCompanyId(companyId);
        muExtImpl.setUserId(userId);

        if (userName == null) {
            muExtImpl.setUserName(StringPool.BLANK);
        } else {
            muExtImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            muExtImpl.setCreateDate(null);
        } else {
            muExtImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            muExtImpl.setModifiedDate(null);
        } else {
            muExtImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (key == null) {
            muExtImpl.setKey(StringPool.BLANK);
        } else {
            muExtImpl.setKey(key);
        }

        muExtImpl.resetOriginalValues();

        return muExtImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        hkey = objectInput.readUTF();
        value = objectInput.readUTF();
        muExtId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        key = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (hkey == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(hkey);
        }

        if (value == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(value);
        }

        objectOutput.writeLong(muExtId);
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

        if (key == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(key);
        }
    }
}
