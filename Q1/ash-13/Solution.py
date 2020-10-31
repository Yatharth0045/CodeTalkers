# Python3 implementation of the approach  
  
# Function to return the  
# sum of digits of n  
def digitSum(n) : 
  
    sum = 0;  
    while (n > 0) : 
        sum += (n % 10);  
        n //= 10;  
  
    return sum;  
  
# Function that returns true  
# if n is palindrome  
def isPalindrome(n) :  
  
    # Find the appropriate divisor  
    # to extract the leading digit  
    divisor = 1;  
    while (n // divisor >= 10) : 
        divisor *= 10;  
  
    while (n != 0) : 
        leading = n // divisor;  
        trailing = n % 10;  
  
        # If first and last digit  
        # not same return false  
        if (leading != trailing) : 
            return False;  
  
        # Removing the leading and trailing  
        # digit from number  
        n = (n % divisor) // 10;  
  
        # Reducing divisor by a factor  
        # of 2 as 2 digits are dropped  
        divisor = divisor // 100;  
  
    return True;  
  
# Function that returns true if  
# the digit sum of n is palindrome  
def isDigitSumPalindrome(n) :  
  
    # Sum of the digits of n  
    sum = digitSum(n);  
  
    # If the digit sum is palindrome  
    if (isPalindrome(sum)) : 
        return True;  
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 56;  
  
    if (isDigitSumPalindrome(n)) : 
        print("Yes");  
    else : 
        print("No");  