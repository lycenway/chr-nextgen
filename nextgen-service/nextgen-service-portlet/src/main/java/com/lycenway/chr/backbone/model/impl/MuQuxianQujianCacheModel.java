package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.MuQuxianQujian;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MuQuxianQujian in entity cache.
 *
 * @author lycenway
 * @see MuQuxianQujian
 * @generated
 */
public class MuQuxianQujianCacheModel implements CacheModel<MuQuxianQujian>,
    Externalizable {
    public String hkey;
    public long muQuxianQujianId;
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
        sb.append(", muQuxianQujianId=");
        sb.append(muQuxianQujianId);
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
    public MuQuxianQujian toEntityModel() {
        MuQuxianQujianImpl muQuxianQujianImpl = new MuQuxianQujianImpl();

        if (hkey == null) {
            muQuxianQujianImpl.setHkey(StringPool.BLANK);
        } else {
            muQuxianQujianImpl.setHkey(hkey);
        }

        muQuxianQujianImpl.setMuQuxianQujianId(muQuxianQujianId);
        muQuxianQujianImpl.setGroupId(groupId);
        muQuxianQujianImpl.setCompanyId(companyId);
        muQuxianQujianImpl.setUserId(userId);

        if (userName == null) {
            muQuxianQujianImpl.setUserName(StringPool.BLANK);
        } else {
            muQuxianQujianImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            muQuxianQujianImpl.setCreateDate(null);
        } else {
            muQuxianQujianImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            muQuxianQujianImpl.setModifiedDate(null);
        } else {
            muQuxianQujianImpl.setModifiedDate(new Date(modifiedDate));
        }

        muQuxianQujianImpl.resetOriginalValues();

        return muQuxianQujianImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        hkey = objectInput.readUTF();
        muQuxianQujianId = objectInput.readLong();
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

        objectOutput.writeLong(muQuxianQujianId);
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
