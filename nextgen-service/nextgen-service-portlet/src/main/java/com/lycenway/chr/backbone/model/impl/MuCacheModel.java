package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.Mu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Mu in entity cache.
 *
 * @author lycenway
 * @see Mu
 * @generated
 */
public class MuCacheModel implements CacheModel<Mu>, Externalizable {
    public String hkey;
    public String par;
    public String title;
    public long muId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{hkey=");
        sb.append(hkey);
        sb.append(", par=");
        sb.append(par);
        sb.append(", title=");
        sb.append(title);
        sb.append(", muId=");
        sb.append(muId);
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
    public Mu toEntityModel() {
        MuImpl muImpl = new MuImpl();

        if (hkey == null) {
            muImpl.setHkey(StringPool.BLANK);
        } else {
            muImpl.setHkey(hkey);
        }

        if (par == null) {
            muImpl.setPar(StringPool.BLANK);
        } else {
            muImpl.setPar(par);
        }

        if (title == null) {
            muImpl.setTitle(StringPool.BLANK);
        } else {
            muImpl.setTitle(title);
        }

        muImpl.setMuId(muId);
        muImpl.setGroupId(groupId);
        muImpl.setCompanyId(companyId);
        muImpl.setUserId(userId);

        if (userName == null) {
            muImpl.setUserName(StringPool.BLANK);
        } else {
            muImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            muImpl.setCreateDate(null);
        } else {
            muImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            muImpl.setModifiedDate(null);
        } else {
            muImpl.setModifiedDate(new Date(modifiedDate));
        }

        muImpl.resetOriginalValues();

        return muImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        hkey = objectInput.readUTF();
        par = objectInput.readUTF();
        title = objectInput.readUTF();
        muId = objectInput.readLong();
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

        if (par == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(par);
        }

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        objectOutput.writeLong(muId);
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
