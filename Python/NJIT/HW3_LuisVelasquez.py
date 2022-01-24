'''
Luis Velasquez
CS 100 Section 004
HW 03, February 03, 2021

'''

# 1.	Write code that uses turtle graphics to draw an equilateral
# triangle, a square and a regular pentagon, each with side length 100.

import turtle
bob = turtle.Turtle()
bob.shape("turtle")
bob.speed(0)
#bob.bgcolor("blue")
bob.fillcolor("red")
bob.penup()
bob.goto(-320,200)
bob.pendown()
bob.begin_fill()

for i in range(3):
    bob.forward(100)
    bob.left(120)
    
bob.end_fill()
bob.penup()
bob.goto(-200,200)
bob.fillcolor("blue")
bob.begin_fill()
bob.pendown()

for x in range(4):
    bob.forward(100)
    bob.left(90)

bob.end_fill()
bob.penup()
bob.goto(-60,200)
bob.fillcolor("yellow")
bob.begin_fill()
bob.pendown()

for p in range(5):
    bob.forward(100)
    bob.left(72)

bob.end_fill()



# 2.	Write code that uses turtle graphics to draw four concentric
# circles of radius 50, 100, 150 and 200.

sophie = turtle.Turtle()
sophie.speed(0)
sophie.penup()
sophie.goto(0,-200)

sophie.setposition(0,-200)
sophie.pendown()
sophie.circle(50)
sophie.right(90)
sophie.penup()

sophie.fd(50)
sophie.left(90)
sophie.pendown()
sophie.circle(100)
sophie.penup()

sophie.rt(90)
sophie.fd(50)
sophie.left(90)
sophie.pendown()
sophie.circle(150)
sophie.penup()

sophie.rt(90)
sophie.fd(50)
sophie.left(90)
sophie.pendown()
sophie.circle(200)
sophie.penup()





# 3.	Write code that uses the Python math module to compute and
# print out the values of
# a.	100!
import math
threeb=(math.factorial(100))
print("\n100!= \n",threeb)

# b.	the log (base 2) of 1,000,000

print("\nLog base2 of 1000000=")
print(math.log2(1000000))

# c.	the greatest common divisor of 63 and 49


print("\nGreatest common divisor=")
print (math.gcd(63,49))

