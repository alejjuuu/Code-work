message = input("Enter a message: ")
key = int(input("Enter a key: "))
alpha='abcdefghijklmnopqrstuvwxyz'
new_message=''
decrypted_message=''
for x in range(len(message)):
    where=alpha.find(message[x])
    #print(where)
    #print(where+key)
    new_char=alpha[(where+key)%26]#encrypt
    #print(new_char)
    new_message=new_message+new_char
print(new_message)

newmessage = input("Enter a message to be decrypted: ")
new_key = int(input("Enter a key: "))
for c in range(len(newmessage)):
    
    position=alpha.find(newmessage[c])
    new_position=alpha[(position-new_key)%26]
    decrypted_message = decrypted_message+new_position

print(decrypted_message)
