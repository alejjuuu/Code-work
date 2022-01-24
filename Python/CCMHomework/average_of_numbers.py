# this program will create an empty list and ask the user
# to input values to be put into the list
# calculate the average of the values in list
# list = strings
# 4 values

limit = int(input("how many numbers would you like to add up? "))
values = []  # create an empty list
for x in range(limit):
    # prompt user to enter a value
    values.append(input("Please enter an integer value: "))

    print(values)

sum = 0
# sum = values[0] + values[1] + values[2] + values[3] + values[4]
# print(sum)

for x in range(limit):
    sum = sum + int(values[x])  # accumulation sum += int(values[x])

    average = sum/limit
print(average)
