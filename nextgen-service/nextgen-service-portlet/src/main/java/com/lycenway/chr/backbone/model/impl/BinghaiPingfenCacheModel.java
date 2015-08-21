package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.BinghaiPingfen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BinghaiPingfen in entity cache.
 *
 * @author lycenway
 * @see BinghaiPingfen
 * @generated
 */
public class BinghaiPingfenCacheModel implements CacheModel<BinghaiPingfen>,
    Externalizable {
    public long binghaiPingfenId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String dalei;
    public double vmin;
    public double vmax;
    public String xiangmu;
    public String dengji;
    public double dengji_min;
    public double dengji_max;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{binghaiPingfenId=");
        sb.append(binghaiPingfenId);
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
        sb.append(", dalei=");
        sb.append(dalei);
        sb.append(", vmin=");
        sb.append(vmin);
        sb.append(", vmax=");
        sb.append(vmax);
        sb.append(", xiangmu=");
        sb.append(xiangmu);
        sb.append(", dengji=");
        sb.append(dengji);
        sb.append(", dengji_min=");
        sb.append(dengji_min);
        sb.append(", dengji_max=");
        sb.append(dengji_max);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public BinghaiPingfen toEntityModel() {
        BinghaiPingfenImpl binghaiPingfenImpl = new BinghaiPingfenImpl();

        binghaiPingfenImpl.setBinghaiPingfenId(binghaiPingfenId);
        binghaiPingfenImpl.setGroupId(groupId);
        binghaiPingfenImpl.setCompanyId(companyId);
        binghaiPingfenImpl.setUserId(userId);

        if (userName == null) {
            binghaiPingfenImpl.setUserName(StringPool.BLANK);
        } else {
            binghaiPingfenImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            binghaiPingfenImpl.setCreateDate(null);
        } else {
            binghaiPingfenImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            binghaiPingfenImpl.setModifiedDate(null);
        } else {
            binghaiPingfenImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (dalei == null) {
            binghaiPingfenImpl.setDalei(StringPool.BLANK);
        } else {
            binghaiPingfenImpl.setDalei(dalei);
        }

        binghaiPingfenImpl.setVmin(vmin);
        binghaiPingfenImpl.setVmax(vmax);

        if (xiangmu == null) {
            binghaiPingfenImpl.setXiangmu(StringPool.BLANK);
        } else {
            binghaiPingfenImpl.setXiangmu(xiangmu);
        }

        if (dengji == null) {
            binghaiPingfenImpl.setDengji(StringPool.BLANK);
        } else {
            binghaiPingfenImpl.setDengji(dengji);
        }

        binghaiPingfenImpl.setDengji_min(dengji_min);
        binghaiPingfenImpl.setDengji_max(dengji_max);

        binghaiPingfenImpl.resetOriginalValues();

        return binghaiPingfenImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        binghaiPingfenId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        dalei = objectInput.readUTF();
        vmin = objectInput.readDouble();
        vmax = objectInput.readDouble();
        xiangmu = objectInput.readUTF();
        dengji = objectInput.readUTF();
        dengji_min = objectInput.readDouble();
        dengji_max = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(binghaiPingfenId);
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

        if (dalei == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dalei);
        }

        objectOutput.writeDouble(vmin);
        objectOutput.writeDouble(vmax);

        if (xiangmu == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(xiangmu);
        }

        if (dengji == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dengji);
        }

        objectOutput.writeDouble(dengji_min);
        objectOutput.writeDouble(dengji_max);
    }
}
