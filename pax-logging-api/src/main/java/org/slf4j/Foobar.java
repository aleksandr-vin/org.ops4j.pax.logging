package org.slf4j;

//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.classic.turbo.MDCFilter;

public class Foobar {

    // private static final LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();

    public static int put(String key, String value)  {
        // addMdcFilter(key, value, lc);
        return 314;
    }

    // public void addMdcFilter(String mdcKey, String mdcValue, LoggerContext lc) {
        // MDCFilter mdcFilter = new MDCFilter();
        // mdcFilter.setMDCKey(mdcKey);
        // mdcFilter.setValue(mdcValue);
        // mdcFilter.setOnMatch("ACCEPT");
        // lc.addTurboFilter(mdcFilter);
    // }

}
