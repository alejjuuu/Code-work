def main():
    print("This program creates a file of usernames from a")
    print("file of names.")

    # get the file names
    infileName = input("what file are the names in? ")
    outfileName = input("What file should the usernames go in? ")

    # open the files
    infile = open(infileName, "r")
    outfile = open(outfileNme, "w")

    # process each line of the input file
    for line in infile:
        # get the first and last name from each line
        fisrt, last = line.split()

        # create the username
        uname = (first[0] + last[:7]).lower()

        # write it to the output file
        print(uname, file=outfile)

        # close both files
        infile.close()
        outfile.close()

        print("Usernames have been written to", outfileName)


main()
