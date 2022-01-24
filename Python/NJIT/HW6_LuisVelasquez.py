'''
Luis Velasquez
CS 100 Section 004
HW 06, February 18, 2021

'''

#1.
#a.	Write a function named hasFinalLetter that takes two parameters

#1.	strList, a list of non-empty strings
#2.	letters, a string of upper and/or lower case letters
# 	The function hasFinalLetter should create and return a list of
# 	all the strings in strList that end with a letter in letters.

def hasFinalLetter(strList,letters):
    newlist=[]
    for i in strList:
        if i[-1] in letters:
            newlist.append(i)
    return newlist

''' It was kind of hard'''    
    

#b.	Create three test cases, each consisting of a list of non-empty
#        strings and a string of upper and/or lower case letters, for your
#        function in Problem 1a. One of these tests should return the empty list.
#        For each test case write two assignment statements and a function call
#        that pass the test arguments to your function.


strList=["doggo","caT","three","andrea"]
letters=("Te amo")
print("Test case #1")
print(hasFinalLetter(strList,letters))


strList=["dog","cat","hey","andrea"]
letters=("pero")
print("Test case #2")
print(hasFinalLetter(strList,letters))


strList=["awesome","cocodrille","new","apartment"]
letters=("no lo sabes")
print("Test case #3")
print(hasFinalLetter(strList,letters))

#2.	 
#a.	Write a function named isDivisible that takes two parameters
#1.	maxInt, an integer
#2.	twoInts, a tuple of two integers
# 	The function isDivisible should create and return a list of all the
# 	ints in the range from 1 to maxInt (not including maxInt) that are
# 	divisible of both ints in twoInts.

'''My first try
def isDivisible(maxInt,twoInts):
    newlist=[]
    for x in twoInts:
        if maxInt % x == 0:
            newlist.append(x)
        
    return newlist'''

'''my second try'''
def isDivisible(maxInt,twoInts):
    newlist = []
    for x in range(1,maxInt):                       #start/ stop/ step: in this case just the first two options
        if x % twoInts[0]==0 and x % twoInts[1]==0: # if any number between 1 and maxint is divisble by index of 0 and 1 
            newlist.append(x)                       # append it to the empty list 
    return newlist                                  # return the new list 


#b.	Create three test cases, each consisting of a value for maxInt and
#        a value for twoInts, for your function in Problem 2a. One of these tests
#        should return the empty list. For each test case write two assignment
#        statements and a function call that pass the test arguments to your function.

print(isDivisible(100,(5,10)))   #first start by calling the function,
                                 #then in parenthesis the value of the range in maxInt followed by a comma and the two int values of twoInts 
twoInts=(2,5)
print(isDivisible(2,twoInts))  

maxInt=(42)
twoInts=(7,2)
print(isDivisible(maxInt,twoInts))
