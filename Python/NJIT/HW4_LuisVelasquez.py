'''
Luis Velasquez
CS 100 Section 004
HW 04, February 09, 2021

'''
# 1.	Write Python code that does the following:
# a.	Assigns the values 3, 4 and 5 to the variables a,
#       b and c, respectively.

# b.	Write an if statement that prints “OK” if a is less than b
# c.	Write an if statement that prints “OK” if c is less than b
# d.	Write an if statement that prints “OK” if the sum of
#       a and b is equal to c

# e.	Write an if statement that prints “OK” if the sum
#       of a squared and b squared equals c squared.

a,b,c=3,4,5

if a<b:
    print("OK")
if c<b:
    print("OK")
if a+b==c:
    print("OK")
if a**2 + b**2 == c**2:
    print("OK")

print("\n")

# 2.	Repeat the previous problem with the additional requirement that
# “NOT OK” is printed if the condition is false.
d=3
e=4
f=5

if d<e:
    print("OK")
if f<e:
    print("OK")
else:
    print("Not okay")
if d+e==f:
    print("OK")
else:
    print("Not okay")
if d**2 + e**2 == f**2:
    print("OK\n")

# 3.	Write a program that asks the user for a color, a line
# width, a line length and a shape. Assume that the user will
# specify a shape that is either a line, a triangle, or a square.
# Use turtle graphics to draw the shape that the user requests
# of the size, color, line width and line length that the user
# requests. For example, if these are the user choices for color,
# width, line length and shape, the blue triangle below would be
# correct graphical output

import turtle
import random

another ="Y"
while another =='Y':
    
    turtle_color = str(input("Please input your wished color? "))
    line_width = int(input("What line width? "))
    line_legth = int(input("What line length? "))
    turtle_shape =str(input("What shape do you want? \n \n line, triangle or square? ")).lower()

    alex=turtle.Turtle()
    alex.color(turtle_color)
    alex.goto(0,0)
    alex.speed(0)

    ran = random.randint(-200,200)

    if turtle_shape == "t":
        alex.penup()
        alex.goto(ran,ran)
        alex.width(line_width)
        alex.pendown()
        #alex.begin_fill()
        for i in range(3):
            alex.forward(line_legth)
            alex.left(120)
            alex.forward(line_legth)
        #alex.end_fill()

    if turtle_shape == "s":
        alex.penup()
        alex.width(line_width)
        alex.goto(ran,ran)
        alex.pendown()
        #alex.begin_fill()
        for i in range(4):
            alex.forward(line_legth)
            alex.right(90)
        #alex.end_fill()
        
    if turtle_shape == "l":
        
        alex.penup()
        alex.width(line_width)
        alex.goto(ran,ran)
        alex.pendown()
        alex.forward(line_legth)


    another = str(input("Another shape ? Y/N ")).upper()



