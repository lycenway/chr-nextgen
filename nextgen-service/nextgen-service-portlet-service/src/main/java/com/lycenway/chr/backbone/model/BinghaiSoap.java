package com.lycenway.chr.backbone.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lycenway.chr.backbone.service.http.BinghaiServiceSoap}.
 *
 * @author lycenway
 * @see com.lycenway.chr.backbone.service.http.BinghaiServiceSoap
 * @generated
 */
public class BinghaiSoap implements Serializable {
    private String _hkey;
    private String _muTitle;
    private String _buwei;
    private String _tab;
    private String _cName;
    private int _cId;
    private String _c1Name;
    private int _c1Id;
    private String _c2Name;
    private int _c2Id;
    private String _binghaiLeixing;
    private String _stageName;
    private int _stageId;
    private int _koufen;
    private String _visitContent;
    private String _visitedBy;
    private String _visitedOn;
    private String _revisitedBy;
    private String _revisitedOn;
    private int _binghaiShuzhi;
    private String _gongzuoliangAction;
    private String _gongzuoliangName;
    private String _gongzuoliangUnit;
    private String _gongzuoliangTval;
    private long _binghaiId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _proofCount;
    private String _referenceRadio;
    private String _daochaJson;

    public BinghaiSoap() {
    }

    public static BinghaiSoap toSoapModel(Binghai model) {
        BinghaiSoap soapModel = new BinghaiSoap();

        soapModel.setHkey(model.getHkey());
        soapModel.setMuTitle(model.getMuTitle());
        soapModel.setBuwei(model.getBuwei());
        soapModel.setTab(model.getTab());
        soapModel.setCName(model.getCName());
        soapModel.setCId(model.getCId());
        soapModel.setC1Name(model.getC1Name());
        soapModel.setC1Id(model.getC1Id());
        soapModel.setC2Name(model.getC2Name());
        soapModel.setC2Id(model.getC2Id());
        soapModel.setBinghaiLeixing(model.getBinghaiLeixing());
        soapModel.setStageName(model.getStageName());
        soapModel.setStageId(model.getStageId());
        soapModel.setKoufen(model.getKoufen());
        soapModel.setVisitContent(model.getVisitContent());
        soapModel.setVisitedBy(model.getVisitedBy());
        soapModel.setVisitedOn(model.getVisitedOn());
        soapModel.setRevisitedBy(model.getRevisitedBy());
        soapModel.setRevisitedOn(model.getRevisitedOn());
        soapModel.setBinghaiShuzhi(model.getBinghaiShuzhi());
        soapModel.setGongzuoliangAction(model.getGongzuoliangAction());
        soapModel.setGongzuoliangName(model.getGongzuoliangName());
        soapModel.setGongzuoliangUnit(model.getGongzuoliangUnit());
        soapModel.setGongzuoliangTval(model.getGongzuoliangTval());
        soapModel.setBinghaiId(model.getBinghaiId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setProofCount(model.getProofCount());
        soapModel.setReferenceRadio(model.getReferenceRadio());
        soapModel.setDaochaJson(model.getDaochaJson());

        return soapModel;
    }

    public static BinghaiSoap[] toSoapModels(Binghai[] models) {
        BinghaiSoap[] soapModels = new BinghaiSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BinghaiSoap[][] toSoapModels(Binghai[][] models) {
        BinghaiSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BinghaiSoap[models.length][models[0].length];
        } else {
            soapModels = new BinghaiSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BinghaiSoap[] toSoapModels(List<Binghai> models) {
        List<BinghaiSoap> soapModels = new ArrayList<BinghaiSoap>(models.size());

        for (Binghai model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BinghaiSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _binghaiId;
    }

    public void setPrimaryKey(long pk) {
        setBinghaiId(pk);
    }

    public String getHkey() {
        return _hkey;
    }

    public void setHkey(String hkey) {
        _hkey = hkey;
    }

    public String getMuTitle() {
        return _muTitle;
    }

    public void setMuTitle(String muTitle) {
        _muTitle = muTitle;
    }

    public String getBuwei() {
        return _buwei;
    }

    public void setBuwei(String buwei) {
        _buwei = buwei;
    }

    public String getTab() {
        return _tab;
    }

    public void setTab(String tab) {
        _tab = tab;
    }

    public String getCName() {
        return _cName;
    }

    public void setCName(String cName) {
        _cName = cName;
    }

    public int getCId() {
        return _cId;
    }

    public void setCId(int cId) {
        _cId = cId;
    }

    public String getC1Name() {
        return _c1Name;
    }

    public void setC1Name(String c1Name) {
        _c1Name = c1Name;
    }

    public int getC1Id() {
        return _c1Id;
    }

    public void setC1Id(int c1Id) {
        _c1Id = c1Id;
    }

    public String getC2Name() {
        return _c2Name;
    }

    public void setC2Name(String c2Name) {
        _c2Name = c2Name;
    }

    public int getC2Id() {
        return _c2Id;
    }

    public void setC2Id(int c2Id) {
        _c2Id = c2Id;
    }

    public String getBinghaiLeixing() {
        return _binghaiLeixing;
    }

    public void setBinghaiLeixing(String binghaiLeixing) {
        _binghaiLeixing = binghaiLeixing;
    }

    public String getStageName() {
        return _stageName;
    }

    public void setStageName(String stageName) {
        _stageName = stageName;
    }

    public int getStageId() {
        return _stageId;
    }

    public void setStageId(int stageId) {
        _stageId = stageId;
    }

    public int getKoufen() {
        return _koufen;
    }

    public void setKoufen(int koufen) {
        _koufen = koufen;
    }

    public String getVisitContent() {
        return _visitContent;
    }

    public void setVisitContent(String visitContent) {
        _visitContent = visitContent;
    }

    public String getVisitedBy() {
        return _visitedBy;
    }

    public void setVisitedBy(String visitedBy) {
        _visitedBy = visitedBy;
    }

    public String getVisitedOn() {
        return _visitedOn;
    }

    public void setVisitedOn(String visitedOn) {
        _visitedOn = visitedOn;
    }

    public String getRevisitedBy() {
        return _revisitedBy;
    }

    public void setRevisitedBy(String revisitedBy) {
        _revisitedBy = revisitedBy;
    }

    public String getRevisitedOn() {
        return _revisitedOn;
    }

    public void setRevisitedOn(String revisitedOn) {
        _revisitedOn = revisitedOn;
    }

    public int getBinghaiShuzhi() {
        return _binghaiShuzhi;
    }

    public void setBinghaiShuzhi(int binghaiShuzhi) {
        _binghaiShuzhi = binghaiShuzhi;
    }

    public String getGongzuoliangAction() {
        return _gongzuoliangAction;
    }

    public void setGongzuoliangAction(String gongzuoliangAction) {
        _gongzuoliangAction = gongzuoliangAction;
    }

    public String getGongzuoliangName() {
        return _gongzuoliangName;
    }

    public void setGongzuoliangName(String gongzuoliangName) {
        _gongzuoliangName = gongzuoliangName;
    }

    public String getGongzuoliangUnit() {
        return _gongzuoliangUnit;
    }

    public void setGongzuoliangUnit(String gongzuoliangUnit) {
        _gongzuoliangUnit = gongzuoliangUnit;
    }

    public String getGongzuoliangTval() {
        return _gongzuoliangTval;
    }

    public void setGongzuoliangTval(String gongzuoliangTval) {
        _gongzuoliangTval = gongzuoliangTval;
    }

    public long getBinghaiId() {
        return _binghaiId;
    }

    public void setBinghaiId(long binghaiId) {
        _binghaiId = binghaiId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public long getProofCount() {
        return _proofCount;
    }

    public void setProofCount(long proofCount) {
        _proofCount = proofCount;
    }

    public String getReferenceRadio() {
        return _referenceRadio;
    }

    public void setReferenceRadio(String referenceRadio) {
        _referenceRadio = referenceRadio;
    }

    public String getDaochaJson() {
        return _daochaJson;
    }

    public void setDaochaJson(String daochaJson) {
        _daochaJson = daochaJson;
    }
}
