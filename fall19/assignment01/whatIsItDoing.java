/**
 *  File name     :  whatIsItDoing.java
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




int size = 10;                      //declare an integer variable, call it 'size' and assign it a value of 10
String name = "Tinker";             //  
Dog myDog = new Dog(name, size);    //
x = size - 5;                       //
if (x < 15) myDog.bark(5);          //

while (x > 3) {                     //
  myDog.play();                     //
}

int[] numList = {2,4,6,8};          //
System.out.print("Howdy");          //
System.out.print("Dog: " + name);   //
String num = "8";                   //
int z = Integer.parseInt(num);      //

try {                               //
  readTheFile("myFile.txt");        //
}                                   //
catch(FileNotFoundException ex) {   //
  System.out.print("File not found.");  //
}                                   //
