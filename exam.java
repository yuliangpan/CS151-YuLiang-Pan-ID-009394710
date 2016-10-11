package cs146;


import org.junit.Test;
import static org.junit.Assert.*;

public class NumberSequenceTest3
{
   @Test public void averageTest2()
   {
      NumberSequence sequence = NumberSequence.of(1, 4, 9, 16);
      assertEquals((1 + 4 + 9 + 16) / 4.0, sequence.average(5), 1E-12);
   }
   
   @Test public void filterTest2()
   {
      NumberSequence oddSquares2 = ((Object) NumberSequence.of(0, 1, 4, 9)).filter(n -> n % 2 != 0);
      assertEquals(1, oddSquares2.next());
      assertEquals(9, oddSquares2.next());
      assertFalse(oddSquares2.hasNext());
   }
}



/*

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class NumberSequenceTest3
{
   @Test public void filterTest3()
   {
      Random gen = new Random(42);
      NumberSequence randomSequence = () -> gen.nextLong();
      // NumberSequence is a functional interface!
      NumberSequence positiveRandoms = randomSequence.filter(n -> n > 0);
      assertEquals(5694868678511409995L, positiveRandoms.next());
   }
}
*/



