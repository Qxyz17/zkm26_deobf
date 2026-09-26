/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

public class t8 {
    public static boolean B(Object[] objectArray) {
        String string = (String)objectArray[0];
        try {
            Integer.parseInt(string);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }
}
