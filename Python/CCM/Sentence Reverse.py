#Luis Velasquez
#this program writes any sentence in reverse 

message = input("Enter a sentence you want to reverse: ")
cipher = ""

i = len(message)-1

for ch in "secret":
    cipher = cipher + message[i]
    i = i -1

    
print(cipher)
