package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.BinghaiProof;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BinghaiProof in entity cache.
 *
 * @author lycenway
 * @see BinghaiProof
 * @generated
 */
public class BinghaiProofCacheModel implements CacheModel<BinghaiProof>,
    Externalizable {
    public String mime;
    public String url;
    public String binghaiId;
    public long binghaiProofId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{mime=");
        sb.append(mime);
        sb.append(", url=");
        sb.append(url);
        sb.append(", binghaiId=");
        sb.append(binghaiId);
        sb.append(", binghaiProofId=");
        sb.append(binghaiProofId);
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
    public BinghaiProof toEntityModel() {
        BinghaiProofImpl binghaiProofImpl = new BinghaiProofImpl();

        if (mime == null) {
            binghaiProofImpl.setMime(StringPool.BLANK);
        } else {
            binghaiProofImpl.setMime(mime);
        }

        if (url == null) {
            binghaiProofImpl.setUrl(StringPool.BLANK);
        } else {
            binghaiProofImpl.setUrl(url);
        }

        if (binghaiId == null) {
            binghaiProofImpl.setBinghaiId(StringPool.BLANK);
        } else {
            binghaiProofImpl.setBinghaiId(binghaiId);
        }

        binghaiProofImpl.setBinghaiProofId(binghaiProofId);
        binghaiProofImpl.setGroupId(groupId);
        binghaiProofImpl.setCompanyId(companyId);
        binghaiProofImpl.setUserId(userId);

        if (userName == null) {
            binghaiProofImpl.setUserName(StringPool.BLANK);
        } else {
            binghaiProofImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            binghaiProofImpl.setCreateDate(null);
        } else {
            binghaiProofImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            binghaiProofImpl.setModifiedDate(null);
        } else {
            binghaiProofImpl.setModifiedDate(new Date(modifiedDate));
        }

        binghaiProofImpl.resetOriginalValues();

        return binghaiProofImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        mime = objectInput.readUTF();
        url = objectInput.readUTF();
        binghaiId = objectInput.readUTF();
        binghaiProofId = objectInput.readLong();
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
        if (mime == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(mime);
        }

        if (url == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(url);
        }

        if (binghaiId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(binghaiId);
        }

        objectOutput.writeLong(binghaiProofId);
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
