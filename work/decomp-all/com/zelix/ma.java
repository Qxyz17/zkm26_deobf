/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.oe;
import com.zelix.prr;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ma {
    protected File y;
    private static final long a = prr.a((long)-2748980715009605901L, (long)-7695223195032935707L, MethodHandles.lookup().lookupClass()).a(105707455933537L);
    private static final String b;

    public ma(int n, byte by, int n2, File file) {
        long l = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ a;
        m44.a("s", (Object)this, (File)file, (long)-1168289499775781852L, (long)l);
    }

    public static void r(Object[] objectArray) {
        block9: {
            long l = (Long)objectArray[0];
            String string = (String)objectArray[1];
            l = a ^ l;
            CallSite callSite = m44.a("m", (long)-3580983155172418147L, (long)l);
            if (string != null) {
                CallSite callSite2;
                block8: {
                    File file = new File(string);
                    try {
                        try {
                            callSite2 = m44.a("r", (Object)file, (long)-3924359332935775151L, (long)l);
                            if (l <= 0L || callSite == false) break block8;
                            if (callSite2 != false) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("m", (Object)((Object)n92), (long)-3615428852715038589L, (long)l);
                        }
                        callSite2 = m44.a("r", (Object)file, (long)-3534587042241066072L, (long)l);
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)((Object)n93), (long)-3615428852715038589L, (long)l);
                    }
                }
                try {
                    if (callSite2 == false) {
                        throw new IOException(b + string + "'");
                    }
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)((Object)n94), (long)-3615428852715038589L, (long)l);
                }
            }
        }
    }

    public List f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x38A61000B7DEL;
        ArrayList arrayList = new ArrayList();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = arrayList;
        objectArray2[0] = m44.a("w", (Object)this, (long)-5863941582669482638L, (long)l);
        m44.a("v", (Object)this, (Object)objectArray2, (long)-6276866652412091459L, (long)l);
        return arrayList;
    }

    protected void o(Object[] objectArray) {
        int n;
        CallSite callSite;
        CallSite callSite2;
        long l;
        long l2;
        List list;
        File file;
        block5: {
            block4: {
                CallSite callSite3;
                block3: {
                    file = (File)objectArray[0];
                    list = (List)objectArray[1];
                    l2 = (Long)objectArray[2];
                    l = (l2 = a ^ l2) ^ 0x2936ABF29872L;
                    callSite2 = m44.a("r", (Object)file, (Object)new oe(), (long)-6976289139791922405L, (long)l2);
                    callSite = m44.a("m", (long)-7420306803482686763L, (long)l2);
                    try {
                        callSite3 = callSite2;
                        if (callSite == false) break block3;
                        if (callSite3 == null) break block4;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)((Object)n92), (long)-7306133747740274741L, (long)l2);
                    }
                    callSite3 = callSite2;
                }
                n = ((CallSite)callSite3).length;
                break block5;
            }
            n = 0;
        }
        int n2 = n;
        for (int i = 0; i < n2; ++i) {
            File file2 = new File(file, (String)((Object)callSite2[i]));
            list.add(m44.a("r", (Object)file2, (long)-7010278218615856179L, (long)l2));
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l;
            objectArray2[1] = list;
            objectArray2[0] = file2;
            m44.a("r", (Object)this, (Object)objectArray2, (long)-8698695423725319151L, (long)l2);
            if (callSite != false) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x289ED745BC5BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("$\f\u001f\u00f3\u00c8h\u0096\u00d0m>~\b\u00b2\u00ceF\tu\u00e9Xg\u0018\u00eamD\u00a8A\u00c3\u008c\u0010\u0019\u0007\u008d".getBytes("ISO-8859-1"));
                b = ma.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }
}
