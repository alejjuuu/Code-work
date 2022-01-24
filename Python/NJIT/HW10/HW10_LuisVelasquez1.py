
'''
Luis Velasquez
CS 100 Section 004
HW 10, April 01, 2021

'''
'''
Problem 1
Write a function named initialLetterCount that takes one parameter, wordList — a list of words.
Create and return a dictionary in which each initial letter of a word in wordList is a key and
the corresponding value is the number of words in wordList that begin with that letter. The keys
in the dictionary should be case-sensitive, which means 'a' and 'A' are two different keys.
For example, the following is correct output:
horton = ['I', 'say', 'what', 'I', 'mean', 'and', 'I', 'mean', 'what', 'I', 'say']
print(initialLetterCount(horton))
{'I': 4, 's': 2, 'w': 2, 'm': 2, 'a': 1}

'''
def initialLetterCount(wordList):
    lst={}
    for word in wordList:
        firstLetter = word[0]
        if firstLetter in lst:
            lst[firstLetter]+=1
        else:
            lst[firstLetter] =1

    return lst
    
#horton = ['I', 'say', 'what', 'I', 'mean', 'and', 'I', 'mean', 'what', 'I', 'say']
#print(initialLetterCount(horton))
