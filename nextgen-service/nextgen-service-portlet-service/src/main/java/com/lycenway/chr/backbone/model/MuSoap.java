package com.lycenway.chr.backbone.model;

import com.lycenway.chr.backbone.service.persistence.MuPK;

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
public class MuSoap implements Serializable {
    private String _hkey;
    private String _par;
    private String _title;
    private long _muId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;

    public MuSoap() {
    }

    public static MuSoap toSoapModel(Mu model) {
        MuSoap soapModel = new MuSoap();

        soapModel.setHkey(model.getHkey());
        soapModel.setPar(model.getPar());
        soapModel.setTitle(model.getTitle());
        soapModel.setMuId(model.getMuId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static MuSoap[] toSoapModels(Mu[] models) {
        MuSoap[] soapModels = new MuSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MuSoap[][] toSoapModels(Mu[][] models) {
        MuSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MuSoap[models.length][models[0].length];
        } else {
            soapModels = new MuSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MuSoap[] toSoapModels(List<Mu> models) {
        List<MuSoap> soapModels = new ArrayList<MuSoap>(models.size());

        for (Mu model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MuSoap[soapModels.size()]);
    }

    public MuPK getPrimaryKey() {
        return new MuPK(_hkey, _muId);
    }

    public void setPrimaryKey(MuPK pk) {
        setHkey(pk.hkey);
        setMuId(pk.muId);
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

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public long getMuId() {
        return _muId;
    }

    public void setMuId(long muId) {
        _muId = muId;
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
