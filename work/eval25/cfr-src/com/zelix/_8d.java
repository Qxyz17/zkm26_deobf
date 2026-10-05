/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ess;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _8d {
    public static final String G;

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        long l;
        block118: {
            int n;
            char[] cArray2;
            int n2;
            int n3;
            block117: {
                char[] cArray3;
                block116: {
                    int n4;
                    char[] cArray4;
                    int n5;
                    int n6;
                    block115: {
                        char[] cArray5;
                        block114: {
                            int n7;
                            char[] cArray6;
                            int n8;
                            int n9;
                            block113: {
                                char[] cArray7;
                                block112: {
                                    int n10;
                                    char[] cArray8;
                                    int n11;
                                    int n12;
                                    block111: {
                                        char[] cArray9;
                                        block110: {
                                            int n13;
                                            char[] cArray10;
                                            int n14;
                                            int n15;
                                            block109: {
                                                char[] cArray11;
                                                block108: {
                                                    int n16;
                                                    char[] cArray12;
                                                    int n17;
                                                    int n18;
                                                    block107: {
                                                        char[] cArray13;
                                                        block106: {
                                                            int n19;
                                                            char[] cArray14;
                                                            int n20;
                                                            int n21;
                                                            block105: {
                                                                char[] cArray15;
                                                                block104: {
                                                                    int n22;
                                                                    char[] cArray16;
                                                                    int n23;
                                                                    int n24;
                                                                    block103: {
                                                                        char[] cArray17;
                                                                        block102: {
                                                                            int n25;
                                                                            char[] cArray18;
                                                                            int n26;
                                                                            int n27;
                                                                            block101: {
                                                                                l = ess.a(-395509923046028740L, -6897587691875117863L, MethodHandles.lookup().lookupClass()).a(149088844946680L) ^ 0x67B36E48EF61L;
                                                                                char[] cArray19 = "\u00ac\u00ff\u00f5+\u00fb0\u00cc\u00c1A\u0003I\u00a1O\u00d2P\u00d4".toCharArray();
                                                                                int n28 = cArray19.length;
                                                                                n27 = 0;
                                                                                n26 = 20;
                                                                                cArray18 = cArray19;
                                                                                n25 = n28;
                                                                                if (n28 <= 1) break block101;
                                                                                cArray17 = cArray18;
                                                                                n25 = n25;
                                                                                if (n25 <= n27) break block102;
                                                                            }
                                                                            do {
                                                                                int n29 = n26;
                                                                                cArray18 = cArray18;
                                                                                char[] cArray20 = cArray18;
                                                                                int n30 = n26;
                                                                                int n31 = n27;
                                                                                while (true) {
                                                                                    int n32;
                                                                                    switch (n27 % 7) {
                                                                                        case 0: {
                                                                                            n32 = 76;
                                                                                            break;
                                                                                        }
                                                                                        case 1: {
                                                                                            n32 = 98;
                                                                                            break;
                                                                                        }
                                                                                        case 2: {
                                                                                            n32 = 112;
                                                                                            break;
                                                                                        }
                                                                                        case 3: {
                                                                                            n32 = 34;
                                                                                            break;
                                                                                        }
                                                                                        case 4: {
                                                                                            n32 = 25;
                                                                                            break;
                                                                                        }
                                                                                        case 5: {
                                                                                            n32 = 60;
                                                                                            break;
                                                                                        }
                                                                                        default: {
                                                                                            n32 = 36;
                                                                                        }
                                                                                    }
                                                                                    cArray20[n31] = (char)(cArray20[n31] ^ (n30 ^ n32));
                                                                                    ++n27;
                                                                                    n26 = n29;
                                                                                    if (n29 != 0) break;
                                                                                    n29 = n26;
                                                                                    cArray18 = cArray18;
                                                                                    n31 = n26;
                                                                                    cArray20 = cArray18;
                                                                                    n30 = n26;
                                                                                }
                                                                                cArray17 = cArray18;
                                                                                n25 = n25;
                                                                            } while (n25 > n27);
                                                                        }
                                                                        String string = new String(cArray17).intern();
                                                                        char[] cArray21 = string.toCharArray();
                                                                        int n33 = cArray21.length;
                                                                        n24 = 0;
                                                                        n23 = 17;
                                                                        cArray16 = cArray21;
                                                                        n22 = n33;
                                                                        if (n33 <= 1) break block103;
                                                                        cArray15 = cArray16;
                                                                        n22 = n22;
                                                                        if (n22 <= n24) break block104;
                                                                    }
                                                                    do {
                                                                        int n34 = n23;
                                                                        cArray16 = cArray16;
                                                                        char[] cArray22 = cArray16;
                                                                        int n35 = n23;
                                                                        int n36 = n24;
                                                                        while (true) {
                                                                            int n37;
                                                                            switch (n24 % 7) {
                                                                                case 0: {
                                                                                    n37 = 34;
                                                                                    break;
                                                                                }
                                                                                case 1: {
                                                                                    n37 = 60;
                                                                                    break;
                                                                                }
                                                                                case 2: {
                                                                                    n37 = 11;
                                                                                    break;
                                                                                }
                                                                                case 3: {
                                                                                    n37 = 110;
                                                                                    break;
                                                                                }
                                                                                case 4: {
                                                                                    n37 = 32;
                                                                                    break;
                                                                                }
                                                                                case 5: {
                                                                                    n37 = 102;
                                                                                    break;
                                                                                }
                                                                                default: {
                                                                                    n37 = 8;
                                                                                }
                                                                            }
                                                                            cArray22[n36] = (char)(cArray22[n36] ^ (n35 ^ n37));
                                                                            ++n24;
                                                                            n23 = n34;
                                                                            if (n34 != 0) break;
                                                                            n34 = n23;
                                                                            cArray16 = cArray16;
                                                                            n36 = n23;
                                                                            cArray22 = cArray16;
                                                                            n35 = n23;
                                                                        }
                                                                        cArray15 = cArray16;
                                                                        n22 = n22;
                                                                    } while (n22 > n24);
                                                                }
                                                                String string = new String(cArray15).intern();
                                                                char[] cArray23 = string.toCharArray();
                                                                int n38 = cArray23.length;
                                                                n21 = 0;
                                                                n20 = 84;
                                                                cArray14 = cArray23;
                                                                n19 = n38;
                                                                if (n38 <= 1) break block105;
                                                                cArray13 = cArray14;
                                                                n19 = n19;
                                                                if (n19 <= n21) break block106;
                                                            }
                                                            do {
                                                                int n39 = n20;
                                                                cArray14 = cArray14;
                                                                char[] cArray24 = cArray14;
                                                                int n40 = n20;
                                                                int n41 = n21;
                                                                while (true) {
                                                                    int n42;
                                                                    switch (n21 % 7) {
                                                                        case 0: {
                                                                            n42 = 57;
                                                                            break;
                                                                        }
                                                                        case 1: {
                                                                            n42 = 17;
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            n42 = 37;
                                                                            break;
                                                                        }
                                                                        case 3: {
                                                                            n42 = 25;
                                                                            break;
                                                                        }
                                                                        case 4: {
                                                                            n42 = 86;
                                                                            break;
                                                                        }
                                                                        case 5: {
                                                                            n42 = 102;
                                                                            break;
                                                                        }
                                                                        default: {
                                                                            n42 = 71;
                                                                        }
                                                                    }
                                                                    cArray24[n41] = (char)(cArray24[n41] ^ (n40 ^ n42));
                                                                    ++n21;
                                                                    n20 = n39;
                                                                    if (n39 != 0) break;
                                                                    n39 = n20;
                                                                    cArray14 = cArray14;
                                                                    n41 = n20;
                                                                    cArray24 = cArray14;
                                                                    n40 = n20;
                                                                }
                                                                cArray13 = cArray14;
                                                                n19 = n19;
                                                            } while (n19 > n21);
                                                        }
                                                        String string = new String(cArray13).intern();
                                                        char[] cArray25 = string.toCharArray();
                                                        int n43 = cArray25.length;
                                                        n18 = 0;
                                                        n17 = 41;
                                                        cArray12 = cArray25;
                                                        n16 = n43;
                                                        if (n43 <= 1) break block107;
                                                        cArray11 = cArray12;
                                                        n16 = n16;
                                                        if (n16 <= n18) break block108;
                                                    }
                                                    do {
                                                        int n44 = n17;
                                                        cArray12 = cArray12;
                                                        char[] cArray26 = cArray12;
                                                        int n45 = n17;
                                                        int n46 = n18;
                                                        while (true) {
                                                            int n47;
                                                            switch (n18 % 7) {
                                                                case 0: {
                                                                    n47 = 36;
                                                                    break;
                                                                }
                                                                case 1: {
                                                                    n47 = 24;
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    n47 = 100;
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    n47 = 117;
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    n47 = 113;
                                                                    break;
                                                                }
                                                                case 5: {
                                                                    n47 = 51;
                                                                    break;
                                                                }
                                                                default: {
                                                                    n47 = 65;
                                                                }
                                                            }
                                                            cArray26[n46] = (char)(cArray26[n46] ^ (n45 ^ n47));
                                                            ++n18;
                                                            n17 = n44;
                                                            if (n44 != 0) break;
                                                            n44 = n17;
                                                            cArray12 = cArray12;
                                                            n46 = n17;
                                                            cArray26 = cArray12;
                                                            n45 = n17;
                                                        }
                                                        cArray11 = cArray12;
                                                        n16 = n16;
                                                    } while (n16 > n18);
                                                }
                                                String string = new String(cArray11).intern();
                                                char[] cArray27 = string.toCharArray();
                                                int n48 = cArray27.length;
                                                n15 = 0;
                                                n14 = 24;
                                                cArray10 = cArray27;
                                                n13 = n48;
                                                if (n48 <= 1) break block109;
                                                cArray9 = cArray10;
                                                n13 = n13;
                                                if (n13 <= n15) break block110;
                                            }
                                            do {
                                                int n49 = n14;
                                                cArray10 = cArray10;
                                                char[] cArray28 = cArray10;
                                                int n50 = n14;
                                                int n51 = n15;
                                                while (true) {
                                                    int n52;
                                                    switch (n15 % 7) {
                                                        case 0: {
                                                            n52 = 104;
                                                            break;
                                                        }
                                                        case 1: {
                                                            n52 = 75;
                                                            break;
                                                        }
                                                        case 2: {
                                                            n52 = 59;
                                                            break;
                                                        }
                                                        case 3: {
                                                            n52 = 52;
                                                            break;
                                                        }
                                                        case 4: {
                                                            n52 = 24;
                                                            break;
                                                        }
                                                        case 5: {
                                                            n52 = 4;
                                                            break;
                                                        }
                                                        default: {
                                                            n52 = 85;
                                                        }
                                                    }
                                                    cArray28[n51] = (char)(cArray28[n51] ^ (n50 ^ n52));
                                                    ++n15;
                                                    n14 = n49;
                                                    if (n49 != 0) break;
                                                    n49 = n14;
                                                    cArray10 = cArray10;
                                                    n51 = n14;
                                                    cArray28 = cArray10;
                                                    n50 = n14;
                                                }
                                                cArray9 = cArray10;
                                                n13 = n13;
                                            } while (n13 > n15);
                                        }
                                        String string = new String(cArray9).intern();
                                        char[] cArray29 = string.toCharArray();
                                        int n53 = cArray29.length;
                                        n12 = 0;
                                        n11 = 33;
                                        cArray8 = cArray29;
                                        n10 = n53;
                                        if (n53 <= 1) break block111;
                                        cArray7 = cArray8;
                                        n10 = n10;
                                        if (n10 <= n12) break block112;
                                    }
                                    do {
                                        int n54 = n11;
                                        cArray8 = cArray8;
                                        char[] cArray30 = cArray8;
                                        int n55 = n11;
                                        int n56 = n12;
                                        while (true) {
                                            int n57;
                                            switch (n12 % 7) {
                                                case 0: {
                                                    n57 = 12;
                                                    break;
                                                }
                                                case 1: {
                                                    n57 = 31;
                                                    break;
                                                }
                                                case 2: {
                                                    n57 = 106;
                                                    break;
                                                }
                                                case 3: {
                                                    n57 = 10;
                                                    break;
                                                }
                                                case 4: {
                                                    n57 = 8;
                                                    break;
                                                }
                                                case 5: {
                                                    n57 = 74;
                                                    break;
                                                }
                                                default: {
                                                    n57 = 18;
                                                }
                                            }
                                            cArray30[n56] = (char)(cArray30[n56] ^ (n55 ^ n57));
                                            ++n12;
                                            n11 = n54;
                                            if (n54 != 0) break;
                                            n54 = n11;
                                            cArray8 = cArray8;
                                            n56 = n11;
                                            cArray30 = cArray8;
                                            n55 = n11;
                                        }
                                        cArray7 = cArray8;
                                        n10 = n10;
                                    } while (n10 > n12);
                                }
                                String string = new String(cArray7).intern();
                                char[] cArray31 = string.toCharArray();
                                int n58 = cArray31.length;
                                n9 = 0;
                                n8 = 31;
                                cArray6 = cArray31;
                                n7 = n58;
                                if (n58 <= 1) break block113;
                                cArray5 = cArray6;
                                n7 = n7;
                                if (n7 <= n9) break block114;
                            }
                            do {
                                int n59 = n8;
                                cArray6 = cArray6;
                                char[] cArray32 = cArray6;
                                int n60 = n8;
                                int n61 = n9;
                                while (true) {
                                    int n62;
                                    switch (n9 % 7) {
                                        case 0: {
                                            n62 = 21;
                                            break;
                                        }
                                        case 1: {
                                            n62 = 38;
                                            break;
                                        }
                                        case 2: {
                                            n62 = 91;
                                            break;
                                        }
                                        case 3: {
                                            n62 = 7;
                                            break;
                                        }
                                        case 4: {
                                            n62 = 74;
                                            break;
                                        }
                                        case 5: {
                                            n62 = 87;
                                            break;
                                        }
                                        default: {
                                            n62 = 17;
                                        }
                                    }
                                    cArray32[n61] = (char)(cArray32[n61] ^ (n60 ^ n62));
                                    ++n9;
                                    n8 = n59;
                                    if (n59 != 0) break;
                                    n59 = n8;
                                    cArray6 = cArray6;
                                    n61 = n8;
                                    cArray32 = cArray6;
                                    n60 = n8;
                                }
                                cArray5 = cArray6;
                                n7 = n7;
                            } while (n7 > n9);
                        }
                        String string = new String(cArray5).intern();
                        char[] cArray33 = string.toCharArray();
                        int n63 = cArray33.length;
                        n6 = 0;
                        n5 = 45;
                        cArray4 = cArray33;
                        n4 = n63;
                        if (n63 <= 1) break block115;
                        cArray3 = cArray4;
                        n4 = n4;
                        if (n4 <= n6) break block116;
                    }
                    do {
                        int n64 = n5;
                        cArray4 = cArray4;
                        char[] cArray34 = cArray4;
                        int n65 = n5;
                        int n66 = n6;
                        while (true) {
                            int n67;
                            switch (n6 % 7) {
                                case 0: {
                                    n67 = 101;
                                    break;
                                }
                                case 1: {
                                    n67 = 73;
                                    break;
                                }
                                case 2: {
                                    n67 = 55;
                                    break;
                                }
                                case 3: {
                                    n67 = 30;
                                    break;
                                }
                                case 4: {
                                    n67 = 91;
                                    break;
                                }
                                case 5: {
                                    n67 = 108;
                                    break;
                                }
                                default: {
                                    n67 = 17;
                                }
                            }
                            cArray34[n66] = (char)(cArray34[n66] ^ (n65 ^ n67));
                            ++n6;
                            n5 = n64;
                            if (n64 != 0) break;
                            n64 = n5;
                            cArray4 = cArray4;
                            n66 = n5;
                            cArray34 = cArray4;
                            n65 = n5;
                        }
                        cArray3 = cArray4;
                        n4 = n4;
                    } while (n4 > n6);
                }
                String string = new String(cArray3).intern();
                char[] cArray35 = string.toCharArray();
                int n68 = cArray35.length;
                n3 = 0;
                n2 = 75;
                cArray2 = cArray35;
                n = n68;
                if (n68 <= 1) break block117;
                cArray = cArray2;
                n = n;
                if (n <= n3) break block118;
            }
            do {
                int n69 = n2;
                cArray2 = cArray2;
                char[] cArray36 = cArray2;
                int n70 = n2;
                int n71 = n3;
                while (true) {
                    int n72;
                    switch (n3 % 7) {
                        case 0: {
                            n72 = 57;
                            break;
                        }
                        case 1: {
                            n72 = 3;
                            break;
                        }
                        case 2: {
                            n72 = 86;
                            break;
                        }
                        case 3: {
                            n72 = 35;
                            break;
                        }
                        case 4: {
                            n72 = 50;
                            break;
                        }
                        case 5: {
                            n72 = 104;
                            break;
                        }
                        default: {
                            n72 = 95;
                        }
                    }
                    cArray36[n71] = (char)(cArray36[n71] ^ (n70 ^ n72));
                    ++n3;
                    n2 = n69;
                    if (n69 != 0) break;
                    n69 = n2;
                    cArray2 = cArray2;
                    n71 = n2;
                    cArray36 = cArray2;
                    n70 = n2;
                }
                cArray = cArray2;
                n = n;
            } while (n > n3);
        }
        String string = new String(cArray).intern();
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal(string.getBytes("ISO-8859-1"));
                String string2 = _8d.a(byArray3).intern();
                G = System.getProperty(string2, "\n");
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
