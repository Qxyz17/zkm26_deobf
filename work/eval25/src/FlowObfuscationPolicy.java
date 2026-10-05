package com.zelix.annotation;

public enum FlowObfuscationPolicy {
   public static final FlowObfuscationPolicy NORMAL = new FlowObfuscationPolicy();
   public static final FlowObfuscationPolicy NONE = new FlowObfuscationPolicy();
   public static final FlowObfuscationPolicy AGGRESSIVE = new FlowObfuscationPolicy();
   public static final FlowObfuscationPolicy LIGHT = new FlowObfuscationPolicy();
}
