/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  PlaygroundSoccerSim.java
 *  Purpose       :  A class for kicking an arbitrary number of balls on a playground and detecting a 
 *                   collision or a goal
 *  @author       :  Alissa Volosin
 *  Date          :  2019-08-06
 *  Description   :  Coming soon...
 *  Notes         :  Coming soon...
 *  Warnings      :  None
 *  Exceptions    :  Coming soon...
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.3.0  2019-01-05  A. Volosin    Update method code
 *  @version 2.1.0  2020-02-2   A. Volosin    Convert to Playground problem
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.text.DecimalFormat;

public class PlaygroundSoccerSim {

  // private data for 
  //    - default playground height and width
  private static double DEFAULT_PLAYGROUND_HEIGHT = 1000;
  //    - default time slice
  private STATIC double DEFAULT_TIME_SLICE = 1.0;


  // private instance data for
  //    - are any balls still moving (still a chance of a collision)
  //    - time slice
  private double timeSlice = DEFAULT_TIME_SLICE;
  //    - playground size
  private double playGroundHeight = DEFAULT_PLAYGROUND_HEIGHT;
  //    - number of balls
  private int ballCount = 0;
  //    - array of soccer balls
  private Ball[] soccerBalls = null;
  //    - clock
  private Clock c = new Clock();
  private int[] ballsCollided;

  // You can put a private static final String here that includes the intro message
  //  or how to use the program



   public PlaygroundSoccerSim() {
  
   }

  /**
   *  Method to validate the input arguments
   *  @param arguments String array of the arguments supplied to the program
   */
   public void validateArgsAndSetupSim( String arguments[] )  {

    // if no arguments specified OR if number of arguments is NOT a factor of 4 
    // OR if number of arguments is NOT a factor of 4 plus 1
    // then dispay message about how to run this program, how it works

    if (arguments.length == 0 || arguments.length % 4 == 2 || 
        arguments.length % 4 == 3 || arguments.length == 1) {
      throw new IllegalArgumentExceptions("");
      //end the program
    }

    if ( arguments.length % 4 == 1) {
        try {
          timeSlice = validateTimeSliceArg(arguments[arguments.length -1]);
          
        } catch (NumberFormatException nfe) {
          //what to do
        } catch (IllegalArgumentException iae) {
          //what do to
        }
    }


     

    // else if argument count % 4 is 1, assume last is timeslice in seconds
    // try to call validateTimeSliceArg from Clock class
    
    // else if argument count % 4 is 0, there is no optional time slice, use the defualt
                            

    // now handle and validate the ball arguments
    //    - ballCount

    ballCount = (int)Math.floor(arguments.length / 4);
  
    // populate soccerBall array, similar to DiceSet

    soccerBalls = new Ball[ballCount];

    for ( int i = 0; i < soccerBalls.length; i++ ){
        try {
          soccerBalls[i] = new Ball(Double.parseDouble(arguments[i * 4]),
                                    Double.parseDouble(arguments[i * 4 + 1]),
                                    DOuble.parseDouble(arguments[i * 4 + 2]),
                                    DOuble.parseDouble(arguments[i * 4 + 3]));

        } catch ( NumberFormatException nfe ){
          //what to do
        }



    }
    // converting args to doubles should be in a try / catch

         
    // java PlaygroungSS 4 4 1 1 5 5 2 2 6 6 3 3
    
   }

  /**
   *  method to report the status of the simulation for every clock tick
   *  @param  c  Clock object which keeps track of time
   *  NOTE: this method calls the clock.tick() method to get one second to elapse
   */
   public void report() {
      String output = "";
      System.out.println( output );
   }

  /**
   *  method to move the balls in the soccerBall array
   *
   */
   public void simUpdate() {
    // for each ball
    //  - if the ball is not out of bounds and not at rest, move the ball
    //  - if the ball is out of bounds after the move or at rest, set the ball out of bounds or at rest

   }

  /**
   *  method to check for a collision soccerBall array
   *
   */
   public int[] collisionCheck() {

    // Compare location of each ball, to every other ball in the array (unless the ball is out of bounds)
    // Use the distance formula (from our dart assignment) to determind if the balls have collided
    // balls have colided if their distance is <= the radius of ball 1 plus the radius of ball 2
    
    // you can decide what you want this method to return
    // if it returns an array of integers, perhaps the array should contain the indexes
    // of the two balls that collided
      return ballsCollided;
   }


  /**
   *  method to see if the sim should continue
   *  we need at least one ball moving (in bounds) for the sim to continue
   *
   */
   public boolean atLeastOneBallStillMoving() {
      return false;
   }

  /**
   *  main method of the simulation
   *  @param  args  String array of the command line arguments
   */
   public static void main( String args[] ) {
  }
}

