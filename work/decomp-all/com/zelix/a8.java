/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nt;
import com.zelix.prr;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a8
implements PropertyChangeListener {
    final nt O;
    private static final long a = prr.a((long)-7256550385011652184L, (long)7756424922776171286L, MethodHandles.lookup().lookupClass()).a(109014724119757L);
    private static final String b;

    a8(nt nt2) {
        this.O = nt2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block9: {
            long l;
            long l2;
            block10: {
                CallSite callSite;
                CallSite callSite2;
                block8: {
                    l2 = a ^ 0x182F03F5152AL;
                    l = l2 ^ 0x1C7B3D32EC08L;
                    callSite2 = m44.a("k", (long)-2566432610332419867L, (long)l2);
                    try {
                        try {
                            callSite = m44.a("t", (Object)propertyChangeEvent, (long)-4345937758325084572L, (long)l2);
                            if (callSite2 != null) break block8;
                            if (!((String)((Object)callSite)).equals(b)) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)((Object)n92), (long)-4483087715680945795L, (long)l2);
                        }
                        callSite = m44.a("t", (Object)propertyChangeEvent, (long)-4245083347921154432L, (long)l2);
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)((Object)n93), (long)-4483087715680945795L, (long)l2);
                    }
                }
                File file = (File)((Object)callSite);
                try {
                    try {
                        if (callSite2 != null) break block10;
                        if (file == null) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)((Object)n94), (long)-4483087715680945795L, (long)l2);
                    }
                    m44.a("w", (Object)m44.a("u", (Object)this, (long)-2377891756630934176L, (long)l2), (int)1, (long)-4350569386094158029L, (long)l2);
                    Object[] objectArray = new Object[2];
                    objectArray[1] = m44.a("u", (Object)this, (long)-2377891756630934176L, (long)l2);
                    objectArray[0] = l;
                    m44.a("t", (Object)m44.a("k", (Object)objectArray, (long)-2862706682366634813L, (long)l2), (boolean)false, (long)-2735134199967289524L, (long)l2);
                }
                catch (n9 n95) {
                    throw m44.a("k", (Object)((Object)n95), (long)-4483087715680945795L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = m44.a("u", (Object)this, (long)-2377891756630934176L, (long)l2);
            objectArray[0] = l;
            m44.a("t", (Object)m44.a("k", (Object)objectArray, (long)-2862706682366634813L, (long)l2), (long)-4355779936536399292L, (long)l2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x4B70365EAC4FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00feKV\u001f\u0000\u0093[w\u00bb\u00ff\u009c\u00da\u00f8r\u00db\u00bc".getBytes("ISO-8859-1"));
                b = a8.a(byArray3).intern();
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
