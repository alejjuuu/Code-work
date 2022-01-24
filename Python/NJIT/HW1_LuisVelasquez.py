'''
Luis Velasquez
CS 100 Section 004
HW 01, January 23, 2021

'''

SecondtoMinute = 60
SpeedSound = 761
NjMaxSpeedLimit = 65


MoonDiameter = 2158.8
PillowCost = 7.99
EnergyAmoungSpent = 1000.89

Best_Laptop = "MacBookPro"
Best_IT_School = "NJIT"
USHouseSpeaker = "Nancy Pelosi"


'<<<_____Exercise 1.1________>>>'

# 1.    In a  print  statement,  what  happens  if
# you leave  out  one of  the  parentheses, or  both?

''' It won't print anything, since the print statement has"
to be in closed parentheses () in order to work '''

# 2.    If  you  are  trying  to  print  a  string,
# what  happens  if  you  leave  out  one  of  the  quotation  marks, or both?

''' If there is a quoation mark missing, the compiler will
most likely show a syntax error and it will not print anything '''

# 3.   You can use a minus sign to make a negative number like
# What happens if you put a plus sign before a number?
# What about 2++2?

''' If there is a + sign before a number it will add the two numbers together
for example 2+10 is equal 12.  On the other hand, if there's ++ sings
the computer reads it as there was a 0 between the two plus signs "+0+"
meaning that if I place 2++10 I will the same answer which is equal to 12 '''

# 4. In math notation, leading zeros are ok, as in . What happens if you
# try this in Python? What about 011?

''' Leading zeros in in decimal integer literals are not permitted
for instace 011 will never work, it will always give a syntaxError'''

# 5 What  happens  if  you have  two  values with  no operator between them? 

''' A syntax error will come up'''





'<<<_______Exercise 1.2______>>>'

#1. How many  seconds  are  there  in 42  minutes 42  seconds?

Seconds = 60
totalSeconds = Seconds * 42 + 42
"totalSeconds = 2562 "

# 2.   How many  miles are there  in 10 kilometers?
# Hint:  there  are  1.61  kilometers in a mile. 

mile = 1.61
kilometers = 10
Total = mile * kilometers
"Total = 16.1"

# 3.   If  you  run  a  10  kilometer  race  in  42  minutes
# 42  seconds,  what  is  your  average  pace  (time  per mile
# in  minutes  and seconds)?  What  is your  average  speed  in miles per hour? 

kilometer = 10
minutes = 42.42
averagePace = minutes / kilometer
"averagePace = 4.242"
averspeed = kilometer / minutes
"averageSpeed = 0.23573785950023574"





'<<<_______Exercise 2.1______>>>'

#  We’ve seen that n = 42 is legal. What about 42 = n ?

''' As long as I know integers can't hold data or be a variable'''

#  Howabout x = y = 1 ?

''' This is valid; however, I belive that the end result would be 1 '''

#  In some languages every statement ends with a semi-colon ;
#  What happens if you put a semi-colon at the end of a Python statement?


''' The semicolon become a statement separator and a good example would be
 print('Statement 1'); print('Statement 2'); print('Statement 3')
 I do not see the point on doing all commands in one line when it looks
 so much messy '''

#  What if you put a period at the end of a statement?

''' If it is a varible that has integer numbers it works and they become float
numbers but if it was a variable that has float numbers it will not work.
It is safe to say that dots at the end of every statement will never be a good
practice and won't never run '''

# In math notation you can multiply x and y like this: xy.
# What happens if you try that in Python?

''' It will never work since x or y is not defined so the compiler does not
what to do with them '''




'<<<_______Exercise 2.2______>>>'

# 1. What is the volume of a sphere with radius 5?


pi = 3.1415926535897931
r= 5
v = 4/3* pi * r ** 3
" v= 523.5987755982989"

# 2. Suppose the cover price of a book is $24.95, but bookstores get a
# 40% discount. Shipping costs $3 for the first copy and 75 cents for
# each additional copy.What is the total wholesale cost for 60 copies?

BookPrice = 24.95
Discount=.40
Shipping = 3
extraCopies= .75
Number_Copies= 60

DiscountPrice = BookPrice * Discount
if Number_Copies >= 2:
    Total = round((Number_Copies * extraCopies + 3) + DiscountPrice,2)
    
"Total = 57.98"


# 3. If I leave my house at 6:52 am and run 1 mile at an easy pace
# (8:15 per mile), then 3 miles at tempo (7:12 per mile) and 1 mile at
# easy pace again, what time do I get home for breakfast?


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

#end of the exercise 2.2.3 here 

