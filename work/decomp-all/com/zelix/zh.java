/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bn;
import com.zelix.ek;
import com.zelix.lml;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class zh {
    private List y;
    private static final long a = prr.a((long)6679378782211802813L, (long)-1786516915917378149L, MethodHandles.lookup().lookupClass()).a(240199713660484L);

    zh(long l) {
        l = a ^ l;
        m44.a("v", (Object)this, new ArrayList(), (long)5912342401822788067L, (long)l);
    }

    bn n(Object[] objectArray) {
        block5: {
            CallSite callSite;
            long l;
            long l2;
            block4: {
                l2 = (Long)objectArray[0];
                l = (l2 = a ^ l2) ^ 0x4D4701F46405L;
                CallSite callSite2 = m44.a("i", (long)9215913600749581923L, (long)l2);
                try {
                    try {
                        callSite = m44.a("w", (Object)this, (long)8743728199128949432L, (long)l2);
                        if (callSite2 != false) break block4;
                        if (callSite.size() <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)7408011118604438142L, (long)l2);
                    }
                    callSite = m44.a("w", (Object)this, (long)8743728199128949432L, (long)l2).get(m44.a("w", (Object)this, (long)8743728199128949432L, (long)l2).size() - 1);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)7408011118604438142L, (long)l2);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l;
            CallSite callSite3 = m44.a("v", (Object)((ek)callSite), (Object)objectArray2, (long)7188537747412035415L, (long)l2);
            return callSite3;
        }
        return null;
    }

    void O(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lml lml2 = (lml)objectArray[1];
        bn bn2 = (bn)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x54C23499E4C1L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = false;
        objectArray2[2] = l2;
        objectArray2[1] = bn2;
        objectArray2[0] = lml2;
        m44.a("u", (Object)this, (Object)objectArray2, (long)4335675941110802435L, (long)l);
    }

    void g(Object[] objectArray) {
        long l = (Long)objectArray[0];
        lml lml2 = (lml)objectArray[1];
        long l2 = (l = a ^ l) ^ 0xF2053676076L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = false;
        objectArray2[0] = lml2;
        m44.a("p", (Object)this, (Object)objectArray2, (long)-2099946251218383724L, (long)l);
    }

    public Object clone() {
        long l = a ^ 0x7E1D65D65198L;
        long l2 = l ^ 0x2849EF8D1605L;
        zh zh2 = new zh(l2);
        m44.a("t", (Object)zh2, new ArrayList(m44.a("v", (Object)this, (long)-3880222558925876791L, (long)l)), (long)-3880222558925876791L, (long)l);
        return zh2;
    }

    Enumeration J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return Collections.enumeration(m44.a("w", (Object)this, (long)8146954983438461664L, (long)l));
    }

    void s(Object[] objectArray) {
        lml lml2 = (lml)objectArray[0];
        boolean bl = (Boolean)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0xABA0C956E9EL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        ek ek2 = new ek(lml2, bl, (char)n, n2, (char)n3);
        m44.a("p", (Object)this, (long)1630458011452820815L, (long)l).add(ek2);
    }

    void E(Object[] objectArray) {
        lml lml2 = (lml)objectArray[0];
        bn bn2 = (bn)objectArray[1];
        long l = (Long)objectArray[2];
        boolean bl = (Boolean)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x7CC7579C966CL;
        ek ek2 = new ek(lml2, l2, bn2, bl);
        m44.a("r", (Object)this, (long)5889203078169725525L, (long)l).add(ek2);
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
