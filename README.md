# Prototype CLI Demo

**IMPORTANT**: This is only for demonstration purposes. It does not contain anything related to OCSF or Hibernate.

There may also be quite a few mistakes. If you encounter them, feel free to send me an email.

## Running
Just run the goal `javafx:run`.

## Example of a possible sequence

**NOTE**: There are many ways to implement this type of functionality. This is only one of them, and anything that follow the instructions given to you by the lecturer will be completely fine.

```
Shell-> #list
Question 1: Select the first answer
1. Foo
2. Bar
3. Baz
4. Moo
Correct answer: 1.


Question 2: Who is the lecturer of our course?
1. Amir Tomer
2. Liel Fridman
3. Malki Grossman
4. Random cats on YouTube
Correct answer: 3.


Question 3: Complete the sentence: OCSF is..
1. A Turing machine implementation in Java
2. A framework for building client-server applications in Java
3. A framework for creating cat memes
4. A framework for messing with people's minds
Correct answer: 2.


Shell-> #set
ERROR: #set must havShell-> e EXACTLY 3 arguments: <id> <description/correctAnswer/answer id> <new content>

Shell-> #set 3 correctAnswer 4
Updated question 3:
Question 3: Complete the sentence: OCSF is..
1. A Turing machine implementation in Java
2. A framework for building client-server applications in Java
3. A framework for creating cat memes
4. A framework for messing with people's minds
Correct answer: 4.

Shell-> #set 1 description Select the third answer
Updated question 1:
Question 1: Select the third answer
1. Foo
2. Bar
3. Baz
4. Moo
Correct answer: 1.

Shell-> #set 1 correctAnswer 3
Updated question 1:
Question 1: Select the third answer
1. Foo
2. Bar
3. Baz
4. Moo
Correct answer: 3.

Shell-> #list
Question 1: Select the third answer
1. Foo
2. Bar
3. Baz
4. Moo
Correct answer: 3.


Question 2: Who is the lecturer of our course?
1. Amir Tomer
2. Liel Fridman
3. Malki Grossman
4. Random cats on YouTube
Correct answer: 3.


Question 3: Complete the sentence: OCSF is..
1. A Turing machine implementation in Java
2. A framework for building client-server applications in Java
3. A framework for creating cat memes
4. A framework for messing with people's minds
Correct answer: 4.


Shell-> 
```


**Good luck!**