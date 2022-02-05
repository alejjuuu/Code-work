menu = {
    "burger": 4.95,
    "fries": 2.50,
    "water": 1.50,
    "soda": 2.00,
    "salad": 5.50
}

receipt = {}
print("Welcome to the Restaurant")
print("Here is our menu ")
print("-----------------------")

for x in menu:
    print(x, 'k', menu[x])

total = 0
another = 'y'
while another == 'y':

    item = input("What would you like to order? ")
    item = item.lower()

    if item in menu:
        print(menu[item])
        total = total + menu[item]  # accumulate a total
        receipt[item] = menu[item]
    else:
        print("We do not have it today")

    another = input("Do you have another item? Y or N: ").lower()

print(receipt)
print("Your total was: ", total)
