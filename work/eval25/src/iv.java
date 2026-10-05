package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class iv extends ie implements sv {
   private x7 b;
   private static final long c = ess.a(-8025202008405947516L, 2285297857061124307L, MethodHandles.lookup().lookupClass()).a(180187316452409L);
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   static ie A(h9 param0, long param1, int param3, String param4, _8c param5, Set param6, List param7, Map param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/iv.c J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 42816271488364
      // 0b: lxor
      // 0c: lstore 9
      // 0e: pop2
      // 0f: ldc2_w -5056771638652269162
      // 12: lload 1
      // 13: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: istore 11
      // 1a: aload 8
      // 1c: aload 4
      // 1e: iload 11
      // 20: ifne 49
      // 23: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 28: ifeq 5e
      // 2b: goto 38
      // 2e: ldc2_w -4842469587242225425
      // 31: lload 1
      // 32: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: athrow
      // 38: aload 8
      // 3a: aload 4
      // 3c: goto 49
      // 3f: ldc2_w -4842469587242225425
      // 42: lload 1
      // 43: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4e: checkcast com/zelix/iv
      // 51: astore 12
      // 53: lload 1
      // 54: lconst_0
      // 55: lcmp
      // 56: iflt 73
      // 59: iload 11
      // 5b: ifeq 7f
      // 5e: new com/zelix/iv
      // 61: dup
      // 62: aload 0
      // 63: lload 9
      // 65: iload 3
      // 66: aload 4
      // 68: aload 5
      // 6a: aload 6
      // 6c: aload 7
      // 6e: invokespecial com/zelix/iv.<init> (Lcom/zelix/h8;JILjava/lang/String;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;)V
      // 71: astore 12
      // 73: aload 8
      // 75: aload 4
      // 77: aload 12
      // 79: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 7e: pop
      // 7f: aload 12
      // 81: areturn
   }

   public void h(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/x7
      // 12: astore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/x7
      // 19: astore 2
      // 1a: pop
      // 1b: ldc2_w 1401169644749333275
      // 1e: lload 4
      // 20: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: iload 6
      // 2a: ifeq 51
      // 2d: getfield com/zelix/iv.b Lcom/zelix/x7;
      // 30: aload 3
      // 31: if_acmpne 55
      // 34: goto 42
      // 37: ldc2_w 799445311312283451
      // 3a: lload 4
      // 3c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: goto 51
      // 46: ldc2_w 799445311312283451
      // 49: lload 4
      // 4b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 2
      // 52: putfield com/zelix/iv.b Lcom/zelix/x7;
      // 55: return
   }

   protected iv(h8 param1, int param2, int param3, short param4, char param5, _xx param6, _y4 param7, int param8, PrintWriter param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 4
      // 002: i2l
      // 003: bipush 48
      // 005: lshl
      // 006: iload 5
      // 008: i2l
      // 009: bipush 48
      // 00b: lshl
      // 00c: bipush 16
      // 00e: lushr
      // 00f: lor
      // 010: iload 8
      // 012: i2l
      // 013: bipush 32
      // 015: lshl
      // 016: bipush 32
      // 018: lushr
      // 019: lor
      // 01a: getstatic com/zelix/iv.c J
      // 01d: lxor
      // 01e: lstore 10
      // 020: lload 10
      // 022: dup2
      // 023: ldc2_w 127123519402887
      // 026: lxor
      // 027: lstore 12
      // 029: dup2
      // 02a: ldc2_w 92027399983931
      // 02d: lxor
      // 02e: dup2
      // 02f: bipush 8
      // 031: lushr
      // 032: lstore 14
      // 034: dup2
      // 035: bipush 56
      // 037: lshl
      // 038: bipush 56
      // 03a: lushr
      // 03b: l2i
      // 03c: istore 16
      // 03e: pop2
      // 03f: dup2
      // 040: ldc2_w 24023661134804
      // 043: lxor
      // 044: lstore 17
      // 046: pop2
      // 047: ldc2_w -2010132670465977232
      // 04a: lload 10
      // 04c: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: aload 0
      // 052: aload 1
      // 053: iload 2
      // 054: invokespecial com/zelix/ie.<init> (Lcom/zelix/h8;I)V
      // 057: istore 19
      // 059: aload 0
      // 05a: lload 14
      // 05c: iload 3
      // 05d: iload 16
      // 05f: i2b
      // 060: invokevirtual com/zelix/iv.N (JIB)Lcom/zelix/xl;
      // 063: astore 20
      // 065: iload 19
      // 067: ifeq 0bb
      // 06a: aload 20
      // 06c: instanceof com/zelix/x7
      // 06f: ifeq 0a8
      // 072: goto 080
      // 075: ldc2_w -255766313300840368
      // 078: lload 10
      // 07a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: aload 0
      // 081: aload 20
      // 083: checkcast com/zelix/x7
      // 086: putfield com/zelix/iv.b Lcom/zelix/x7;
      // 089: aload 7
      // 08b: aload 0
      // 08c: getfield com/zelix/iv.b Lcom/zelix/x7;
      // 08f: aload 0
      // 090: lload 12
      // 092: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 095: iload 19
      // 097: ifne 117
      // 09a: goto 0a8
      // 09d: ldc2_w -255766313300840368
      // 0a0: lload 10
      // 0a2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: bipush 0
      // 0aa: putfield com/zelix/iv.P Z
      // 0ad: goto 0bb
      // 0b0: ldc2_w -255766313300840368
      // 0b3: lload 10
      // 0b5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: aload 9
      // 0bd: new java/lang/StringBuilder
      // 0c0: dup
      // 0c1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c4: sipush 31121
      // 0c7: ldc2_w 8740211742445504918
      // 0ca: lload 10
      // 0cc: lxor
      // 0cd: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/iv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d5: aload 0
      // 0d6: lload 17
      // 0d8: invokevirtual com/zelix/iv.j (J)Ljava/lang/String;
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: sipush 11789
      // 0e1: ldc2_w 5382337339586338319
      // 0e4: lload 10
      // 0e6: lxor
      // 0e7: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/iv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: sipush 22347
      // 0f2: ldc2_w 8047832845535258445
      // 0f5: lload 10
      // 0f7: lxor
      // 0f8: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/iv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 100: sipush 20800
      // 103: ldc2_w 3828817996296823108
      // 106: lload 10
      // 108: lxor
      // 109: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/iv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 111: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 114: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 117: return
   }

   public boolean b(long var1, ie var3) {
      long var4 = var1 ^ 26026849688191L;
      boolean var6 = x44.a<"v">(-3611923917992559179L, var1);

      label27: {
         try {
            if (!var6) {
               return (boolean)this.j;
            }

            if (this.j == var3.j) {
               break label27;
            }
         } catch (gj var8) {
            throw x44.a<"v">(var8, -3047220277234230891L, var1);
         }

         return (boolean)0;
      }

      iv var7 = (iv)var3;
      return this.b.W(var4).equals(var7.b.W(var4));
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      this.b.O(var4, var3, this, this.x());
   }

   protected iv(h8 param1, long param2, int param4, String param5, _8c param6, Set param7, List param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/iv.c J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 67100578070962
      // 00b: lxor
      // 00c: dup2
      // 00d: bipush 32
      // 00f: lushr
      // 010: l2i
      // 011: istore 9
      // 013: dup2
      // 014: bipush 32
      // 016: lshl
      // 017: bipush 40
      // 019: lushr
      // 01a: l2i
      // 01b: istore 10
      // 01d: dup2
      // 01e: bipush 56
      // 020: lshl
      // 021: bipush 56
      // 023: lushr
      // 024: l2i
      // 025: istore 11
      // 027: pop2
      // 028: dup2
      // 029: ldc2_w 122565553699046
      // 02c: lxor
      // 02d: lstore 12
      // 02f: pop2
      // 030: ldc2_w -7401230131553194739
      // 033: lload 2
      // 034: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: aload 0
      // 03a: aload 1
      // 03b: iload 4
      // 03d: invokespecial com/zelix/ie.<init> (Lcom/zelix/h8;I)V
      // 040: istore 14
      // 042: aload 5
      // 044: iload 14
      // 046: ifne 0b0
      // 049: ldc "L"
      // 04b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 04e: ifeq 0a1
      // 051: goto 05e
      // 054: ldc2_w -7181228178175864716
      // 057: lload 2
      // 058: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: aload 5
      // 060: iload 14
      // 062: ifne 0b0
      // 065: goto 072
      // 068: ldc2_w -7181228178175864716
      // 06b: lload 2
      // 06c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: ldc ";"
      // 074: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 077: ifeq 0a1
      // 07a: goto 087
      // 07d: ldc2_w -7181228178175864716
      // 080: lload 2
      // 081: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: aload 5
      // 089: bipush 1
      // 08a: aload 5
      // 08c: invokevirtual java/lang/String.length ()I
      // 08f: bipush 1
      // 090: isub
      // 091: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 094: lload 2
      // 095: lconst_0
      // 096: lcmp
      // 097: iflt 0a3
      // 09a: astore 15
      // 09c: iload 14
      // 09e: ifeq 0b2
      // 0a1: aload 5
      // 0a3: goto 0b0
      // 0a6: ldc2_w -7181228178175864716
      // 0a9: lload 2
      // 0aa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: astore 15
      // 0b2: aload 15
      // 0b4: aload 7
      // 0b6: lload 12
      // 0b8: invokestatic com/zelix/x7.y (Ljava/lang/String;Ljava/util/Collection;J)Lcom/zelix/x7;
      // 0bb: astore 16
      // 0bd: iload 14
      // 0bf: lload 2
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: ifle 11c
      // 0c5: ifne 113
      // 0c8: aload 16
      // 0ca: ifnonnull 100
      // 0cd: goto 0da
      // 0d0: ldc2_w -7181228178175864716
      // 0d3: lload 2
      // 0d4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: aload 0
      // 0db: aload 6
      // 0dd: iload 9
      // 0df: iload 10
      // 0e1: aload 15
      // 0e3: aload 8
      // 0e5: iload 11
      // 0e7: i2b
      // 0e8: invokevirtual com/zelix/_8c.a (IILjava/lang/String;Ljava/util/List;B)Lcom/zelix/x7;
      // 0eb: putfield com/zelix/iv.b Lcom/zelix/x7;
      // 0ee: iload 14
      // 0f0: ifeq 11d
      // 0f3: goto 100
      // 0f6: ldc2_w -7181228178175864716
      // 0f9: lload 2
      // 0fa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: aload 0
      // 101: aload 16
      // 103: putfield com/zelix/iv.b Lcom/zelix/x7;
      // 106: goto 113
      // 109: ldc2_w -7181228178175864716
      // 10c: lload 2
      // 10d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 7
      // 115: aload 16
      // 117: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 11c: pop
      // 11d: return
   }

   protected void b(DataOutputStream param1, int param2, char param3, int param4, Map param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 3
      // 006: i2l
      // 007: bipush 48
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: iload 4
      // 010: i2l
      // 011: bipush 48
      // 013: lshl
      // 014: bipush 48
      // 016: lushr
      // 017: lor
      // 018: lstore 6
      // 01a: lload 6
      // 01c: dup2
      // 01d: ldc2_w 140635337017104
      // 020: lxor
      // 021: lstore 8
      // 023: dup2
      // 024: ldc2_w 122389609845340
      // 027: lxor
      // 028: lstore 10
      // 02a: pop2
      // 02b: ldc2_w 267272957407016945
      // 02e: lload 6
      // 030: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: istore 12
      // 037: iload 12
      // 039: ifne 0c3
      // 03c: aload 0
      // 03d: getfield com/zelix/iv.P Z
      // 040: ifne 0a4
      // 043: goto 051
      // 046: ldc2_w 480513223477938824
      // 049: lload 6
      // 04b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: lload 10
      // 053: bipush 0
      // 054: bipush 1
      // 055: anewarray 9
      // 058: dup
      // 059: bipush 0
      // 05a: new java/lang/StringBuilder
      // 05d: dup
      // 05e: invokespecial java/lang/StringBuilder.<init> ()V
      // 061: sipush 9189
      // 064: ldc2_w 3986458528893118776
      // 067: lload 6
      // 069: lxor
      // 06a: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/iv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 072: aload 0
      // 073: lload 8
      // 075: bipush 1
      // 076: anewarray 162
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 0
      // 080: swap
      // 081: aastore
      // 082: ldc2_w 226709446317987203
      // 085: lload 6
      // 087: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 092: aastore
      // 093: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 096: goto 0a4
      // 099: ldc2_w 480513223477938824
      // 09c: lload 6
      // 09e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: iload 3
      // 0a5: ifle 0b5
      // 0a8: aload 1
      // 0a9: aload 0
      // 0aa: getfield com/zelix/iv.j I
      // 0ad: iload 12
      // 0af: ifne 14e
      // 0b2: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 0b5: goto 0c3
      // 0b8: ldc2_w 480513223477938824
      // 0bb: lload 6
      // 0bd: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: aload 5
      // 0c5: iload 4
      // 0c7: ifle 0d8
      // 0ca: ifnull 138
      // 0cd: aload 5
      // 0cf: aload 0
      // 0d0: getfield com/zelix/iv.b Lcom/zelix/x7;
      // 0d3: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d8: checkcast com/zelix/xl
      // 0db: astore 13
      // 0dd: iload 12
      // 0df: iload 2
      // 0e0: ifle 112
      // 0e3: ifne 110
      // 0e6: aload 13
      // 0e8: ifnull 11a
      // 0eb: goto 0f9
      // 0ee: ldc2_w 480513223477938824
      // 0f1: lload 6
      // 0f3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 1
      // 0fa: aload 13
      // 0fc: invokevirtual com/zelix/xl.B ()I
      // 0ff: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 102: goto 110
      // 105: ldc2_w 480513223477938824
      // 108: lload 6
      // 10a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: iload 12
      // 112: iload 4
      // 114: iflt 135
      // 117: ifeq 133
      // 11a: aload 1
      // 11b: aload 0
      // 11c: getfield com/zelix/iv.b Lcom/zelix/x7;
      // 11f: invokevirtual com/zelix/x7.B ()I
      // 122: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 125: goto 133
      // 128: ldc2_w 480513223477938824
      // 12b: lload 6
      // 12d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: iload 12
      // 135: ifeq 151
      // 138: aload 1
      // 139: aload 0
      // 13a: getfield com/zelix/iv.b Lcom/zelix/x7;
      // 13d: invokevirtual com/zelix/x7.B ()I
      // 140: goto 14e
      // 143: ldc2_w 480513223477938824
      // 146: lload 6
      // 148: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 151: return
   }

   static {
      long var0 = c ^ 6964967407799L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "6\t¾«\u009bnÉäü«÷#X×\t\u009d½ÇÖ+\u0010xs8I0Ûî\u0011Ô\u0087d¼\u0007\u008c\u0010\u0011ó\u00881\u009f t\"M\u000e4óÌ[©m«·ý\u0017\u0010 &)\rå¢\u008f=¯ø4\u009dR©\u0088\u009c\u0010Â$m÷Ùw<\u007fê`\u001bÚ4C&B";
      int var8 = "6\t¾«\u009bnÉäü«÷#X×\t\u009d½ÇÖ+\u0010xs8I0Ûî\u0011Ô\u0087d¼\u0007\u008c\u0010\u0011ó\u00881\u009f t\"M\u000e4óÌ[©m«·ý\u0017\u0010 &)\rå¢\u008f=¯ø4\u009dR©\u0088\u009c\u0010Â$m÷Ùw<\u007fê`\u001bÚ4C&B"
         .length();
      char var5 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     h = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "Ð\u000fª\u00ad1Øuû®kn/\u0013âù\u00adµg\u0017Ê\u008fuC\u0017E\u001ca$§\u0002'ÄW-P2\"\u0098¾}[Üä\u0005/¨g\u0010\u0083+Õ¶å\u001e\fü\u0010\u008c\u001fWË\u008c2ì¼.\u009f\u0082ô\\\u0095\u0019°";
                  var8 = "Ð\u000fª\u00ad1Øuû®kn/\u0013âù\u00adµg\u0017Ê\u008fuC\u0017E\u001ca$§\u0002'ÄW-P2\"\u0098¾}[Üä\u0005/¨g\u0010\u0083+Õ¶å\u001e\fü\u0010\u008c\u001fWË\u008c2ì¼.\u009f\u0082ô\\\u0095\u0019°"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj b(gj var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6334;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/iv", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/iv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
