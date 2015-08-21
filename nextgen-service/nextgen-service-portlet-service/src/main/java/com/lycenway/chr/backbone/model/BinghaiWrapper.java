package com.lycenway.chr.backbone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Binghai}.
 * </p>
 *
 * @author lycenway
 * @see Binghai
 * @generated
 */
public class BinghaiWrapper implements Binghai, ModelWrapper<Binghai> {
    private Binghai _binghai;

    public BinghaiWrapper(Binghai binghai) {
        _binghai = binghai;
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

    /**
    * Returns the primary key of this Binghai Case Weixiu Wenti.
    *
    * @return the primary key of this Binghai Case Weixiu Wenti
    */
    @Override
    public long getPrimaryKey() {
        return _binghai.getPrimaryKey();
    }

    /**
    * Sets the primary key of this Binghai Case Weixiu Wenti.
    *
    * @param primaryKey the primary key of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _binghai.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the hkey of this Binghai Case Weixiu Wenti.
    *
    * @return the hkey of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getHkey() {
        return _binghai.getHkey();
    }

    /**
    * Sets the hkey of this Binghai Case Weixiu Wenti.
    *
    * @param hkey the hkey of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setHkey(java.lang.String hkey) {
        _binghai.setHkey(hkey);
    }

    /**
    * Returns the mu title of this Binghai Case Weixiu Wenti.
    *
    * @return the mu title of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getMuTitle() {
        return _binghai.getMuTitle();
    }

    /**
    * Sets the mu title of this Binghai Case Weixiu Wenti.
    *
    * @param muTitle the mu title of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setMuTitle(java.lang.String muTitle) {
        _binghai.setMuTitle(muTitle);
    }

    /**
    * Returns the buwei of this Binghai Case Weixiu Wenti.
    *
    * @return the buwei of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getBuwei() {
        return _binghai.getBuwei();
    }

    /**
    * Sets the buwei of this Binghai Case Weixiu Wenti.
    *
    * @param buwei the buwei of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setBuwei(java.lang.String buwei) {
        _binghai.setBuwei(buwei);
    }

    /**
    * Returns the tab of this Binghai Case Weixiu Wenti.
    *
    * @return the tab of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getTab() {
        return _binghai.getTab();
    }

    /**
    * Sets the tab of this Binghai Case Weixiu Wenti.
    *
    * @param tab the tab of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setTab(java.lang.String tab) {
        _binghai.setTab(tab);
    }

    /**
    * Returns the c name of this Binghai Case Weixiu Wenti.
    *
    * @return the c name of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getCName() {
        return _binghai.getCName();
    }

    /**
    * Sets the c name of this Binghai Case Weixiu Wenti.
    *
    * @param cName the c name of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setCName(java.lang.String cName) {
        _binghai.setCName(cName);
    }

    /**
    * Returns the c ID of this Binghai Case Weixiu Wenti.
    *
    * @return the c ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public int getCId() {
        return _binghai.getCId();
    }

    /**
    * Sets the c ID of this Binghai Case Weixiu Wenti.
    *
    * @param cId the c ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setCId(int cId) {
        _binghai.setCId(cId);
    }

    /**
    * Returns the c1 name of this Binghai Case Weixiu Wenti.
    *
    * @return the c1 name of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getC1Name() {
        return _binghai.getC1Name();
    }

    /**
    * Sets the c1 name of this Binghai Case Weixiu Wenti.
    *
    * @param c1Name the c1 name of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setC1Name(java.lang.String c1Name) {
        _binghai.setC1Name(c1Name);
    }

    /**
    * Returns the c1 ID of this Binghai Case Weixiu Wenti.
    *
    * @return the c1 ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public int getC1Id() {
        return _binghai.getC1Id();
    }

    /**
    * Sets the c1 ID of this Binghai Case Weixiu Wenti.
    *
    * @param c1Id the c1 ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setC1Id(int c1Id) {
        _binghai.setC1Id(c1Id);
    }

    /**
    * Returns the c2 name of this Binghai Case Weixiu Wenti.
    *
    * @return the c2 name of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getC2Name() {
        return _binghai.getC2Name();
    }

    /**
    * Sets the c2 name of this Binghai Case Weixiu Wenti.
    *
    * @param c2Name the c2 name of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setC2Name(java.lang.String c2Name) {
        _binghai.setC2Name(c2Name);
    }

    /**
    * Returns the c2 ID of this Binghai Case Weixiu Wenti.
    *
    * @return the c2 ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public int getC2Id() {
        return _binghai.getC2Id();
    }

    /**
    * Sets the c2 ID of this Binghai Case Weixiu Wenti.
    *
    * @param c2Id the c2 ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setC2Id(int c2Id) {
        _binghai.setC2Id(c2Id);
    }

    /**
    * Returns the binghai leixing of this Binghai Case Weixiu Wenti.
    *
    * @return the binghai leixing of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getBinghaiLeixing() {
        return _binghai.getBinghaiLeixing();
    }

    /**
    * Sets the binghai leixing of this Binghai Case Weixiu Wenti.
    *
    * @param binghaiLeixing the binghai leixing of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setBinghaiLeixing(java.lang.String binghaiLeixing) {
        _binghai.setBinghaiLeixing(binghaiLeixing);
    }

    /**
    * Returns the stage name of this Binghai Case Weixiu Wenti.
    *
    * @return the stage name of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getStageName() {
        return _binghai.getStageName();
    }

    /**
    * Sets the stage name of this Binghai Case Weixiu Wenti.
    *
    * @param stageName the stage name of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setStageName(java.lang.String stageName) {
        _binghai.setStageName(stageName);
    }

    /**
    * Returns the stage ID of this Binghai Case Weixiu Wenti.
    *
    * @return the stage ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public int getStageId() {
        return _binghai.getStageId();
    }

    /**
    * Sets the stage ID of this Binghai Case Weixiu Wenti.
    *
    * @param stageId the stage ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setStageId(int stageId) {
        _binghai.setStageId(stageId);
    }

    /**
    * Returns the koufen of this Binghai Case Weixiu Wenti.
    *
    * @return the koufen of this Binghai Case Weixiu Wenti
    */
    @Override
    public int getKoufen() {
        return _binghai.getKoufen();
    }

    /**
    * Sets the koufen of this Binghai Case Weixiu Wenti.
    *
    * @param koufen the koufen of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setKoufen(int koufen) {
        _binghai.setKoufen(koufen);
    }

    /**
    * Returns the visit content of this Binghai Case Weixiu Wenti.
    *
    * @return the visit content of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getVisitContent() {
        return _binghai.getVisitContent();
    }

    /**
    * Sets the visit content of this Binghai Case Weixiu Wenti.
    *
    * @param visitContent the visit content of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setVisitContent(java.lang.String visitContent) {
        _binghai.setVisitContent(visitContent);
    }

    /**
    * Returns the visited by of this Binghai Case Weixiu Wenti.
    *
    * @return the visited by of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getVisitedBy() {
        return _binghai.getVisitedBy();
    }

    /**
    * Sets the visited by of this Binghai Case Weixiu Wenti.
    *
    * @param visitedBy the visited by of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setVisitedBy(java.lang.String visitedBy) {
        _binghai.setVisitedBy(visitedBy);
    }

    /**
    * Returns the visited on of this Binghai Case Weixiu Wenti.
    *
    * @return the visited on of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getVisitedOn() {
        return _binghai.getVisitedOn();
    }

    /**
    * Sets the visited on of this Binghai Case Weixiu Wenti.
    *
    * @param visitedOn the visited on of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setVisitedOn(java.lang.String visitedOn) {
        _binghai.setVisitedOn(visitedOn);
    }

    /**
    * Returns the revisited by of this Binghai Case Weixiu Wenti.
    *
    * @return the revisited by of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getRevisitedBy() {
        return _binghai.getRevisitedBy();
    }

    /**
    * Sets the revisited by of this Binghai Case Weixiu Wenti.
    *
    * @param revisitedBy the revisited by of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setRevisitedBy(java.lang.String revisitedBy) {
        _binghai.setRevisitedBy(revisitedBy);
    }

    /**
    * Returns the revisited on of this Binghai Case Weixiu Wenti.
    *
    * @return the revisited on of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getRevisitedOn() {
        return _binghai.getRevisitedOn();
    }

    /**
    * Sets the revisited on of this Binghai Case Weixiu Wenti.
    *
    * @param revisitedOn the revisited on of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setRevisitedOn(java.lang.String revisitedOn) {
        _binghai.setRevisitedOn(revisitedOn);
    }

    /**
    * Returns the binghai shuzhi of this Binghai Case Weixiu Wenti.
    *
    * @return the binghai shuzhi of this Binghai Case Weixiu Wenti
    */
    @Override
    public int getBinghaiShuzhi() {
        return _binghai.getBinghaiShuzhi();
    }

    /**
    * Sets the binghai shuzhi of this Binghai Case Weixiu Wenti.
    *
    * @param binghaiShuzhi the binghai shuzhi of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setBinghaiShuzhi(int binghaiShuzhi) {
        _binghai.setBinghaiShuzhi(binghaiShuzhi);
    }

    /**
    * Returns the gongzuoliang action of this Binghai Case Weixiu Wenti.
    *
    * @return the gongzuoliang action of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getGongzuoliangAction() {
        return _binghai.getGongzuoliangAction();
    }

    /**
    * Sets the gongzuoliang action of this Binghai Case Weixiu Wenti.
    *
    * @param gongzuoliangAction the gongzuoliang action of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setGongzuoliangAction(java.lang.String gongzuoliangAction) {
        _binghai.setGongzuoliangAction(gongzuoliangAction);
    }

    /**
    * Returns the gongzuoliang name of this Binghai Case Weixiu Wenti.
    *
    * @return the gongzuoliang name of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getGongzuoliangName() {
        return _binghai.getGongzuoliangName();
    }

    /**
    * Sets the gongzuoliang name of this Binghai Case Weixiu Wenti.
    *
    * @param gongzuoliangName the gongzuoliang name of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setGongzuoliangName(java.lang.String gongzuoliangName) {
        _binghai.setGongzuoliangName(gongzuoliangName);
    }

    /**
    * Returns the gongzuoliang unit of this Binghai Case Weixiu Wenti.
    *
    * @return the gongzuoliang unit of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getGongzuoliangUnit() {
        return _binghai.getGongzuoliangUnit();
    }

    /**
    * Sets the gongzuoliang unit of this Binghai Case Weixiu Wenti.
    *
    * @param gongzuoliangUnit the gongzuoliang unit of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setGongzuoliangUnit(java.lang.String gongzuoliangUnit) {
        _binghai.setGongzuoliangUnit(gongzuoliangUnit);
    }

    /**
    * Returns the gongzuoliang tval of this Binghai Case Weixiu Wenti.
    *
    * @return the gongzuoliang tval of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getGongzuoliangTval() {
        return _binghai.getGongzuoliangTval();
    }

    /**
    * Sets the gongzuoliang tval of this Binghai Case Weixiu Wenti.
    *
    * @param gongzuoliangTval the gongzuoliang tval of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setGongzuoliangTval(java.lang.String gongzuoliangTval) {
        _binghai.setGongzuoliangTval(gongzuoliangTval);
    }

    /**
    * Returns the binghai ID of this Binghai Case Weixiu Wenti.
    *
    * @return the binghai ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public long getBinghaiId() {
        return _binghai.getBinghaiId();
    }

    /**
    * Sets the binghai ID of this Binghai Case Weixiu Wenti.
    *
    * @param binghaiId the binghai ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setBinghaiId(long binghaiId) {
        _binghai.setBinghaiId(binghaiId);
    }

    /**
    * Returns the group ID of this Binghai Case Weixiu Wenti.
    *
    * @return the group ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public long getGroupId() {
        return _binghai.getGroupId();
    }

    /**
    * Sets the group ID of this Binghai Case Weixiu Wenti.
    *
    * @param groupId the group ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setGroupId(long groupId) {
        _binghai.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this Binghai Case Weixiu Wenti.
    *
    * @return the company ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public long getCompanyId() {
        return _binghai.getCompanyId();
    }

    /**
    * Sets the company ID of this Binghai Case Weixiu Wenti.
    *
    * @param companyId the company ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setCompanyId(long companyId) {
        _binghai.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this Binghai Case Weixiu Wenti.
    *
    * @return the user ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public long getUserId() {
        return _binghai.getUserId();
    }

    /**
    * Sets the user ID of this Binghai Case Weixiu Wenti.
    *
    * @param userId the user ID of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setUserId(long userId) {
        _binghai.setUserId(userId);
    }

    /**
    * Returns the user uuid of this Binghai Case Weixiu Wenti.
    *
    * @return the user uuid of this Binghai Case Weixiu Wenti
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _binghai.getUserUuid();
    }

    /**
    * Sets the user uuid of this Binghai Case Weixiu Wenti.
    *
    * @param userUuid the user uuid of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _binghai.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this Binghai Case Weixiu Wenti.
    *
    * @return the user name of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getUserName() {
        return _binghai.getUserName();
    }

    /**
    * Sets the user name of this Binghai Case Weixiu Wenti.
    *
    * @param userName the user name of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _binghai.setUserName(userName);
    }

    /**
    * Returns the create date of this Binghai Case Weixiu Wenti.
    *
    * @return the create date of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.util.Date getCreateDate() {
        return _binghai.getCreateDate();
    }

    /**
    * Sets the create date of this Binghai Case Weixiu Wenti.
    *
    * @param createDate the create date of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _binghai.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this Binghai Case Weixiu Wenti.
    *
    * @return the modified date of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _binghai.getModifiedDate();
    }

    /**
    * Sets the modified date of this Binghai Case Weixiu Wenti.
    *
    * @param modifiedDate the modified date of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _binghai.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the proof count of this Binghai Case Weixiu Wenti.
    *
    * @return the proof count of this Binghai Case Weixiu Wenti
    */
    @Override
    public long getProofCount() {
        return _binghai.getProofCount();
    }

    /**
    * Sets the proof count of this Binghai Case Weixiu Wenti.
    *
    * @param proofCount the proof count of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setProofCount(long proofCount) {
        _binghai.setProofCount(proofCount);
    }

    /**
    * Returns the reference radio of this Binghai Case Weixiu Wenti.
    *
    * @return the reference radio of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getReferenceRadio() {
        return _binghai.getReferenceRadio();
    }

    /**
    * Sets the reference radio of this Binghai Case Weixiu Wenti.
    *
    * @param referenceRadio the reference radio of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setReferenceRadio(java.lang.String referenceRadio) {
        _binghai.setReferenceRadio(referenceRadio);
    }

    /**
    * Returns the daocha json of this Binghai Case Weixiu Wenti.
    *
    * @return the daocha json of this Binghai Case Weixiu Wenti
    */
    @Override
    public java.lang.String getDaochaJson() {
        return _binghai.getDaochaJson();
    }

    /**
    * Sets the daocha json of this Binghai Case Weixiu Wenti.
    *
    * @param daochaJson the daocha json of this Binghai Case Weixiu Wenti
    */
    @Override
    public void setDaochaJson(java.lang.String daochaJson) {
        _binghai.setDaochaJson(daochaJson);
    }

    @Override
    public boolean isNew() {
        return _binghai.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _binghai.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _binghai.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _binghai.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _binghai.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _binghai.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _binghai.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _binghai.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _binghai.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _binghai.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _binghai.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BinghaiWrapper((Binghai) _binghai.clone());
    }

    @Override
    public int compareTo(com.lycenway.chr.backbone.model.Binghai binghai) {
        return _binghai.compareTo(binghai);
    }

    @Override
    public int hashCode() {
        return _binghai.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.lycenway.chr.backbone.model.Binghai> toCacheModel() {
        return _binghai.toCacheModel();
    }

    @Override
    public com.lycenway.chr.backbone.model.Binghai toEscapedModel() {
        return new BinghaiWrapper(_binghai.toEscapedModel());
    }

    @Override
    public com.lycenway.chr.backbone.model.Binghai toUnescapedModel() {
        return new BinghaiWrapper(_binghai.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _binghai.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _binghai.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _binghai.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BinghaiWrapper)) {
            return false;
        }

        BinghaiWrapper binghaiWrapper = (BinghaiWrapper) obj;

        if (Validator.equals(_binghai, binghaiWrapper._binghai)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Binghai getWrappedBinghai() {
        return _binghai;
    }

    @Override
    public Binghai getWrappedModel() {
        return _binghai;
    }

    @Override
    public void resetOriginalValues() {
        _binghai.resetOriginalValues();
    }
}
