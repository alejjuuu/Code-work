# class 11.09.20
# homework

# diver scoring program
moredata = "y"
#totalaverage = 0

while moredata == "y":
    counter = 1
    total = 0
    # ask for name *
    diver_name = str(input("Please input the diver's name: "))
    # ask for city *
    diver_city = str(input("Please input the diver's city: "))

    # read 5 scores
    while counter <= 3:

        # the code doesn't go further from here

        score = float(
            input("Enter the score given by judge #" + str(counter) + ": "))
        # validate between 0 and 10
        while score > 10 or score < 0:
            print("Invalid score - please reenter (Valid range: 0-10)")
            score = float(
                input("Enter the score given by judge #" + counter + ": "))

        counter = counter + 1
        total = score + total

        # find the highest and lowest*

        min = 11
        max = -1
        if (min > total):
            min = total
        if (max < total):
            max = total

        # read degree of difficulty
    degree = float(input("What is the degree of difficulty? "))
    # validate between 1.2 and 1.67
    while degree < 1.2 or degree > 1.67:
        print("Invalid degree of difficulty - Please reenter (Valid Range: 1- 1.67) ")
        degree = float(input("What is the degree of difficulty? "))

        # calculation: (total - highest - lowest)/3* degree  *
        # print name, city, finalscore *

    print("Diver: " + diver_name + " who lives in city " + diver_city)
    totalaverage = (total-min-max)*degree/3
    print("average score of all divers: " + str(totalaverage))
    moredata = input("do you want to process another diver (Y/N)? ")


# print event summary
#print("Number of divers participating: " + str(counter)+"\n")
#print("average score of all divers: " + str(totalaverage))
