/**
 *  File name     :  whatIsItDoingAnswers.java
 *  Purpose       :  Practice interpreting Java code
 *  Author        :  A. Volosin
 *  Date          :  2019-01-22
 *  Description   :  An excercise lovingly adapted from Head First Java
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2019-01-22  A. Volosin     Initial writing and release
 */




int size = 10;                      //declare an integer variable, call it 'size', assign it a value of 10
String name = "Tinker";             //declare a string variable, call it 'name', assign value of "Tinker"  
Dog myDog = new Dog(name, size);    //declare a Dog variable, call it 'myDog', make the dog using 'name' and 'size'
x = size - 5;                       //subtract 5 from the value of 'size and assign it to a variable 'x
if (x < 15) myDog.bark(5);          //if x (5) is less than 15, tell the dog to bark 5 times

while (x > 3) {                     //continue looping if x is greater than 3
  myDog.runAround();                //if the above condition is true, tell the dog to 'runAround'
}                                   //end of the loop

int[] numList = {2,4,6,8};          //declare a list of integers, call it numList and put 2, 4, 6 and 8 in the list
System.out.print("Howdy");          //print "Howdy" to the command line
System.out.print("Dog: " + name);   //print "Dog: Tinker" to the command line
String num = "8";                   //declare a string variable, call it num, assign it a value of "8"
int z = Integer.parseInt(num);      //declare an integer variable, call it z, convert "8" into a number

try {                               //try to do the next thing in the curly brackets
  readTheFile("myFile.txt");        //read, or TRY to read a file called "myFile.txt"
}                                   //end of things to try
catch(FileNotFoundException ex) {   //do this if the thing you tried did not work, such as the file could not be found
  System.out.print("File not found.");  //print "File not found." to the command line
}                                   //this is the end of the things to do if the thing to try did not work
