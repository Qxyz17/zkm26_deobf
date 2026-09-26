/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.jx;
import com.zelix.lkh;
import com.zelix.m44;
import com.zelix.to;
import java.io.DataOutputStream;

public abstract class j0
extends jx
implements lkh {
    final int z;
    final int s;

    public boolean G() {
        return true;
    }

    public j0(int n, h1 h12, to to2) {
        super(n, to2);
        this.s = h12.readUnsignedShort();
        this.z = h12.readUnsignedShort();
    }

    void O(DataOutputStream dataOutputStream, long l) {
        long l2 = l ^ 0x68EC39ED4954L;
        dataOutputStream.writeByte(this.A(l2).g());
        dataOutputStream.writeShort((int)m44.a("w", (Object)((Object)this), (long)-1757927856054372661L, (long)l));
        dataOutputStream.writeShort((int)m44.a("w", (Object)((Object)this), (long)-2172795878897454933L, (long)l));
    }
}
