import random

numList=[]

for i in range(0,7):
    celsius = random.randint(0,100)
    numList.append(celsius)

    fahrenheit = 9/6 * celsius + 32

    print("The temperature is", fahrenheit, "degrees Fahrenheit, or", celsius, "degrees celsius")


