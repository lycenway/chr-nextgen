package com.lycenway.chr.backbone.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author lycenway
 * @generated
 */
public class MuQuxianQujianSoap implements Serializable {
    private String _hkey;
    private long _muQuxianQujianId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;

    public MuQuxianQujianSoap() {
    }

    public static MuQuxianQujianSoap toSoapModel(MuQuxianQujian model) {
        MuQuxianQujianSoap soapModel = new MuQuxianQujianSoap();

        soapModel.setHkey(model.getHkey());
        soapModel.setMuQuxianQujianId(model.getMuQuxianQujianId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static MuQuxianQujianSoap[] toSoapModels(MuQuxianQujian[] models) {
        MuQuxianQujianSoap[] soapModels = new MuQuxianQujianSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MuQuxianQujianSoap[][] toSoapModels(MuQuxianQujian[][] models) {
        MuQuxianQujianSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MuQuxianQujianSoap[models.length][models[0].length];
        } else {
            soapModels = new MuQuxianQujianSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MuQuxianQujianSoap[] toSoapModels(List<MuQuxianQujian> models) {
        List<MuQuxianQujianSoap> soapModels = new ArrayList<MuQuxianQujianSoap>(models.size());

        for (MuQuxianQujian model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MuQuxianQujianSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _muQuxianQujianId;
    }

    public void setPrimaryKey(long pk) {
        setMuQuxianQujianId(pk);
    }

    public String getHkey() {
        return _hkey;
    }

    public void setHkey(String hkey) {
        _hkey = hkey;
    }

    public long getMuQuxianQujianId() {
        return _muQuxianQujianId;
    }

    public void setMuQuxianQujianId(long muQuxianQujianId) {
        _muQuxianQujianId = muQuxianQujianId;
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
