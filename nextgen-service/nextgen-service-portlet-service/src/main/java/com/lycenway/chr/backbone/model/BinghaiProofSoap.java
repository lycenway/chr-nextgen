package com.lycenway.chr.backbone.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lycenway.chr.backbone.service.http.BinghaiProofServiceSoap}.
 *
 * @author lycenway
 * @see com.lycenway.chr.backbone.service.http.BinghaiProofServiceSoap
 * @generated
 */
public class BinghaiProofSoap implements Serializable {
    private String _mime;
    private String _url;
    private String _binghaiId;
    private long _binghaiProofId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;

    public BinghaiProofSoap() {
    }

    public static BinghaiProofSoap toSoapModel(BinghaiProof model) {
        BinghaiProofSoap soapModel = new BinghaiProofSoap();

        soapModel.setMime(model.getMime());
        soapModel.setUrl(model.getUrl());
        soapModel.setBinghaiId(model.getBinghaiId());
        soapModel.setBinghaiProofId(model.getBinghaiProofId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static BinghaiProofSoap[] toSoapModels(BinghaiProof[] models) {
        BinghaiProofSoap[] soapModels = new BinghaiProofSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BinghaiProofSoap[][] toSoapModels(BinghaiProof[][] models) {
        BinghaiProofSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BinghaiProofSoap[models.length][models[0].length];
        } else {
            soapModels = new BinghaiProofSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BinghaiProofSoap[] toSoapModels(List<BinghaiProof> models) {
        List<BinghaiProofSoap> soapModels = new ArrayList<BinghaiProofSoap>(models.size());

        for (BinghaiProof model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BinghaiProofSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _binghaiProofId;
    }

    public void setPrimaryKey(long pk) {
        setBinghaiProofId(pk);
    }

    public String getMime() {
        return _mime;
    }

    public void setMime(String mime) {
        _mime = mime;
    }

    public String getUrl() {
        return _url;
    }

    public void setUrl(String url) {
        _url = url;
    }

    public String getBinghaiId() {
        return _binghaiId;
    }

    public void setBinghaiId(String binghaiId) {
        _binghaiId = binghaiId;
    }

    public long getBinghaiProofId() {
        return _binghaiProofId;
    }

    public void setBinghaiProofId(long binghaiProofId) {
        _binghaiProofId = binghaiProofId;
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
}
