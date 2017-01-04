package com.lorelib.microservice.commons.stereotype;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 业务逻辑层
 * Created by listening on 2017/1/4.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Business {
    String value() default "";
}
