import random

computerwins = 0
userwins = 0
counter = 0

while counter <= 9:
    computerdie = random.randint(1, 7)
    userdie = random.randint(1, 7)

    if computerdie > userdie:
        computerwins += 1
        print("Computer wins")
    elif userdie > computerdie:
        userwins += 1
        print("User wins")
    else:
        print("Tie")
    counter += 1

if computerwins > userwins:
    print("Computer Wins out of " + str(counter) + " games played")
elif computerwins < userwins:
    print("User Wins out of " + str(counter) + " games played")
else:
    print("Overall Tie")
