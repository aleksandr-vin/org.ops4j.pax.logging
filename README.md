# The OSGi Logging framework implementation

Supports SLF4J, LOG4J, JCL etc.

## Logback TurboFilter API

### Proposal

This should be real with new pax-logging-{api,logback}:

```
        MDCFilter mdcFilter = new MDCFilter();
        mdcFilter.setMDCKey("foo");
        mdcFilter.setValue("bar");
        mdcFilter.setOnMatch("ACCEPT");
        lc.addTurboFilter(mdcFilter);
```

Then

```
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.slf4j.MDC;

        ...

        private static final Logger logger = LoggerFactory.getLogger(LogbackControlService.class);
        logger.debug("Hello!");
        MDC.put("foo", "bar");
        logger.debug("Hello again!");
        lc.getTurboFilterList().remove(mdcFilter);
        logger.debug("Good bye!");
```
