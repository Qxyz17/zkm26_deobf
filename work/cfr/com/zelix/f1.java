/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f1
extends Enum {
    private static final f1[] a;
    public static final f1 Z;
    private final int x;
    public static final f1 p;
    public static final f1 n;
    private static final long b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = prr.a(-2738968222394555957L, -5627068520649490906L, MethodHandles.lookup().lookupClass()).a(214083454273963L);
        long l10 = b ^ 0x47D47FD0F6B8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n10 = 0;
        String string = "\f\u0011\u000f\u00e8x\u00e2\u00b5,w\u00ef\u00db5\u0015\u008f\u00adN\b\u0085\u0092\\-8\u00c1\u00f6\u00f6\u0010\u00b3\u00f6/\u0084?}\n\u00c0\u0087\u00118\u00baA\"eS";
        int n11 = "\f\u0011\u000f\u00e8x\u00e2\u00b5,w\u00ef\u00db5\u0015\u008f\u00adN\b\u0085\u0092\\-8\u00c1\u00f6\u00f6\u0010\u00b3\u00f6/\u0084?}\n\u00c0\u0087\u00118\u00baA\"eS".length();
        int n12 = 16;
        int n13 = -1;
        while (true) {
            int n14 = ++n13;
            byte[] byArray3 = cipher.doFinal(string.substring(n14, n14 + n12).getBytes("ISO-8859-1"));
            stringArray[n10++] = f1.a(byArray3).intern();
            if ((n13 += n12) >= n11) {
                n = new f1(stringArray[2], 0, 1);
                p = new f1(stringArray[0], 1, 0);
                Z = new f1(stringArray[1], 2, -1);
                a = new f1[]{m44.a("i", (long)2216565360525117437L, (long)l10), m44.a("i", (long)2089241069512799210L, (long)l10), m44.a("i", (long)362818857663182795L, (long)l10)};
                return;
            }
            n12 = string.charAt(n13);
        }
    }

    int d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = b ^ l10;
        return (int)m44.a("t", (Object)((Object)this), (long)4284246040922066709L, (long)l10);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f1() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.x = var3_1;
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

