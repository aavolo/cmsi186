/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Ball.java
 *  Purpose       :  A class for a single ball that has a location and speed.
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

// Use to format string output of location and speed doubles
import java.text.DecimalFormat;

public class Ball {

   // Private class wide data
       private static final double BALL_RADIUS = 4.45; // radius in inches as given by the problem
       private static final double FRICTION_COEFFICIENT = .99; // one percent slowdown per second due to friction
       private static final int X_INDEX = 0; // index of X values within location and speed arrays
       private static final int Y_INDEX = 1; // index of Y values within location and speed arrays

   // Private instance data
       private boolean outOfBounds = false; // all balls will start in bounds by default
       private boolean atRest = false; // all balls will start moving by default
       private double[] ballLocation = new double[2];// array containing both coordinate values
       private double[] ballSpeed = new double[2];// array containing both direction speed values

  /**
   * Constructor to make a new Ball
   *  @param xLoc double-precision value of the X location of the ball
   *  @param yLoc double-precision value of the Y location of the ball
   *  @param xSpeed double-precision value for the initial speed of the ball in X direction
   *  @param ySpeed double-precision value for the initial speed of the ball in Y direction
   */
   public Ball( double xLoc, double yLoc, double xSpeed, double ySpeed ) {
      // To create an instance of a ball, set the private instance data equal to argument values
      ballLocation[X_INDEX] = xLoc;
      ballLocation[Y_INDEX] = yLoc;
      ballSpeed[X_INDEX] = xSpeed;
      ballSpeed[Y_INDEX] = ySpeed;

   }

  /**
   *  method to fetch the current speed of the ball
   *  @return  double-precision two-element array of X and Y speed values
   */
   public double[] getSpeed() {
      return ballSpeed;
   }

   public double getSpeed( String xy ) {
      if ( xy.equals("x") || xy.equals("X ")) {
        return ballSpeed[X_INDEX];
      }
      // else if... equals y
      // else... throw exception

   }

  /**
   *  method to fetch the current position of the ball
   *  @return  double-precision two-element array of X and Y location values
   */
   public double[] getPosition() {
      return ballLocation;
   }

  /**
   *  method to flag the ball as "is still moving"
   *  @return  boolean true if ball is moving, false if at rest
   *  @note    at rest is defined as speed <= 1.0 inch/second
   */
   public boolean isStillMoving() {
      return false;
   }


  /**
   *  method to flag the ball as "out of bounds" which will set its speed to zero and its
   *    "outOfBounds" value to true so it will effectively no longer be in the simulation
   *  @param playgroundWidth    double-precision value of 1/2 the designated playground width
   *  @param playgroundHeight   double-precision value of 1/2 the designated playground height
   */
   public boolean isBallOutOfBounds( double playgroundWidth, double playgroundHeight ) {
      //Check to see if ball is out of bounds given a playground size

      // Set out of bounds private instance data
     

      // Decrease Speed to 0
      return false;
   }

  /**
   *  method to update the speed of the ball for one slice of time
   *  @param timeSlice     double-precision value of time slace for simulation
   *  @return  double-precision two element array of new velocity values
   */
   public double[] updateSpeedsForOneTick( double timeSlice ) {
      // Update x index of ballSpeed
      // Update y index of ballSpeed
      return ballSpeed;
   }

  /**
   *  method to update the ball's position and velocity
   *  @param timeSlice     double-precision value of time slace for simulation
   */
   public void move( double timeSlice ) {
      // Update x index of ballLocation
      // Update y index of ballLocation
      // Update ballSpeed for one tick given the timeslice parameter
   }

  /**
   *  "toString()" representation of this ball
   *  @return  String-y version of what this Ball is
   */
   public String toString() {
      // Use to format ball location
      DecimalFormat dfl = new DecimalFormat( "#0.00");

      // Use to format speed
      DecimalFormat dfs = new DecimalFormat( "#0.0000" );

      //  location and speed
      // OR
      //  Out of bounds
      // OR
      // at rest
      
      return "ball as a string";
   }

  /**
   * a main method for testing -- pretty simple
   *  @param args[] String array of command line arguments
   */
   public static void main( String args[] ) {
      System.out.println( "\n   Testing the Ball class................" );
      Ball b1 = new Ball( 10.0, 50.0, 2.0, 6.0 );
      
      System.out.println( "Ball b1: " + b1.toString() );
      System.out.println();
      b1.move( 1.0 );
      
      
   }

}
