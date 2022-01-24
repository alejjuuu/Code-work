# while - lecture 8

'''
mult 7
if num <= 37 get the next multiple
num=7+7=14 go back and check
14+7 = 21 - go back 
'''

num = 7
count = 0
while num <= 37:
    num += 7
    count += 1
print('mult of 7 >37 is:', num)
print('number of reps is:', count)


def getNextMult(bound, multiple):
    num = multiple
    while num <= bound:
        num += multiple
    return num


print(getNextMult(37, 7))
print(getNextMult(35, 5))
print(getNextMult(100, 10))


def getNegativeNumber():
    num = 0
    while num >= 0:
        num = int(input("Enter a negative number"))
    return num


def getNegativeNumber():
    num = 0
    while num >= 0:
        # num = int(input("Enter a negative# : "))
        strNum = input("Enter a negative #: ")
        if (strNum[0]) == '-' and strNum[1:].isdigit():
            num = int(strNum)
    return num


def febSeq(bound):
    prev = 1
    curr = 1
    while(curr <= bound):
        print(curr)
        temp = curr
        curr = curr+prev  # get new current
        prev = temp
        prev = temp
    return curr


print(febSeq(55))


def hello():
    while True:
        name = input("Enter name: ")
        if name == '':
            break
        print("hello", name)


x = ''
while x == 'Y':
    name = input("Enter name: ")
    x = input("want to continue? enter to Stop").upper()
