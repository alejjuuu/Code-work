#luis velasquez
#11.18.20

import turtle
import random
import math


window = turtle.Screen()
window.setup(500,500)
window.bgcolor("burlywood")
bob = turtle.Turtle()
bob.speed(100)
bob.shape("arrow")

def drawCircles():
    bob.color("white")
    bob.penup()
    bob.goto(0,-80)
    bob.pendown()
    bob.begin_fill()
    bob.circle(100)
    bob.end_fill()

    bob.color("black")
    bob.circle(100)
    bob.penup()
    bob.goto(0,-60)
    bob.left(90)
    bob.pendown()

    bob.color("black")
    bob.goto(0,-60)
    bob.begin_fill()
    bob.right(90)
    bob.circle(80)
    bob.end_fill()

    bob.color("deep sky blue")
    bob.penup()
    bob.goto(0,-40)
    bob.left(90)
    bob.pendown()
    bob.begin_fill()
    bob.right(90)
    bob.circle(60)
    bob.end_fill()

    bob.color("red")
    bob.penup()
    bob.goto(0,-20)
    bob.left(90)
    bob.pendown()
    bob.begin_fill()
    bob.right(90)
    bob.circle(40)
    bob.end_fill()

    bob.color("yellow")
    bob.penup()
    bob.goto(0,0)
    bob.left(90)
    bob.pendown()
    bob.begin_fill()
    bob.right(90)
    bob.circle(20)
    bob.end_fill()

drawCircles()




luis = turtle.Turtle()

def drawCross(pen, color, size, x, y):
  pen.pensize(3)
  pen.color(color)
  pen.penup()
  pen.goto(x-size,y-size)
  pen.pendown()
  pen.goto(x+size,y+size)
  pen.penup()
  pen.goto(x-size,y+size)
  pen.pendown()
  pen.goto(x+size,y-size)



        
def math1(distance):
    score = 0
    
    if distance >= 0 and distance <= 20:
        score = score + 10

    elif distance >= 21 and distance <= 40:
        score = score + 5

    elif distance >= 41 and distance <= 60:
        score = score + 3

    elif distance >= 61 and distance <= 80:
        score = score + 2

    elif distance >= 81 and distance <= 100:
        score = score + 1
    else:
        score = score + 0

    
    
    return score
total =0

for x in range(5):
    
    x = random.randint(-100,100)
    y = random.randint(-100,100)
    drawCross(luis,"black",10,x,y)
    distance = math.sqrt(x*x+y*y)
    total= total +(math1(distance))

luis.penup()
luis.goto(-20,150)
luis.pendown()
luis.write("Your total is:" + str(total))
luis.penup()
luis.goto(300,300)

