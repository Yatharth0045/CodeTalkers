# Questions

#### Note: You can use any programming language of your choice to provide the solution 

### Sample Question : For Demo purpose

Print Hello World

### Q1 Sum of Digit is Pallindrome or not 

Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not. <br />
Note: A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.

### Q2 Add two fractions
You are given four numbers num1, den1, num2, and den2. You need to find (num1/den1)+(num2/den2) and output the result in the form of (numx/denx). 

### Q3 Print the pattern
You a given a number N. You need to print the pattern for the given value of N. <br />
for N=2 the pattern will be <br />
```
2 2 1 1
2 1
```
for N=3 the pattern will be 
```
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
```

### Q4 Armstrong Number
For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No". <br />
NOTE: 371 is an Armstrong number since (3)^3 + (7)^3 + (1)^3 = 371

### Q5 Factorial

Given a positive integer, N. Find the factorial of N.

### Q6 Perfect Numbers

Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

Input: <br />
N = 6 <br />
Output: <br />
1  <br />
Explanation: <br />
Factors of 6 are 1, 2, 3 and 6. <br />
Excluding 6 their sum is 6 which is equal to N itself. So, it's a Perfect Number.

### Q7 Sieve of Eratosthenes

Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.  

Input: <br />
N = 10 <br />
Output: <br />
2 3 5 7 <br />
Explanation: <br />
Prime numbers less than equal to N  <br />
are 2 3 5 and 7.

### Q8 Sum of all prime numbers between 1 and N. 

Given a positive integer N, calculate the sum of all prime numbers between 1 and N(inclusive).


### Q9 Find a duplicate in an array.  

Given an array of n + 1 integers between 1 and n, find one of the duplicates. If there are multiple possible answers, return one of the duplicates. If there is no duplicate, return -1.

Example: <br />
Input: [1, 2, 2, 3] <br />
Output: 2 <br />
Input: [3, 4, 1, 4, 1] <br />
Output: 4 or 1

### Q10 N people in a circle with a gun

Given N people standing in a circle in an order 1 to N. No. 1 has a gun. He kills the next person (i.e. No. 2) and gives the gun to the next (i.e. No. 3). All people do the same until only 1 survives. 

Write a program to tell which number survives at the last?

Note: There are N people starting from 1 to N.

Example <br /> 
Input: Number of people in circle: N=10 <br />
Output: 5

Explanation:

Here, we can define an array with 10 elements with values from 1 to 10.

 - No.1 has a gun. He kills next person (i.e. no. 2) and gives gun to next to next (i.e no. 3). We have taken array element as a person. 1st person kills the next. So, starting from 1, we’ll remove next element i.e. 2.
 - Then first person gives gun to next to next i.e. 3. That person will also kill next person and this continues. Means, in array, we need to start with 1 and remove the every other (alternate) element till 10. (all the even numbers will be removed and we’ll be left with odd numbers only in array).

Initially: 1 2 3 4 5 6 7 8 9 10 <br />
Round 1: 1 3 5 7 9 <br />
Round 2: 1 5 9 <br />
Round 3: 5 

### Q11 Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

Example 1 <br /> 
Input: arr[]   = {2, 0, 2} <br /> 
Output: 2 <br /> 
Explanation: <br /> 
We can trap 2 units of water in the middle gap. <br /> 
The structure is like below <br /> 

```

    #   #
    #   #
    - - -    

```

Example 2 <br />
Input: arr[]   = {3, 0, 2, 0, 4} <br />
Output: 7 <br />
Explanation: <br />
We can trap "3 units" of water between 3 and 2, "1 unit" on top of bar 2 and "3 units" between 2 and 4. <br />
Structure is like below <br />

```

            #
    #       #
    #   #   #
    #   #   #
    - - - - -

```

Example 3 <br />
Input: arr[] = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] <br />
Output: 6 <br />
Explanation: <br />
Trap "1 unit" between first 1 and 2, "4 units" between first 2 and 3 and "1 unit" between second last 1 and last 2. <br />
The structure is like below <br />

```

                  #  
          #       # #   #
      #   # #   # # # # # #  
    - - - - - - - - - - - -

```

### Q12 Leaders in an array  

Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. <br />
Let the input array be arr[] and size of the array be size. <br />

Example: <br />
Input: [16, 17, 4, 3, 5, 2] <br />
Output: 17, 5, 2 
