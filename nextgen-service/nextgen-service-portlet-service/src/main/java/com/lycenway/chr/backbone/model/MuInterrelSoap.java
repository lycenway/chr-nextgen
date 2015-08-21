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
public class MuInterrelSoap implements Serializable {
    private String _hkey;
    private String _par;
    private String _type;
    private long _muInterrelId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;

    public MuInterrelSoap() {
    }

    public static MuInterrelSoap toSoapModel(MuInterrel model) {
        MuInterrelSoap soapModel = new MuInterrelSoap();

        soapModel.setHkey(model.getHkey());
        soapModel.setPar(model.getPar());
        soapModel.setType(model.getType());
        soapModel.setMuInterrelId(model.getMuInterrelId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static MuInterrelSoap[] toSoapModels(MuInterrel[] models) {
        MuInterrelSoap[] soapModels = new MuInterrelSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MuInterrelSoap[][] toSoapModels(MuInterrel[][] models) {
        MuInterrelSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MuInterrelSoap[models.length][models[0].length];
        } else {
            soapModels = new MuInterrelSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MuInterrelSoap[] toSoapModels(List<MuInterrel> models) {
        List<MuInterrelSoap> soapModels = new ArrayList<MuInterrelSoap>(models.size());

        for (MuInterrel model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MuInterrelSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _muInterrelId;
    }

    public void setPrimaryKey(long pk) {
        setMuInterrelId(pk);
    }

    public String getHkey() {
        return _hkey;
    }

    public void setHkey(String hkey) {
        _hkey = hkey;
    }

    public String getPar() {
        return _par;
    }

    public void setPar(String par) {
        _par = par;
    }

    public String getType() {
        return _type;
    }

    public void setType(String type) {
        _type = type;
    }

    public long getMuInterrelId() {
        return _muInterrelId;
    }

    public void setMuInterrelId(long muInterrelId) {
        _muInterrelId = muInterrelId;
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
