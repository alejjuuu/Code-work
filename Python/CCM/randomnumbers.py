import random
sum = 0
numList = []

for i in range(0, 5):

    x = random.randint(70, 100)
    numList.append(x)
    sum += x

print(numList, "main list here! ")
average = len(numList)
print(average, "average of the random numbers here")
#
numList.sort()
print(numList, "numbers sorted in incrementing order")

numList.reverse()
print(numList,  "numbers sorter in a reversed order")
