package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.lycenway.chr.backbone.service.BinghaiLocalServiceUtil;
import com.lycenway.chr.backbone.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BinghaiClp extends BaseModelImpl<Binghai> implements Binghai {
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
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _proofCount;
    private String _referenceRadio;
    private String _daochaJson;
    private BaseModel<?> _binghaiRemoteModel;
    private Class<?> _clpSerializerClass = com.lycenway.chr.backbone.service.ClpSerializer.class;

    public BinghaiClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Binghai.class;
    }

    @Override
    public String getModelClassName() {
        return Binghai.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _binghaiId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBinghaiId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _binghaiId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("hkey", getHkey());
        attributes.put("muTitle", getMuTitle());
        attributes.put("buwei", getBuwei());
        attributes.put("tab", getTab());
        attributes.put("cName", getCName());
        attributes.put("cId", getCId());
        attributes.put("c1Name", getC1Name());
        attributes.put("c1Id", getC1Id());
        attributes.put("c2Name", getC2Name());
        attributes.put("c2Id", getC2Id());
        attributes.put("binghaiLeixing", getBinghaiLeixing());
        attributes.put("stageName", getStageName());
        attributes.put("stageId", getStageId());
        attributes.put("koufen", getKoufen());
        attributes.put("visitContent", getVisitContent());
        attributes.put("visitedBy", getVisitedBy());
        attributes.put("visitedOn", getVisitedOn());
        attributes.put("revisitedBy", getRevisitedBy());
        attributes.put("revisitedOn", getRevisitedOn());
        attributes.put("binghaiShuzhi", getBinghaiShuzhi());
        attributes.put("gongzuoliangAction", getGongzuoliangAction());
        attributes.put("gongzuoliangName", getGongzuoliangName());
        attributes.put("gongzuoliangUnit", getGongzuoliangUnit());
        attributes.put("gongzuoliangTval", getGongzuoliangTval());
        attributes.put("binghaiId", getBinghaiId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("proofCount", getProofCount());
        attributes.put("referenceRadio", getReferenceRadio());
        attributes.put("daochaJson", getDaochaJson());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String hkey = (String) attributes.get("hkey");

        if (hkey != null) {
            setHkey(hkey);
        }

        String muTitle = (String) attributes.get("muTitle");

        if (muTitle != null) {
            setMuTitle(muTitle);
        }

        String buwei = (String) attributes.get("buwei");

        if (buwei != null) {
            setBuwei(buwei);
        }

        String tab = (String) attributes.get("tab");

        if (tab != null) {
            setTab(tab);
        }

        String cName = (String) attributes.get("cName");

        if (cName != null) {
            setCName(cName);
        }

        Integer cId = (Integer) attributes.get("cId");

        if (cId != null) {
            setCId(cId);
        }

        String c1Name = (String) attributes.get("c1Name");

        if (c1Name != null) {
            setC1Name(c1Name);
        }

        Integer c1Id = (Integer) attributes.get("c1Id");

        if (c1Id != null) {
            setC1Id(c1Id);
        }

        String c2Name = (String) attributes.get("c2Name");

        if (c2Name != null) {
            setC2Name(c2Name);
        }

        Integer c2Id = (Integer) attributes.get("c2Id");

        if (c2Id != null) {
            setC2Id(c2Id);
        }

        String binghaiLeixing = (String) attributes.get("binghaiLeixing");

        if (binghaiLeixing != null) {
            setBinghaiLeixing(binghaiLeixing);
        }

        String stageName = (String) attributes.get("stageName");

        if (stageName != null) {
            setStageName(stageName);
        }

        Integer stageId = (Integer) attributes.get("stageId");

        if (stageId != null) {
            setStageId(stageId);
        }

        Integer koufen = (Integer) attributes.get("koufen");

        if (koufen != null) {
            setKoufen(koufen);
        }

        String visitContent = (String) attributes.get("visitContent");

        if (visitContent != null) {
            setVisitContent(visitContent);
        }

        String visitedBy = (String) attributes.get("visitedBy");

        if (visitedBy != null) {
            setVisitedBy(visitedBy);
        }

        String visitedOn = (String) attributes.get("visitedOn");

        if (visitedOn != null) {
            setVisitedOn(visitedOn);
        }

        String revisitedBy = (String) attributes.get("revisitedBy");

        if (revisitedBy != null) {
            setRevisitedBy(revisitedBy);
        }

        String revisitedOn = (String) attributes.get("revisitedOn");

        if (revisitedOn != null) {
            setRevisitedOn(revisitedOn);
        }

        Integer binghaiShuzhi = (Integer) attributes.get("binghaiShuzhi");

        if (binghaiShuzhi != null) {
            setBinghaiShuzhi(binghaiShuzhi);
        }

        String gongzuoliangAction = (String) attributes.get(
                "gongzuoliangAction");

        if (gongzuoliangAction != null) {
            setGongzuoliangAction(gongzuoliangAction);
        }

        String gongzuoliangName = (String) attributes.get("gongzuoliangName");

        if (gongzuoliangName != null) {
            setGongzuoliangName(gongzuoliangName);
        }

        String gongzuoliangUnit = (String) attributes.get("gongzuoliangUnit");

        if (gongzuoliangUnit != null) {
            setGongzuoliangUnit(gongzuoliangUnit);
        }

        String gongzuoliangTval = (String) attributes.get("gongzuoliangTval");

        if (gongzuoliangTval != null) {
            setGongzuoliangTval(gongzuoliangTval);
        }

        Long binghaiId = (Long) attributes.get("binghaiId");

        if (binghaiId != null) {
            setBinghaiId(binghaiId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long proofCount = (Long) attributes.get("proofCount");

        if (proofCount != null) {
            setProofCount(proofCount);
        }

        String referenceRadio = (String) attributes.get("referenceRadio");

        if (referenceRadio != null) {
            setReferenceRadio(referenceRadio);
        }

        String daochaJson = (String) attributes.get("daochaJson");

        if (daochaJson != null) {
            setDaochaJson(daochaJson);
        }
    }

    @Override
    public String getHkey() {
        return _hkey;
    }

    @Override
    public void setHkey(String hkey) {
        _hkey = hkey;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setHkey", String.class);

                method.invoke(_binghaiRemoteModel, hkey);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMuTitle() {
        return _muTitle;
    }

    @Override
    public void setMuTitle(String muTitle) {
        _muTitle = muTitle;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setMuTitle", String.class);

                method.invoke(_binghaiRemoteModel, muTitle);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBuwei() {
        return _buwei;
    }

    @Override
    public void setBuwei(String buwei) {
        _buwei = buwei;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setBuwei", String.class);

                method.invoke(_binghaiRemoteModel, buwei);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTab() {
        return _tab;
    }

    @Override
    public void setTab(String tab) {
        _tab = tab;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setTab", String.class);

                method.invoke(_binghaiRemoteModel, tab);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCName() {
        return _cName;
    }

    @Override
    public void setCName(String cName) {
        _cName = cName;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setCName", String.class);

                method.invoke(_binghaiRemoteModel, cName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCId() {
        return _cId;
    }

    @Override
    public void setCId(int cId) {
        _cId = cId;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setCId", int.class);

                method.invoke(_binghaiRemoteModel, cId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getC1Name() {
        return _c1Name;
    }

    @Override
    public void setC1Name(String c1Name) {
        _c1Name = c1Name;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setC1Name", String.class);

                method.invoke(_binghaiRemoteModel, c1Name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getC1Id() {
        return _c1Id;
    }

    @Override
    public void setC1Id(int c1Id) {
        _c1Id = c1Id;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setC1Id", int.class);

                method.invoke(_binghaiRemoteModel, c1Id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getC2Name() {
        return _c2Name;
    }

    @Override
    public void setC2Name(String c2Name) {
        _c2Name = c2Name;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setC2Name", String.class);

                method.invoke(_binghaiRemoteModel, c2Name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getC2Id() {
        return _c2Id;
    }

    @Override
    public void setC2Id(int c2Id) {
        _c2Id = c2Id;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setC2Id", int.class);

                method.invoke(_binghaiRemoteModel, c2Id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBinghaiLeixing() {
        return _binghaiLeixing;
    }

    @Override
    public void setBinghaiLeixing(String binghaiLeixing) {
        _binghaiLeixing = binghaiLeixing;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setBinghaiLeixing",
                        String.class);

                method.invoke(_binghaiRemoteModel, binghaiLeixing);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStageName() {
        return _stageName;
    }

    @Override
    public void setStageName(String stageName) {
        _stageName = stageName;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setStageName", String.class);

                method.invoke(_binghaiRemoteModel, stageName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStageId() {
        return _stageId;
    }

    @Override
    public void setStageId(int stageId) {
        _stageId = stageId;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setStageId", int.class);

                method.invoke(_binghaiRemoteModel, stageId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKoufen() {
        return _koufen;
    }

    @Override
    public void setKoufen(int koufen) {
        _koufen = koufen;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setKoufen", int.class);

                method.invoke(_binghaiRemoteModel, koufen);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVisitContent() {
        return _visitContent;
    }

    @Override
    public void setVisitContent(String visitContent) {
        _visitContent = visitContent;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setVisitContent", String.class);

                method.invoke(_binghaiRemoteModel, visitContent);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVisitedBy() {
        return _visitedBy;
    }

    @Override
    public void setVisitedBy(String visitedBy) {
        _visitedBy = visitedBy;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setVisitedBy", String.class);

                method.invoke(_binghaiRemoteModel, visitedBy);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVisitedOn() {
        return _visitedOn;
    }

    @Override
    public void setVisitedOn(String visitedOn) {
        _visitedOn = visitedOn;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setVisitedOn", String.class);

                method.invoke(_binghaiRemoteModel, visitedOn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRevisitedBy() {
        return _revisitedBy;
    }

    @Override
    public void setRevisitedBy(String revisitedBy) {
        _revisitedBy = revisitedBy;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setRevisitedBy", String.class);

                method.invoke(_binghaiRemoteModel, revisitedBy);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRevisitedOn() {
        return _revisitedOn;
    }

    @Override
    public void setRevisitedOn(String revisitedOn) {
        _revisitedOn = revisitedOn;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setRevisitedOn", String.class);

                method.invoke(_binghaiRemoteModel, revisitedOn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBinghaiShuzhi() {
        return _binghaiShuzhi;
    }

    @Override
    public void setBinghaiShuzhi(int binghaiShuzhi) {
        _binghaiShuzhi = binghaiShuzhi;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setBinghaiShuzhi", int.class);

                method.invoke(_binghaiRemoteModel, binghaiShuzhi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGongzuoliangAction() {
        return _gongzuoliangAction;
    }

    @Override
    public void setGongzuoliangAction(String gongzuoliangAction) {
        _gongzuoliangAction = gongzuoliangAction;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setGongzuoliangAction",
                        String.class);

                method.invoke(_binghaiRemoteModel, gongzuoliangAction);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGongzuoliangName() {
        return _gongzuoliangName;
    }

    @Override
    public void setGongzuoliangName(String gongzuoliangName) {
        _gongzuoliangName = gongzuoliangName;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setGongzuoliangName",
                        String.class);

                method.invoke(_binghaiRemoteModel, gongzuoliangName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGongzuoliangUnit() {
        return _gongzuoliangUnit;
    }

    @Override
    public void setGongzuoliangUnit(String gongzuoliangUnit) {
        _gongzuoliangUnit = gongzuoliangUnit;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setGongzuoliangUnit",
                        String.class);

                method.invoke(_binghaiRemoteModel, gongzuoliangUnit);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGongzuoliangTval() {
        return _gongzuoliangTval;
    }

    @Override
    public void setGongzuoliangTval(String gongzuoliangTval) {
        _gongzuoliangTval = gongzuoliangTval;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setGongzuoliangTval",
                        String.class);

                method.invoke(_binghaiRemoteModel, gongzuoliangTval);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBinghaiId() {
        return _binghaiId;
    }

    @Override
    public void setBinghaiId(long binghaiId) {
        _binghaiId = binghaiId;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setBinghaiId", long.class);

                method.invoke(_binghaiRemoteModel, binghaiId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_binghaiRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_binghaiRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_binghaiRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_binghaiRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_binghaiRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_binghaiRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getProofCount() {
        return _proofCount;
    }

    @Override
    public void setProofCount(long proofCount) {
        _proofCount = proofCount;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setProofCount", long.class);

                method.invoke(_binghaiRemoteModel, proofCount);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getReferenceRadio() {
        return _referenceRadio;
    }

    @Override
    public void setReferenceRadio(String referenceRadio) {
        _referenceRadio = referenceRadio;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setReferenceRadio",
                        String.class);

                method.invoke(_binghaiRemoteModel, referenceRadio);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDaochaJson() {
        return _daochaJson;
    }

    @Override
    public void setDaochaJson(String daochaJson) {
        _daochaJson = daochaJson;

        if (_binghaiRemoteModel != null) {
            try {
                Class<?> clazz = _binghaiRemoteModel.getClass();

                Method method = clazz.getMethod("setDaochaJson", String.class);

                method.invoke(_binghaiRemoteModel, daochaJson);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBinghaiRemoteModel() {
        return _binghaiRemoteModel;
    }

    public void setBinghaiRemoteModel(BaseModel<?> binghaiRemoteModel) {
        _binghaiRemoteModel = binghaiRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _binghaiRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_binghaiRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BinghaiLocalServiceUtil.addBinghai(this);
        } else {
            BinghaiLocalServiceUtil.updateBinghai(this);
        }
    }

    @Override
    public Binghai toEscapedModel() {
        return (Binghai) ProxyUtil.newProxyInstance(Binghai.class.getClassLoader(),
            new Class[] { Binghai.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BinghaiClp clone = new BinghaiClp();

        clone.setHkey(getHkey());
        clone.setMuTitle(getMuTitle());
        clone.setBuwei(getBuwei());
        clone.setTab(getTab());
        clone.setCName(getCName());
        clone.setCId(getCId());
        clone.setC1Name(getC1Name());
        clone.setC1Id(getC1Id());
        clone.setC2Name(getC2Name());
        clone.setC2Id(getC2Id());
        clone.setBinghaiLeixing(getBinghaiLeixing());
        clone.setStageName(getStageName());
        clone.setStageId(getStageId());
        clone.setKoufen(getKoufen());
        clone.setVisitContent(getVisitContent());
        clone.setVisitedBy(getVisitedBy());
        clone.setVisitedOn(getVisitedOn());
        clone.setRevisitedBy(getRevisitedBy());
        clone.setRevisitedOn(getRevisitedOn());
        clone.setBinghaiShuzhi(getBinghaiShuzhi());
        clone.setGongzuoliangAction(getGongzuoliangAction());
        clone.setGongzuoliangName(getGongzuoliangName());
        clone.setGongzuoliangUnit(getGongzuoliangUnit());
        clone.setGongzuoliangTval(getGongzuoliangTval());
        clone.setBinghaiId(getBinghaiId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setProofCount(getProofCount());
        clone.setReferenceRadio(getReferenceRadio());
        clone.setDaochaJson(getDaochaJson());

        return clone;
    }

    @Override
    public int compareTo(Binghai binghai) {
        long primaryKey = binghai.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BinghaiClp)) {
            return false;
        }

        BinghaiClp binghai = (BinghaiClp) obj;

        long primaryKey = binghai.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(69);

        sb.append("{hkey=");
        sb.append(getHkey());
        sb.append(", muTitle=");
        sb.append(getMuTitle());
        sb.append(", buwei=");
        sb.append(getBuwei());
        sb.append(", tab=");
        sb.append(getTab());
        sb.append(", cName=");
        sb.append(getCName());
        sb.append(", cId=");
        sb.append(getCId());
        sb.append(", c1Name=");
        sb.append(getC1Name());
        sb.append(", c1Id=");
        sb.append(getC1Id());
        sb.append(", c2Name=");
        sb.append(getC2Name());
        sb.append(", c2Id=");
        sb.append(getC2Id());
        sb.append(", binghaiLeixing=");
        sb.append(getBinghaiLeixing());
        sb.append(", stageName=");
        sb.append(getStageName());
        sb.append(", stageId=");
        sb.append(getStageId());
        sb.append(", koufen=");
        sb.append(getKoufen());
        sb.append(", visitContent=");
        sb.append(getVisitContent());
        sb.append(", visitedBy=");
        sb.append(getVisitedBy());
        sb.append(", visitedOn=");
        sb.append(getVisitedOn());
        sb.append(", revisitedBy=");
        sb.append(getRevisitedBy());
        sb.append(", revisitedOn=");
        sb.append(getRevisitedOn());
        sb.append(", binghaiShuzhi=");
        sb.append(getBinghaiShuzhi());
        sb.append(", gongzuoliangAction=");
        sb.append(getGongzuoliangAction());
        sb.append(", gongzuoliangName=");
        sb.append(getGongzuoliangName());
        sb.append(", gongzuoliangUnit=");
        sb.append(getGongzuoliangUnit());
        sb.append(", gongzuoliangTval=");
        sb.append(getGongzuoliangTval());
        sb.append(", binghaiId=");
        sb.append(getBinghaiId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", proofCount=");
        sb.append(getProofCount());
        sb.append(", referenceRadio=");
        sb.append(getReferenceRadio());
        sb.append(", daochaJson=");
        sb.append(getDaochaJson());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(106);

        sb.append("<model><model-name>");
        sb.append("com.lycenway.chr.backbone.model.Binghai");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>hkey</column-name><column-value><![CDATA[");
        sb.append(getHkey());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>muTitle</column-name><column-value><![CDATA[");
        sb.append(getMuTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>buwei</column-name><column-value><![CDATA[");
        sb.append(getBuwei());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tab</column-name><column-value><![CDATA[");
        sb.append(getTab());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cName</column-name><column-value><![CDATA[");
        sb.append(getCName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cId</column-name><column-value><![CDATA[");
        sb.append(getCId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c1Name</column-name><column-value><![CDATA[");
        sb.append(getC1Name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c1Id</column-name><column-value><![CDATA[");
        sb.append(getC1Id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c2Name</column-name><column-value><![CDATA[");
        sb.append(getC2Name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c2Id</column-name><column-value><![CDATA[");
        sb.append(getC2Id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>binghaiLeixing</column-name><column-value><![CDATA[");
        sb.append(getBinghaiLeixing());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stageName</column-name><column-value><![CDATA[");
        sb.append(getStageName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stageId</column-name><column-value><![CDATA[");
        sb.append(getStageId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>koufen</column-name><column-value><![CDATA[");
        sb.append(getKoufen());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>visitContent</column-name><column-value><![CDATA[");
        sb.append(getVisitContent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>visitedBy</column-name><column-value><![CDATA[");
        sb.append(getVisitedBy());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>visitedOn</column-name><column-value><![CDATA[");
        sb.append(getVisitedOn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>revisitedBy</column-name><column-value><![CDATA[");
        sb.append(getRevisitedBy());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>revisitedOn</column-name><column-value><![CDATA[");
        sb.append(getRevisitedOn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>binghaiShuzhi</column-name><column-value><![CDATA[");
        sb.append(getBinghaiShuzhi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gongzuoliangAction</column-name><column-value><![CDATA[");
        sb.append(getGongzuoliangAction());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gongzuoliangName</column-name><column-value><![CDATA[");
        sb.append(getGongzuoliangName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gongzuoliangUnit</column-name><column-value><![CDATA[");
        sb.append(getGongzuoliangUnit());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gongzuoliangTval</column-name><column-value><![CDATA[");
        sb.append(getGongzuoliangTval());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>binghaiId</column-name><column-value><![CDATA[");
        sb.append(getBinghaiId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>proofCount</column-name><column-value><![CDATA[");
        sb.append(getProofCount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>referenceRadio</column-name><column-value><![CDATA[");
        sb.append(getReferenceRadio());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>daochaJson</column-name><column-value><![CDATA[");
        sb.append(getDaochaJson());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
