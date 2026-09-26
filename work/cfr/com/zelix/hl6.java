/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.nn;
import com.zelix.nv;
import com.zelix.prr;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;

public class hl6
extends nv {
    private static final long a = prr.a(5884938371840857429L, -4103676735824169163L, MethodHandles.lookup().lookupClass()).a(228433656744617L);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static hl6 e(String string, String string2) {
        hl6 hl62;
        File file = new File(string, string2);
        long l10 = a ^ 0x4E5BBB4349EL;
        if (m44.a("w", (Object)file, (long)5601601881580652644L, (long)l10) == false) return new hl6();
        if (m44.a("w", (Object)file, (long)5802982398849227762L, (long)l10) != false) return new hl6();
        if (m44.a("w", (Object)file, (long)5848114819565584826L, (long)l10) == false) return new hl6();
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            hl6 hl63 = (hl6)((Object)m44.a("w", (Object)objectInputStream, (long)6103585123750936380L, (long)l10));
            if (m44.a("v", (Object)hl63, (long)5730247783373583281L, (long)l10) == null) {
                m44.a("t", (Object)hl63, new LinkedHashMap(), (long)5730247783373583281L, (long)l10);
            }
            m44.a("t", (Object)hl63, (boolean)true, (long)5419944424019958939L, (long)l10);
            hl62 = hl63;
            if (objectInputStream == null) return hl62;
        }
        catch (IOException iOException) {
            if (objectInputStream == null) return new hl6();
            try {
                m44.a("w", (Object)objectInputStream, (long)6156459785532934494L, (long)l10);
                return new hl6();
            }
            catch (IOException iOException2) {
                return new hl6();
            }
            catch (ClassNotFoundException classNotFoundException) {
                if (objectInputStream == null) return new hl6();
                try {
                    m44.a("w", (Object)objectInputStream, (long)6156459785532934494L, (long)l10);
                    return new hl6();
                }
                catch (IOException iOException3) {
                    return new hl6();
                }
                catch (ClassCastException classCastException) {
                    if (objectInputStream == null) return new hl6();
                    try {
                        m44.a("w", (Object)objectInputStream, (long)6156459785532934494L, (long)l10);
                        return new hl6();
                    }
                    catch (IOException iOException4) {
                        return new hl6();
                    }
                    catch (nn nn2) {
                        throw nn2;
                        catch (Throwable throwable) {
                            return new hl6();
                        }
                    }
                }
            }
        }
        try {
            m44.a("w", (Object)objectInputStream, (long)6156459785532934494L, (long)l10);
            return hl62;
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return hl62;
        finally {
            if (objectInputStream != null) {
                try {
                    m44.a("w", objectInputStream, (long)6156459785532934494L, (long)l10);
                }
                catch (IOException iOException) {}
            }
        }
    }

    public hl6() {
        long l10 = a ^ 0x63D4BFA03171L;
        long l11 = l10 ^ 0x5DD39646031BL;
        long l12 = l11 >>> 8;
        int n10 = (int)(l11 << 56 >>> 56);
        super(l12, (byte)n10);
    }
}

