# Passing by Value vs Reference Lab

## Learning Goals

- Explore passing by value and passing by reference

## Instructions

In this lab, we are going to swap the values of two numbers to help us better
understand pass-by-value vs. pass-by-reference.

Consider the starter code below:

```java
public class Main {
    public static void main(String[] args) {
        int firstNumber = 2;
        int secondNumber = 5;

        System.out.println("Before swapping, firstNumber = " + firstNumber + " secondNumber = " + secondNumber);

        swap(firstNumber, secondNumber);

        System.out.println("After swapping, firstNumber = " + firstNumber + " secondNumber = " + secondNumber);
    }

    public static void swap(int firstNumber, int secondNumber) {
        // Write code here to swap the two values
    }
}
```

Our goal is to swap `firstNumber` and `secondNumber` so that the value of
`firstNumber` is 5 and the value of `secondNumber` is 2.

Let's try to first swap the values within the `swap()` method as is - using
primitive types for the variables. Check out what happens when you do that!

The output below should match your output:

```plainttext
Before swapping, firstNumber = 2 secondNumber = 5
After swapping, firstNumber = 2 secondNumber = 5
```

The values of firstNumber and secondNumber stayed the same. This is because
when we pass-by-value, we are only passing it a copy of the values. Can you
modify the code above to successfully swap the numbers? We want the following
output:

```plainttext
Before swapping, firstNumber = 2 secondNumber = 5
After swapping, firstNumber = 5 secondNumber = 2
```

Hint: Try moving the `int` variables up to the `Main` class and making them
private instance variables with getters and setters. Then try a `Main` object in
the `main()` method and passing the `Main` object to the `swap()` method.
