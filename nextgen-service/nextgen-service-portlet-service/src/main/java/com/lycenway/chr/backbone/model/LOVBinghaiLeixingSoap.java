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
public class LOVBinghaiLeixingSoap implements Serializable {
    private String _code;
    private String _title;

    public LOVBinghaiLeixingSoap() {
    }

    public static LOVBinghaiLeixingSoap toSoapModel(LOVBinghaiLeixing model) {
        LOVBinghaiLeixingSoap soapModel = new LOVBinghaiLeixingSoap();

        soapModel.setCode(model.getCode());
        soapModel.setTitle(model.getTitle());

        return soapModel;
    }

    public static LOVBinghaiLeixingSoap[] toSoapModels(
        LOVBinghaiLeixing[] models) {
        LOVBinghaiLeixingSoap[] soapModels = new LOVBinghaiLeixingSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LOVBinghaiLeixingSoap[][] toSoapModels(
        LOVBinghaiLeixing[][] models) {
        LOVBinghaiLeixingSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LOVBinghaiLeixingSoap[models.length][models[0].length];
        } else {
            soapModels = new LOVBinghaiLeixingSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LOVBinghaiLeixingSoap[] toSoapModels(
        List<LOVBinghaiLeixing> models) {
        List<LOVBinghaiLeixingSoap> soapModels = new ArrayList<LOVBinghaiLeixingSoap>(models.size());

        for (LOVBinghaiLeixing model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LOVBinghaiLeixingSoap[soapModels.size()]);
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
