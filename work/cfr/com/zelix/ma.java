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
    private static final long a = prr.a(-2748980715009605901L, -7695223195032935707L, MethodHandles.lookup().lookupClass()).a(105707455933537L);
    private static final String b;

    public ma(int n10, byte by2, int n11, File file) {
        long l10 = ((long)n10 << 32 | (long)by2 << 56 >>> 32 | (long)n11 << 40 >>> 40) ^ a;
        m44.a("s", (Object)this, (File)file, (long)-1168289499775781852L, (long)l10);
    }

    public static void r(Object[] objectArray) {
        block9: {
            long l10 = (Long)objectArray[0];
            String string = (String)objectArray[1];
            l10 = a ^ l10;
            CallSite callSite = m44.a("m", (long)-3580983155172418147L, (long)l10);
            if (string != null) {
                CallSite callSite2;
                block8: {
                    File file = new File(string);
                    try {
                        try {
                            callSite2 = m44.a("r", (Object)file, (long)-3924359332935775151L, (long)l10);
                            if (l10 <= 0L || callSite == false) break block8;
                            if (callSite2 != false) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("m", (Object)n92, (long)-3615428852715038589L, (long)l10);
                        }
                        callSite2 = m44.a("r", (Object)file, (long)-3534587042241066072L, (long)l10);
                    }
                    catch (n9 n93) {
                        throw m44.a("m", (Object)n93, (long)-3615428852715038589L, (long)l10);
                    }
                }
                try {
                    if (callSite2 == false) {
                        throw new IOException(b + string + "'");
                    }
                }
                catch (n9 n94) {
                    throw m44.a("m", (Object)n94, (long)-3615428852715038589L, (long)l10);
                }
            }
        }
    }

    public List f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (l10 = a ^ l10) ^ 0x38A61000B7DEL;
        ArrayList arrayList = new ArrayList();
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l11;
        objectArray2[1] = arrayList;
        objectArray2[0] = m44.a("w", (Object)this, (long)-5863941582669482638L, (long)l10);
        m44.a("v", (Object)this, (Object)objectArray2, (long)-6276866652412091459L, (long)l10);
        return arrayList;
    }

    protected void o(Object[] objectArray) {
        int n10;
        CallSite callSite;
        CallSite callSite2;
        long l10;
        long l11;
        List list;
        File file;
        block5: {
            block4: {
                CallSite callSite3;
                block3: {
                    file = (File)objectArray[0];
                    list = (List)objectArray[1];
                    l11 = (Long)objectArray[2];
                    l10 = (l11 = a ^ l11) ^ 0x2936ABF29872L;
                    callSite2 = m44.a("r", (Object)file, (Object)new oe(), (long)-6976289139791922405L, (long)l11);
                    callSite = m44.a("m", (long)-7420306803482686763L, (long)l11);
                    try {
                        callSite3 = callSite2;
                        if (callSite == false) break block3;
                        if (callSite3 == null) break block4;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-7306133747740274741L, (long)l11);
                    }
                    callSite3 = callSite2;
                }
                n10 = ((CallSite)callSite3).length;
                break block5;
            }
            n10 = 0;
        }
        int n11 = n10;
        for (int i10 = 0; i10 < n11; ++i10) {
            File file2 = new File(file, (String)((Object)callSite2[i10]));
            list.add(m44.a("r", (Object)file2, (long)-7010278218615856179L, (long)l11));
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l10;
            objectArray2[1] = list;
            objectArray2[0] = file2;
            m44.a("r", (Object)this, (Object)objectArray2, (long)-8698695423725319151L, (long)l11);
            if (callSite != false) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x289ED745BC5BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("$\f\u001f\u00f3\u00c8h\u0096\u00d0m>~\b\u00b2\u00ceF\tu\u00e9Xg\u0018\u00eamD\u00a8A\u00c3\u008c\u0010\u0019\u0007\u008d".getBytes("ISO-8859-1"));
                b = ma.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }
}

