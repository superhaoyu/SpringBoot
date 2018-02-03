package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Before("execution(public * com.haoyu.girl.controller.GirlController*.* (..))")
    public void doBefore() {
        logger.info("abcdefg");

    }

    @After("execution(public * com.haoyu.girl.controller.GirlController*.*(..))")
    public void doAfter() {
        logger.info("hijklmn");
    }

}
