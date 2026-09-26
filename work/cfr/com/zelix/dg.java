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
    private static final long a = prr.a(-8132951831683983595L, -5918730886316216090L, MethodHandles.lookup().lookupClass()).a(277959640069446L);
    private static final String b;

    dg(r9 r92) {
        this.x = r92;
    }

    @Override
    public void hyperlinkUpdate(HyperlinkEvent hyperlinkEvent) {
        long l10 = a ^ 0x249AC6D5FF45L;
        if (m44.a("u", (Object)hyperlinkEvent, (long)9030488517920925220L, (long)l10) == m44.a("n", (long)9079096830758879358L, (long)l10)) {
            CallSite callSite = null;
            try {
                callSite = m44.a("u", (Object)hyperlinkEvent, (long)7041853345806137334L, (long)l10);
                m44.a("u", (Object)m44.a("t", (Object)m44.a("t", (Object)this, (long)9131614411205839907L, (long)l10), (long)8690719673162319385L, (long)l10), (Object)callSite, (long)7143398007400432240L, (long)l10);
            }
            catch (Throwable throwable) {
                m44.a("u", (Object)m44.a("t", (Object)m44.a("t", (Object)this, (long)9131614411205839907L, (long)l10), (long)8690719673162319385L, (long)l10), (Object)((String)((Object)m44.a("u", (Object)throwable, (long)8655162497421470416L, (long)l10)) + b + callSite), (long)7186743711507404759L, (long)l10);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x33013D722D29L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("e\u00bd\u0081\u001c4\u00c2\u00f0J".getBytes("ISO-8859-1"));
                b = dg.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
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

