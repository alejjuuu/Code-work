
message = input("Please enter your message: ")
key = int(input("Enter the key"))
secret = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

#change our input to be uppercase
message = message.upper()
new_message="" #This will hold the encrypted message

#for loop to loop for the number of the characters in message


for x in range(len(message)):
#stop=len(message) This is the same as the above
#for x in range(stop)
    
    ch = message[x]
    print(ch,end=' ')

    #where in secret is the letter
    where=secret.find(ch)
    print(where, end=' ')

    #add the key to where
    new_where = (where + key)%26
    print(new_where,end=' ')
    print(secret[new_where])

    new_message=new_message+secret[new_where]
    print(new_message)
    

