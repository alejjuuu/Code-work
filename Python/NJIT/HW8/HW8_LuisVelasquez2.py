
'''
Luis Velasquez
CS 100 Section 004
HW 08, February 28, 2021

'''
'''
 

Problem 2

Write a function named twoWordsV2 that has the same specification as Problem 1,
but implement it using while and not using break. (Hint: provide a different boolean condition for while.)

Since only the implementation has changed, and not the specification, for a given
input the output should be identical to the output in Problem 1.

'''

def twoWordsV2(length,firstLetter):
    newList=[]
    firstWordlen=""
    secondWord=""
    
    while firstWordlen != length:
        firstWord = input("Please input a "+ str(length) + " -letter word please: ")
        firstWordlen = len(firstWord)
        if firstWordlen == length:
            newList.append(firstWord)

    while secondWord != firstLetter:
        secondWord = input(str("Enter a word beginning with " + firstLetter.lower() + " please :"))
        if secondWord[0].lower() == firstLetter.lower():
            newList.append(secondWord)
            return (newList)

