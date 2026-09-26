/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.mk;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class m6
extends mk {
    private static final String[] e;
    private static final Map g;
    private final String[] v;
    private static final String a;
    private static final String[] f;
    private static final String b;
    private static final String c;
    private static final long d;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/m6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public String W(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = d ^ l10;
        return m6.a("i", (int)16863, (long)(0x60CC531EDB829038L ^ l10));
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = m6.a(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    public String Q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = d ^ l10;
        return m6.a("i", (int)18636, (long)(0x5844BDA0EC568182L ^ l10));
    }

    public String j(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = d ^ l10;
        return m6.a("i", (int)744, (long)(0x7654C3913FED98E0L ^ l10));
    }

    public m6(short s10, long l10) {
        long l11 = ((long)s10 << 48 | l10 << 16 >>> 16) ^ d;
        String[] stringArray = new String[]{m6.a("i", (int)29505, (long)(0x146595E9BCA4CB6DL ^ l11)), m6.a("i", (int)27866, (long)(0x3086F2CB0BFB54F3L ^ l11)), m6.a("i", (int)30012, (long)(0x78F4FDCF8EB04D12L ^ l11)), m6.a("i", (int)18362, (long)(0x6CE6403CBA1C7F98L ^ l11)), m6.a("i", (int)4880, (long)(0x4A103A28DDDAAB31L ^ l11)), m6.a("i", (int)24888, (long)(0x4530EDD2CE32D910L ^ l11)), m6.a("i", (int)10759, (long)(0x27E4BD6286D71220L ^ l11)), m6.a("i", (int)7312, (long)(0xA7524CE8251A4B5L ^ l11)), m6.a("i", (int)21975, (long)(0x1E8EF3F2E455EDFAL ^ l11)), m6.a("i", (int)2927, (long)(0x5384C31AE9E93344L ^ l11))};
        this.v = stringArray;
    }

    public String c(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = d ^ l10;
        return m6.a("i", (int)21047, (long)(0x35AFDF274861148DL ^ l10));
    }

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x40B5;
        if (f[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/m6", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n11].getBytes("ISO-8859-1");
            m6.f[n11] = m6.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n11];
    }

    public String u(Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        return this.v[n10];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                m6.d = prr.a(7154504489339285048L, -492678502331431315L, MethodHandles.lookup().lookupClass()).a(133368234428045L);
                m6.g = new HashMap<K, V>(13);
                var0 = m6.d ^ 107154787455763L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[17];
                var7_4 = 0;
                var6_5 = "\u00cc\u00ffk\u0086t\u00ee'l\u00a8d\u0010\u00f93\u00e7\u00bd@\u00d9\u0002\u00bfl\u00a2\u000e\u0088\u00b2n\u00c8 \u00a1r'\u00c2O\u00dci\u0081X\u0086v\u00d0\u00ad\u0016]M\u00ach\u00eb\u00f6\u00bf\u008d\u00a9\u00a7)\u00fd\u0096N\u00f2\u00c9\u0000\u007f\u009b\u009d\u009d\u0012_\u0080u\u0003\u00cdj\u00f8\u00a1\u00e6C\u0099\u0085\u00b3\u00b7\u0088R\u0003dE\u00a7\u0001s\u00bb\u009ayX\u00ddcqaT\u00c3\u0091\u00b6\u009bW\u0005Ny\u00c9\u00e5I\u00f6|\u00055|\u0011\\\u00cf\u00ea\u0098\u00dc\u0017\u00db^\u00daI\u00dd\u00eef\u009c\u0003\u00bdp\u0088 \u00f49\u00acWF@\u00ad]\u00c4\u00f7\u00e9\u00a6\u00ef0\u00b5:2:uY\u00b1\u00fc\u0091XD\u00ddS\u00bbC\u0086K\u0090\u00b6\u0018\u00cb\u00e7H\u00e9c\n8a\u0010M<\u00b4\u00bb\u0018\u00af\u0091\u00b1\u008b\u00a5\u00a3#\u00f39h\u0099\u008f\u0002\u00a4\u00a3\u001eM\u00a9w\u0010\u00d7\u00ba$kPR\u0016\u009e\u00f5Y\u0081\u00ff\u0084\u0090,Q?\u0086<\u009b\u00d8\u00d1\u00e1O&\u00ae\u00dc2V\u001c\u00f2O\u0087b\u00c0\u00d3\u0015\u00cd\u00f3\u00f3\f\u007f4\u00b2\u00d5\u00e4\u001b\u00fb\u008d\u00e1\u00c6WQ^\u00ce2\u0085G'=\u008b\u00c1,19'\t\u00bfWEE\u0099\u001b\u00d6\u00cc\u00ed;h\u0004\u00b8X\u00b8\u00ac\u00c1\u0017Xh\u00e9u\u00d6\u00f6_\u00e5\u00f6\u00df\u00f97\u001d^\u00f4\u00f0g|\u00a0\u00e4/\u00e1\u00db\u0002\u0011\u0090h0\u0003\u00e9\u0097=c\u00b4hR\u001f\u0018y\u009e\u0097`\u00cf\u00cd\u0010\u00a2\u008ci\u0093,=\u0010\u00cd\u00be\u000f\u000e\u00c4|\u00cc1\u00d6^\u00ebHM\u0001<8\u0086\u00c4V\u00a6\u00e8\u00fa'\u0018w)>s\u00a9\"F\r\u0095\u009ca\u00ce\u0017(-\u00aeb\u00ae\u001a\u00faL\u0082\n\u00aa\u0091\u009b@\u0012\u00b4\u00adJi\u0005,m^\u00a2\u00b6\u00dd\u00ae\u00cb\u0093B2|\u0084\u00c0\u00c1\u00a0o\u008a\u00de\u008a\u00d1X\u00bd}S\u0010+|\u0014\u009b\u0004\u00e7blC`\u00e6Ne\u00d3k^\u00a0*\u0085\u00f3^\u00b2V\u00af\u00d3\u00da!d\u00cd.\u00f3\u001fu[\u0090\u0019\u00f5\u00e3FP[\u00fc\u00920\b\u0086\u00c5\u00d2B\u001e\u00c7\u009a\u0006M\u00b6\u0001\u00e9U\u00f6.,\u0087TP\u00e8pD\u0004\u0098\u001b\u00f5TJ\u001d\u0019\u0089\u00dfM\u009a\u00ccQD+\u00e2\u0018ZC\u0018\u0097\u00b6\u0006\u0003\u00db\u00d7\u0011\f\u00d8e\u00f5\u00e8\u0016l\u0095SwW)\u00feu8/\u0000\u00d3w+1j\u009f\u001dLq\u0097iv\u009e\u0097nW\u0019\u00af\u00b3t\u0084p\u00e9N\u00df\u00ec\u009c\u00ff\u00f7c`h\u00c1\u009e=r\u00d2'\u0010\\ B\u00f9\u00c6\u00d7\u009c\"\u00ef\u001b\u00af\u00f7\u007f\u00e0\u0093 \u008c\u00df\u0015MDj\u0010~|DG1\u00dc\u00f1\u0087\u0095[=.\u00a9J\u00df~X\u00ee|-\u00f8\u00b8\u00eeX1X\u00f3\u0080\u00b1\u00d2\u0013\u0088\u00fd\u00a92a#\u00c2K\u00cc\u0018\u008f\u0084h\u00a9\u0099O\u00ff\u00e6\u0092\u0081\u009d\u0003\u0006\u00c7\u00f9\u00e9/\u0018\u00b5\u0003\u001a\\G^\u0099uvoM\u00a8\u00ac\u0017\t\u0015\u00ce\u00bc/\u008c\u0083\u0019^^\u0012\u00d5ux\u008c\u0098\u00ffQ\u00a2pU\u00a2\u00ad_4\u001cV\u00df\b\u00ab\u00b9\u008f\u0019,$\u008a\u00d7\u00cc\u00bd\u00b3U\u0018bbYK\u00bf\u00bb\u0001\u0084|=\u008bT7\u0099\u00f2\u00af\u0085\u0082\u0010\u00eb\u00ae\u00ed\u00cb\u00d5Pr5\u0011\u00f2\u00fe\u00f6\u00fba\u00b7\u00d1\u00f74,\u0083U\u00c9\u00ea\u0016\u00de\u00fc\u00f6=\u00cbQ(\u0089S&\u00c6\u00c7\u0007,E!\u0092(\u00c7\u00c4\u0014\u0000\u00bcj\u00b0V\u0099\u00e05\u00b0\u00eb{\u00d7-H\u00c6\u00c7\u008f\u00b8\u00efa&\u0006@Q\u00b76\u00a9'\u00bb\u00b0\u00e5\u00cc{\u00c7(\u00e55O\u00cfV\u0012 \u008a\u00c0\u00ce^EC}\u00b4#\n\u00fa\u00f3V#\u008a\u00b9\u00fb\u00eb\u00f5*\u00a7\u0001i\u00f5\u00fao\u0019G\u00cd\u00ab\u00b3\u00f7@\u008d\u00a7*\t\u0004b\u0095\u00dd\u00b6 \u00f94\u00cdxTjT\t\u00db\t\u00a7\u0019\u0083'\u00ca\u009b}\u00c0]\u00cenS\u0004\u0088\u008cd\u009c\u00a0I\u00cb\u00c2Z \u0094n\u00e6\u00ba>.\u00fe/\u00b3\u00a8\u0000B0\u00fa\u0010\u0018\u00df\u00c2\u00abX\u00df";
                var8_6 = "\u00cc\u00ffk\u0086t\u00ee'l\u00a8d\u0010\u00f93\u00e7\u00bd@\u00d9\u0002\u00bfl\u00a2\u000e\u0088\u00b2n\u00c8 \u00a1r'\u00c2O\u00dci\u0081X\u0086v\u00d0\u00ad\u0016]M\u00ach\u00eb\u00f6\u00bf\u008d\u00a9\u00a7)\u00fd\u0096N\u00f2\u00c9\u0000\u007f\u009b\u009d\u009d\u0012_\u0080u\u0003\u00cdj\u00f8\u00a1\u00e6C\u0099\u0085\u00b3\u00b7\u0088R\u0003dE\u00a7\u0001s\u00bb\u009ayX\u00ddcqaT\u00c3\u0091\u00b6\u009bW\u0005Ny\u00c9\u00e5I\u00f6|\u00055|\u0011\\\u00cf\u00ea\u0098\u00dc\u0017\u00db^\u00daI\u00dd\u00eef\u009c\u0003\u00bdp\u0088 \u00f49\u00acWF@\u00ad]\u00c4\u00f7\u00e9\u00a6\u00ef0\u00b5:2:uY\u00b1\u00fc\u0091XD\u00ddS\u00bbC\u0086K\u0090\u00b6\u0018\u00cb\u00e7H\u00e9c\n8a\u0010M<\u00b4\u00bb\u0018\u00af\u0091\u00b1\u008b\u00a5\u00a3#\u00f39h\u0099\u008f\u0002\u00a4\u00a3\u001eM\u00a9w\u0010\u00d7\u00ba$kPR\u0016\u009e\u00f5Y\u0081\u00ff\u0084\u0090,Q?\u0086<\u009b\u00d8\u00d1\u00e1O&\u00ae\u00dc2V\u001c\u00f2O\u0087b\u00c0\u00d3\u0015\u00cd\u00f3\u00f3\f\u007f4\u00b2\u00d5\u00e4\u001b\u00fb\u008d\u00e1\u00c6WQ^\u00ce2\u0085G'=\u008b\u00c1,19'\t\u00bfWEE\u0099\u001b\u00d6\u00cc\u00ed;h\u0004\u00b8X\u00b8\u00ac\u00c1\u0017Xh\u00e9u\u00d6\u00f6_\u00e5\u00f6\u00df\u00f97\u001d^\u00f4\u00f0g|\u00a0\u00e4/\u00e1\u00db\u0002\u0011\u0090h0\u0003\u00e9\u0097=c\u00b4hR\u001f\u0018y\u009e\u0097`\u00cf\u00cd\u0010\u00a2\u008ci\u0093,=\u0010\u00cd\u00be\u000f\u000e\u00c4|\u00cc1\u00d6^\u00ebHM\u0001<8\u0086\u00c4V\u00a6\u00e8\u00fa'\u0018w)>s\u00a9\"F\r\u0095\u009ca\u00ce\u0017(-\u00aeb\u00ae\u001a\u00faL\u0082\n\u00aa\u0091\u009b@\u0012\u00b4\u00adJi\u0005,m^\u00a2\u00b6\u00dd\u00ae\u00cb\u0093B2|\u0084\u00c0\u00c1\u00a0o\u008a\u00de\u008a\u00d1X\u00bd}S\u0010+|\u0014\u009b\u0004\u00e7blC`\u00e6Ne\u00d3k^\u00a0*\u0085\u00f3^\u00b2V\u00af\u00d3\u00da!d\u00cd.\u00f3\u001fu[\u0090\u0019\u00f5\u00e3FP[\u00fc\u00920\b\u0086\u00c5\u00d2B\u001e\u00c7\u009a\u0006M\u00b6\u0001\u00e9U\u00f6.,\u0087TP\u00e8pD\u0004\u0098\u001b\u00f5TJ\u001d\u0019\u0089\u00dfM\u009a\u00ccQD+\u00e2\u0018ZC\u0018\u0097\u00b6\u0006\u0003\u00db\u00d7\u0011\f\u00d8e\u00f5\u00e8\u0016l\u0095SwW)\u00feu8/\u0000\u00d3w+1j\u009f\u001dLq\u0097iv\u009e\u0097nW\u0019\u00af\u00b3t\u0084p\u00e9N\u00df\u00ec\u009c\u00ff\u00f7c`h\u00c1\u009e=r\u00d2'\u0010\\ B\u00f9\u00c6\u00d7\u009c\"\u00ef\u001b\u00af\u00f7\u007f\u00e0\u0093 \u008c\u00df\u0015MDj\u0010~|DG1\u00dc\u00f1\u0087\u0095[=.\u00a9J\u00df~X\u00ee|-\u00f8\u00b8\u00eeX1X\u00f3\u0080\u00b1\u00d2\u0013\u0088\u00fd\u00a92a#\u00c2K\u00cc\u0018\u008f\u0084h\u00a9\u0099O\u00ff\u00e6\u0092\u0081\u009d\u0003\u0006\u00c7\u00f9\u00e9/\u0018\u00b5\u0003\u001a\\G^\u0099uvoM\u00a8\u00ac\u0017\t\u0015\u00ce\u00bc/\u008c\u0083\u0019^^\u0012\u00d5ux\u008c\u0098\u00ffQ\u00a2pU\u00a2\u00ad_4\u001cV\u00df\b\u00ab\u00b9\u008f\u0019,$\u008a\u00d7\u00cc\u00bd\u00b3U\u0018bbYK\u00bf\u00bb\u0001\u0084|=\u008bT7\u0099\u00f2\u00af\u0085\u0082\u0010\u00eb\u00ae\u00ed\u00cb\u00d5Pr5\u0011\u00f2\u00fe\u00f6\u00fba\u00b7\u00d1\u00f74,\u0083U\u00c9\u00ea\u0016\u00de\u00fc\u00f6=\u00cbQ(\u0089S&\u00c6\u00c7\u0007,E!\u0092(\u00c7\u00c4\u0014\u0000\u00bcj\u00b0V\u0099\u00e05\u00b0\u00eb{\u00d7-H\u00c6\u00c7\u008f\u00b8\u00efa&\u0006@Q\u00b76\u00a9'\u00bb\u00b0\u00e5\u00cc{\u00c7(\u00e55O\u00cfV\u0012 \u008a\u00c0\u00ce^EC}\u00b4#\n\u00fa\u00f3V#\u008a\u00b9\u00fb\u00eb\u00f5*\u00a7\u0001i\u00f5\u00fao\u0019G\u00cd\u00ab\u00b3\u00f7@\u008d\u00a7*\t\u0004b\u0095\u00dd\u00b6 \u00f94\u00cdxTjT\t\u00db\t\u00a7\u0019\u0083'\u00ca\u009b}\u00c0]\u00cenS\u0004\u0088\u008cd\u009c\u00a0I\u00cb\u00c2Z \u0094n\u00e6\u00ba>.\u00fe/\u00b3\u00a8\u0000B0\u00fa\u0010\u0018\u00df\u00c2\u00abX\u00df".length();
                var5_7 = 88;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = m6.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0090\u00ffX\u0083\u00ae<\u00be\u00dd\u00cc\u008f{\u00d5\u00dejL\u00fd\u00d3+^\u00f04Dns\u0016\u00f3\"\u008a!\u0093\u00a7\u00c8s\u00d9j\u00ef;hlp\u0094\u00c8\t\u00a5\u00f6`\u0092^\u008d{\f'h\u00c1*\u0090\u00d1J\u00f4\u00f8w[=\u009f\u009ev\u00ffUo*(\u00d6\u008bi\u00ef\\\u0001\u00bbT'\u0014W\u00bc;\u0019\u00c8\u008c\u0013 \u00d9F\u0002A\u00aa\u009a\u000buEw\u008d\f\u00f4\u0091C\u00fb\u00a6\u008d\u0019~z\u009a\u00e2^J\u00f4\u0019\u00bc\\\u0093\u00a2=";
                    var8_6 = "\u0090\u00ffX\u0083\u00ae<\u00be\u00dd\u00cc\u008f{\u00d5\u00dejL\u00fd\u00d3+^\u00f04Dns\u0016\u00f3\"\u008a!\u0093\u00a7\u00c8s\u00d9j\u00ef;hlp\u0094\u00c8\t\u00a5\u00f6`\u0092^\u008d{\f'h\u00c1*\u0090\u00d1J\u00f4\u00f8w[=\u009f\u009ev\u00ffUo*(\u00d6\u008bi\u00ef\\\u0001\u00bbT'\u0014W\u00bc;\u0019\u00c8\u008c\u0013 \u00d9F\u0002A\u00aa\u009a\u000buEw\u008d\f\u00f4\u0091C\u00fb\u00a6\u008d\u0019~z\u009a\u00e2^J\u00f4\u0019\u00bc\\\u0093\u00a2=".length();
                    var5_7 = 88;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = m6.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        m6.e = var9_3;
        m6.f = new String[17];
        m6.b = m6.a("i", (int)5069, (long)(8039440264433089665L ^ var0));
        m6.c = m6.a("i", (int)31694, (long)(3700561038695093392L ^ var0));
        m6.a = m6.a("i", (int)13739, (long)(7063003554978208496L ^ var0));
    }

    private static String b(byte[] byArray) {
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

    public String a(Object[] objectArray) {
        Object object = objectArray[0];
        return this.v[(Integer)object].trim();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

