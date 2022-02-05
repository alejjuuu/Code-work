# futval_graph4

from graphics import *


def createLabeledWindow():
    window = GraphWin("Investment Grwth Chart", 320, 240)
    window.setBackground("white")
    window.setCoords(-1.75, -200, 11.5, 10400)
    Text(Point(-1, 0), '0.0K').draw(window)
    Text(Point(-1, 2500), '2.5K').draw(window)
    Text(Point(-1, 5000), '5.0K').draw(window)
    Text(Point(-1, 10000), '10.0K').draw(window)
    return window


def drwaBar(window, year, height):
    bar = Rectangle(Point(year, 0), Point(year+1, height))
    bar.setFill("green")
    bar.setWidth(2)
    bar.draw(window)


def main():
    print("This program plots the growth of a 10 year investment.")

    principal = float(input("Enter the initial pricipal: "))
    apr = float(input("Enter the annualized interest rate: "))

    win = createLabeledWindow()
    drawBar(win, 0, principal)
    for year in range(1, 11):
        principal = principal*(1+apr)
        drawBar(win, year, pricipal)

    input("Press <Enter> to quit.")
    win.close()


main()
