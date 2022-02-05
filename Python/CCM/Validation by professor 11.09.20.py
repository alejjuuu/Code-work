# validation
# ask the user to enter the value
# check if the value is valid
# if not, error and aks again
# 10 numbers is range of 1 to 20
# multiple times


moredata = "y"
while moredata == "y":
    counter = 1
    total = 0

    while counter <= 5:
        number = int(input("Enter a number between 1 and 20\n "))
        # invalid numbers are?

        while number > 20 or number < 1:
            print("invalid. try again")
            number = int(input("Enter a number between 1 and 20\n "))
        print(number, "is a valid input")
        counter = counter + 1
        total = total + number
    print("Your total was: " + str(total) + "\n")
    moredata = input("Enter y if there is more data: ")


#number= int(input("Enter a number between 1 and 20 "))
# invalid numbers are?

# if number >= 1 and number <= 20:
 #   print("valid")
# else:
 #   print("invalid")
