package com.lycenway.chr.backbone.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.lycenway.chr.backbone.service.BinghaiLocalServiceUtil;
import com.lycenway.chr.backbone.service.BinghaiPingfenLocalServiceUtil;
import com.lycenway.chr.backbone.service.BinghaiPingfenServiceUtil;
import com.lycenway.chr.backbone.service.BinghaiProofLocalServiceUtil;
import com.lycenway.chr.backbone.service.BinghaiProofServiceUtil;
import com.lycenway.chr.backbone.service.BinghaiServiceUtil;
import com.lycenway.chr.backbone.service.ClpSerializer;
import com.lycenway.chr.backbone.service.LOVBinghaiLeixingLocalServiceUtil;
import com.lycenway.chr.backbone.service.LOVMuTypeLocalServiceUtil;
import com.lycenway.chr.backbone.service.MuExtLocalServiceUtil;
import com.lycenway.chr.backbone.service.MuInterrelLocalServiceUtil;
import com.lycenway.chr.backbone.service.MuLocalServiceUtil;
import com.lycenway.chr.backbone.service.MuQuxianQujianLocalServiceUtil;
import com.lycenway.chr.backbone.service.MuWufengXianluLocalServiceUtil;
import com.lycenway.chr.backbone.service.MuZhengxianPodaoLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            BinghaiLocalServiceUtil.clearService();

            BinghaiServiceUtil.clearService();
            BinghaiPingfenLocalServiceUtil.clearService();

            BinghaiPingfenServiceUtil.clearService();
            BinghaiProofLocalServiceUtil.clearService();

            BinghaiProofServiceUtil.clearService();
            LOVBinghaiLeixingLocalServiceUtil.clearService();

            LOVMuTypeLocalServiceUtil.clearService();

            MuLocalServiceUtil.clearService();

            MuExtLocalServiceUtil.clearService();

            MuInterrelLocalServiceUtil.clearService();

            MuQuxianQujianLocalServiceUtil.clearService();

            MuWufengXianluLocalServiceUtil.clearService();

            MuZhengxianPodaoLocalServiceUtil.clearService();
        }
    }
}
