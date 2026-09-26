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

public abstract class mk {
    public static final String r;

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        long l10;
        block118: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block117: {
                char[] cArray3;
                block116: {
                    int n13;
                    char[] cArray4;
                    int n14;
                    int n15;
                    block115: {
                        char[] cArray5;
                        block114: {
                            int n16;
                            char[] cArray6;
                            int n17;
                            int n18;
                            block113: {
                                char[] cArray7;
                                block112: {
                                    int n19;
                                    char[] cArray8;
                                    int n20;
                                    int n21;
                                    block111: {
                                        char[] cArray9;
                                        block110: {
                                            int n22;
                                            char[] cArray10;
                                            int n23;
                                            int n24;
                                            block109: {
                                                char[] cArray11;
                                                block108: {
                                                    int n25;
                                                    char[] cArray12;
                                                    int n26;
                                                    int n27;
                                                    block107: {
                                                        char[] cArray13;
                                                        block106: {
                                                            int n28;
                                                            char[] cArray14;
                                                            int n29;
                                                            int n30;
                                                            block105: {
                                                                char[] cArray15;
                                                                block104: {
                                                                    int n31;
                                                                    char[] cArray16;
                                                                    int n32;
                                                                    int n33;
                                                                    block103: {
                                                                        char[] cArray17;
                                                                        block102: {
                                                                            int n34;
                                                                            char[] cArray18;
                                                                            int n35;
                                                                            int n36;
                                                                            block101: {
                                                                                l10 = prr.a(-3297759523641945205L, -7569054724720219045L, MethodHandles.lookup().lookupClass()).a(253114468636168L) ^ 0xC535665E5AAL;
                                                                                char[] cArray19 = "\u0015\u00a5\u00f43\u00f2\u00a9\u0098\u0006\u008d\u00d3Z\u0000)|R\u00e3".toCharArray();
                                                                                int n37 = cArray19.length;
                                                                                n36 = 0;
                                                                                n35 = 22;
                                                                                cArray18 = cArray19;
                                                                                n34 = n37;
                                                                                if (n37 <= 1) break block101;
                                                                                cArray17 = cArray18;
                                                                                n34 = n34;
                                                                                if (n34 <= n36) break block102;
                                                                            }
                                                                            do {
                                                                                int n38 = n35;
                                                                                cArray18 = cArray18;
                                                                                char[] cArray20 = cArray18;
                                                                                int n39 = n35;
                                                                                int n40 = n36;
                                                                                while (true) {
                                                                                    int n41;
                                                                                    switch (n36 % 7) {
                                                                                        case 0: {
                                                                                            n41 = 58;
                                                                                            break;
                                                                                        }
                                                                                        case 1: {
                                                                                            n41 = 110;
                                                                                            break;
                                                                                        }
                                                                                        case 2: {
                                                                                            n41 = 59;
                                                                                            break;
                                                                                        }
                                                                                        case 3: {
                                                                                            n41 = 15;
                                                                                            break;
                                                                                        }
                                                                                        case 4: {
                                                                                            n41 = 103;
                                                                                            break;
                                                                                        }
                                                                                        case 5: {
                                                                                            n41 = 43;
                                                                                            break;
                                                                                        }
                                                                                        default: {
                                                                                            n41 = 93;
                                                                                        }
                                                                                    }
                                                                                    cArray20[n40] = (char)(cArray20[n40] ^ (n39 ^ n41));
                                                                                    ++n36;
                                                                                    n35 = n38;
                                                                                    if (n38 != 0) break;
                                                                                    n38 = n35;
                                                                                    cArray18 = cArray18;
                                                                                    n40 = n35;
                                                                                    cArray20 = cArray18;
                                                                                    n39 = n35;
                                                                                }
                                                                                cArray17 = cArray18;
                                                                                n34 = n34;
                                                                            } while (n34 > n36);
                                                                        }
                                                                        String string = new String(cArray17).intern();
                                                                        char[] cArray21 = string.toCharArray();
                                                                        int n42 = cArray21.length;
                                                                        n33 = 0;
                                                                        n32 = 10;
                                                                        cArray16 = cArray21;
                                                                        n31 = n42;
                                                                        if (n42 <= 1) break block103;
                                                                        cArray15 = cArray16;
                                                                        n31 = n31;
                                                                        if (n31 <= n33) break block104;
                                                                    }
                                                                    do {
                                                                        int n43 = n32;
                                                                        cArray16 = cArray16;
                                                                        char[] cArray22 = cArray16;
                                                                        int n44 = n32;
                                                                        int n45 = n33;
                                                                        while (true) {
                                                                            int n46;
                                                                            switch (n33 % 7) {
                                                                                case 0: {
                                                                                    n46 = 84;
                                                                                    break;
                                                                                }
                                                                                case 1: {
                                                                                    n46 = 40;
                                                                                    break;
                                                                                }
                                                                                case 2: {
                                                                                    n46 = 101;
                                                                                    break;
                                                                                }
                                                                                case 3: {
                                                                                    n46 = 50;
                                                                                    break;
                                                                                }
                                                                                case 4: {
                                                                                    n46 = 38;
                                                                                    break;
                                                                                }
                                                                                case 5: {
                                                                                    n46 = 127;
                                                                                    break;
                                                                                }
                                                                                default: {
                                                                                    n46 = 113;
                                                                                }
                                                                            }
                                                                            cArray22[n45] = (char)(cArray22[n45] ^ (n44 ^ n46));
                                                                            ++n33;
                                                                            n32 = n43;
                                                                            if (n43 != 0) break;
                                                                            n43 = n32;
                                                                            cArray16 = cArray16;
                                                                            n45 = n32;
                                                                            cArray22 = cArray16;
                                                                            n44 = n32;
                                                                        }
                                                                        cArray15 = cArray16;
                                                                        n31 = n31;
                                                                    } while (n31 > n33);
                                                                }
                                                                String string = new String(cArray15).intern();
                                                                char[] cArray23 = string.toCharArray();
                                                                int n47 = cArray23.length;
                                                                n30 = 0;
                                                                n29 = 105;
                                                                cArray14 = cArray23;
                                                                n28 = n47;
                                                                if (n47 <= 1) break block105;
                                                                cArray13 = cArray14;
                                                                n28 = n28;
                                                                if (n28 <= n30) break block106;
                                                            }
                                                            do {
                                                                int n48 = n29;
                                                                cArray14 = cArray14;
                                                                char[] cArray24 = cArray14;
                                                                int n49 = n29;
                                                                int n50 = n30;
                                                                while (true) {
                                                                    int n51;
                                                                    switch (n30 % 7) {
                                                                        case 0: {
                                                                            n51 = 93;
                                                                            break;
                                                                        }
                                                                        case 1: {
                                                                            n51 = 101;
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            n51 = 47;
                                                                            break;
                                                                        }
                                                                        case 3: {
                                                                            n51 = 123;
                                                                            break;
                                                                        }
                                                                        case 4: {
                                                                            n51 = 64;
                                                                            break;
                                                                        }
                                                                        case 5: {
                                                                            n51 = 54;
                                                                            break;
                                                                        }
                                                                        default: {
                                                                            n51 = 107;
                                                                        }
                                                                    }
                                                                    cArray24[n50] = (char)(cArray24[n50] ^ (n49 ^ n51));
                                                                    ++n30;
                                                                    n29 = n48;
                                                                    if (n48 != 0) break;
                                                                    n48 = n29;
                                                                    cArray14 = cArray14;
                                                                    n50 = n29;
                                                                    cArray24 = cArray14;
                                                                    n49 = n29;
                                                                }
                                                                cArray13 = cArray14;
                                                                n28 = n28;
                                                            } while (n28 > n30);
                                                        }
                                                        String string = new String(cArray13).intern();
                                                        char[] cArray25 = string.toCharArray();
                                                        int n52 = cArray25.length;
                                                        n27 = 0;
                                                        n26 = 17;
                                                        cArray12 = cArray25;
                                                        n25 = n52;
                                                        if (n52 <= 1) break block107;
                                                        cArray11 = cArray12;
                                                        n25 = n25;
                                                        if (n25 <= n27) break block108;
                                                    }
                                                    do {
                                                        int n53 = n26;
                                                        cArray12 = cArray12;
                                                        char[] cArray26 = cArray12;
                                                        int n54 = n26;
                                                        int n55 = n27;
                                                        while (true) {
                                                            int n56;
                                                            switch (n27 % 7) {
                                                                case 0: {
                                                                    n56 = 123;
                                                                    break;
                                                                }
                                                                case 1: {
                                                                    n56 = 35;
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    n56 = 63;
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    n56 = 80;
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    n56 = 16;
                                                                    break;
                                                                }
                                                                case 5: {
                                                                    n56 = 77;
                                                                    break;
                                                                }
                                                                default: {
                                                                    n56 = 123;
                                                                }
                                                            }
                                                            cArray26[n55] = (char)(cArray26[n55] ^ (n54 ^ n56));
                                                            ++n27;
                                                            n26 = n53;
                                                            if (n53 != 0) break;
                                                            n53 = n26;
                                                            cArray12 = cArray12;
                                                            n55 = n26;
                                                            cArray26 = cArray12;
                                                            n54 = n26;
                                                        }
                                                        cArray11 = cArray12;
                                                        n25 = n25;
                                                    } while (n25 > n27);
                                                }
                                                String string = new String(cArray11).intern();
                                                char[] cArray27 = string.toCharArray();
                                                int n57 = cArray27.length;
                                                n24 = 0;
                                                n23 = 10;
                                                cArray10 = cArray27;
                                                n22 = n57;
                                                if (n57 <= 1) break block109;
                                                cArray9 = cArray10;
                                                n22 = n22;
                                                if (n22 <= n24) break block110;
                                            }
                                            do {
                                                int n58 = n23;
                                                cArray10 = cArray10;
                                                char[] cArray28 = cArray10;
                                                int n59 = n23;
                                                int n60 = n24;
                                                while (true) {
                                                    int n61;
                                                    switch (n24 % 7) {
                                                        case 0: {
                                                            n61 = 114;
                                                            break;
                                                        }
                                                        case 1: {
                                                            n61 = 109;
                                                            break;
                                                        }
                                                        case 2: {
                                                            n61 = 102;
                                                            break;
                                                        }
                                                        case 3: {
                                                            n61 = 124;
                                                            break;
                                                        }
                                                        case 4: {
                                                            n61 = 39;
                                                            break;
                                                        }
                                                        case 5: {
                                                            n61 = 73;
                                                            break;
                                                        }
                                                        default: {
                                                            n61 = 120;
                                                        }
                                                    }
                                                    cArray28[n60] = (char)(cArray28[n60] ^ (n59 ^ n61));
                                                    ++n24;
                                                    n23 = n58;
                                                    if (n58 != 0) break;
                                                    n58 = n23;
                                                    cArray10 = cArray10;
                                                    n60 = n23;
                                                    cArray28 = cArray10;
                                                    n59 = n23;
                                                }
                                                cArray9 = cArray10;
                                                n22 = n22;
                                            } while (n22 > n24);
                                        }
                                        String string = new String(cArray9).intern();
                                        char[] cArray29 = string.toCharArray();
                                        int n62 = cArray29.length;
                                        n21 = 0;
                                        n20 = 120;
                                        cArray8 = cArray29;
                                        n19 = n62;
                                        if (n62 <= 1) break block111;
                                        cArray7 = cArray8;
                                        n19 = n19;
                                        if (n19 <= n21) break block112;
                                    }
                                    do {
                                        int n63 = n20;
                                        cArray8 = cArray8;
                                        char[] cArray30 = cArray8;
                                        int n64 = n20;
                                        int n65 = n21;
                                        while (true) {
                                            int n66;
                                            switch (n21 % 7) {
                                                case 0: {
                                                    n66 = 40;
                                                    break;
                                                }
                                                case 1: {
                                                    n66 = 12;
                                                    break;
                                                }
                                                case 2: {
                                                    n66 = 24;
                                                    break;
                                                }
                                                case 3: {
                                                    n66 = 87;
                                                    break;
                                                }
                                                case 4: {
                                                    n66 = 43;
                                                    break;
                                                }
                                                case 5: {
                                                    n66 = 80;
                                                    break;
                                                }
                                                default: {
                                                    n66 = 37;
                                                }
                                            }
                                            cArray30[n65] = (char)(cArray30[n65] ^ (n64 ^ n66));
                                            ++n21;
                                            n20 = n63;
                                            if (n63 != 0) break;
                                            n63 = n20;
                                            cArray8 = cArray8;
                                            n65 = n20;
                                            cArray30 = cArray8;
                                            n64 = n20;
                                        }
                                        cArray7 = cArray8;
                                        n19 = n19;
                                    } while (n19 > n21);
                                }
                                String string = new String(cArray7).intern();
                                char[] cArray31 = string.toCharArray();
                                int n67 = cArray31.length;
                                n18 = 0;
                                n17 = 37;
                                cArray6 = cArray31;
                                n16 = n67;
                                if (n67 <= 1) break block113;
                                cArray5 = cArray6;
                                n16 = n16;
                                if (n16 <= n18) break block114;
                            }
                            do {
                                int n68 = n17;
                                cArray6 = cArray6;
                                char[] cArray32 = cArray6;
                                int n69 = n17;
                                int n70 = n18;
                                while (true) {
                                    int n71;
                                    switch (n18 % 7) {
                                        case 0: {
                                            n71 = 39;
                                            break;
                                        }
                                        case 1: {
                                            n71 = 16;
                                            break;
                                        }
                                        case 2: {
                                            n71 = 7;
                                            break;
                                        }
                                        case 3: {
                                            n71 = 49;
                                            break;
                                        }
                                        case 4: {
                                            n71 = 24;
                                            break;
                                        }
                                        case 5: {
                                            n71 = 55;
                                            break;
                                        }
                                        default: {
                                            n71 = 101;
                                        }
                                    }
                                    cArray32[n70] = (char)(cArray32[n70] ^ (n69 ^ n71));
                                    ++n18;
                                    n17 = n68;
                                    if (n68 != 0) break;
                                    n68 = n17;
                                    cArray6 = cArray6;
                                    n70 = n17;
                                    cArray32 = cArray6;
                                    n69 = n17;
                                }
                                cArray5 = cArray6;
                                n16 = n16;
                            } while (n16 > n18);
                        }
                        String string = new String(cArray5).intern();
                        char[] cArray33 = string.toCharArray();
                        int n72 = cArray33.length;
                        n15 = 0;
                        n14 = 118;
                        cArray4 = cArray33;
                        n13 = n72;
                        if (n72 <= 1) break block115;
                        cArray3 = cArray4;
                        n13 = n13;
                        if (n13 <= n15) break block116;
                    }
                    do {
                        int n73 = n14;
                        cArray4 = cArray4;
                        char[] cArray34 = cArray4;
                        int n74 = n14;
                        int n75 = n15;
                        while (true) {
                            int n76;
                            switch (n15 % 7) {
                                case 0: {
                                    n76 = 107;
                                    break;
                                }
                                case 1: {
                                    n76 = 91;
                                    break;
                                }
                                case 2: {
                                    n76 = 38;
                                    break;
                                }
                                case 3: {
                                    n76 = 99;
                                    break;
                                }
                                case 4: {
                                    n76 = 10;
                                    break;
                                }
                                case 5: {
                                    n76 = 40;
                                    break;
                                }
                                default: {
                                    n76 = 114;
                                }
                            }
                            cArray34[n75] = (char)(cArray34[n75] ^ (n74 ^ n76));
                            ++n15;
                            n14 = n73;
                            if (n73 != 0) break;
                            n73 = n14;
                            cArray4 = cArray4;
                            n75 = n14;
                            cArray34 = cArray4;
                            n74 = n14;
                        }
                        cArray3 = cArray4;
                        n13 = n13;
                    } while (n13 > n15);
                }
                String string = new String(cArray3).intern();
                char[] cArray35 = string.toCharArray();
                int n77 = cArray35.length;
                n12 = 0;
                n11 = 54;
                cArray2 = cArray35;
                n10 = n77;
                if (n77 <= 1) break block117;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block118;
            }
            do {
                int n78 = n11;
                cArray2 = cArray2;
                char[] cArray36 = cArray2;
                int n79 = n11;
                int n80 = n12;
                while (true) {
                    int n81;
                    switch (n12 % 7) {
                        case 0: {
                            n81 = 5;
                            break;
                        }
                        case 1: {
                            n81 = 57;
                            break;
                        }
                        case 2: {
                            n81 = 7;
                            break;
                        }
                        case 3: {
                            n81 = 12;
                            break;
                        }
                        case 4: {
                            n81 = 22;
                            break;
                        }
                        case 5: {
                            n81 = 76;
                            break;
                        }
                        default: {
                            n81 = 40;
                        }
                    }
                    cArray36[n80] = (char)(cArray36[n80] ^ (n79 ^ n81));
                    ++n12;
                    n11 = n78;
                    if (n78 != 0) break;
                    n78 = n11;
                    cArray2 = cArray2;
                    n80 = n11;
                    cArray36 = cArray2;
                    n79 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        String string = new String(cArray).intern();
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n82 = 1;
        while (true) {
            if (n82 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal(string.getBytes("ISO-8859-1"));
                String string2 = mk.a(byArray3).intern();
                r = System.getProperty(string2, "\n");
                return;
            }
            byArray2 = byArray2;
            byArray2[n82] = (byte)(l10 << n82 * 8 >>> 56);
            ++n82;
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

