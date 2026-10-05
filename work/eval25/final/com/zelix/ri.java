package com.zelix;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public class ri implements Enumeration {
   @Override
   public final boolean hasMoreElements() {
      return false;
   }

   @Override
   public final Object nextElement() {
      throw new NoSuchElementException();
   }
}
