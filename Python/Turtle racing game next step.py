#Luis Velasquez
#11/14/20
#turtle race game

import turtle
import random
import time

window = turtle.Screen()
window.bgcolor("light blue")
luis = turtle.Turtle()
luis.speed(50)
luis.penup()
luis.goto(-80,140)
luis.pencolor("navy")
luis.write("TURTLE RACE", font=("Arial", 30, "bold"))
luis.pencolor("black")
luis.goto(-120,120)
luis.pendown()
for x in range(15):

    luis.color("Blue")
    luis.right(90)
    luis.forward(150)
    luis.penup()
    luis.forward(20)
    luis.write(x)
    luis.backward(20)
    luis.pendown()
    
    luis.backward(150)
    
    luis.penup()
    luis.left(90)
    luis.forward(20)
    luis.pendown()
    

    print(x)

#finish line
gap_size = 20
finish_line=turtle.Turtle()
finish_line.shape("square")
finish_line.penup()

#white squares
finish_line.color ("white")
for i in range(4):
    finish_line.goto(190, (100 - (i * gap_size * 2)))
    finish_line.stamp()
    
for i in range(4):
    finish_line.goto(190 + gap_size,((140 - gap_size) - (i * gap_size * 2 )))
    finish_line.stamp()

#black squares
finish_line.color("black")
for i in range(4):
    finish_line.goto(190,(120 - (i * gap_size * 2)))
    finish_line.stamp()

for i in range(4):
    finish_line.goto(191 + gap_size,((120 - gap_size - (i * gap_size * 2))))
    finish_line.stamp()
    
#Turtle #1

luis=turtle.Turtle()
luis.color("red")
luis.shape("turtle")
luis.penup()
luis.goto(-140,100)

#Turtle #2

olivia=turtle.Turtle()
olivia.color("orange")
olivia.shape("turtle")
olivia.penup()
olivia.goto(-140,60)

#Turtle#3

alejandro=turtle.Turtle()
alejandro.color("black")
alejandro.shape("turtle")
alejandro.penup()
alejandro.goto(-140,20)

#Turtle#4

katelyn=turtle.Turtle()
katelyn.color("pink")
katelyn.shape("turtle")
katelyn.penup()
katelyn.goto(-140,-20)

time.sleep(1) #Pauses the game for 1 second

turtle=turtle.Turtle()
turtle.penup()
turtle.goto(-20,200)
turtle.pencolor("red")
turtle.write("GO", font=("Arial", 60, "bold"))

while luis.xcor() <=  180 and olivia.xcor() <=  180 and alejandro.xcor() <=  180 and katelyn.xcor() <=  180:
    #steps = random.randint(1,25)

    luis.forward(random.randint(1,25))
    
    olivia.forward(random.randint(1,25))

    alejandro.forward(random.randint(1,25))
    
    katelyn.forward(random.randint(1,25))

if luis.xcor() > olivia.xcor() and luis.xcor() > alejandro.xcor() and luis.xcor() > katelyn.xcor():
    luis.goto(-100,-200)
    luis.color("Red")
    luis.write("Luis red turtle wins", font=("Corbel", 30, "bold"))
    luis.goto(0,-250)
    for i in range(72):
        luis.right(5)
        luis.shapesize(2.5)

elif olivia.xcor() > luis.xcor() and olivia.xcor() > alejandro.xcor() and olivia.xcor() > katelyn.xcor():
    olivia.goto(-100,-200)
    olivia.color("orange")
    olivia.write("Olivia orange turtle wins", font=("Corbel", 30, "bold"))
    olivia.goto(0,-250)
    for i in range(72):
        olivia.right(5)
        olivia.shapesize(2.5)
    


elif alejandro.xcor() > luis.xcor() and alejandro.xcor() > olivia.xcor() and alejandro.xcor() > katelyn.xcor():
    alejandro.goto(-100,-200)
    alejandro.color("black")
    alejandro.write("Alejandro black turtle wins", font=("Corbel", 30, "bold"))
    alejandro.goto(0,-250)
    for i in range(72):
        alejandro.right(5)
        alejandro.shapesize(2.5)
    


elif katelyn.xcor() > luis.xcor() and katelyn.xcor() > olivia.xcor() and katelyn.xcor() > alejandro.xcor():
    katelyn.goto(-100,-200)
    katelyn.color("pink")
    katelyn.write("Katelyn pink turtle wins", font=("Cobel", 30, "bold"))
    katelyn.goto(0,-250)
    for i in range(72):
        katelyn.right(5)
        katelyn.shapesize(2.5)
  



