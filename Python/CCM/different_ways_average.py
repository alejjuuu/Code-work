#average2 python book

def main():
    total = 0.0
    count = 0
    moredata = "yes"

    while moredata[0] == "y":
        x =  float(input("Enter a number>>"))
        total = total + x
        count = count + 1
        moredata = input ("Do you have more numbers (yes or no)? ")
    print("\n The average of the numbers is", total / count)

main()


#average 3 python book

def main():
    total = 0.0
    count = 0
    x = float(input("Enter a number (negative to quit) >>"))
    while x >= 0:
        total = total + x
        count = count + 1
        x = float(input("Enter a number (negative to quit) >>"))
    print("\nThe average of the numbers is", total/ count)
main()


# average 4

def main():
    total = 0.0
    count = 0
    xStr = input("Enter a number (<Enter> to quit) >>")
    while xStr != "":
        x = float(xStr)
        total = total + x
        count = count + 1
        xStr = input("Enter a number(<Enter> to quit) >> ")
    print("\nThe average of the numbers is ", total/count)
main()

#average 5 

def main():
    fileName = input("What file are the numbers in?")
    infile = open(fileName,'r')
    total = 0.0
    count = 0
    for line in infile:
        total = total + float(line)
        count = count + 1
    print("\n The average of the numbers is", total/count)
main()

#average 6

def main():
    fileName = input("What file are the numbers in?")
    infile = open(fileName,'r')
    total = 0.0
    count = 0
    line = infile.readline()
    while line != "":
        total = total + float(line)
        count = count + 1
        line = infile.readline()
    print("\n The average of the numbers is", total/count)
main()



#average 7

def main():
    fileName = input("What file are the numbers in?")
    infile = open(fileName,'r')
    total = 0.0
    count = 0
    line = infile.readline()
    while line != "":
        #update total and count for values in line
        for xStr in line.slit(","):
            total = total + float(xStr)
            count = count + 1
        line = infile.readline()
    print("\n The average of the numbers is", total/count)
main()
