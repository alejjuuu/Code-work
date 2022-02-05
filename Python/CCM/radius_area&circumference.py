import math


def calcarea(rad):
    return math.pi * rad**2


def calccircumference(rad):
    return math.pi * 2 * rad


radius = float(input("Enter the radius: "))
print("Total area")
print(round(calcarea(radius), 2))
print("Total circumference")
print(round(calccircumference(radius), 2))
