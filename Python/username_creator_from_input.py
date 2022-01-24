# username.py
# simple string processing program to generate usernames.

def main():
    print("This program generates computer usernames.\n")

    # get user's first and last names
    first = input("Please enter your first name (All lowercase): ")
    last = input("Please enter your last name (All lowercase): ")

    # concatenate first initial with 7 chats of the last name.
    uname = first[0] + last[:7]

    # output the username
    print("Your name is:", uname)


main()
