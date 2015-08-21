package com.lycenway.chr.backbone.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.lycenway.chr.backbone.model.Binghai;
import com.lycenway.chr.backbone.service.BinghaiService;
import com.lycenway.chr.backbone.service.persistence.BinghaiPersistence;
import com.lycenway.chr.backbone.service.persistence.BinghaiPingfenPersistence;
import com.lycenway.chr.backbone.service.persistence.BinghaiProofPersistence;
import com.lycenway.chr.backbone.service.persistence.LOVBinghaiLeixingPersistence;
import com.lycenway.chr.backbone.service.persistence.LOVMuTypePersistence;
import com.lycenway.chr.backbone.service.persistence.MuExtPersistence;
import com.lycenway.chr.backbone.service.persistence.MuInterrelPersistence;
import com.lycenway.chr.backbone.service.persistence.MuPersistence;
import com.lycenway.chr.backbone.service.persistence.MuQuxianQujianPersistence;
import com.lycenway.chr.backbone.service.persistence.MuWufengXianluPersistence;
import com.lycenway.chr.backbone.service.persistence.MuZhengxianPodaoPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the Binghai Case Weixiu Wenti remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.lycenway.chr.backbone.service.impl.BinghaiServiceImpl}.
 * </p>
 *
 * @author lycenway
 * @see com.lycenway.chr.backbone.service.impl.BinghaiServiceImpl
 * @see com.lycenway.chr.backbone.service.BinghaiServiceUtil
 * @generated
 */
public abstract class BinghaiServiceBaseImpl extends BaseServiceImpl
    implements BinghaiService, IdentifiableBean {
    @BeanReference(type = com.lycenway.chr.backbone.service.BinghaiLocalService.class)
    protected com.lycenway.chr.backbone.service.BinghaiLocalService binghaiLocalService;
    @BeanReference(type = com.lycenway.chr.backbone.service.BinghaiService.class)
    protected com.lycenway.chr.backbone.service.BinghaiService binghaiService;
    @BeanReference(type = BinghaiPersistence.class)
    protected BinghaiPersistence binghaiPersistence;
    @BeanReference(type = com.lycenway.chr.backbone.service.BinghaiPingfenLocalService.class)
    protected com.lycenway.chr.backbone.service.BinghaiPingfenLocalService binghaiPingfenLocalService;
    @BeanReference(type = com.lycenway.chr.backbone.service.BinghaiPingfenService.class)
    protected com.lycenway.chr.backbone.service.BinghaiPingfenService binghaiPingfenService;
    @BeanReference(type = BinghaiPingfenPersistence.class)
    protected BinghaiPingfenPersistence binghaiPingfenPersistence;
    @BeanReference(type = com.lycenway.chr.backbone.service.BinghaiProofLocalService.class)
    protected com.lycenway.chr.backbone.service.BinghaiProofLocalService binghaiProofLocalService;
    @BeanReference(type = com.lycenway.chr.backbone.service.BinghaiProofService.class)
    protected com.lycenway.chr.backbone.service.BinghaiProofService binghaiProofService;
    @BeanReference(type = BinghaiProofPersistence.class)
    protected BinghaiProofPersistence binghaiProofPersistence;
    @BeanReference(type = com.lycenway.chr.backbone.service.LOVBinghaiLeixingLocalService.class)
    protected com.lycenway.chr.backbone.service.LOVBinghaiLeixingLocalService lovBinghaiLeixingLocalService;
    @BeanReference(type = LOVBinghaiLeixingPersistence.class)
    protected LOVBinghaiLeixingPersistence lovBinghaiLeixingPersistence;
    @BeanReference(type = com.lycenway.chr.backbone.service.LOVMuTypeLocalService.class)
    protected com.lycenway.chr.backbone.service.LOVMuTypeLocalService lovMuTypeLocalService;
    @BeanReference(type = LOVMuTypePersistence.class)
    protected LOVMuTypePersistence lovMuTypePersistence;
    @BeanReference(type = com.lycenway.chr.backbone.service.MuLocalService.class)
    protected com.lycenway.chr.backbone.service.MuLocalService muLocalService;
    @BeanReference(type = MuPersistence.class)
    protected MuPersistence muPersistence;
    @BeanReference(type = com.lycenway.chr.backbone.service.MuExtLocalService.class)
    protected com.lycenway.chr.backbone.service.MuExtLocalService muExtLocalService;
    @BeanReference(type = MuExtPersistence.class)
    protected MuExtPersistence muExtPersistence;
    @BeanReference(type = com.lycenway.chr.backbone.service.MuInterrelLocalService.class)
    protected com.lycenway.chr.backbone.service.MuInterrelLocalService muInterrelLocalService;
    @BeanReference(type = MuInterrelPersistence.class)
    protected MuInterrelPersistence muInterrelPersistence;
    @BeanReference(type = com.lycenway.chr.backbone.service.MuQuxianQujianLocalService.class)
    protected com.lycenway.chr.backbone.service.MuQuxianQujianLocalService muQuxianQujianLocalService;
    @BeanReference(type = MuQuxianQujianPersistence.class)
    protected MuQuxianQujianPersistence muQuxianQujianPersistence;
    @BeanReference(type = com.lycenway.chr.backbone.service.MuWufengXianluLocalService.class)
    protected com.lycenway.chr.backbone.service.MuWufengXianluLocalService muWufengXianluLocalService;
    @BeanReference(type = MuWufengXianluPersistence.class)
    protected MuWufengXianluPersistence muWufengXianluPersistence;
    @BeanReference(type = com.lycenway.chr.backbone.service.MuZhengxianPodaoLocalService.class)
    protected com.lycenway.chr.backbone.service.MuZhengxianPodaoLocalService muZhengxianPodaoLocalService;
    @BeanReference(type = MuZhengxianPodaoPersistence.class)
    protected MuZhengxianPodaoPersistence muZhengxianPodaoPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private BinghaiServiceClpInvoker _clpInvoker = new BinghaiServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.lycenway.chr.backbone.service.BinghaiServiceUtil} to access the Binghai Case Weixiu Wenti remote service.
     */

    /**
     * Returns the Binghai Case Weixiu Wenti local service.
     *
     * @return the Binghai Case Weixiu Wenti local service
     */
    public com.lycenway.chr.backbone.service.BinghaiLocalService getBinghaiLocalService() {
        return binghaiLocalService;
    }

    /**
     * Sets the Binghai Case Weixiu Wenti local service.
     *
     * @param binghaiLocalService the Binghai Case Weixiu Wenti local service
     */
    public void setBinghaiLocalService(
        com.lycenway.chr.backbone.service.BinghaiLocalService binghaiLocalService) {
        this.binghaiLocalService = binghaiLocalService;
    }

    /**
     * Returns the Binghai Case Weixiu Wenti remote service.
     *
     * @return the Binghai Case Weixiu Wenti remote service
     */
    public com.lycenway.chr.backbone.service.BinghaiService getBinghaiService() {
        return binghaiService;
    }

    /**
     * Sets the Binghai Case Weixiu Wenti remote service.
     *
     * @param binghaiService the Binghai Case Weixiu Wenti remote service
     */
    public void setBinghaiService(
        com.lycenway.chr.backbone.service.BinghaiService binghaiService) {
        this.binghaiService = binghaiService;
    }

    /**
     * Returns the Binghai Case Weixiu Wenti persistence.
     *
     * @return the Binghai Case Weixiu Wenti persistence
     */
    public BinghaiPersistence getBinghaiPersistence() {
        return binghaiPersistence;
    }

    /**
     * Sets the Binghai Case Weixiu Wenti persistence.
     *
     * @param binghaiPersistence the Binghai Case Weixiu Wenti persistence
     */
    public void setBinghaiPersistence(BinghaiPersistence binghaiPersistence) {
        this.binghaiPersistence = binghaiPersistence;
    }

    /**
     * Returns the binghai pingfen local service.
     *
     * @return the binghai pingfen local service
     */
    public com.lycenway.chr.backbone.service.BinghaiPingfenLocalService getBinghaiPingfenLocalService() {
        return binghaiPingfenLocalService;
    }

    /**
     * Sets the binghai pingfen local service.
     *
     * @param binghaiPingfenLocalService the binghai pingfen local service
     */
    public void setBinghaiPingfenLocalService(
        com.lycenway.chr.backbone.service.BinghaiPingfenLocalService binghaiPingfenLocalService) {
        this.binghaiPingfenLocalService = binghaiPingfenLocalService;
    }

    /**
     * Returns the binghai pingfen remote service.
     *
     * @return the binghai pingfen remote service
     */
    public com.lycenway.chr.backbone.service.BinghaiPingfenService getBinghaiPingfenService() {
        return binghaiPingfenService;
    }

    /**
     * Sets the binghai pingfen remote service.
     *
     * @param binghaiPingfenService the binghai pingfen remote service
     */
    public void setBinghaiPingfenService(
        com.lycenway.chr.backbone.service.BinghaiPingfenService binghaiPingfenService) {
        this.binghaiPingfenService = binghaiPingfenService;
    }

    /**
     * Returns the binghai pingfen persistence.
     *
     * @return the binghai pingfen persistence
     */
    public BinghaiPingfenPersistence getBinghaiPingfenPersistence() {
        return binghaiPingfenPersistence;
    }

    /**
     * Sets the binghai pingfen persistence.
     *
     * @param binghaiPingfenPersistence the binghai pingfen persistence
     */
    public void setBinghaiPingfenPersistence(
        BinghaiPingfenPersistence binghaiPingfenPersistence) {
        this.binghaiPingfenPersistence = binghaiPingfenPersistence;
    }

    /**
     * Returns the Binghai Attachments Pictures local service.
     *
     * @return the Binghai Attachments Pictures local service
     */
    public com.lycenway.chr.backbone.service.BinghaiProofLocalService getBinghaiProofLocalService() {
        return binghaiProofLocalService;
    }

    /**
     * Sets the Binghai Attachments Pictures local service.
     *
     * @param binghaiProofLocalService the Binghai Attachments Pictures local service
     */
    public void setBinghaiProofLocalService(
        com.lycenway.chr.backbone.service.BinghaiProofLocalService binghaiProofLocalService) {
        this.binghaiProofLocalService = binghaiProofLocalService;
    }

    /**
     * Returns the Binghai Attachments Pictures remote service.
     *
     * @return the Binghai Attachments Pictures remote service
     */
    public com.lycenway.chr.backbone.service.BinghaiProofService getBinghaiProofService() {
        return binghaiProofService;
    }

    /**
     * Sets the Binghai Attachments Pictures remote service.
     *
     * @param binghaiProofService the Binghai Attachments Pictures remote service
     */
    public void setBinghaiProofService(
        com.lycenway.chr.backbone.service.BinghaiProofService binghaiProofService) {
        this.binghaiProofService = binghaiProofService;
    }

    /**
     * Returns the Binghai Attachments Pictures persistence.
     *
     * @return the Binghai Attachments Pictures persistence
     */
    public BinghaiProofPersistence getBinghaiProofPersistence() {
        return binghaiProofPersistence;
    }

    /**
     * Sets the Binghai Attachments Pictures persistence.
     *
     * @param binghaiProofPersistence the Binghai Attachments Pictures persistence
     */
    public void setBinghaiProofPersistence(
        BinghaiProofPersistence binghaiProofPersistence) {
        this.binghaiProofPersistence = binghaiProofPersistence;
    }

    /**
     * Returns the List of Value Binghai Leixing - Case Type local service.
     *
     * @return the List of Value Binghai Leixing - Case Type local service
     */
    public com.lycenway.chr.backbone.service.LOVBinghaiLeixingLocalService getLOVBinghaiLeixingLocalService() {
        return lovBinghaiLeixingLocalService;
    }

    /**
     * Sets the List of Value Binghai Leixing - Case Type local service.
     *
     * @param lovBinghaiLeixingLocalService the List of Value Binghai Leixing - Case Type local service
     */
    public void setLOVBinghaiLeixingLocalService(
        com.lycenway.chr.backbone.service.LOVBinghaiLeixingLocalService lovBinghaiLeixingLocalService) {
        this.lovBinghaiLeixingLocalService = lovBinghaiLeixingLocalService;
    }

    /**
     * Returns the List of Value Binghai Leixing - Case Type persistence.
     *
     * @return the List of Value Binghai Leixing - Case Type persistence
     */
    public LOVBinghaiLeixingPersistence getLOVBinghaiLeixingPersistence() {
        return lovBinghaiLeixingPersistence;
    }

    /**
     * Sets the List of Value Binghai Leixing - Case Type persistence.
     *
     * @param lovBinghaiLeixingPersistence the List of Value Binghai Leixing - Case Type persistence
     */
    public void setLOVBinghaiLeixingPersistence(
        LOVBinghaiLeixingPersistence lovBinghaiLeixingPersistence) {
        this.lovBinghaiLeixingPersistence = lovBinghaiLeixingPersistence;
    }

    /**
     * Returns the Lisf of Value Mgmt Unit Type local service.
     *
     * @return the Lisf of Value Mgmt Unit Type local service
     */
    public com.lycenway.chr.backbone.service.LOVMuTypeLocalService getLOVMuTypeLocalService() {
        return lovMuTypeLocalService;
    }

    /**
     * Sets the Lisf of Value Mgmt Unit Type local service.
     *
     * @param lovMuTypeLocalService the Lisf of Value Mgmt Unit Type local service
     */
    public void setLOVMuTypeLocalService(
        com.lycenway.chr.backbone.service.LOVMuTypeLocalService lovMuTypeLocalService) {
        this.lovMuTypeLocalService = lovMuTypeLocalService;
    }

    /**
     * Returns the Lisf of Value Mgmt Unit Type persistence.
     *
     * @return the Lisf of Value Mgmt Unit Type persistence
     */
    public LOVMuTypePersistence getLOVMuTypePersistence() {
        return lovMuTypePersistence;
    }

    /**
     * Sets the Lisf of Value Mgmt Unit Type persistence.
     *
     * @param lovMuTypePersistence the Lisf of Value Mgmt Unit Type persistence
     */
    public void setLOVMuTypePersistence(
        LOVMuTypePersistence lovMuTypePersistence) {
        this.lovMuTypePersistence = lovMuTypePersistence;
    }

    /**
     * Returns the Mgmt Unit local service.
     *
     * @return the Mgmt Unit local service
     */
    public com.lycenway.chr.backbone.service.MuLocalService getMuLocalService() {
        return muLocalService;
    }

    /**
     * Sets the Mgmt Unit local service.
     *
     * @param muLocalService the Mgmt Unit local service
     */
    public void setMuLocalService(
        com.lycenway.chr.backbone.service.MuLocalService muLocalService) {
        this.muLocalService = muLocalService;
    }

    /**
     * Returns the Mgmt Unit persistence.
     *
     * @return the Mgmt Unit persistence
     */
    public MuPersistence getMuPersistence() {
        return muPersistence;
    }

    /**
     * Sets the Mgmt Unit persistence.
     *
     * @param muPersistence the Mgmt Unit persistence
     */
    public void setMuPersistence(MuPersistence muPersistence) {
        this.muPersistence = muPersistence;
    }

    /**
     * Returns the Mgmt Unit Extended Attributes local service.
     *
     * @return the Mgmt Unit Extended Attributes local service
     */
    public com.lycenway.chr.backbone.service.MuExtLocalService getMuExtLocalService() {
        return muExtLocalService;
    }

    /**
     * Sets the Mgmt Unit Extended Attributes local service.
     *
     * @param muExtLocalService the Mgmt Unit Extended Attributes local service
     */
    public void setMuExtLocalService(
        com.lycenway.chr.backbone.service.MuExtLocalService muExtLocalService) {
        this.muExtLocalService = muExtLocalService;
    }

    /**
     * Returns the Mgmt Unit Extended Attributes persistence.
     *
     * @return the Mgmt Unit Extended Attributes persistence
     */
    public MuExtPersistence getMuExtPersistence() {
        return muExtPersistence;
    }

    /**
     * Sets the Mgmt Unit Extended Attributes persistence.
     *
     * @param muExtPersistence the Mgmt Unit Extended Attributes persistence
     */
    public void setMuExtPersistence(MuExtPersistence muExtPersistence) {
        this.muExtPersistence = muExtPersistence;
    }

    /**
     * Returns the Mgmt Unit Inter Relationship local service.
     *
     * @return the Mgmt Unit Inter Relationship local service
     */
    public com.lycenway.chr.backbone.service.MuInterrelLocalService getMuInterrelLocalService() {
        return muInterrelLocalService;
    }

    /**
     * Sets the Mgmt Unit Inter Relationship local service.
     *
     * @param muInterrelLocalService the Mgmt Unit Inter Relationship local service
     */
    public void setMuInterrelLocalService(
        com.lycenway.chr.backbone.service.MuInterrelLocalService muInterrelLocalService) {
        this.muInterrelLocalService = muInterrelLocalService;
    }

    /**
     * Returns the Mgmt Unit Inter Relationship persistence.
     *
     * @return the Mgmt Unit Inter Relationship persistence
     */
    public MuInterrelPersistence getMuInterrelPersistence() {
        return muInterrelPersistence;
    }

    /**
     * Sets the Mgmt Unit Inter Relationship persistence.
     *
     * @param muInterrelPersistence the Mgmt Unit Inter Relationship persistence
     */
    public void setMuInterrelPersistence(
        MuInterrelPersistence muInterrelPersistence) {
        this.muInterrelPersistence = muInterrelPersistence;
    }

    /**
     * Returns the Mgmt Unit of Quxian Qujian local service.
     *
     * @return the Mgmt Unit of Quxian Qujian local service
     */
    public com.lycenway.chr.backbone.service.MuQuxianQujianLocalService getMuQuxianQujianLocalService() {
        return muQuxianQujianLocalService;
    }

    /**
     * Sets the Mgmt Unit of Quxian Qujian local service.
     *
     * @param muQuxianQujianLocalService the Mgmt Unit of Quxian Qujian local service
     */
    public void setMuQuxianQujianLocalService(
        com.lycenway.chr.backbone.service.MuQuxianQujianLocalService muQuxianQujianLocalService) {
        this.muQuxianQujianLocalService = muQuxianQujianLocalService;
    }

    /**
     * Returns the Mgmt Unit of Quxian Qujian persistence.
     *
     * @return the Mgmt Unit of Quxian Qujian persistence
     */
    public MuQuxianQujianPersistence getMuQuxianQujianPersistence() {
        return muQuxianQujianPersistence;
    }

    /**
     * Sets the Mgmt Unit of Quxian Qujian persistence.
     *
     * @param muQuxianQujianPersistence the Mgmt Unit of Quxian Qujian persistence
     */
    public void setMuQuxianQujianPersistence(
        MuQuxianQujianPersistence muQuxianQujianPersistence) {
        this.muQuxianQujianPersistence = muQuxianQujianPersistence;
    }

    /**
     * Returns the Mgmt Unit of Wufeng Xianlu local service.
     *
     * @return the Mgmt Unit of Wufeng Xianlu local service
     */
    public com.lycenway.chr.backbone.service.MuWufengXianluLocalService getMuWufengXianluLocalService() {
        return muWufengXianluLocalService;
    }

    /**
     * Sets the Mgmt Unit of Wufeng Xianlu local service.
     *
     * @param muWufengXianluLocalService the Mgmt Unit of Wufeng Xianlu local service
     */
    public void setMuWufengXianluLocalService(
        com.lycenway.chr.backbone.service.MuWufengXianluLocalService muWufengXianluLocalService) {
        this.muWufengXianluLocalService = muWufengXianluLocalService;
    }

    /**
     * Returns the Mgmt Unit of Wufeng Xianlu persistence.
     *
     * @return the Mgmt Unit of Wufeng Xianlu persistence
     */
    public MuWufengXianluPersistence getMuWufengXianluPersistence() {
        return muWufengXianluPersistence;
    }

    /**
     * Sets the Mgmt Unit of Wufeng Xianlu persistence.
     *
     * @param muWufengXianluPersistence the Mgmt Unit of Wufeng Xianlu persistence
     */
    public void setMuWufengXianluPersistence(
        MuWufengXianluPersistence muWufengXianluPersistence) {
        this.muWufengXianluPersistence = muWufengXianluPersistence;
    }

    /**
     * Returns the Mgmt Unit of Zhengxian Podao local service.
     *
     * @return the Mgmt Unit of Zhengxian Podao local service
     */
    public com.lycenway.chr.backbone.service.MuZhengxianPodaoLocalService getMuZhengxianPodaoLocalService() {
        return muZhengxianPodaoLocalService;
    }

    /**
     * Sets the Mgmt Unit of Zhengxian Podao local service.
     *
     * @param muZhengxianPodaoLocalService the Mgmt Unit of Zhengxian Podao local service
     */
    public void setMuZhengxianPodaoLocalService(
        com.lycenway.chr.backbone.service.MuZhengxianPodaoLocalService muZhengxianPodaoLocalService) {
        this.muZhengxianPodaoLocalService = muZhengxianPodaoLocalService;
    }

    /**
     * Returns the Mgmt Unit of Zhengxian Podao persistence.
     *
     * @return the Mgmt Unit of Zhengxian Podao persistence
     */
    public MuZhengxianPodaoPersistence getMuZhengxianPodaoPersistence() {
        return muZhengxianPodaoPersistence;
    }

    /**
     * Sets the Mgmt Unit of Zhengxian Podao persistence.
     *
     * @param muZhengxianPodaoPersistence the Mgmt Unit of Zhengxian Podao persistence
     */
    public void setMuZhengxianPodaoPersistence(
        MuZhengxianPodaoPersistence muZhengxianPodaoPersistence) {
        this.muZhengxianPodaoPersistence = muZhengxianPodaoPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Binghai.class;
    }

    protected String getModelClassName() {
        return Binghai.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = binghaiPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
