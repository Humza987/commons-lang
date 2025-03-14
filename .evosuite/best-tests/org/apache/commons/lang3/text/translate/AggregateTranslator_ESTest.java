/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 02 15:35:32 GMT 2025
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AggregateTranslator_ESTest extends AggregateTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      CharSequenceTranslator charSequenceTranslator0 = mock(CharSequenceTranslator.class, new ViolatedAssumptionAnswer());
      doReturn((-108)).when(charSequenceTranslator0).translate(any(java.lang.CharSequence.class) , anyInt() , any(java.io.Writer.class));
      charSequenceTranslatorArray0[0] = charSequenceTranslator0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(371);
      int int0 = aggregateTranslator0.translate((CharSequence) charBuffer0, 371, (Writer) null);
      assertEquals((-108), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[8];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "46F", 0, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      CharSequenceTranslator charSequenceTranslator0 = mock(CharSequenceTranslator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 349).when(charSequenceTranslator0).translate(any(java.lang.CharSequence.class) , anyInt() , any(java.io.Writer.class));
      charSequenceTranslatorArray0[0] = charSequenceTranslator0;
      charSequenceTranslatorArray0[1] = charSequenceTranslator0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = aggregateTranslator0.translate((CharSequence) charBuffer0, 349, (Writer) stringWriter0);
      assertEquals(0, int0);
      
      int int1 = aggregateTranslator0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(349, int1);
  }
}
