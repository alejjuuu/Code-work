
'''
Luis Velasquez
CS 100 Section 004
HW 11, April 20, 2021
'''

class Dog():
    species = str('canis familiaris') 

    def __init__(self,name,breed):
        self.name = name
        self.breed = breed 
        self.tricks = []

    def teach(self,trick):
        self.tricks.append(trick)
        print("{} knows {}".format(self.name, trick))

    def knows(self,trick):
        if trick in self.tricks:
            print("Yes, {} knows {}".format(self.name, trick))
            return True
        else:
            print("No, {} doesn't know {} ".format(self.name, trick))
            return False
            

    
'''
Problem 1
Write a class definition line and a one line docstring for the class Dog. Write an __init__ method for
the class Dog that gives each dog its own name and breed. Test this on a successful creation of a Dog object.
>>> import dog
>>> sugar = dog.Dog('Sugar', 'border collie')
>>> sugar.name
'Sugar'
>>> sugar.breed
'border collie'

'''

'''
Problem 2
Add a data attribute tricks of type list to each Dog instance and initialize it in __init__ to the empty list.
The user does not have to supply a list of tricks when constructing a Dog instance. Make sure that you test this successfully.
>>> sugar.tricks
[]

'''

'''
Problem 3
Write a method teach as part of the class Dog. The method teach should add a passed string parameter to tricks and
print a message that the dog knows the trick.
>>> sugar.teach('frisbee')
Sugar knows frisbee
'''

'''
Problem 4
Write a method knows as part of the class Dog. The method knows should check whether a passed string parameter
is in the dog’s list of tricks, print an appropriate message and return True or False.
>>> sugar.knows('frisbee')
Yes, Sugar knows frisbee
True
>>> sugar.knows('arithmetic')
No, Sugar doesn't know arithmetic
False
'''



'''
Problem 5
Create a class attribute species of type str to be shared by all instances of the class Dog and set its value to 'canis familiaris'.
The class attribute species should be defined within the class Dog but outside of any method.
>>> dog.Dog.species
'Canis familiaris'
>>> sugar.species
'Canis familiaris'
'''
