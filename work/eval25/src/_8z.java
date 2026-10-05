package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _8z {
   private int V;
   private int t;
   private boolean O;
   Map Z;
   private static final long a = ess.a(-1253125237169980758L, 8819302690630740999L, MethodHandles.lookup().lookupClass()).a(8763417674022L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public _8z(int var1, long var2, boolean var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 2367817770574L;
      this(var1, var5, a<"n">(21694, 8878317844509251134L ^ var2), var4);
   }

   public _8z(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 96028169877855L;
      this(var1, var4, a<"n">(7638, 6068081899084890181L ^ var2), false);
   }

   public Enumeration b(Object[] var1) {
      return Collections.enumeration(this.Z.values());
   }

   public boolean O(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Object
      // 18: astore 5
      // 1a: pop
      // 1b: getstatic com/zelix/_8z.a J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: ldc2_w 151632784639138590
      // 24: lload 3
      // 25: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: aload 0
      // 2b: getfield com/zelix/_8z.Z Ljava/util/Map;
      // 2e: aload 2
      // 2f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 34: checkcast java/util/Map
      // 37: astore 7
      // 39: astore 6
      // 3b: aload 7
      // 3d: aload 6
      // 3f: ifnonnull 60
      // 42: ifnonnull 5e
      // 45: goto 52
      // 48: ldc2_w 1808019824211705749
      // 4b: lload 3
      // 4c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
      // 54: ldc2_w 1808019824211705749
      // 57: lload 3
      // 58: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 7
      // 60: aload 5
      // 62: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 67: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      String var10000 = x44.a<"w">(4728415058666608794L, var2);
      Iterator var5 = this.Z.values().iterator();
      String var4 = var10000;

      label41:
      while (var5.hasNext()) {
         try {
            ((Map)var5.next()).clear();
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"w">(var7, 6526667161557466129L, var2);
         }

         while (true) {
            try {
               var10000 = var4;
               if (var2 >= 0L) {
                  if (var4 != null) {
                     return;
                  }

                  var10000 = var4;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (gj var6) {
               boolean var11 = false;
               throw x44.a<"w">(var6, 6526667161557466129L, var2);
            }

            if (var2 >= 0L) {
               break label41;
            }
         }
      }

      this.Z.clear();
   }

   public Object V(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Object
      // 19: astore 3
      // 1a: pop
      // 1b: getstatic com/zelix/_8z.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: aconst_null
      // 24: astore 7
      // 26: ldc2_w 5910386003670813441
      // 29: lload 4
      // 2b: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: aload 0
      // 31: getfield com/zelix/_8z.Z Ljava/util/Map;
      // 34: aload 2
      // 35: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3a: checkcast java/util/Map
      // 3d: astore 8
      // 3f: astore 6
      // 41: aload 8
      // 43: aload 6
      // 45: ifnonnull 6f
      // 48: ifnull a7
      // 4b: goto 59
      // 4e: ldc2_w 5262523805141954442
      // 51: lload 4
      // 53: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 8
      // 5b: aload 3
      // 5c: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 61: goto 6f
      // 64: ldc2_w 5262523805141954442
      // 67: lload 4
      // 69: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: astore 7
      // 71: aload 8
      // 73: aload 6
      // 75: ifnonnull a9
      // 78: invokeinterface java/util/Map.size ()I 1
      // 7d: ifne a7
      // 80: goto 8e
      // 83: ldc2_w 5262523805141954442
      // 86: lload 4
      // 88: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: aload 0
      // 8f: getfield com/zelix/_8z.Z Ljava/util/Map;
      // 92: aload 2
      // 93: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 98: pop
      // 99: goto a7
      // 9c: ldc2_w 5262523805141954442
      // 9f: lload 4
      // a1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: aload 7
      // a9: areturn
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this.Z, 2260265286757398658L, var2);
   }

   public Object R(Object param1, char param2, int param3, Object param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 3
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 5
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: getstatic com/zelix/_8z.a J
      // 1b: lxor
      // 1c: lstore 6
      // 1e: ldc2_w -306043391074442556
      // 21: lload 6
      // 23: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: aload 0
      // 29: getfield com/zelix/_8z.Z Ljava/util/Map;
      // 2c: aload 1
      // 2d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 32: checkcast java/util/Map
      // 35: astore 9
      // 37: astore 8
      // 39: aload 9
      // 3b: aload 8
      // 3d: ifnonnull 67
      // 40: ifnonnull 5e
      // 43: goto 51
      // 46: ldc2_w -2248032414593038769
      // 49: lload 6
      // 4b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aconst_null
      // 52: areturn
      // 53: ldc2_w -2248032414593038769
      // 56: lload 6
      // 58: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 9
      // 60: aload 4
      // 62: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 67: areturn
   }

   public _8z(int var1, long var2, int var4, boolean var5) {
      var2 = a ^ var2;
      long var6 = var2 ^ 12301304357183L;
      long var8 = var2 ^ 84780193458340L;
      super();
      this.O = var5;
      this.V = sh.Q(var1, var8);
      this.t = sh.Q(var4, var8);
      if (var5) {
         this.Z = new ConcurrentHashMap(this.V);
         if (var2 > 0L) {
            return;
         }
      }

      int var10001 = this.V;
      Object[] var10004 = new Object[]{null, var6};
      var10004[0] = var10001;
      this.Z = x44.a<"r">(var10004, -6972525402131818353L, var2);
   }

   public Map Y(Object[] var1) {
      Object var2 = var1[0];
      return (Map)this.Z.remove(var2);
   }

   public boolean g(Object var1) {
      return this.Z.containsKey(var1);
   }

   public Set v(Object[] var1) {
      return this.Z.keySet();
   }

   public Object s(Object var1, Object var2, Object var3, int var4, byte var5, int var6) {
      long var7 = ((long)var4 << 32 | (long)var5 << 56 >>> 32 | (long)var6 << 40 >>> 40) ^ a;
      long var10001 = var7 ^ 63068030372306L;
      int var9 = (int)((var7 ^ 63068030372306L) >>> 32);
      int var10 = (int)((var7 ^ 63068030372306L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      Object var12 = null;
      Map var13 = (Map)this.Z.get(var1);
      if (var13 == null) {
         var13 = this.S(var9, (char)var10, (short)var11);
         var13.put(var2, var3);
         this.Z.put(var1, var13);
         if (var6 > 0) {
            return var12;
         }
      }

      return var13.put(var2, var3);
   }

   public Enumeration g(Object[] var1) {
      return Collections.enumeration(this.Z.keySet());
   }

   public _8z(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 47122818587715L;
      this(a<"n">(11484, 7562101637474161746L ^ var1), var3, a<"n">(21694, 8878345247840496691L ^ var1), false);
   }

   public _8z(boolean var1, long var2, int var4) {
      long var5 = (var2 << 32 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 99359429724518L;
      this(a<"n">(22288, 7546594805520710329L ^ var5), var7, a<"n">(21694, 8878362265721518358L ^ var5), var1);
   }

   public Map D(Object[] var1) {
      long var2 = (Long)var1[0];
      Map var4 = (Map)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 54615565852517L;
      String var7 = x44.a<"w">(4597774995934881482L, var2);
      if (this.O) {
         ConcurrentHashMap var10000 = new ConcurrentHashMap(var4);
         if (var2 < 0L) {
            return x44.a<"w">(new Object[]{var10000, var5}, 4280074950412047854L, var2);
         }

         ConcurrentHashMap var8 = var10000;
         if (var7 == null) {
            return var8;
         }
      }

      return x44.a<"w">(new Object[]{var4, var5}, 4280074950412047854L, var2);
   }

   public int o(Object[] var1) {
      return this.Z.size();
   }

   public _8z(long var1, int var3, int var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 123671224539192L;
      this(var3, var5, var4, false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public Enumeration m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 93988556235068L;
      HashSet var7 = x44.a<"u">(new Object[]{var4}, 7005499556184320244L, var2);
      String var10000 = x44.a<"u">(9220178880910943984L, var2);
      Iterator var8 = this.Z.values().iterator();
      String var6 = var10000;

      label51:
      while (true) {
         Object var12;
         if (var8.hasNext()) {
            var12 = var8.next();
         } else {
            var12 = Collections.enumeration(var7);
            if (var2 > 0L) {
               return (Enumeration)var12;
            }
         }

         label49:
         while (true) {
            Map var9 = (Map)var12;
            Iterator var10 = var9.values().iterator();

            label45:
            while (true) {
               if (var10.hasNext()) {
                  var7.add(var10.next());
                  if (var6 != null) {
                     continue label51;
                  }
               } else {
                  var13 = var6;
                  if (var2 >= 0L) {
                     break;
                  }

                  if (var6 != null) {
                     continue label51;
                  }
               }

               while (true) {
                  var12 = var6;
                  if (var2 <= 0L) {
                     continue label49;
                  }

                  if (var6 == null) {
                     break;
                  }

                  var13 = var6;
                  if (var2 >= 0L) {
                     break label45;
                  }

                  if (var6 != null) {
                     continue label51;
                  }
               }
            }

            if (var13 == null) {
               break;
            }

            var12 = Collections.enumeration(var7);
            if (var2 > 0L) {
               return (Enumeration)var12;
            }
         }
      }
   }

   public int r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var5 = 0;
      String var10000 = x44.a<"v">(-5953885438338943909L, var2);
      Iterator var6 = this.Z.values().iterator();
      String var4 = var10000;

      while (var6.hasNext()) {
         Map var7 = (Map)var6.next();
         if (var7 != null) {
            var5 += var7.size();
         }

         if (var4 != null) {
            break;
         }
      }

      return var5;
   }

   public Set I(Object[] var1) {
      return this.Z.entrySet();
   }

   public _8z o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 108018431640460L;
      long var6 = var2 ^ 2629685528106L;
      String var10000 = x44.a<"p">(2774675006838357893L, var2);
      int var9 = this.Z.size();
      _8z var10 = new _8z(var9 * 2 + 1, var4, this.O);
      Iterator var11 = this.Z.entrySet().iterator();
      String var8 = var10000;

      while (true) {
         if (var11.hasNext()) {
            Entry var12 = (Entry)var11.next();
            Map var13 = (Map)var12.getValue();

            label34: {
               Object var14;
               label33: {
                  label44: {
                     try {
                        var17 = this;
                        if (var8 != null) {
                           break;
                        }

                        if (!this.O) {
                           break label44;
                        }
                     } catch (gj var15) {
                        throw x44.a<"p">(var15, 4435048867493944078L, var2);
                     }

                     var14 = new ConcurrentHashMap(var13);
                     var10000 = var8;
                     if (var2 <= 0L) {
                        break label34;
                     }

                     if (var8 == null) {
                        break label33;
                     }
                  }

                  var14 = x44.a<"p">(new Object[]{var13, var6}, 2462011825425058977L, var2);
               }

               x44.a<"h">(var10, new Object[]{var12.getKey(), var14}, 2600356526143620607L, var2);
               var10000 = var8;
            }

            if (var10000 == null) {
               continue;
            }
         }

         var17 = var10;
         break;
      }

      return var17;
   }

   public Map L(Object[] var1) {
      Object var2 = var1[0];
      Map var3 = (Map)var1[1];
      return this.Z.put(var2, var3);
   }

   public Map D(Object var1) {
      return (Map)this.Z.get(var1);
   }

   public Map S(int var1, char var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 103897142022625L;

      try {
         if (this.O) {
            return new ConcurrentHashMap(this.t);
         }
      } catch (gj var8) {
         throw x44.a<"t">(var8, -6300465349582713326L, var4);
      }

      int var10000 = this.t;
      Object[] var10003 = new Object[]{null, var6};
      var10003[0] = var10000;
      return x44.a<"t">(var10003, -5772831488490493871L, var4);
   }

   static {
      long var0 = a ^ 139564218845155L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[4];
      int var5 = 0;
      String var6 = "ôXì\u0017C\u001cYLó\u0011\u0093\u00052\u007fMÑ";
      int var7 = "ôXì\u0017C\u001cYLó\u0011\u0093\u00052\u007fMÑ".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)((int)(var10 >>> 56)),
                  (byte)((int)(var10 >>> 48)),
                  (byte)((int)(var10 >>> 40)),
                  (byte)((int)(var10 >>> 32)),
                  (byte)((int)(var10 >>> 24)),
                  (byte)((int)(var10 >>> 16)),
                  (byte)((int)(var10 >>> 8)),
                  (byte)((int)var10)
               }
            );
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "ÐT\u0094w{èô\u000ekq\u0093Ö»?\u000bÙ";
                  var7 = "ÐT\u0094w{èô\u000ekq\u0093Ö»?\u000bÙ".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1021;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = b[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_8z", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_8z" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
