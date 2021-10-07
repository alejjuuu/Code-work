#Luis Velasquez
#this program writes any sentence in reverse 


message = input("Enter a sentence you want to reverse: ")
cipher = ""

i = len(message)-1

for x in range(i,-1,-1): 

    cipher = cipher + message[x]
    
print(cipher)

