package com.aries.xviewlog;

import com.aries.extension.data.TransactionData;
import com.aries.extension.handler.TransactionHandler;
import com.aries.extension.util.LogUtil;

import java.text.SimpleDateFormat;

public class LogAdapter implements TransactionHandler {
    public void on(TransactionData[] txlist) {
        LogProp prop = LogConfig.getLog();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(prop.getDateFormat());

            for(int i = 0; i < txlist.length; i++) {
                TransactionData model = txlist[i];

                String pattern = prop.getPattern();
                String startTimeStr = sdf.format(model.startTime);
                String endTimeStr = sdf.format(model.endTime);
                String collectTimeStr = sdf.format(model.collectTime);

                pattern = pattern.replaceFirst("%startTime", startTimeStr);
                pattern = pattern.replaceFirst("%endTime", endTimeStr);
                pattern = pattern.replaceFirst("%collectTime", collectTimeStr);
                pattern = pattern.replaceFirst("%domainId", "" + model.domainId);
                pattern = pattern.replaceFirst("%domainName", "" + model.domainName);
                pattern = pattern.replaceFirst("%instanceId", "" + model.instanceId);
                pattern = pattern.replaceFirst("%instanceName", "" + model.instanceName);
                pattern = pattern.replaceFirst("%txid", "" + model.txid);
                pattern = pattern.replaceFirst("%clientIp", "" + model.clientIp);
                pattern = pattern.replaceFirst("%clientId", "" + model.clientId);
                pattern = pattern.replaceFirst("%userId", "" + model.userId);
                pattern = pattern.replaceFirst("%responseTime", "" + model.responseTime);
                pattern = pattern.replaceFirst("%frontendTime", "" + model.frontendTime);
                pattern = pattern.replaceFirst("%networkTime", "" + model.networkTime);
                pattern = pattern.replaceFirst("%sqlTime", "" + model.sqlTime);
                pattern = pattern.replaceFirst("%fetchTime", "" + model.fetchTime);
                pattern = pattern.replaceFirst("%cpuTime", "" + model.cpuTime);
                pattern = pattern.replaceFirst("%externalcallTime", "" + model.externalcallTime);
                pattern = pattern.replaceFirst("%error", "" + model.errorType);
                pattern = pattern.replaceFirst("%application", "" + model.applicationName);

                Logger.info(pattern);
            }
        } catch (Exception e) {
            LogUtil.error(e.toString());
        }
    }
}