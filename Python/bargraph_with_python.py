# Luis Velasquez
# 11.22.20
# drawbars program

import turtle


def userinput(value):

    value = int(
        input("Enter 8 values individually between 0 and 300 that you want to graph: "))

    return value


def drawBar(t, height, linecolor, fillcolor):
    t.color(linecolor)
    t.fillcolor(fillcolor)
    t.penup()
    t.sety(-20)
    t.pendown()
    t.penup()
    t.sety(0)
    t.pendown()
    t.begin_fill()
    t.left(90)
    t.forward(height)
    t.write(str(height))
    t.right(90)
    t.forward(40)
    t.right(90)
    t.forward(height)
    t.left(90)
    t.end_fill()
    t.penup()
    t.forward(3)
    t.pendown()


inputx = ()
barlist = []
for x in range(7):
    xvalue = int(userinput(inputx))
    if xvalue > 0 and xvalue < 300:
        barlist.append(xvalue)
        barlist.sort()    # I sorted my list
        print(barlist)
    else:
        print("Not a valid number")


bob = turtle.Turtle()
bob.penup()
bob.goto(-100, 0)
bob.pendown()
for ch in barlist:
    drawBar(bob, ch, "red", "yellow")
