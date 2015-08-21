package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.Binghai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Binghai in entity cache.
 *
 * @author lycenway
 * @see Binghai
 * @generated
 */
public class BinghaiCacheModel implements CacheModel<Binghai>, Externalizable {
    public String hkey;
    public String muTitle;
    public String buwei;
    public String tab;
    public String cName;
    public int cId;
    public String c1Name;
    public int c1Id;
    public String c2Name;
    public int c2Id;
    public String binghaiLeixing;
    public String stageName;
    public int stageId;
    public int koufen;
    public String visitContent;
    public String visitedBy;
    public String visitedOn;
    public String revisitedBy;
    public String revisitedOn;
    public int binghaiShuzhi;
    public String gongzuoliangAction;
    public String gongzuoliangName;
    public String gongzuoliangUnit;
    public String gongzuoliangTval;
    public long binghaiId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long proofCount;
    public String referenceRadio;
    public String daochaJson;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(69);

        sb.append("{hkey=");
        sb.append(hkey);
        sb.append(", muTitle=");
        sb.append(muTitle);
        sb.append(", buwei=");
        sb.append(buwei);
        sb.append(", tab=");
        sb.append(tab);
        sb.append(", cName=");
        sb.append(cName);
        sb.append(", cId=");
        sb.append(cId);
        sb.append(", c1Name=");
        sb.append(c1Name);
        sb.append(", c1Id=");
        sb.append(c1Id);
        sb.append(", c2Name=");
        sb.append(c2Name);
        sb.append(", c2Id=");
        sb.append(c2Id);
        sb.append(", binghaiLeixing=");
        sb.append(binghaiLeixing);
        sb.append(", stageName=");
        sb.append(stageName);
        sb.append(", stageId=");
        sb.append(stageId);
        sb.append(", koufen=");
        sb.append(koufen);
        sb.append(", visitContent=");
        sb.append(visitContent);
        sb.append(", visitedBy=");
        sb.append(visitedBy);
        sb.append(", visitedOn=");
        sb.append(visitedOn);
        sb.append(", revisitedBy=");
        sb.append(revisitedBy);
        sb.append(", revisitedOn=");
        sb.append(revisitedOn);
        sb.append(", binghaiShuzhi=");
        sb.append(binghaiShuzhi);
        sb.append(", gongzuoliangAction=");
        sb.append(gongzuoliangAction);
        sb.append(", gongzuoliangName=");
        sb.append(gongzuoliangName);
        sb.append(", gongzuoliangUnit=");
        sb.append(gongzuoliangUnit);
        sb.append(", gongzuoliangTval=");
        sb.append(gongzuoliangTval);
        sb.append(", binghaiId=");
        sb.append(binghaiId);
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
        sb.append(", proofCount=");
        sb.append(proofCount);
        sb.append(", referenceRadio=");
        sb.append(referenceRadio);
        sb.append(", daochaJson=");
        sb.append(daochaJson);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Binghai toEntityModel() {
        BinghaiImpl binghaiImpl = new BinghaiImpl();

        if (hkey == null) {
            binghaiImpl.setHkey(StringPool.BLANK);
        } else {
            binghaiImpl.setHkey(hkey);
        }

        if (muTitle == null) {
            binghaiImpl.setMuTitle(StringPool.BLANK);
        } else {
            binghaiImpl.setMuTitle(muTitle);
        }

        if (buwei == null) {
            binghaiImpl.setBuwei(StringPool.BLANK);
        } else {
            binghaiImpl.setBuwei(buwei);
        }

        if (tab == null) {
            binghaiImpl.setTab(StringPool.BLANK);
        } else {
            binghaiImpl.setTab(tab);
        }

        if (cName == null) {
            binghaiImpl.setCName(StringPool.BLANK);
        } else {
            binghaiImpl.setCName(cName);
        }

        binghaiImpl.setCId(cId);

        if (c1Name == null) {
            binghaiImpl.setC1Name(StringPool.BLANK);
        } else {
            binghaiImpl.setC1Name(c1Name);
        }

        binghaiImpl.setC1Id(c1Id);

        if (c2Name == null) {
            binghaiImpl.setC2Name(StringPool.BLANK);
        } else {
            binghaiImpl.setC2Name(c2Name);
        }

        binghaiImpl.setC2Id(c2Id);

        if (binghaiLeixing == null) {
            binghaiImpl.setBinghaiLeixing(StringPool.BLANK);
        } else {
            binghaiImpl.setBinghaiLeixing(binghaiLeixing);
        }

        if (stageName == null) {
            binghaiImpl.setStageName(StringPool.BLANK);
        } else {
            binghaiImpl.setStageName(stageName);
        }

        binghaiImpl.setStageId(stageId);
        binghaiImpl.setKoufen(koufen);

        if (visitContent == null) {
            binghaiImpl.setVisitContent(StringPool.BLANK);
        } else {
            binghaiImpl.setVisitContent(visitContent);
        }

        if (visitedBy == null) {
            binghaiImpl.setVisitedBy(StringPool.BLANK);
        } else {
            binghaiImpl.setVisitedBy(visitedBy);
        }

        if (visitedOn == null) {
            binghaiImpl.setVisitedOn(StringPool.BLANK);
        } else {
            binghaiImpl.setVisitedOn(visitedOn);
        }

        if (revisitedBy == null) {
            binghaiImpl.setRevisitedBy(StringPool.BLANK);
        } else {
            binghaiImpl.setRevisitedBy(revisitedBy);
        }

        if (revisitedOn == null) {
            binghaiImpl.setRevisitedOn(StringPool.BLANK);
        } else {
            binghaiImpl.setRevisitedOn(revisitedOn);
        }

        binghaiImpl.setBinghaiShuzhi(binghaiShuzhi);

        if (gongzuoliangAction == null) {
            binghaiImpl.setGongzuoliangAction(StringPool.BLANK);
        } else {
            binghaiImpl.setGongzuoliangAction(gongzuoliangAction);
        }

        if (gongzuoliangName == null) {
            binghaiImpl.setGongzuoliangName(StringPool.BLANK);
        } else {
            binghaiImpl.setGongzuoliangName(gongzuoliangName);
        }

        if (gongzuoliangUnit == null) {
            binghaiImpl.setGongzuoliangUnit(StringPool.BLANK);
        } else {
            binghaiImpl.setGongzuoliangUnit(gongzuoliangUnit);
        }

        if (gongzuoliangTval == null) {
            binghaiImpl.setGongzuoliangTval(StringPool.BLANK);
        } else {
            binghaiImpl.setGongzuoliangTval(gongzuoliangTval);
        }

        binghaiImpl.setBinghaiId(binghaiId);
        binghaiImpl.setGroupId(groupId);
        binghaiImpl.setCompanyId(companyId);
        binghaiImpl.setUserId(userId);

        if (userName == null) {
            binghaiImpl.setUserName(StringPool.BLANK);
        } else {
            binghaiImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            binghaiImpl.setCreateDate(null);
        } else {
            binghaiImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            binghaiImpl.setModifiedDate(null);
        } else {
            binghaiImpl.setModifiedDate(new Date(modifiedDate));
        }

        binghaiImpl.setProofCount(proofCount);

        if (referenceRadio == null) {
            binghaiImpl.setReferenceRadio(StringPool.BLANK);
        } else {
            binghaiImpl.setReferenceRadio(referenceRadio);
        }

        if (daochaJson == null) {
            binghaiImpl.setDaochaJson(StringPool.BLANK);
        } else {
            binghaiImpl.setDaochaJson(daochaJson);
        }

        binghaiImpl.resetOriginalValues();

        return binghaiImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        hkey = objectInput.readUTF();
        muTitle = objectInput.readUTF();
        buwei = objectInput.readUTF();
        tab = objectInput.readUTF();
        cName = objectInput.readUTF();
        cId = objectInput.readInt();
        c1Name = objectInput.readUTF();
        c1Id = objectInput.readInt();
        c2Name = objectInput.readUTF();
        c2Id = objectInput.readInt();
        binghaiLeixing = objectInput.readUTF();
        stageName = objectInput.readUTF();
        stageId = objectInput.readInt();
        koufen = objectInput.readInt();
        visitContent = objectInput.readUTF();
        visitedBy = objectInput.readUTF();
        visitedOn = objectInput.readUTF();
        revisitedBy = objectInput.readUTF();
        revisitedOn = objectInput.readUTF();
        binghaiShuzhi = objectInput.readInt();
        gongzuoliangAction = objectInput.readUTF();
        gongzuoliangName = objectInput.readUTF();
        gongzuoliangUnit = objectInput.readUTF();
        gongzuoliangTval = objectInput.readUTF();
        binghaiId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        proofCount = objectInput.readLong();
        referenceRadio = objectInput.readUTF();
        daochaJson = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (hkey == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(hkey);
        }

        if (muTitle == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(muTitle);
        }

        if (buwei == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(buwei);
        }

        if (tab == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tab);
        }

        if (cName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cName);
        }

        objectOutput.writeInt(cId);

        if (c1Name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(c1Name);
        }

        objectOutput.writeInt(c1Id);

        if (c2Name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(c2Name);
        }

        objectOutput.writeInt(c2Id);

        if (binghaiLeixing == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(binghaiLeixing);
        }

        if (stageName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(stageName);
        }

        objectOutput.writeInt(stageId);
        objectOutput.writeInt(koufen);

        if (visitContent == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(visitContent);
        }

        if (visitedBy == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(visitedBy);
        }

        if (visitedOn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(visitedOn);
        }

        if (revisitedBy == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(revisitedBy);
        }

        if (revisitedOn == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(revisitedOn);
        }

        objectOutput.writeInt(binghaiShuzhi);

        if (gongzuoliangAction == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gongzuoliangAction);
        }

        if (gongzuoliangName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gongzuoliangName);
        }

        if (gongzuoliangUnit == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gongzuoliangUnit);
        }

        if (gongzuoliangTval == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gongzuoliangTval);
        }

        objectOutput.writeLong(binghaiId);
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
        objectOutput.writeLong(proofCount);

        if (referenceRadio == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(referenceRadio);
        }

        if (daochaJson == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(daochaJson);
        }
    }
}
