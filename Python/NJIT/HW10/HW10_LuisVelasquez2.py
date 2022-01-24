
'''
Luis Velasquez
CS 100 Section 004
HW 10, April 1, 2021

'''
'''
Problem 2
Write a function named initialLetters that takes one parameter, wordList –
a list of words. Create and return a dictionary in which each initial letter
of a word in wordList is a key and the corresponding value is a list of the words
in wordList that begin with that letter. There should be no duplicate words in any value in the dictionary.

For example, the following is correct output:
print(initialLetters(horton))
{'I': ['I'], 's': ['say'], 'w': ['what'], 'm': ['mean'], 'a': ['and']}
'''


def initialLetters(wordList):
    lst ={}                                 #empty list
    for word in wordList:                      #for loop   
        firstLetter = word[0]           #variable that stores the first letter
        if firstLetter not in lst:          #if the first letter is not in in lst 
            lst[firstLetter] = []           #create a string as key only if the first letter is a unique key 
        if word not in lst[firstLetter]:    #if the value of a key is empty, it appends the first unique word
            lst[firstLetter].append(word)
            
    return lst
            
            
horton = ['I', 'say', 'what', 'I', 'mean', 'and', 'I', 'mean', 'what', 'I', 'say']
print(initialLetters(horton))

