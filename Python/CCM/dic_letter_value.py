score = {"a": 1, "c": 3, "b": 3, "e": 1, "d": 2, "g": 2,
         "f": 4, "i": 1, "h": 4, "k": 5, "j": 8, "m": 3,
         "l": 1, "o": 1, "n": 1, "q": 10, "p": 3, "s": 1,
         "r": 1, "u": 1, "t": 1, "w": 4, "v": 4, "y": 4,
         "x": 8, "z": 10}
# ask the user to input a word
# convert the work to lowercase
# for loop to extract each character from the word


word = input("Insert a letter: ").lower()
#word = word.lower()
sum = 0  # create sum and initialize to accumulate the total for the word

for ch in score:
    # print(ch, end='')  # (,end='') to print right next to each other
    value = score[word]
    # print(value)

sum += value  # sum = sum + value
print('The word', word, 'is worth', sum, 'points')
