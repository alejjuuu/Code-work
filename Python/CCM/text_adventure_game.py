# text adventure game
# luis Velasquez
# 12/11/20

rooms = {
    "exit room": {
        "north": "noisy neighbors"},

    "car": {
        "item": "oil",
        "east": "noisy neighbors"},

    "noisy neighbors": {
        "item": "radio",
        "north": "garden",
        "west": "car",
        "south": "exit room"},

    "garden": {
        "item": "dirt",
        "west": "home",
        "south": "noisy neighbors"},

    "home": {
        "item": "orange juice",
        "west": "home",
        "east": "garden"},

    "god's rooms": {
        "item": "hope",
        "east": "home",
        "south": "mom's house"},

    "mom's house": {
        "item": "gold",
        "north": "god's rooms"},
}
inventory = []  # empty list
currentRoom = "mom's house"
finalroom = "exit room"

print("---------------------------------------")
print()
print("Hello dear user this is a text adventure game. You will have to visit",
      " each of the six rooms and collect all items. Once you have collected the",
      "items YOU WILL BE READY TO ROCK!!")
print()
print("---------------------------------------")

player = input("Enter your name: ")

print("--------------------------------------------------")
print()
print("Instructions are: ")
print("'move direction' to go to a direction ,ex: move north")
print("or")
print("'take item' to take an item and put it in your inventory, ex: take cat")
print()
print("-------------------------------------------------")
print()

print("posible options, move direction or take item")
print(rooms[currentRoom])

print()
instruction = input("What would you like to do? ")
words = instruction.split()


while currentRoom != finalroom:

    if words[0] == "move":
        if words[1] in rooms[currentRoom]:
            currentRoom = rooms[currentRoom][words[1]]
            print("Your are now in the", currentRoom)

        else:
            print("You cannot go in that direction")
    elif words[0] == "take":

        inventory.append(rooms[currentRoom]["item"])
        del rooms[currentRoom]["item"]

    else:
        print("Invalid instructions")

    print()
    print("posible options: ")
    print("move direction or take item")
    print(rooms[currentRoom])
    print()

    instruction = input("What would you like to do? ")
    words = instruction.split()
    print(inventory)


if len(inventory) == 6:
    print()
    print("Player " + player + " wins")
else:
    print()
    print("Player " + player + " lost")
