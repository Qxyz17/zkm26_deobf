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
import java.util.List;

public class wc
extends bh
implements Serializable {
    public static final String P = "*.";
    private boolean g;
    private String h;
    private static final long i = prr.a((long)3892341592420011031L, (long)-7026241435123569508L, MethodHandles.lookup().lookupClass()).a(17599429486974L);

    public void a(boolean bl, String string) {
        long l = i ^ 0x67F2BAE90367L;
        m44.a("q", (Object)this, (boolean)bl, (long)-2568995947644133433L, (long)l);
        m44.a("q", (Object)this, (String)string, (long)-4059688425357744329L, (long)l);
    }

    public boolean i() {
        long l = i ^ 0x7DC7F855C85BL;
        return (boolean)m44.a("w", (Object)this, (long)1685769023146169595L, (long)l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static wc a(String string, String string2) {
        wc wc2;
        File file = new File(string, string2);
        long l = i ^ 0x7738D7FF614FL;
        if (m44.a("r", (Object)file, (long)-4831913808384444119L, (long)l) == false) return new wc();
        if (m44.a("r", (Object)file, (long)-6789984057662477633L, (long)l) != false) return new wc();
        if (m44.a("r", (Object)file, (long)-6888860671152131849L, (long)l) == false) return new wc();
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            wc wc3 = (wc)((Object)m44.a("r", (Object)objectInputStream, (long)-6487084989170151823L, (long)l));
            if (m44.a("s", (Object)wc3, (long)-4699337737583115524L, (long)l) == null) {
                m44.a("q", (Object)wc3, new LinkedHashMap(), (long)-4699337737583115524L, (long)l);
            }
            m44.a("q", (Object)wc3, (boolean)true, (long)-5009420628744770090L, (long)l);
            wc2 = wc3;
            if (objectInputStream == null) return wc2;
        }
        catch (IOException iOException) {
            if (objectInputStream == null) return new wc();
            try {
                m44.a("r", (Object)objectInputStream, (long)-6612032711100073965L, (long)l);
                return new wc();
            }
            catch (IOException iOException2) {
                return new wc();
            }
            catch (ClassNotFoundException classNotFoundException) {
                if (objectInputStream == null) return new wc();
                try {
                    m44.a("r", (Object)objectInputStream, (long)-6612032711100073965L, (long)l);
                    return new wc();
                }
                catch (IOException iOException3) {
                    return new wc();
                }
                catch (ClassCastException classCastException) {
                    if (objectInputStream == null) return new wc();
                    try {
                        m44.a("r", (Object)objectInputStream, (long)-6612032711100073965L, (long)l);
                        return new wc();
                    }
                    catch (IOException iOException4) {
                        return new wc();
                    }
                    catch (nn nn2) {
                        throw nn2;
                        catch (Throwable throwable) {
                            return new wc();
                        }
                    }
                }
            }
        }
        try {
            m44.a("r", (Object)objectInputStream, (long)-6612032711100073965L, (long)l);
            return wc2;
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return wc2;
        finally {
            if (objectInputStream != null) {
                try {
                    m44.a("r", objectInputStream, (long)-6612032711100073965L, (long)l);
                }
                catch (IOException iOException) {}
            }
        }
    }

    public String h() {
        long l = i ^ 0xC966038AC81L;
        return m44.a("u", (Object)this, (long)7516364318541662417L, (long)l);
    }

    public void a(List list) {
        long l = i ^ 0x11545AFA01CL;
        m44.a("p", (Object)this, (long)9195205934955463599L, (long)l).clear();
        int n = 0;
        String string = null;
        for (int i = 0; i < list.size(); ++i) {
            String string2 = (String)list.get(i);
            m44.a("p", (Object)this, (long)9195205934955463599L, (long)l).put(string2, string2);
            if (m44.a("o", (Object)this, (Object)string2, (long)8862962228978880180L, (long)l) == false || ++n != 1) continue;
            string = string2;
        }
        if (m44.a("p", (Object)this, (long)8923847632452704878L, (long)l) != null && ((String)((Object)m44.a("p", (Object)this, (long)8923847632452704878L, (long)l))).length() > 0) {
            if (m44.a("p", (Object)this, (long)7119731643557955620L, (long)l) != false) {
                if (!m44.a("p", (Object)this, (long)9195205934955463599L, (long)l).containsKey(m44.a("p", (Object)this, (long)8923847632452704878L, (long)l))) {
                    m44.a("r", (Object)this, (boolean)false, (long)7119731643557955620L, (long)l);
                }
            } else if (m44.a("p", (Object)this, (long)9195205934955463599L, (long)l).containsKey(m44.a("p", (Object)this, (long)8923847632452704878L, (long)l))) {
                m44.a("r", (Object)this, (boolean)true, (long)7119731643557955620L, (long)l);
            }
        }
        if (m44.a("p", (Object)this, (long)9161009025952152764L, (long)l) != false) {
            if (!m44.a("p", (Object)this, (long)9195205934955463599L, (long)l).containsKey(m44.a("p", (Object)this, (long)7264992316158362700L, (long)l))) {
                m44.a("r", (Object)this, (boolean)false, (long)9161009025952152764L, (long)l);
            }
        } else if (m44.a("p", (Object)this, (long)9195205934955463599L, (long)l).containsKey(m44.a("p", (Object)this, (long)7264992316158362700L, (long)l))) {
            m44.a("r", (Object)this, (boolean)true, (long)9161009025952152764L, (long)l);
        }
        if (m44.a("p", (Object)this, (long)9161009025952152764L, (long)l) == false && n > 0) {
            m44.a("r", (Object)this, (boolean)true, (long)9161009025952152764L, (long)l);
            m44.a("r", (Object)this, (String)string, (long)7264992316158362700L, (long)l);
        }
    }

    public wc() {
        long l = i ^ 0x5A841B8572A8L;
        m44.a("v", (Object)this, (boolean)false, (long)-5938512065958466040L, (long)l);
        m44.a("v", (Object)this, null, (long)-5303503595408910600L, (long)l);
    }

    private boolean a(String string) {
        return string != null && string.length() > 0 && string.indexOf("*") == -1 && string.indexOf("^") == -1 && string.charAt(string.length() - 1) == '.';
    }
}
