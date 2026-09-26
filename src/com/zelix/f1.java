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
        b = prr.a((long)-2738968222394555957L, (long)-5627068520649490906L, MethodHandles.lookup().lookupClass()).a(214083454273963L);
        long l = b ^ 0x47D47FD0F6B8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\f\u0011\u000f\u00e8x\u00e2\u00b5,w\u00ef\u00db5\u0015\u008f\u00adN\b\u0085\u0092\\-8\u00c1\u00f6\u00f6\u0010\u00b3\u00f6/\u0084?}\n\u00c0\u0087\u00118\u00baA\"eS";
        int n2 = "\f\u0011\u000f\u00e8x\u00e2\u00b5,w\u00ef\u00db5\u0015\u008f\u00adN\b\u0085\u0092\\-8\u00c1\u00f6\u00f6\u0010\u00b3\u00f6/\u0084?}\n\u00c0\u0087\u00118\u00baA\"eS".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = f1.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                f1.n = new f1(stringArray[2], 0, 1);
                p = new f1(stringArray[0], 1, 0);
                Z = new f1(stringArray[1], 2, -1);
                a = new f1[]{m44.a("i", (long)2216565360525117437L, (long)l), m44.a("i", (long)2089241069512799210L, (long)l), m44.a("i", (long)362818857663182795L, (long)l)};
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    int d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = b ^ l;
        return (int)m44.a("t", (Object)((Object)this), (long)4284246040922066709L, (long)l);
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
