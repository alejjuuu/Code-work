'''
Luis Velasquez
CS 100 Section 004
HW 02, February 01, 2021

'''

# 1.	This question practices the use of a list method. Assign to the variable
#       grades a list of 10 letter grades from among 'A', 'B', 'C', 'D', and 'F'. For example:


# Write a Python expression that creates a list named frequency, in which the elements
# are the number of times each of the letters A, B, C, D and F appear in grades. 
# Your expression must give the correct values for any list of grades, not just the one in
#your list. Hint: use the list method count.

grades = ['B','C','D','A','F','F','A','C','A','B']
frequency = []

for x in grades:
    letterA = grades.count('A')
    letterB = grades.count('B')
    letterC = grades.count('C')
    letterD = grades.count('D')
    letterF = grades.count('F')

frequency.append(letterA)
frequency.append(letterB)
frequency.append(letterC)
frequency.append(letterD)
frequency.append(letterF)

# print (frequency)
print('Frequency: ')
for i in frequency:
    print( i,end='')

   
print('\n_____________________________________\n')

#2.	This question practices list membership, list indexes and list slices.
#a.	Write a Python statement that creates a list named dog_breeds that contains
#       the elements 'collie', 'sheepdog', 'Chow', and 'Chihuahua' in the order given.

dog_breeds = ['collie','sheepdog','Chow','Chihuahua']


#b.	Write a Python statement that uses list slicing to create a list herding_dogs
#        that is made up of the first two elements of dog_breeds.

herding_dogs = dog_breeds [:3]

#c.	Write a Python statement that uses list indexing to create a list tiny_dogs
#        that is made up of the last element of dog_breeds.

tiny_dogs=[]
tiny_dogs.append(dog_breeds [-1])


#d.	Write a Python statement that tests whether 'Persian' is in the list dog_breeds
#        and prints either True or False depending on the answer.


if 'Persian' is not dog_breeds:
    print(True)
else:
    print(False)
