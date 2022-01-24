
'''
Luis Velasquez
CS 100 Section 004
HW 08, February 28, 2021

'''
'''
 

Problem 3

Write a function named enterNewPassword. This function
takes no parameters. It prompts the user to enter a password
until the entered password has 8-15 characters, including at least
one digit. Tell the user whenever a password fails one or both of these tests.

'''

def enterNewPassword():
    while True:
        password = input("Please input your password: ")
        digit = False
        for number in password:
            if (number.isdigit()):
                digit=True
        character = False
        if (len(password)) >= 8 and (len(password)) <=15:
            character = True
        
        if digit and character == True: 
            print("good password!")
            break
        else:
            print("Please try again! ")
        
        
    
