
'''
Luis Velasquez
CS 100 Section 004
HW 10, April 01, 2021

'''
''' 
Problem 3
Write a function named shareOneLetter that takes one parameter,
wordList – a list of words. Create and return a dictionary in which
each word in wordList is a key and the corresponding value is a list of
all the words in wordList that share at least one letter with that word.
There should be no duplicate words in any value in the dictionary.

For example, the following is correct output:
print(shareOneLetter(horton))
{'I': ['I'], 'say': ['say', 'what', 'mean', 'and'], 'what': ['say', 'what', 'mean', 'and'], 'mean': ['say', 'what', 'mean', 'and'], 'and': ['say', 'what', 'mean', 'and']}
'''

def shareOneLetter(wordList):
    lst ={}                         #empty list
    for word in wordList:               #first for loop
        if word not in lst:             #if the first word is not in the empty list then skip it otherwise create a new key 
            lst[word] = []                      
        for each_w in wordList:         # a neasted for loop 
            valid = 0                   # if the condition is true it will add up a one to the variable 
            for eachCh in each_w:       # for loop that takes each word and goes to each character 
                if (eachCh in word):        # if any character is in the initial word
                    valid = 1                 # valid becomes 1 
            if (each_w not in lst[word]) and (valid==1):    # if the word is not repeated and valid is == 1 then append it to the value of the key 
                lst[word].append(each_w)
    return lst

horton = ['I', 'say', 'what', 'I', 'mean', 'and', 'I', 'mean', 'what', 'I', 'say']
print(shareOneLetter(horton))
