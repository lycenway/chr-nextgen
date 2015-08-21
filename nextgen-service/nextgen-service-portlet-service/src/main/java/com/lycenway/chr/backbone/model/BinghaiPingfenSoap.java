package com.lycenway.chr.backbone.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lycenway.chr.backbone.service.http.BinghaiPingfenServiceSoap}.
 *
 * @author lycenway
 * @see com.lycenway.chr.backbone.service.http.BinghaiPingfenServiceSoap
 * @generated
 */
public class BinghaiPingfenSoap implements Serializable {
    private long _binghaiPingfenId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _dalei;
    private double _vmin;
    private double _vmax;
    private String _xiangmu;
    private String _dengji;
    private double _dengji_min;
    private double _dengji_max;

    public BinghaiPingfenSoap() {
    }

    public static BinghaiPingfenSoap toSoapModel(BinghaiPingfen model) {
        BinghaiPingfenSoap soapModel = new BinghaiPingfenSoap();

        soapModel.setBinghaiPingfenId(model.getBinghaiPingfenId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setDalei(model.getDalei());
        soapModel.setVmin(model.getVmin());
        soapModel.setVmax(model.getVmax());
        soapModel.setXiangmu(model.getXiangmu());
        soapModel.setDengji(model.getDengji());
        soapModel.setDengji_min(model.getDengji_min());
        soapModel.setDengji_max(model.getDengji_max());

        return soapModel;
    }

    public static BinghaiPingfenSoap[] toSoapModels(BinghaiPingfen[] models) {
        BinghaiPingfenSoap[] soapModels = new BinghaiPingfenSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BinghaiPingfenSoap[][] toSoapModels(BinghaiPingfen[][] models) {
        BinghaiPingfenSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BinghaiPingfenSoap[models.length][models[0].length];
        } else {
            soapModels = new BinghaiPingfenSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BinghaiPingfenSoap[] toSoapModels(List<BinghaiPingfen> models) {
        List<BinghaiPingfenSoap> soapModels = new ArrayList<BinghaiPingfenSoap>(models.size());

        for (BinghaiPingfen model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BinghaiPingfenSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _binghaiPingfenId;
    }

    public void setPrimaryKey(long pk) {
        setBinghaiPingfenId(pk);
    }

    public long getBinghaiPingfenId() {
        return _binghaiPingfenId;
    }

    public void setBinghaiPingfenId(long binghaiPingfenId) {
        _binghaiPingfenId = binghaiPingfenId;
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

    public String getDalei() {
        return _dalei;
    }

    public void setDalei(String dalei) {
        _dalei = dalei;
    }

    public double getVmin() {
        return _vmin;
    }

    public void setVmin(double vmin) {
        _vmin = vmin;
    }

    public double getVmax() {
        return _vmax;
    }

    public void setVmax(double vmax) {
        _vmax = vmax;
    }

    public String getXiangmu() {
        return _xiangmu;
    }

    public void setXiangmu(String xiangmu) {
        _xiangmu = xiangmu;
    }

    public String getDengji() {
        return _dengji;
    }

    public void setDengji(String dengji) {
        _dengji = dengji;
    }

    public double getDengji_min() {
        return _dengji_min;
    }

    public void setDengji_min(double dengji_min) {
        _dengji_min = dengji_min;
    }

    public double getDengji_max() {
        return _dengji_max;
    }

    public void setDengji_max(double dengji_max) {
        _dengji_max = dengji_max;
    }
}
