'''
Luis Velasquez
CS 100 Section 004
HW 05, February 14, 2021

'''

# 1.	Create a list named months of the months of the year.
# Write a for loop that iterates over the elements of months and
# prints out each one that begins with letter 'J', one month per line.

months= ["January",'February','March','April','May','June','July','August','September','Octuber','November','December']

#first option 
for j in months:
    if "J" in j:
        print(j)
# second option
for i in range(len(months)):
    if months[i][0] == 'J':
        print(months[i])

# 2.	Write a for loop that iterates over all of the integers in
# the range 0 through 99, inclusive, and prints out all of those numbers
# that are divisible by both 2 and 5.

for numbers in range(0,100):
    #print(numbers, end="")

    if numbers%2 == 0 and numbers%5==0:
        print(numbers)

# 3.	Consider the strings created by these assignment statements:
# 	horton = "A person's a person, no matter how small."
#       vowels = "aeiouAEIOU"
#  	Write a for loop that prints out all the vowels in horton in the order
# 	they appear in horton.

horton = "A person's a person, no matter how small."
vowels = "aeiouAEIOU"

for vwl in range(len(horton)):
    if horton[vwl] in vowels:
        print(horton[vwl])
