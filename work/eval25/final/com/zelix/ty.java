package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ty implements sr {
   private String g;
   private _og M;
   private static final long a = ess.a(-6431151674761528523L, 7434534205912435308L, MethodHandles.lookup().lookupClass()).a(229181889497394L);
   private static final String c;

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 76144862595463L;
      boolean var10000 = x44.a<"q">(-7175241025777797255L, var1);
      int var4 = 0;
      boolean var3 = var10000;

      label25: {
         label24: {
            try {
               var6 = this;
               if (var3) {
                  break label25;
               }

               if (x44.a<"m">(this, -6926969010289576418L, var1) == null) {
                  break label24;
               }
            } catch (gj var5) {
               throw x44.a<"q">(var5, -7181081073780360400L, var1);
            }

            var4 = x44.a<"m">(this, -6926969010289576418L, var1).hashCode();
         }

         var6 = this;
      }

      if (x44.a<"m">(var6, -8843056356449748221L, var1) != null) {
         var4 ^= x44.a<"m">(this, -8843056356449748221L, var1).hashCode();
      }

      return var4;
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public int B(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var4 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      return -1;
   }

   public String s(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public ty(long var1, _og var3, String var4) {
      var1 = a ^ var1;
      super();
      x44.a<"q">(this, var3, 3149480355686204021L, var1);
      x44.a<"q">(this, var4, 3543315618121830248L, var1);
   }

   public String i(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: pop
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 80973003147548
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 51362775915654
      // 018: lxor
      // 019: lstore 6
      // 01b: dup2
      // 01c: ldc2_w 73754746280261
      // 01f: lxor
      // 020: lstore 8
      // 022: pop2
      // 023: ldc2_w -1057002200846667978
      // 026: lload 2
      // 027: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: new java/lang/StringBuffer
      // 02f: dup
      // 030: invokespecial java/lang/StringBuffer.<init> ()V
      // 033: astore 11
      // 035: istore 10
      // 037: aload 11
      // 039: ldc "<"
      // 03b: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 03e: pop
      // 03f: iload 10
      // 041: ifeq 19a
      // 044: aload 0
      // 045: ldc2_w -1042839065723496377
      // 048: lload 2
      // 049: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: ifnull 172
      // 051: goto 05e
      // 054: ldc2_w -1004639405092104855
      // 057: lload 2
      // 058: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: aload 0
      // 05f: ldc2_w -1042839065723496377
      // 062: lload 2
      // 063: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: iload 10
      // 06a: ifeq 0c1
      // 06d: goto 07a
      // 070: ldc2_w -1004639405092104855
      // 073: lload 2
      // 074: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: lload 2
      // 07b: lconst_0
      // 07c: lcmp
      // 07d: iflt 0b4
      // 080: invokevirtual com/zelix/_og.l ()I
      // 083: tableswitch 168 182 185 39 39 168 39
      // 0a0: ldc2_w -1004639405092104855
      // 0a3: lload 2
      // 0a4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: ldc2_w -1042839065723496377
      // 0ae: lload 2
      // 0af: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: goto 0c1
      // 0b7: ldc2_w -1004639405092104855
      // 0ba: lload 2
      // 0bb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: checkcast com/zelix/_ow
      // 0c4: astore 12
      // 0c6: aload 12
      // 0c8: lload 8
      // 0ca: invokevirtual com/zelix/_ow.T (J)Lcom/zelix/xl;
      // 0cd: checkcast com/zelix/m8
      // 0d0: astore 13
      // 0d2: aload 11
      // 0d4: new java/lang/StringBuilder
      // 0d7: dup
      // 0d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0db: aload 12
      // 0dd: lload 6
      // 0df: bipush 1
      // 0e0: anewarray 195
      // 0e3: dup_x2
      // 0e4: dup_x2
      // 0e5: pop
      // 0e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e9: bipush 0
      // 0ea: swap
      // 0eb: aastore
      // 0ec: ldc2_w -902564765587944189
      // 0ef: lload 2
      // 0f0: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: ldc " "
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd: aload 13
      // 0ff: lload 4
      // 101: invokevirtual com/zelix/m8.O (J)Ljava/lang/String;
      // 104: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 107: ldc "."
      // 109: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10c: aload 13
      // 10e: invokevirtual com/zelix/m8.Q ()Ljava/lang/String;
      // 111: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 114: ldc " "
      // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 119: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11c: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 11f: pop
      // 120: lload 2
      // 121: lconst_0
      // 122: lcmp
      // 123: ifle 19a
      // 126: iload 10
      // 128: ifne 172
      // 12b: aload 11
      // 12d: new java/lang/StringBuilder
      // 130: dup
      // 131: invokespecial java/lang/StringBuilder.<init> ()V
      // 134: aload 0
      // 135: ldc2_w -1042839065723496377
      // 138: lload 2
      // 139: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: lload 6
      // 140: bipush 1
      // 141: anewarray 195
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 0
      // 14b: swap
      // 14c: aastore
      // 14d: ldc2_w -902564765587944189
      // 150: lload 2
      // 151: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 159: ldc " "
      // 15b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 161: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 164: pop
      // 165: goto 172
      // 168: ldc2_w -1004639405092104855
      // 16b: lload 2
      // 16c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: aload 11
      // 174: new java/lang/StringBuilder
      // 177: dup
      // 178: invokespecial java/lang/StringBuilder.<init> ()V
      // 17b: ldc "'"
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: aload 0
      // 181: ldc2_w -1504688124605295270
      // 184: lload 2
      // 185: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18d: getstatic com/zelix/ty.c Ljava/lang/String;
      // 190: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 193: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 196: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 199: pop
      // 19a: aload 11
      // 19c: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 19f: areturn
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ty.a J
      // 003: ldc2_w 45026336000073
      // 006: lxor
      // 007: lstore 2
      // 008: ldc2_w 6828524307492094113
      // 00b: lload 2
      // 00c: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: istore 4
      // 013: aload 1
      // 014: instanceof com/zelix/ty
      // 017: iload 4
      // 019: ifeq 197
      // 01c: ifeq 196
      // 01f: goto 02c
      // 022: ldc2_w 6744634656084572926
      // 025: lload 2
      // 026: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: athrow
      // 02c: aload 1
      // 02d: checkcast com/zelix/ty
      // 030: astore 6
      // 032: aload 0
      // 033: ldc2_w 6777948026241759184
      // 036: lload 2
      // 037: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: iload 4
      // 03e: ifeq 0ca
      // 041: ifnull 0b2
      // 044: goto 051
      // 047: ldc2_w 6744634656084572926
      // 04a: lload 2
      // 04b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: aload 6
      // 053: ldc2_w 6777948026241759184
      // 056: lload 2
      // 057: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: iload 4
      // 05e: ifeq 095
      // 061: goto 06e
      // 064: ldc2_w 6744634656084572926
      // 067: lload 2
      // 068: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: ifnull 0aa
      // 071: goto 07e
      // 074: ldc2_w 6744634656084572926
      // 077: lload 2
      // 078: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: aload 0
      // 07f: ldc2_w 6777948026241759184
      // 082: lload 2
      // 083: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: goto 095
      // 08b: ldc2_w 6744634656084572926
      // 08e: lload 2
      // 08f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: aload 6
      // 097: ldc2_w 6777948026241759184
      // 09a: lload 2
      // 09b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0a3: istore 5
      // 0a5: iload 4
      // 0a7: ifne 0de
      // 0aa: bipush 0
      // 0ab: istore 5
      // 0ad: iload 4
      // 0af: ifne 0de
      // 0b2: aload 6
      // 0b4: ldc2_w 6777948026241759184
      // 0b7: lload 2
      // 0b8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: goto 0ca
      // 0c0: ldc2_w 6744634656084572926
      // 0c3: lload 2
      // 0c4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: ifnonnull 0db
      // 0cd: bipush 1
      // 0ce: goto 0dc
      // 0d1: ldc2_w 6744634656084572926
      // 0d4: lload 2
      // 0d5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: bipush 0
      // 0dc: istore 5
      // 0de: iload 5
      // 0e0: iload 4
      // 0e2: ifeq 195
      // 0e5: ifeq 194
      // 0e8: goto 0f5
      // 0eb: ldc2_w 6744634656084572926
      // 0ee: lload 2
      // 0ef: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: ldc2_w 4938560568726567629
      // 0f9: lload 2
      // 0fa: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: iload 4
      // 101: ifeq 181
      // 104: goto 111
      // 107: ldc2_w 6744634656084572926
      // 10a: lload 2
      // 10b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: ifnull 176
      // 114: goto 121
      // 117: ldc2_w 6744634656084572926
      // 11a: lload 2
      // 11b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: aload 6
      // 123: ldc2_w 4938560568726567629
      // 126: lload 2
      // 127: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: iload 4
      // 12e: ifeq 165
      // 131: goto 13e
      // 134: ldc2_w 6744634656084572926
      // 137: lload 2
      // 138: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: ifnull 174
      // 141: goto 14e
      // 144: ldc2_w 6744634656084572926
      // 147: lload 2
      // 148: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: aload 0
      // 14f: ldc2_w 4938560568726567629
      // 152: lload 2
      // 153: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: goto 165
      // 15b: ldc2_w 6744634656084572926
      // 15e: lload 2
      // 15f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: aload 6
      // 167: ldc2_w 4938560568726567629
      // 16a: lload 2
      // 16b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 173: ireturn
      // 174: bipush 0
      // 175: ireturn
      // 176: aload 6
      // 178: ldc2_w 4938560568726567629
      // 17b: lload 2
      // 17c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: ifnonnull 192
      // 184: bipush 1
      // 185: goto 193
      // 188: ldc2_w 6744634656084572926
      // 18b: lload 2
      // 18c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: bipush 0
      // 193: ireturn
      // 194: bipush 0
      // 195: ireturn
      // 196: bipush 0
      // 197: ireturn
   }

   public boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public String y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 135986204036823L;
      return x44.a<"k">(this, new Object[]{var4}, 7599791621912863545L, var2);
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 67135027577178L;
      return x44.a<"n">(this, new Object[]{var4}, 2808738273734782132L, var2);
   }

   public String u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -8241449372559379484L, var2);
   }

   static {
      long var0 = a ^ 132098091605772L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("8øE[¸\u009b\u0086ø".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      c = var5;
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
