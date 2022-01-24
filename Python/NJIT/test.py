morningHours = 6    # start point 
morningMinutes = 52  
easyPaceMinutes = 8  # done 
easyPaceSeconds = 15  #done
tempoPaceMinutes = 7  #done 
tempoPaceSeconds = 12
easyMiles = 2
tempoMiles = 3

# I belive the easiest way is by calculating the seconds

slow_time = (easyPaceMinutes * 60 + easyPaceSeconds) * easyMiles
fast_time = (tempoPaceMinutes * 60 + tempoPaceSeconds) * tempoMiles
totalRunSeconds = slow_time + fast_time

# then calculate the end time

current_time = morningHours * 3600 + morningMinutes * 60
finalTime = current_time + totalRunSeconds # total in seconds


hour = round(finalTime / 3600)
minute = round((finalTime % 3600) / 60)  # remainder = seconds 
print (hour,':',minute)

