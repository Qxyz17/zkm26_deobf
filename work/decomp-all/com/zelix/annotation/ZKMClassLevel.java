/*
 * Decompiled with CFR 0.152.
 */
package com.zelix.annotation;

import com.zelix.annotation.ExceptionObfuscationPolicy;
import com.zelix.annotation.FlowObfuscationPolicy;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(value=RetentionPolicy.CLASS)
@Target(value={ElementType.TYPE})
public @interface ZKMClassLevel {
    public FlowObfuscationPolicy obfuscateFlow() default FlowObfuscationPolicy.LIGHT;

    public ExceptionObfuscationPolicy exceptionObfuscation() default ExceptionObfuscationPolicy.LIGHT;
}
