import random

possible = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*_-+=`|\(){}[]:;",.?/'
password = ''

for x in range(10):
    password = password + random.choice(possible)
print('your new password is ' + password)
