
#a1,b1,c1 = str(input("Please enter 3 words separated by a comma and the programm will print the first letter of each word: "))

# for i in a1,b1,c1:
#    print(course[0])


#word1=input("Enter first word")
#word2=input("Enter second word")
#word3=input("Enter third word")

# print(word1[0])
# print(word2[0])
# print(word3[0])

words = input("Enter three words: ")

for word in words.split():
    print(word[0])
