
'''
Luis Velasquez
CS 100 Section 004
HW 08, February 28, 2021

'''
'''
 

Problem 4

Implement the GuessNumber game. In this game, the computer

•	Think of a random number in the range 0-50. (Hint: use the random module.)

•	Repeatedly prompt the user to guess the mystery number.

•	If the guess is correct, congratulate the user for winning. If the guess is incorrect, let the user know if the guess is too high or too low.

•	After 5 incorrect guesses, tell the user the right answer.

The following is an example of correct input and output.

I'm thinking of a number in the range 0-50. You have five tries to guess it.

Guess 1? 32

32 is too high

Guess 2? 18

18 is too low

Guess 3? 24

You are right! I was thinking of 24!


'''
import random
def GuessNumber():
    randomNum = random.randint(0,50)
    tries = 0
    counter = 1
    guess = 0
    print("I'm thinking of a number in the range 0-50. You have five tries to guess it")
    while tries != 5:
        tries += 1
        guess = int(input("Guess " + str(tries)+ "? "))
        if randomNum != guess:
            counter += 1
        if guess > randomNum:
            print(guess , (str("Is too high")))
        if guess < randomNum:
            print(guess , "Is too low")
        if guess == randomNum:
            print("You are right! I was thinking of ",guess)
            break
    else:
        print("You have lost the game :(")
        

    
    
    
    
    
