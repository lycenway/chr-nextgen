package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.MuInterrel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MuInterrel in entity cache.
 *
 * @author lycenway
 * @see MuInterrel
 * @generated
 */
public class MuInterrelCacheModel implements CacheModel<MuInterrel>,
    Externalizable {
    public String hkey;
    public String par;
    public String type;
    public long muInterrelId;
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
        sb.append(", type=");
        sb.append(type);
        sb.append(", muInterrelId=");
        sb.append(muInterrelId);
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
    public MuInterrel toEntityModel() {
        MuInterrelImpl muInterrelImpl = new MuInterrelImpl();

        if (hkey == null) {
            muInterrelImpl.setHkey(StringPool.BLANK);
        } else {
            muInterrelImpl.setHkey(hkey);
        }

        if (par == null) {
            muInterrelImpl.setPar(StringPool.BLANK);
        } else {
            muInterrelImpl.setPar(par);
        }

        if (type == null) {
            muInterrelImpl.setType(StringPool.BLANK);
        } else {
            muInterrelImpl.setType(type);
        }

        muInterrelImpl.setMuInterrelId(muInterrelId);
        muInterrelImpl.setGroupId(groupId);
        muInterrelImpl.setCompanyId(companyId);
        muInterrelImpl.setUserId(userId);

        if (userName == null) {
            muInterrelImpl.setUserName(StringPool.BLANK);
        } else {
            muInterrelImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            muInterrelImpl.setCreateDate(null);
        } else {
            muInterrelImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            muInterrelImpl.setModifiedDate(null);
        } else {
            muInterrelImpl.setModifiedDate(new Date(modifiedDate));
        }

        muInterrelImpl.resetOriginalValues();

        return muInterrelImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        hkey = objectInput.readUTF();
        par = objectInput.readUTF();
        type = objectInput.readUTF();
        muInterrelId = objectInput.readLong();
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

        if (type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(type);
        }

        objectOutput.writeLong(muInterrelId);
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
