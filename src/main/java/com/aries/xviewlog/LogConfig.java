package com.aries.xviewlog;

import com.aries.extension.util.PropertyUtil;

public class LogConfig {
    static final LogProp prop = new LogProp();
    static final String PATTERN = "[%startTime, %endTime, %collectTime] Domain=%domainName(%domainId), Instance=%instanceName(%instanceId), " +
            "TXID=%txid, Client IP=%clientIp, Client ID=%clientId, User ID=%userId, Response Time=%responseTime, " +
            "Front-end Time=%frontendTime, Network Time=%networkTime, SQL Time=%sqlTime, Fetch Time=%fetchTime, CPU Time=%cpuTime, External-call Time=%externalcallTime, " +
            "ERROR=%error, Application=%application";

    static final String DATE_FORMAT = "HH:mm:ss";
    static final String FULL_PATH = "../logs/xviewlog.%d{yyyy-MM-dd_HH}.log";
    static final String ROLLING_MODE = "true";

    public static LogProp getLog() {
        prop.setPattern(PropertyUtil.getValue("xviewlog", "pattern", PATTERN));
        prop.setDateFormat(PropertyUtil.getValue("xviewlog", "date_format", DATE_FORMAT));
        prop.setFullPath(PropertyUtil.getValue("xviewlog", "full_path", FULL_PATH));
        prop.setRollingMode(PropertyUtil.getValue("xviewlog", "rolling_mode", ROLLING_MODE));

        return prop;
    }
}