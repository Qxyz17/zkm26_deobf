/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.yf;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

public class yr
extends yf {
    private final lqu M;
    private final int D;
    private final PrintWriter o;
    private static final long a = prr.a((long)-2854259028268209013L, (long)-8249183552789405023L, MethodHandles.lookup().lookupClass()).a(153155084114013L);

    public void f(Object[] objectArray) {
        String string = (String)objectArray[0];
        String string2 = (String)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x52900A306282L;
        long l4 = l2 ^ 0x2430DD94142CL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        String string3 = string + (String)((Object)m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-2286752870783078143L, (long)l)) + string2 + (String)((Object)m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)-341400035588431147L, (long)l), (Object)objectArray3, (long)-330544872949858951L, (long)l));
        m44.a("u", (Object)m44.a("n", (long)-2119145246892827723L, (long)l), (long)-2128130300694973087L, (long)l);
        m44.a("u", (Object)m44.a("n", (long)-2119145246892827723L, (long)l), (Object)string3, (long)-439062474112375811L, (long)l);
        ((PrintWriter)((Object)m44.a("t", (Object)((Object)this), (long)-2198393237383087181L, (long)l))).println(string3);
    }

    public void p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l;
        long l3 = l2 ^ 0x41485587D798L;
        long l4 = l2 ^ 0x37E88223A136L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = string;
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        String string3 = string + (String)((Object)m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)6150159768215946267L, (long)l)) + string2 + (String)((Object)m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)5645554197794756559L, (long)l), (Object)objectArray3, (long)5653065264502704227L, (long)l));
        m44.a("w", (Object)m44.a("l", (long)6308799225929494191L, (long)l), (long)6299778435722182779L, (long)l);
        m44.a("w", (Object)m44.a("l", (long)6308799225929494191L, (long)l), (Object)string3, (long)5544547803367495399L, (long)l);
        ((PrintWriter)((Object)m44.a("v", (Object)((Object)this), (long)6082022407426494121L, (long)l))).println(string3);
    }

    public yr(PrintWriter printWriter, int n, boolean bl, int n2, int n3, short s, lqu lqu2) {
        boolean bl2;
        yr yr2;
        long l;
        long l2;
        block2: {
            block3: {
                long l3 = l2 = ((long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
                l = l3 ^ 0x58D118FEFD7L;
                long l4 = l3 ^ 0x4DDA30984C21L;
                int n4 = (int)(l4 >>> 48);
                int n5 = (int)(l4 << 16 >>> 48);
                int n6 = (int)(l4 << 32 >>> 32);
                CallSite callSite = m44.a("m", (long)-8161173159469183365L, (long)l2);
                super((short)n4, (short)n5, n6);
                CallSite callSite2 = callSite;
                try {
                    this.o = printWriter;
                    this.D = n;
                    yr2 = this;
                    bl2 = bl;
                    if (callSite2 == false) break block2;
                    if (bl2) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("m", (Object)((Object)n92), (long)-7860163885378478342L, (long)l2);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = bl2;
        objectArray[0] = l;
        m44.a("r", (Object)((Object)yr2), (Object)objectArray, (long)-7578993214104625296L, (long)l2);
        this.M = lqu2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void t(Object[] objectArray) {
        Object object;
        CallSite callSite;
        String string;
        long l;
        block4: {
            String string2 = (String)objectArray[0];
            l = (Long)objectArray[1];
            String string3 = (String)objectArray[2];
            long l2 = l;
            long l3 = l2 ^ 0x397FBE9110D2L;
            long l4 = l2 ^ 0x4FDF6935667CL;
            long l5 = l2 ^ 0x57ED1B5EAD0DL;
            CallSite callSite2 = m44.a("j", (long)-8506016364038628660L, (long)l);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = string2;
            objectArray2[0] = l3;
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l4;
            string = string2 + (String)((Object)m44.a("u", (Object)((Object)this), (Object)objectArray2, (long)-7920783297871887535L, (long)l)) + string3 + (String)((Object)m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)-8569380775607971707L, (long)l), (Object)objectArray3, (long)-8558597549376778455L, (long)l));
            m44.a("u", (Object)m44.a("n", (long)-7622855903672782265L, (long)l), (long)-8059412346105903311L, (long)l);
            m44.a("u", (Object)m44.a("n", (long)-7622855903672782265L, (long)l), (Object)string, (long)-8378866918727970387L, (long)l);
            ((PrintWriter)((Object)m44.a("t", (Object)((Object)this), (long)-7841374911430293021L, (long)l))).println(string);
            m44.a("u", (Object)m44.a("t", (Object)((Object)this), (long)-7841374911430293021L, (long)l), (long)-8421855268909237912L, (long)l);
            callSite = callSite2;
            try {
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l5;
                object = m44.a("u", (Object)((Object)this), (Object)objectArray4, (long)-8142595634442928084L, (long)l);
                if (callSite != false) break block4;
                if (object == false) throw new n9(string);
            }
            catch (n9 n92) {
                throw m44.a("j", (Object)((Object)n92), (long)-8222335681041120779L, (long)l);
            }
            object = true;
        }
        try {
            m44.a("j", (int)object, (long)-8099454847081937521L, (long)l);
            if (callSite == false) return;
            throw new n9(string);
        }
        catch (n9 n93) {
            throw m44.a("j", (Object)((Object)n93), (long)-8222335681041120779L, (long)l);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void n(Object[] objectArray) {
        Object object;
        CallSite callSite;
        String string;
        long l;
        block4: {
            String string2 = (String)objectArray[0];
            String string3 = (String)objectArray[1];
            l = (Long)objectArray[2];
            String string4 = (String)objectArray[3];
            long l2 = l;
            long l3 = l2 ^ 0x3B74BF987889L;
            long l4 = l2 ^ 0x4DD4683C0E27L;
            long l5 = l2 ^ 0x55E61A57C556L;
            CallSite callSite2 = m44.a("i", (long)-438606599741408977L, (long)l);
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = string2;
            objectArray2[0] = l3;
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l4;
            string = string2 + (String)((Object)m44.a("v", (Object)((Object)this), (Object)objectArray2, (long)-411873183810540790L, (long)l)) + string3 + (String)((Object)m44.a("v", (Object)m44.a("w", (Object)((Object)this), (long)-2213392097399392034L, (long)l), (Object)objectArray3, (long)-2205986648232614030L, (long)l));
            m44.a("v", (Object)m44.a("m", (long)-113382762348455396L, (long)l), (long)-541499439425212566L, (long)l);
            m44.a("v", (Object)m44.a("m", (long)-113382762348455396L, (long)l), (Object)string, (long)-2025693059005810186L, (long)l);
            m44.a("v", (Object)m44.a("m", (long)-113382762348455396L, (long)l), (Object)string4, (long)-2025693059005810186L, (long)l);
            callSite = callSite2;
            try {
                ((PrintWriter)((Object)m44.a("w", (Object)((Object)this), (long)-326839609981869640L, (long)l))).println(string);
                ((PrintWriter)((Object)m44.a("w", (Object)((Object)this), (long)-326839609981869640L, (long)l))).println(string4);
                m44.a("v", (Object)m44.a("w", (Object)((Object)this), (long)-326839609981869640L, (long)l), (long)-2070374571195707085L, (long)l);
                Object[] objectArray4 = new Object[1];
                objectArray4[0] = l5;
                object = m44.a("v", (Object)((Object)this), (Object)objectArray4, (long)-1827139413043615625L, (long)l);
                if (callSite == false) break block4;
                if (object == false) throw new n9(string);
            }
            catch (n9 n92) {
                throw m44.a("i", (Object)((Object)n92), (long)-1891679759359858258L, (long)l);
            }
            object = true;
        }
        try {
            m44.a("i", (int)object, (long)-1746280987394511404L, (long)l);
            if (callSite != false) return;
            throw new n9(string);
        }
        catch (n9 n93) {
            throw m44.a("i", (Object)((Object)n93), (long)-1891679759359858258L, (long)l);
        }
    }

    public void K(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = (String)objectArray[2];
        long l2 = l ^ 0x457307BD84E7L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = string2;
        objectArray2[1] = l2;
        objectArray2[0] = string;
        m44.a("r", (Object)((Object)this), (Object)objectArray2, (long)1643981827443713816L, (long)l);
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
        m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-7341450796456121387L, (long)l);
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
        m44.a("t", (Object)((Object)this), (Object)objectArray2, (long)3629460090985549464L, (long)l);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
