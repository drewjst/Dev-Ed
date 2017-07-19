## O(1) Constant
def func_constant(values):
    print(values[0])

## O(n) Linear
def func_lin(lst):
    for val in lst:
        print(val)

## O(n^2) Quadratic
def fun_quad(lst):
    for item_1 in lst:
        for item_2 in lst:
            print(item_1, item_2)

## Time & Space Complexity
def printer(n):
    for x in range(10): # Time Complexity O(n)
        print('Hello World!') # Space Complexity O(1)

# Find the bigger value of two inputs
def bigger(a,b):
    if a > b:
        return a
    else:
        return b
# Find the biggest value of three inputs
def biggest(a, b, c):
    return bigger(bigger(a,b), c)

# Define a procedure, print_numbers, that takes
# as input a positive whole number, and prints 
# out all the whole numbers from 1 to the input
# number.

# Make sure your procedure prints "upwards", so
# from 1 up to the input number.
def print_numbers(n):
    i = 1
    while i < n:
        print(i)
        i = i + 1
