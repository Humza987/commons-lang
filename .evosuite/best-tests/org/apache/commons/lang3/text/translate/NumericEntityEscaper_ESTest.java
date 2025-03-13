/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 02 15:34:23 GMT 2025
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumericEntityEscaper_ESTest extends NumericEntityEscaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(3134);
      StringWriter stringWriter0 = new StringWriter(3134);
      boolean boolean0 = numericEntityEscaper0.translate(3134, (Writer) stringWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter(0);
      boolean boolean0 = numericEntityEscaper0.translate(0, (Writer) stringWriter0);
      assertEquals("&#0;", stringWriter0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between((-2256), 556);
      assertNotNull(numericEntityEscaper0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf((-1), (-1));
      StringWriter stringWriter0 = new StringWriter(0);
      boolean boolean0 = numericEntityEscaper0.translate(0, (Writer) stringWriter0);
      assertEquals("&#0;", stringWriter0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(57);
      StringWriter stringWriter0 = new StringWriter();
      boolean boolean0 = numericEntityEscaper0.translate(57, (Writer) stringWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(21, 54);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((-157), (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.NumericEntityEscaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(10, 10);
      StringWriter stringWriter0 = new StringWriter();
      boolean boolean0 = numericEntityEscaper0.translate(10, (Writer) stringWriter0);
      assertEquals("&#10;", stringWriter0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between((-1), (-1));
      StringWriter stringWriter0 = new StringWriter();
      boolean boolean0 = numericEntityEscaper0.translate(2327, (Writer) stringWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      boolean boolean0 = numericEntityEscaper0.translate((-1029), (Writer) stringWriter0);
      assertFalse(boolean0);
  }
}
