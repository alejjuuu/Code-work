# page 239 #6
# input speedlimit, clockedspeed

speedLimit = int(input("Enter the speed limit: "))
clockedSpeed = int(input("Enter the clocked speed: "))

if clockedSpeed > speedLimit:
    if clockedSpeed > 90:
        fine = 200 + 50 + (clockedSpeed - speedLimit)
    else:
        fine = 50 + ((clockedSpeed - speedLimit) * 5)
    print("You must have to pay " + str(fine))
else:
    print("Speed was legal")
