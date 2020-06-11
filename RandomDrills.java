/**
 *  Do not use any of these methods to solve other methods.
 *  Do not create any other methods to solve these methods.
 *  Do not change the method headers (return type, name, parameters) of these methods.
 *  Do not delete the comments from the starter code
 *
 *  Remember: Comments describe the method that comes after them.
 */
public class RandomDrills
{
  /** The starting point of this program.
   *
   *  Write code here to test the methods you write.
   *
   *  @param String[] args Commandline arguments.
   */
  public static void main(String[] args)
  {
    // You need to test your work! Follow this example of how to test a method:

    // This statement invokes the hello method and stores its response in the answer variable
    int answer = getRandom(705);

    // This statement outputs the value of the answer variable to the console
    System.out.println( answer );
  }

  /**  Return a random number between 0 and limit, exclusive.
   *
   *   @param int limit The upper bound of the random number.
   *   @return int A random int between 0 and limit, exclusive of limit
   *
   *  Precondition: limit > 0
   */
  public static int getRandom(int limit)
  {
    return -1;
  }

  /**  Return a random number between low and high, exclusive.
   *
   *   @param int low The lower bound of the random number.
   *   @param int high The upper bound of the random number.
   *   @return int A random int between low and high, exclusive of high
   *
   *  Precondition: high > low > 0
   */
  public static int getRandomBetween(int low, int high)
  {
    return -1;
  }

  /**  Count how many random ints between 1 and 6 (inclusive) you have to generate to get the value 4 100 times.
   *
   *   @return int The number of times you generated a random int between 1 and 6 to get the value 4 100 times.
   */
  public static int hundred4()
  {
    return -1;
  }

  /**  Count how many times it takes to get the same value from generating 2 random numbers between 1 and 6 (inclusive)
   *
   *   @return int The number of times you generated two random ints between 1 and 6 before getting the same value for both
   */
  public static int doubles()
  {
    return -1;
  }

  /**  Generaete a random int between 1 and 2 (inclusive) 100 times and identify which value occured the most times.
   *
   *  If there is a tie, then return 0
   *
   *   @return int The value that occured the most times after generating a random int between 1 and 2 inclusive) 100 times
   */
  public static int mode()
  {
    return -1;
  }

  /**  Isolate a random character from word. Each character in word should have an equal change of being isolated.
   *
   *   @param String word The string to get a random character from
   *   @return String a random character that occurs in word
   *
   *  Precondition: word.length() > 0
   */
  public static String randomLetter(String word)
  {
    return null;
  }

  /**  Swap two random characters in word with each other.
   *
   *  Example:
   *    swap("abcd") -> "cbad"
   *    swap("abcd") -> "acbd"
   *    swap("abcd") -> "adba"
   *
   *   @param String word The string to Swap two characters in
   *   @return String The value of word with 2 characters swapped
   *
   *  Precondition: word.length() > 1
   */
  public static String swap(String word)
  {
    return null;
  }

  /**  Scramble the letters in a string by swapping random characters 100 times
   *
   *   @param String word The string to scramble
   *   @return String The value of word with all the characters scrambled*
   *
   *  Precondition: word.length() > 1
   */
  public static String scramble(String word)
  {
    return null;
  }
}
