# Luis Velasquez
# Distance to a lightning strike based on the time
# elapsed between the flash and the sound of thunder


# variables
Speed_sound = 1100
mile_feet = 5280

# userinputinsec
time = int(input('Enter the time elapsed between the' +
                 'flash and the sound of thunder in seconds: '))
# calculations
distance = Speed_sound * time
miles = distance // mile_feet
feet = distance % mile_feet

# display
print('The distance to the lightning strike is about', miles, 'miles and',
      feet, 'feet from your current location.')
