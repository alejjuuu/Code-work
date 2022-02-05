fruits = {"apples": 2, "bananas":4, "grapes": 12}
#dictionary name is fruits
#keys are fruit
#value is the number of each fruit
print(fruits)

for key in fruits:
    print(key,fruits[key])
print(fruits.items())
fruits["bananas"] = 2 #change value for key bananas
print(fruits)
fruits["pears"] = 3 #adding a key value pair for pears
print(fruits)
fruits["apples"] = 0 #change value for key apples
del fruits ["apples"] #remove from the dictionary
print(fruits)

