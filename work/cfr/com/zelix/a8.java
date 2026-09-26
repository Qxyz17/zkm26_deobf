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
    private static final long a = prr.a(-7256550385011652184L, 7756424922776171286L, MethodHandles.lookup().lookupClass()).a(109014724119757L);
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
            long l10;
            long l11;
            block10: {
                CallSite callSite;
                CallSite callSite2;
                block8: {
                    l11 = a ^ 0x182F03F5152AL;
                    l10 = l11 ^ 0x1C7B3D32EC08L;
                    callSite2 = m44.a("k", (long)-2566432610332419867L, (long)l11);
                    try {
                        try {
                            callSite = m44.a("t", (Object)propertyChangeEvent, (long)-4345937758325084572L, (long)l11);
                            if (callSite2 != null) break block8;
                            if (!((String)((Object)callSite)).equals(b)) break block9;
                        }
                        catch (n9 n92) {
                            throw m44.a("k", (Object)n92, (long)-4483087715680945795L, (long)l11);
                        }
                        callSite = m44.a("t", (Object)propertyChangeEvent, (long)-4245083347921154432L, (long)l11);
                    }
                    catch (n9 n93) {
                        throw m44.a("k", (Object)n93, (long)-4483087715680945795L, (long)l11);
                    }
                }
                File file = (File)((Object)callSite);
                try {
                    try {
                        if (callSite2 != null) break block10;
                        if (file == null) break block9;
                    }
                    catch (n9 n94) {
                        throw m44.a("k", (Object)n94, (long)-4483087715680945795L, (long)l11);
                    }
                    m44.a("w", (Object)m44.a("u", (Object)this, (long)-2377891756630934176L, (long)l11), (int)1, (long)-4350569386094158029L, (long)l11);
                    Object[] objectArray = new Object[2];
                    objectArray[1] = m44.a("u", (Object)this, (long)-2377891756630934176L, (long)l11);
                    objectArray[0] = l10;
                    m44.a("t", (Object)m44.a("k", (Object)objectArray, (long)-2862706682366634813L, (long)l11), (boolean)false, (long)-2735134199967289524L, (long)l11);
                }
                catch (n9 n95) {
                    throw m44.a("k", (Object)n95, (long)-4483087715680945795L, (long)l11);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = m44.a("u", (Object)this, (long)-2377891756630934176L, (long)l11);
            objectArray[0] = l10;
            m44.a("t", (Object)m44.a("k", (Object)objectArray, (long)-2862706682366634813L, (long)l11), (long)-4355779936536399292L, (long)l11);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x4B70365EAC4FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00feKV\u001f\u0000\u0093[w\u00bb\u00ff\u009c\u00da\u00f8r\u00db\u00bc".getBytes("ISO-8859-1"));
                b = a8.a(byArray3).intern();
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

