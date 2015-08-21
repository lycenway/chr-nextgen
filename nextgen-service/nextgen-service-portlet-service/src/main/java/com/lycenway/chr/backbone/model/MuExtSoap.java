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
public class MuExtSoap implements Serializable {
    private String _hkey;
    private String _value;
    private long _muExtId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _key;

    public MuExtSoap() {
    }

    public static MuExtSoap toSoapModel(MuExt model) {
        MuExtSoap soapModel = new MuExtSoap();

        soapModel.setHkey(model.getHkey());
        soapModel.setValue(model.getValue());
        soapModel.setMuExtId(model.getMuExtId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setKey(model.getKey());

        return soapModel;
    }

    public static MuExtSoap[] toSoapModels(MuExt[] models) {
        MuExtSoap[] soapModels = new MuExtSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MuExtSoap[][] toSoapModels(MuExt[][] models) {
        MuExtSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MuExtSoap[models.length][models[0].length];
        } else {
            soapModels = new MuExtSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MuExtSoap[] toSoapModels(List<MuExt> models) {
        List<MuExtSoap> soapModels = new ArrayList<MuExtSoap>(models.size());

        for (MuExt model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MuExtSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _muExtId;
    }

    public void setPrimaryKey(long pk) {
        setMuExtId(pk);
    }

    public String getHkey() {
        return _hkey;
    }

    public void setHkey(String hkey) {
        _hkey = hkey;
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }

    public long getMuExtId() {
        return _muExtId;
    }

    public void setMuExtId(long muExtId) {
        _muExtId = muExtId;
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

    public String getKey() {
        return _key;
    }

    public void setKey(String key) {
        _key = key;
    }
}
