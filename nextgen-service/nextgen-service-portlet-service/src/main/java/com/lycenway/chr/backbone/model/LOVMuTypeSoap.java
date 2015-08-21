package com.lycenway.chr.backbone.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author lycenway
 * @generated
 */
public class LOVMuTypeSoap implements Serializable {
    private String _code;
    private String _title;

    public LOVMuTypeSoap() {
    }

    public static LOVMuTypeSoap toSoapModel(LOVMuType model) {
        LOVMuTypeSoap soapModel = new LOVMuTypeSoap();

        soapModel.setCode(model.getCode());
        soapModel.setTitle(model.getTitle());

        return soapModel;
    }

    public static LOVMuTypeSoap[] toSoapModels(LOVMuType[] models) {
        LOVMuTypeSoap[] soapModels = new LOVMuTypeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LOVMuTypeSoap[][] toSoapModels(LOVMuType[][] models) {
        LOVMuTypeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LOVMuTypeSoap[models.length][models[0].length];
        } else {
            soapModels = new LOVMuTypeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LOVMuTypeSoap[] toSoapModels(List<LOVMuType> models) {
        List<LOVMuTypeSoap> soapModels = new ArrayList<LOVMuTypeSoap>(models.size());

        for (LOVMuType model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LOVMuTypeSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _code;
    }

    public void setPrimaryKey(String pk) {
        setCode(pk);
    }

    public String getCode() {
        return _code;
    }

    public void setCode(String code) {
        _code = code;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }
}
