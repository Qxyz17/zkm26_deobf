/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.yf;
import java.lang.invoke.MethodHandles;

public class y9
extends yf {
    private static final long a = prr.a((long)3119947130793329901L, (long)-7769620680651108019L, MethodHandles.lookup().lookupClass()).a(241107951093705L);

    public void K(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x2E9CB31CF6B7L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = string2;
        objectArray2[0] = string;
        m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)1356952945249190293L, (long)l);
    }

    public void p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x41485587D798L;
        m44.a("w", (Object)m44.a("l", (long)6308799225929494191L, (long)l), (long)6299778435722182779L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l2;
        m44.a("w", (Object)m44.a("l", (long)6308799225929494191L, (long)l), (Object)(string + (String)((Object)m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)6150159768215946267L, (long)l)) + string2), (long)5544547803367495399L, (long)l);
    }

    public void f(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l ^ 0x52900A306282L;
        m44.a("u", (Object)m44.a("n", (long)-2119145246892827723L, (long)l), (long)-2128130300694973087L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l2;
        m44.a("u", (Object)m44.a("n", (long)-2119145246892827723L, (long)l), (Object)(string + (String)((Object)m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-2286752870783078143L, (long)l)) + string2), (long)-439062474112375811L, (long)l);
    }

    public void n(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l = (Long)objectArray[2];
        String string3 = (String)objectArray[3];
        long l2 = l ^ 0x3B74BF987889L;
        m44.a("v", (Object)m44.a("m", (long)-113382762348455396L, (long)l), (long)-541499439425212566L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l2;
        m44.a("v", (Object)m44.a("m", (long)-113382762348455396L, (long)l), (Object)(string + (String)((Object)m44.a("v", (Object)((Object)this), (Object)objectArray2, (long)-411873183810540790L, (long)l)) + string2), (long)-2025693059005810186L, (long)l);
        m44.a("v", (Object)m44.a("m", (long)-113382762348455396L, (long)l), (Object)string3, (long)-2025693059005810186L, (long)l);
        m44.a("i", (int)1, (long)-1746280987394511404L, (long)l);
    }

    public void t(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x397FBE9110D2L;
        m44.a("u", (Object)m44.a("n", (long)-7622855903672782265L, (long)l), (long)-8059412346105903311L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l2;
        m44.a("u", (Object)m44.a("n", (long)-7622855903672782265L, (long)l), (Object)(string + (String)((Object)m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-7920783297871887535L, (long)l)) + string2), (long)-8378866918727970387L, (long)l);
        m44.a("j", (int)1, (long)-8099454847081937521L, (long)l);
    }

    public void I(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        String string3 = (String)objectArray[3];
        long l2 = l ^ 0x6B23FB6DCDBAL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = string3;
        objectArray2[2] = l2;
        objectArray2[1] = string2;
        objectArray2[0] = string;
        m44.a("t", (Object)((Object)this), (Object)objectArray2, (long)4015470567297757594L, (long)l);
    }

    public y9(long l) {
        long l2 = (l = a ^ l) ^ 0x5CA86F1F367AL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 48);
        int n3 = (int)(l2 << 32 >>> 32);
        super((short)n, (short)n2, n3);
    }

    public void a(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x30D5BB7E082AL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = string2;
        objectArray2[1] = l2;
        objectArray2[0] = string;
        m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-7174789791670010770L, (long)l);
    }
}
