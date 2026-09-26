/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface lkd {
    public static final String[] V;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = prr.a(6088259006274959946L, -7897672908970844396L, MethodHandles.lookup().lookupClass()).a(169132344875751L) ^ 126275027508992L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[78];
                var6_4 = 0;
                var5_5 = "\u0086\u001d\u00fc\\\u00d2\u008br\u00a4\u00a5\u0013\u00dc\u00e1c\u00c2\u00ca\u00cb 2n\u00d2\u00d2-\u00a5P\u00f4\u00b2\u00c3\u0000\u00ef\u00c4 P\u00c8\u0015xB\u0011d\u00b6z\u00c1\u0014\u00aa\u00be\u000b\u00b4\u00ac\u00a3e\b\u00b4\u00976\u00d5\u008d\u009a.\u00a3\beu\u001f\u00f4\u00f4\u00deK\u00c8\b\t~\u00f0\u000bn]4\u00e7\b\u00e8i\u00d6\u00a39i\u00cf2\b\u00e9x-\u0092\u00b8\u00ce\u00a7Z\u0010\u00a0\u000fm]\u001c\u00ceuG\u00a4nk=\fv\u00d5\u00fe\u0010\u0085\u00af@\u0006\u009f\u00f2\u00f4q\u00e3\u00fa\u0090+t\u00c2\u009c\u0019\bHp*\u00f8\u00d3\u00da\u00f7\u00ca\u0010\u0088\u00f7\u0082\u00b1\u008ak@:1fD4\u00c3\u008e\u00bcd\b\u00d7bNY\u0089hC\u0088\b\u00ca\u00e9Rm\u0090\u00cd\u00c8.\u0010;'Z\u00ba\u00d9\u00893O\u00d4\u0098\u00c3\u0000\u008e\u001d\u00f0\u00e8\u0010\u00b7LY\u00b78v\u0096N\u0004&\u000fW\u001a\u00be\u0091C\u0010g\u00a8\u00bcY\u0005?\u0005}\u0089\u008f\u001b\u0092\u0099 \u0082\u00b7\u0018\u00b0\u00f5#A\u00d2|\u00b0\u009c\u00e8M\u0006U\u0087?\u00fd\u0080!\u00b8\\*\u008a\u00f8\rE\u0018\u00db\f'z\u00980\u00a9:i\u00adw\\\u00a0\u0000lh\u00ed'\u00b7\u008d\u00c4\u00c7]r\u0010\u00b1\u001a.\u00e0\u00cc\u00c9C7#\u00e1nj\u00d4\u001d\u0081\u00a1\bS\u0018\u00feKOpX\u0095\b\u009f\u0095x\t\u00f8A\u0080.\b,`\u0018#\u00c4\u00c6^\u00c6\u0018\u00be^\u00ea\u00e5\u00f0\u00b9\u00cc\u00f1\u00f4\u008bB\u0080\u000e\b\u00c4\rO\u0016\u00ef\u00caa&K\u00a0\u0010\u00eb79n\u00c6Iw\u00e3B\u00edDh\u0011@g\u00e3\b\u0085\u00edt|\u007f\u00b0}\u0002\u0010\u00c3\u007f\u001c\u0012s\u00be\u0099\u0097Y\u00aa\u00f1\u0087\u00a9\u00e9\u0089\u0093\bS\u0018\u00feKOpX\u0095\u0010\u0093Q;\u0013Kr\u00f7L\u0090\u001f\u0007\u00f6^\u008d~\u00bb\b4\u0016\u008a\u00edVPo\u0087\b\u0014t\u0097|.\u0095\u00db_\u0018\u00fd\u00f70\u0089\u008b\u0011\u00dc\u0012\u00fbe\u00a9\u009e\u0011O\u0007\u00d2\u0092gd,\u00aa\\\u00d3[\bx\u001c\u00b5\u00fbP\u00da\f\u0093\u0010\u00b9BAFv\u00ae\u0006\u00cf\u00b9M\u00da\u00a0\u00cf\u00b9\u00bc\u00cf\b-L\u00a9Iy\u00a7K$\b6\u00e7}^\u00de\u0014as\b\u008cI\u0016#G\u00c0\u0095\u0083\u0010\u0017\u00dd*>\u00b1\u00f8\u00a0s\u00b6;3|\u00a3\u0091\u00ad+\b\u00ef\u0010\u0002Qj\u009f\u0085\u0096\bHK\u0007n\u00bd\u0002\u00c6b\b\u008d\u0001\u00ae[\u0087\u00d5\u00b5\u00f0\u0018}\u0089[-PX<\u00b9\u0093\u0010\u00e9\u00d2\u00d8\u00a1\u00b7\u00f9\u007f\u00fcgYV\u00e7m]\u0018\u0088/\u00d2\u000e{\u00c8\u00afj\u00b4MI'{\u00a2e\u00ack\u00a2\u00ab\u007f\u0005\u0015\u00a1\u00d1\u0018\u0088/\u00d2\u000e{\u00c8\u00afj\u00b4MI'{\u00a2e\u00ac\u009c\u0084\u00b8\u00a1bS\u0093,\u0018r\u001d\u00f3\u001f\u008a\u00edd\u00ee e\u0095EI\u00d3\u00a7\u00b8\u00c7\u00e9\u008dt\u0085\u00cc\u00d8)\b6\u00c3\u00da\u0090\u00ae\u00cf1\u00dd\u00105\u00abRcv\u00b6\u00c5\r\u001eFL\u0089#\u00e80M\b4\u0016\u008a\u00edVPo\u0087\u0010\u008a\u00b57,T2E\u00e3\u00ffi\u00e1e\u0088\u0094\u00da\u00ab\u0010ji\u00cd\u00e6\u00a7l\u0005\u00c5\u0095|\u00bb\r\u0015\u00ae=\u0088\u0018t\u0001\u00b0\u0087J\u0006\u007f\u0088X\u00cb\u00c8\u00c9\u0097l\u00ef\u00f3\u00d5\u00b8\u0099\u00cb\u00c6[&G\b\u0004\u00a1\u00d2\u0080\u008a\u00bb|\u00c9\u0018\u0083\u00b2i%s>\u00c2\u00feV\u0003 +\u0091fE\u0018\u00bd\u00e4^\u00a2K\u00ff\u00c4\u00af\bNr\u00f3\u0014I\u00baAZ\b\u0010\u00d6N\u0000m\u0017\u00f0\u00da\u0010>A\u0013\u0088\u00cb7c4'#K\u00a89\u00adj\u0016\u0010\u0016\u0015w\u00a6rV\u008e\u00fc\u000b\u00e6N\u00baB\u00a5\u00a9\u00af \u00d7\b`\u00d7\u00ec\u00f7\u00fe]G\u00b4\u009dK\u0098\u00f9r\u00cb\u00dbHT~\u0016!>\u00ecM\u00a2\u00a4\u0089\u00cd\u00f2F\u0000\u0010\u00d5o\u00c9[f@<\u0082\u00ce\u0018\u00d2\u00c0c\u00d5\u00ac\u00e0\u0010^nmKZZ\u00c3\t\u00dc\r\u00a0\u000be\u00b3\u00ce\u0098\u0010\u00e55AE&q\u00a9\u0088\u00bffK+\u0099Q=3\u0010lr' \u0082\u009bpD\u0098r\u00df\u00f0|\n\u00cc\u00e9\b8Z\u00cb\u00ef\u00a0\u00b2\u00e5@\u0010j'\u0081\u0018l~\\uoy\u00c4\u00bf\u00d3u6\u00d7\u0010\u00a9\u00d6Z>\u00c6bU\u007f\u00eaq\u00d7\u009e\u00c5\u00fbc\u0011\b\u00e7o\u009a\u00a8\u0010\u00d4\u00c6\u00dd\u0010\u00fb\u0090gG\u00ddM\u009e\u00fc\"\u00dd\u0017\u00c6\u0085\u00bc\u000b\u00c4\u0010\u00eb\u001b\u0081\u00af\u0080{j\u00e9\u00b5\u0004\u001f\u00adoT\u00cb_\u0010B\u00961\u0004tjC\u00f2h\u00b2\u00db\u001a]\u009d}Z\bpZ\u00de\u009fx\u001b\u0096\u00e4\u0010O\u00fd\u00ea9\u0003\u00bb\u0095B\u00e3p\u00c1\u001di\u00bd\u00cfX\u0018\u0088/\u00d2\u000e{\u00c8\u00afj4\u0080\u00ef\u0090zD<\u0093\u0084\u0003\u009d\u00f5\u00a7\u00ee\u00bfg\b\u001aG\u0000\u00af\u0088\u00ff3\u00fb\b\u00cc \u0083\u00ccN\u00fa\u0013\u00a8\u0010\u00fe\u00de\u00af\u00ad\u00fe\u001b*+&\u009b\u00e8\"s\u00a0\u00da\f\u0010\u00b9\u0003\t$l\u009e\u00a5\u0090\u00f0F\u00e6\u00e7\u000b\u00b3e8\u0010\u00c8\u00a1\u0081E\u00a7\u00da\u00a0>Q\u00b1aH\u0094\u0017\u00025";
                var7_6 = "\u0086\u001d\u00fc\\\u00d2\u008br\u00a4\u00a5\u0013\u00dc\u00e1c\u00c2\u00ca\u00cb 2n\u00d2\u00d2-\u00a5P\u00f4\u00b2\u00c3\u0000\u00ef\u00c4 P\u00c8\u0015xB\u0011d\u00b6z\u00c1\u0014\u00aa\u00be\u000b\u00b4\u00ac\u00a3e\b\u00b4\u00976\u00d5\u008d\u009a.\u00a3\beu\u001f\u00f4\u00f4\u00deK\u00c8\b\t~\u00f0\u000bn]4\u00e7\b\u00e8i\u00d6\u00a39i\u00cf2\b\u00e9x-\u0092\u00b8\u00ce\u00a7Z\u0010\u00a0\u000fm]\u001c\u00ceuG\u00a4nk=\fv\u00d5\u00fe\u0010\u0085\u00af@\u0006\u009f\u00f2\u00f4q\u00e3\u00fa\u0090+t\u00c2\u009c\u0019\bHp*\u00f8\u00d3\u00da\u00f7\u00ca\u0010\u0088\u00f7\u0082\u00b1\u008ak@:1fD4\u00c3\u008e\u00bcd\b\u00d7bNY\u0089hC\u0088\b\u00ca\u00e9Rm\u0090\u00cd\u00c8.\u0010;'Z\u00ba\u00d9\u00893O\u00d4\u0098\u00c3\u0000\u008e\u001d\u00f0\u00e8\u0010\u00b7LY\u00b78v\u0096N\u0004&\u000fW\u001a\u00be\u0091C\u0010g\u00a8\u00bcY\u0005?\u0005}\u0089\u008f\u001b\u0092\u0099 \u0082\u00b7\u0018\u00b0\u00f5#A\u00d2|\u00b0\u009c\u00e8M\u0006U\u0087?\u00fd\u0080!\u00b8\\*\u008a\u00f8\rE\u0018\u00db\f'z\u00980\u00a9:i\u00adw\\\u00a0\u0000lh\u00ed'\u00b7\u008d\u00c4\u00c7]r\u0010\u00b1\u001a.\u00e0\u00cc\u00c9C7#\u00e1nj\u00d4\u001d\u0081\u00a1\bS\u0018\u00feKOpX\u0095\b\u009f\u0095x\t\u00f8A\u0080.\b,`\u0018#\u00c4\u00c6^\u00c6\u0018\u00be^\u00ea\u00e5\u00f0\u00b9\u00cc\u00f1\u00f4\u008bB\u0080\u000e\b\u00c4\rO\u0016\u00ef\u00caa&K\u00a0\u0010\u00eb79n\u00c6Iw\u00e3B\u00edDh\u0011@g\u00e3\b\u0085\u00edt|\u007f\u00b0}\u0002\u0010\u00c3\u007f\u001c\u0012s\u00be\u0099\u0097Y\u00aa\u00f1\u0087\u00a9\u00e9\u0089\u0093\bS\u0018\u00feKOpX\u0095\u0010\u0093Q;\u0013Kr\u00f7L\u0090\u001f\u0007\u00f6^\u008d~\u00bb\b4\u0016\u008a\u00edVPo\u0087\b\u0014t\u0097|.\u0095\u00db_\u0018\u00fd\u00f70\u0089\u008b\u0011\u00dc\u0012\u00fbe\u00a9\u009e\u0011O\u0007\u00d2\u0092gd,\u00aa\\\u00d3[\bx\u001c\u00b5\u00fbP\u00da\f\u0093\u0010\u00b9BAFv\u00ae\u0006\u00cf\u00b9M\u00da\u00a0\u00cf\u00b9\u00bc\u00cf\b-L\u00a9Iy\u00a7K$\b6\u00e7}^\u00de\u0014as\b\u008cI\u0016#G\u00c0\u0095\u0083\u0010\u0017\u00dd*>\u00b1\u00f8\u00a0s\u00b6;3|\u00a3\u0091\u00ad+\b\u00ef\u0010\u0002Qj\u009f\u0085\u0096\bHK\u0007n\u00bd\u0002\u00c6b\b\u008d\u0001\u00ae[\u0087\u00d5\u00b5\u00f0\u0018}\u0089[-PX<\u00b9\u0093\u0010\u00e9\u00d2\u00d8\u00a1\u00b7\u00f9\u007f\u00fcgYV\u00e7m]\u0018\u0088/\u00d2\u000e{\u00c8\u00afj\u00b4MI'{\u00a2e\u00ack\u00a2\u00ab\u007f\u0005\u0015\u00a1\u00d1\u0018\u0088/\u00d2\u000e{\u00c8\u00afj\u00b4MI'{\u00a2e\u00ac\u009c\u0084\u00b8\u00a1bS\u0093,\u0018r\u001d\u00f3\u001f\u008a\u00edd\u00ee e\u0095EI\u00d3\u00a7\u00b8\u00c7\u00e9\u008dt\u0085\u00cc\u00d8)\b6\u00c3\u00da\u0090\u00ae\u00cf1\u00dd\u00105\u00abRcv\u00b6\u00c5\r\u001eFL\u0089#\u00e80M\b4\u0016\u008a\u00edVPo\u0087\u0010\u008a\u00b57,T2E\u00e3\u00ffi\u00e1e\u0088\u0094\u00da\u00ab\u0010ji\u00cd\u00e6\u00a7l\u0005\u00c5\u0095|\u00bb\r\u0015\u00ae=\u0088\u0018t\u0001\u00b0\u0087J\u0006\u007f\u0088X\u00cb\u00c8\u00c9\u0097l\u00ef\u00f3\u00d5\u00b8\u0099\u00cb\u00c6[&G\b\u0004\u00a1\u00d2\u0080\u008a\u00bb|\u00c9\u0018\u0083\u00b2i%s>\u00c2\u00feV\u0003 +\u0091fE\u0018\u00bd\u00e4^\u00a2K\u00ff\u00c4\u00af\bNr\u00f3\u0014I\u00baAZ\b\u0010\u00d6N\u0000m\u0017\u00f0\u00da\u0010>A\u0013\u0088\u00cb7c4'#K\u00a89\u00adj\u0016\u0010\u0016\u0015w\u00a6rV\u008e\u00fc\u000b\u00e6N\u00baB\u00a5\u00a9\u00af \u00d7\b`\u00d7\u00ec\u00f7\u00fe]G\u00b4\u009dK\u0098\u00f9r\u00cb\u00dbHT~\u0016!>\u00ecM\u00a2\u00a4\u0089\u00cd\u00f2F\u0000\u0010\u00d5o\u00c9[f@<\u0082\u00ce\u0018\u00d2\u00c0c\u00d5\u00ac\u00e0\u0010^nmKZZ\u00c3\t\u00dc\r\u00a0\u000be\u00b3\u00ce\u0098\u0010\u00e55AE&q\u00a9\u0088\u00bffK+\u0099Q=3\u0010lr' \u0082\u009bpD\u0098r\u00df\u00f0|\n\u00cc\u00e9\b8Z\u00cb\u00ef\u00a0\u00b2\u00e5@\u0010j'\u0081\u0018l~\\uoy\u00c4\u00bf\u00d3u6\u00d7\u0010\u00a9\u00d6Z>\u00c6bU\u007f\u00eaq\u00d7\u009e\u00c5\u00fbc\u0011\b\u00e7o\u009a\u00a8\u0010\u00d4\u00c6\u00dd\u0010\u00fb\u0090gG\u00ddM\u009e\u00fc\"\u00dd\u0017\u00c6\u0085\u00bc\u000b\u00c4\u0010\u00eb\u001b\u0081\u00af\u0080{j\u00e9\u00b5\u0004\u001f\u00adoT\u00cb_\u0010B\u00961\u0004tjC\u00f2h\u00b2\u00db\u001a]\u009d}Z\bpZ\u00de\u009fx\u001b\u0096\u00e4\u0010O\u00fd\u00ea9\u0003\u00bb\u0095B\u00e3p\u00c1\u001di\u00bd\u00cfX\u0018\u0088/\u00d2\u000e{\u00c8\u00afj4\u0080\u00ef\u0090zD<\u0093\u0084\u0003\u009d\u00f5\u00a7\u00ee\u00bfg\b\u001aG\u0000\u00af\u0088\u00ff3\u00fb\b\u00cc \u0083\u00ccN\u00fa\u0013\u00a8\u0010\u00fe\u00de\u00af\u00ad\u00fe\u001b*+&\u009b\u00e8\"s\u00a0\u00da\f\u0010\u00b9\u0003\t$l\u009e\u00a5\u0090\u00f0F\u00e6\u00e7\u000b\u00b3e8\u0010\u00c8\u00a1\u0081E\u00a7\u00da\u00a0>Q\u00b1aH\u0094\u0017\u00025".length();
                var4_7 = 16;
                var3_8 = -1;
lbl18:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = lkd.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00fd\u00f70\u0089\u008b\u0011\u00dc\u0012\u00fbe\u00a9\u009e\u0011O\u0007\u00d2\u0093\u00c3\u00ad\u00ee\u00ccc\u009b\u0095\b6\u00fd\u00b7\u00a3^j\u00fd\u00a6";
                    var7_6 = "\u00fd\u00f70\u0089\u008b\u0011\u00dc\u0012\u00fbe\u00a9\u009e\u0011O\u0007\u00d2\u0093\u00c3\u00ad\u00ee\u00ccc\u009b\u0095\b6\u00fd\u00b7\u00a3^j\u00fd\u00a6".length();
                    var4_7 = 24;
                    var3_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = lkd.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl49:
                // 1 sources

                ** continue;
            }
        }
        lkd.V = new String[]{var0_3[9], var0_3[39], var0_3[5], var0_3[31], var0_3[6], var0_3[20], var0_3[4], var0_3[42], var0_3[35], var0_3[17], var0_3[19], var0_3[26], var0_3[70], var0_3[45], var0_3[24], var0_3[21], var0_3[29], var0_3[3], var0_3[33], var0_3[37], var0_3[2], var0_3[38], var0_3[11], var0_3[50], var0_3[68], var0_3[71], var0_3[64], var0_3[34], var0_3[77], var0_3[72], var0_3[12], var0_3[53], var0_3[61], var0_3[44], var0_3[32], var0_3[10], var0_3[57], var0_3[13], var0_3[14], var0_3[65], var0_3[66], var0_3[63], var0_3[62], var0_3[67], var0_3[25], var0_3[73], var0_3[47], var0_3[8], var0_3[15], var0_3[58], var0_3[27], var0_3[48], var0_3[54], var0_3[23], var0_3[59], var0_3[7], var0_3[74], var0_3[69], var0_3[36], var0_3[55], var0_3[75], var0_3[18], var0_3[60], var0_3[0], var0_3[16], var0_3[22], var0_3[51], var0_3[30], var0_3[76], var0_3[40], var0_3[56], var0_3[1], var0_3[28], var0_3[46], var0_3[41], var0_3[49], var0_3[43], var0_3[52]};
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

