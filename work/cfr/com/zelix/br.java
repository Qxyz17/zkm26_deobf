/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.bh;
import com.zelix.m44;
import com.zelix.nn;
import com.zelix.prr;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;

public class br
extends bh
implements Serializable {
    private static final long g = prr.a(-569656259407027278L, 3596161681283800713L, MethodHandles.lookup().lookupClass()).a(190869365263869L);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static br b(String string, String string2) {
        br br2;
        File file = new File(string, string2);
        long l10 = g ^ 0x6645FFA37CBL;
        if (m44.a("q", (Object)file, (long)2874069538357060154L, (long)l10) == false) return new br();
        if (m44.a("q", (Object)file, (long)4239586544979931564L, (long)l10) != false) return new br();
        if (m44.a("q", (Object)file, (long)4284877415092251620L, (long)l10) == false) return new br();
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            br br3 = (br)((Object)m44.a("q", (Object)objectInputStream, (long)4533460627557258594L, (long)l10));
            if (m44.a("p", (Object)br3, (long)2727969440241998319L, (long)l10) == null) {
                m44.a("r", (Object)br3, new LinkedHashMap(), (long)2727969440241998319L, (long)l10);
            }
            m44.a("r", (Object)br3, (boolean)true, (long)2407700133272417989L, (long)l10);
            br2 = br3;
            if (objectInputStream == null) return br2;
        }
        catch (IOException iOException) {
            if (objectInputStream == null) return new br();
            try {
                m44.a("q", (Object)objectInputStream, (long)4552716673381458688L, (long)l10);
                return new br();
            }
            catch (IOException iOException2) {
                return new br();
            }
            catch (ClassNotFoundException classNotFoundException) {
                if (objectInputStream == null) return new br();
                try {
                    m44.a("q", (Object)objectInputStream, (long)4552716673381458688L, (long)l10);
                    return new br();
                }
                catch (IOException iOException3) {
                    return new br();
                }
                catch (ClassCastException classCastException) {
                    if (objectInputStream == null) return new br();
                    try {
                        m44.a("q", (Object)objectInputStream, (long)4552716673381458688L, (long)l10);
                        return new br();
                    }
                    catch (IOException iOException4) {
                        return new br();
                    }
                    catch (nn nn2) {
                        throw nn2;
                        catch (Throwable throwable) {
                            return new br();
                        }
                    }
                }
            }
        }
        try {
            m44.a("q", (Object)objectInputStream, (long)4552716673381458688L, (long)l10);
            return br2;
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return br2;
        finally {
            if (objectInputStream != null) {
                try {
                    m44.a("q", objectInputStream, (long)4552716673381458688L, (long)l10);
                }
                catch (IOException iOException) {}
            }
        }
    }
}

