/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.prr;
import com.zelix.r9;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class dg
implements HyperlinkListener {
    final r9 x;
    private static final long a = prr.a((long)-8132951831683983595L, (long)-5918730886316216090L, MethodHandles.lookup().lookupClass()).a(277959640069446L);
    private static final String b;

    dg(r9 r92) {
        this.x = r92;
    }

    @Override
    public void hyperlinkUpdate(HyperlinkEvent hyperlinkEvent) {
        long l = a ^ 0x249AC6D5FF45L;
        if (m44.a("u", (Object)hyperlinkEvent, (long)9030488517920925220L, (long)l) == m44.a("n", (long)9079096830758879358L, (long)l)) {
            CallSite callSite = null;
            try {
                callSite = m44.a("u", (Object)hyperlinkEvent, (long)7041853345806137334L, (long)l);
                m44.a("u", (Object)m44.a("t", (Object)m44.a("t", (Object)this, (long)9131614411205839907L, (long)l), (long)8690719673162319385L, (long)l), (Object)callSite, (long)7143398007400432240L, (long)l);
            }
            catch (Throwable throwable) {
                m44.a("u", (Object)m44.a("t", (Object)m44.a("t", (Object)this, (long)9131614411205839907L, (long)l), (long)8690719673162319385L, (long)l), (Object)((String)((Object)m44.a("u", (Object)throwable, (long)8655162497421470416L, (long)l)) + b + callSite), (long)7186743711507404759L, (long)l);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x33013D722D29L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("e\u00bd\u0081\u001c4\u00c2\u00f0J".getBytes("ISO-8859-1"));
                b = dg.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
