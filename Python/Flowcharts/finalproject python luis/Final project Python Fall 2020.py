#    Python Final Project Shooping List app
#    Luis Velasquez
#    CMP 228
#    12/16/20

import sys
# I imported sys module
#to use the sys.exit() function at the end

people={
"andreu": {
            'budget':0,
            'Halo 3': 0,
            'Database Book': 0,
            'Gamer Desktop': 0,
            'completion status': 'incomplete'},

"andrea": { 
            'budget':0,
            'roses': 0,
            'pajama': 0,
            'monitor': 0,
            'completion status': 'incomplete'},
"katherin": { 
            'budget':0,
            'pills antistress': 0,
            'accounting book': 0,
            'scarf': 0,
            'completion status': 'incomplete'},
"luis": { 
            'budget':0,
            'medical bills': 0,
            'doctors bill': 0,
            'ambulance': 0,
            'supplies': 0,
            'shoes': 0,
            'completion status':'incomplete'},
"gloria": { 
            'budget':0,
            'teddy bear': 0,
            'skechers shoes': 0,
            'new clothes': 0,
            'completion status': 'incomplete'},
    }

def displayMenu():
    print()
    print('''
            Menu
    '-----------------------'
    'Update Shopping List'
    'Complete Shopping List'
    'Display Shopping List')
    'Exit Shopping List')
    '-----------------------')
    ''')

def getChoice():
    
    selection = input(str('Please make Your Selection: ')).upper()
    words = selection[0]
    
    if words == 'U':
        updateShoppingList()
    elif words == 'C':
        completeShoppingList()
    elif words == 'D':
        displayShoppingList()
    elif words == 'E':
        exitApplication()
    else:
        print ("Not a valid choice")
        
    return words

    #I know getchoice is the core of the program. Could please tell me how a while loop would be usefull for the program?
    # Would I have to make an infinite while loop? example below 
        # while true:
           # displayMenu()
           # getChoice() ??

def completeShoppingList():
    
    status= "completion status"
    print("Your current christmas status")
    print("-----------------------------")
    for names in people:
        print("Family member, ", names ,", Current status, ", people[names][status])
    print("-----------------------------")
    
    another = 'Y'
    familymember = input("Which family member is completed? ").lower()
    
    while another == 'Y':
        for x in people:
            if familymember == x:

                people[familymember][status] = "Complete"
                
            print("Family member, ", x ,", Current status, ", people[x][status])
        another = input('Do you have any other family member Y/N ? ').upper()
        familymember = input("Which family member is completed? ").lower()

    #complete function is working well so far

#completeShoppingList()
        
def updateShoppingList():
    
    nextperson = 'yes'
    for name in people:
        print()
        print ("Family members : ", name,)
        
        print(people[name])
    print('''
    ----------------------
    Example: update pepito
    ----------------------''')

    
    while nextperson == "yes":
        member = input(str("Which member would you like to update: "))
        memberupdate = member.split()
    
        if memberupdate[0] == "update":
            if memberupdate[1] in people:
                value = input(str("What item do you want to update? "))
                cost = input("What's the amount of $ for the item? ")
                                
                people[memberupdate[1]][value] = float(cost)
                print(people[memberupdate[1]][value])

        nextperson = input("Want to update someone else or another item? yes/no: ").lower()

    #my while loop does not loop my updateshoppingList function, what would I be missing in the code to make it work?
    #function works well and stores the value of keys 
                            
#updateShoppingList()    




def displayShoppingList():

    #display function works well but I don't know if that's what you were looking for
    
    for i in people:
        print("___________________________________________________________________________")
        print(i, people[i])

        
        
        if i == "andreu":
            budget= people["andreu"]["budget"]
            spent_amount = people["andreu"]["Halo 3"] + people["andreu"]["Database Book"] + people["andreu"]["Gamer Desktop"]
            print("Your total spent was: $", spent_amount, " and your budget was: $", budget)
            if budget < spent_amount:
                budgetcalculation = budget - spent_amount
                print ("You have spent $", budgetcalculation," more than expected!" )
            elif budget > spent_amount:
                budgetcalculation = budget - spent_amount
                print ("You have spent $", budgetcalculation," less than expected!" )

        
        if i == "andrea":
            budget= people["andrea"]["budget"]
            spent_amount = people["andrea"]["roses"] + people["andrea"]["pajama"] + people["andrea"]["monitor"]
            print("Your total spent was: $", spent_amount, " and your budget was: $", budget)
            if budget < spent_amount:
                budgetcalculation = budget - spent_amount
                print ("You have spent $", budgetcalculation," more than expected!" )
            elif budget > spent_amount:
                budgetcalculation = budget - spent_amount
                print ("You have spent $", budgetcalculation," less than expected!" )

        
        if i == "katherin":
            budget= people["katherin"]["budget"]
            spent_amount = people["katherin"]["pills antistress"] + people["katherin"]["accounting book"] + people["katherin"]["scarf"]
            print("Your total spent was: $", spent_amount, " and your budget was: $", budget)
            if budget < spent_amount:
                budgetcalculation = budget - spent_amount
                print ("You have spent $", budgetcalculation," more than expected!" )
            elif budget > spent_amount:
                budgetcalculation = budget - spent_amount
                print ("You have spent $", budgetcalculation," less than expected!" )

        
        if i == "luis":
            budget= people["luis"]["budget"]
            spent_amount = people["luis"]["medical bills"] + people["luis"]["doctors bill"] + people["luis"]["ambulance"] + people["luis"]["supplies"] + people["luis"]["shoes"]
            print("Your total spent was: $", spent_amount, " and your budget was: $", budget)
            if budget < spent_amount:
                budgetcalculation = budget - spent_amount
                print ("You have spent $", budgetcalculation," more than expected!" )
            elif budget > spent_amount:
                budgetcalculation = budget - spent_amount
                print ("You have spent $", budgetcalculation," less than expected!" )

        
        if i == "gloria":
            budget= people["gloria"]["budget"]
            spent_amount = people["gloria"]["teddy bear"] + people["gloria"]["skechers shoes"] + people["gloria"]["new clothes"]
            print("Your total spent was: $", spent_amount, " and your budget was: $", budget)
            if budget < spent_amount:
                budgetcalculation = budget - spent_amount
                print ("You have spent $", budgetcalculation," more than expected!" )
            elif budget > spent_amount:
                budgetcalculation = budget - spent_amount
                print ("You have spent $", budgetcalculation," less than expected!" )   
    
#displayShoppingList()


def exitApplication():
    print('Thank you')
   # sys.exit()   
    #break 

words = ' '
while words != 'E':
    displayMenu()
    words = getChoice()

