# Java Assessment: Factorial Calculator

## Problem Statement
For this assessment, you will write a Java program that calculates and prints the factorial for a number input by the user.

The factorial of a positive integer `num` is the product of all numbers in the range from 1 to `num`.

For example: `Factorial(4) = 1 * 2 * 3 * 4`, which gives the result of 24.

- **Input Format:** The user can input a value to be used in the calculation.
- **Output Format:** The program will output a single value showing the factorial of the number input by the user.
- **Constraints:**
    - The input value must be:
      - An integer
      - Positive
      - Between 1 and 10, inclusive


## Instructions

Update only the existing **Factorial.java** class in the starter code provided. Do not change the code in any other file provided.

- For prompts and other output to the console, use `this.printStream.print()` and NOT `System.out.println()`.

Update the existing `isInputNumberValid` method to accept a number from the user and test whether the number is valid.

- Write code to accept a number from the user and store the value in an instance variable `num`. 

  - Use an instance variable `scanner` to accept the input from the user.
- If the input value is valid, return the number input by the user (NOT the factorial of the number).
- In case of invalid input, print the following message to the console:
  - "Invalid entry. Please enter an integer between 1 and 10, inclusive."
  - Return -1

Update the existing `private void calculateFactorial` method to calculate and output the factorial of the number input by the user.

## Steps to Solve the Problem

### Step 1: Verify the Setup Requirements

* Java version 11 installed with the JAVA_HOME path variable
* An IDE with required plugins for Java 
* Git
* A GitHub account

### Step 2: Access GitHub Classroom and the Repository

1. Your instructor will provide a link for the assessment in GitHub Classroom.
2. Open the link and authorize access using your GitHub account.
3. Clone the repository to a local folder.
   - Instructions for working with GitHub repositories are provided in the Git and GitHub section of the course.
4. Open the project folder in your selected IDE.

### Step 3: Solve the Problem

Read the problem statement carefully to be sure you understand what the code is expected to do.

- You are encouraged to sketch out a flowchart, use pseudocode, or create class diagrams to plan out the code.

Open the indicated .java file on your computer. Make changes only to that file.

The .java file includes comments to indicate where you should add your code. 

* All new code must be added inside the placeholders provided. 
* Do not delete the placeholder comments.
* Do not change any existing code elsewhere in the project.
* Do not alter existing class names, interface names, method signatures, or attribute names.
* Use Java naming conventions for the code you create. 

The placeholders for your code will look like:

```java
//YOUR CODE STARTS HERE

//YOUR CODE ENDS HERE
```

All new code should be added **inside** these placeholders.

### Step 4: Submit Your Work

1. Code solutions to the problem statements and run the code in the local IDE to check it as you work.
2. Incrementally commit the changes to the repository, labeling each commit numerically (Commit1, Commit2, etc.).
   - The number of commits can be as high as necessary; commit as frequently as you wish.
3. Each commit will be tested automatically against the relevant test cases. Open the repository in GitHub to view the test results.
   - A checkmark indicates that a test passed.
   - An X indicates that the test failed.
4. If any test fails, return to the local code to make corrections or add more code, then recommit the changes.
5. When the code passes all tests, commit one more time, labeling the last commit as "final commit."
   - You may need to make a minor edit to the code, such as adding a comment, so that Git knows the code is different.
6. Copy the URL for the GitHub repository and submit it to the assessment page in Engage.
7. Your instructor may also ask you to submit a pull request on the repository.
