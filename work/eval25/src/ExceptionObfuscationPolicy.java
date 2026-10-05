package com.zelix.annotation;

public enum ExceptionObfuscationPolicy {
   public static final ExceptionObfuscationPolicy HEAVY = new ExceptionObfuscationPolicy();
   public static final ExceptionObfuscationPolicy LIGHT = new ExceptionObfuscationPolicy();
   public static final ExceptionObfuscationPolicy NONE = new ExceptionObfuscationPolicy();
}
