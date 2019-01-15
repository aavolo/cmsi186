#CMSI 186: Homework Assignment 01
##Calendars and Dates - Getting Familiar with Java

###Construct two classes for this assignment…

One class must be named CalendarStuff.java and the other must be named CountTheDays.java. There is a test harness, called CalendarStuffTester.java, along with an empty CalendarStuff.java template file located in my repo for homework01. There are also several files in that folder which show you how to do things like get command line arguments and do some logical and computational operations.

###For this homework, accomplish at a minimum the following activities:

Make method public static boolean isLeapYear( long year ), which returns returns true if and only if [iff] the specified year is a Leap Year. Make sure that you understand the definition for Leap Year!
Make method public static long daysInMonth( long month, long year ), which returns the number of days in the specified month.
Make method public static boolean isValidDate( long month, long day, long year ), which returns true iff the arguments constitute a valid date. [Some examples of invalid dates are 0/15/2010, 1/-5/2012, 2/29/1700, 3/32/2001, 4/31/2014, 5/1/-2000, 16/16/2009, dog/cat/fish, etc.]
Make method public static long daysBetween( long month0, long day0, long year0, long month1, long day1, long year1 ), which returns the absolute number of days between the two given dates. For example:

"daysBetween( 3, 1, 2000, 3, 1, 1999)" should return 366, and

"daysBetween( 3, 2, 1999, 5, 1, 2001)" should return 791

Make a complete program, CountTheDays, int its own class file which outputs the absolute number of days between two given dates. The dates will be specified via args[0] through args[5]. [As before, the order of the two dates is irrelevant.] This program will certainly make use of most, if not all, of the preceding methods.

###Notes:

In item 4, the order in which the dates are specified is irrelevant, but the order of the parts of the dates is specific and must be month first, day second, and year last.
The program in item 5 will be contained in its own class file called CountTheDays.java.
Submission Guidelines: Make a sub-directory in your repository as mentioned above, called homework01 and commit your source code into it. DON'T FORGET TO ADD A COMMIT COMMENT! You can commit as many times as you want, so commit early and commit often…
You should also make several other methods which will help do the operations you need for the methods listed. Check the template code to see what is there and fill in ALL the methods there.
