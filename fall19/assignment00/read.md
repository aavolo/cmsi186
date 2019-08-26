
# CMSI 186: Homework Assignment 00
## Hello World!
## Due on Wednesday 08.28.19

### Summary

The purpose of this assignment is to get your java environment up and running and to write, compile and run your first program. You will also set up your GitHub which will be your primary means of submitting your assignments.


### Requirements:

1. Present your working Java setup to the instructor or a TA at the beginning of class on the due date
2. Use Brightspace to submit your GitHub username/ID.
3. Use Brightspace to submit your Slack username/ID.
3. Submit your working helloWorld.java file on Github.

*If your program does not compile, you will recieve a 0 on the assignment.*

### Installing Java Programs
#### Downloading Software (PC only)

1. Download Java.
2. Accept the agreement and choose the latest version for your operating system.

#### Install Software (PC only)

1. Open your downloaded software file and proceed with the installation. Note where you save your files.
2. Set your Environment Variables using this tutorial from Oracle

#### Confirm Installation
1. Open the command prompt,  type 
      ``` java
      %java -version
      ```

### Get a Text Editor
For this class you will use a text editor to write and edit code. I recommend using something like Sublime text that will color the syntax of your code based on the language you are using.
- Sublime Text
- Notepad++
- Atom
- TextPad
- ❗ IDE's can be dangerous!
    - An "IDE" is an Integrated Development Environment. Instead of just a text editor, it is a set of tools that all work together including a text editor, a compiler, build or make integration, debugging, etc. Sounds great but the IDE can modify your code when it compiles or runs. This means, what works in your IDE, may not work when I compile and run your java in the command prompt. If you choose to use an IDE, ALWAYS run your code in the command prompt.

### Edit, Compile and Run a Java Program
#### Edit
1. Make a directory on your computer for your assignment00
2. Copy and paste this code into your editor
``` java
public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World!");
    } 
}
```

3. Save the file with the name "helloWorld.java" into your assignment00 directory. 

#### Compile
1. In the command prompt, navigate to the directory in which you saved “helloWorld.java” (hint: use the cd command)
2. Compile your program
    ``` java
    %javac HelloWorld.java
    ```

#### Run
1. Run your program
    ``` java
    %java HelloWorld
    ```

### GitHub
1. Create a GitHub account. Set up your account profile however you want, but remember that this account is likely going to be used for your entire LMU career (and beyond) so think before you name your account (try your first initial with your last name or a favorite, appropriate nickname). Mine is aavolo.
2. Create a repository for this class. Try naming it something like cmsi186. This should be a private repository so as not to share answers with the rest of the class. You will then add me (aavolo) as a collaborator so that I can see your files and upload your grades to your assignments. 
3. Read GitHub documentation to find out how to create a directory (or sub-directory, also called "folders") in your repo, then create one for this assignment named "assignment00". 
4. Drag and drop your helloWorld.java to the directory, then commit (save) the file for evaluation.
5. Submit your GitHub account name on Brightspace.

### Slack
1. Create a Slack account using your LMU email. Our domain is lmucs.slack.com.
2. Submit your Slack name on Brightspace

### Reading
1. Start the Java Tutorials. Read Getting Started and Learning the Java Language at https://docs.oracle.com/javase/tutorial/  
2. Read Chapter 2 in Java in a Nutshell

