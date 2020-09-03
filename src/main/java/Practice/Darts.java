package Practice;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Darts {

  /*Todo:: Think about how you would like to store this information.
  This method will return a list but each entry will have 3 numbers ie {first dart, second dart, third dart}.
  Left the return type as void for now just so it compiles.
   */
  private void getPossibleCombinationsOf3Darts() {

  }

  private List<Integer> getPossibleScoresWith1Dart() {
    List<Integer> scores = new ArrayList<>();

    //Todo:: Loop to add numbers 1-20 their double and their triples.

    //Leave 25 and 50 outside of loop as they dont match the pattern of the rest of the numbers
    scores.add(25);
    scores.add(50);

    for (int i = 0; i < scores.size() ; i++) {
      if (scores.equals(25)) {
        //leave out of loop
      }

      if (scores.equals(50)) {
        //leave out of loop
      }
    }
    return scores;
  }

  @Test
  public void possibleScoresWith1DartTest() {
    List<Integer> actual = getPossibleScoresWith1Dart();
    List<Integer> expected = Arrays.asList(1,2,3,2,4,6,3,6,9,4,8,12,5,10,15,6,12,18,7,14,21,8,16,24,9,18,27,10,20,30,
      11,22,33,12,24,36,13,26,39,14,28,42,15,30,45,15,32,48,17,34,51,18,36,54,19,38,57,20,40,60,25,50);
    Collections.sort(actual);
    Collections.sort(expected);

    assertThat(actual, equalTo(expected));
  }

}
