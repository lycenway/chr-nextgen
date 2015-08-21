package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.MuZhengxianPodao;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MuZhengxianPodao in entity cache.
 *
 * @author lycenway
 * @see MuZhengxianPodao
 * @generated
 */
public class MuZhengxianPodaoCacheModel implements CacheModel<MuZhengxianPodao>,
    Externalizable {
    public String hkey;
    public long muZhengxianPodaoId;
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
        sb.append(", muZhengxianPodaoId=");
        sb.append(muZhengxianPodaoId);
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
    public MuZhengxianPodao toEntityModel() {
        MuZhengxianPodaoImpl muZhengxianPodaoImpl = new MuZhengxianPodaoImpl();

        if (hkey == null) {
            muZhengxianPodaoImpl.setHkey(StringPool.BLANK);
        } else {
            muZhengxianPodaoImpl.setHkey(hkey);
        }

        muZhengxianPodaoImpl.setMuZhengxianPodaoId(muZhengxianPodaoId);
        muZhengxianPodaoImpl.setGroupId(groupId);
        muZhengxianPodaoImpl.setCompanyId(companyId);
        muZhengxianPodaoImpl.setUserId(userId);

        if (userName == null) {
            muZhengxianPodaoImpl.setUserName(StringPool.BLANK);
        } else {
            muZhengxianPodaoImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            muZhengxianPodaoImpl.setCreateDate(null);
        } else {
            muZhengxianPodaoImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            muZhengxianPodaoImpl.setModifiedDate(null);
        } else {
            muZhengxianPodaoImpl.setModifiedDate(new Date(modifiedDate));
        }

        muZhengxianPodaoImpl.resetOriginalValues();

        return muZhengxianPodaoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        hkey = objectInput.readUTF();
        muZhengxianPodaoId = objectInput.readLong();
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

        objectOutput.writeLong(muZhengxianPodaoId);
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
