'''
Luis Velasquez
CS 100 Section 004
HW 07, April 29, 2021

'''
def safeOpen(filename):
    try:
        return open(filename)
    except:
        return None

def safeFloat(x):
    try:
        return float(x)
    except:
        return 0.0

def averageSpeed():
    counter=0
    while counter !=2:
        file= input("Please input the name of the file: ")
        inF = safeOpen(file)
        
        if inF == None:
            if counter == 0:
                print(" File not found, please try again!")
            counter+=1

        else:
            break

    if counter == 2 and inF == None:
        print("Come back later.")
        return     #don't break, it will not run 

    speed_num =0
    speed_total =0

    for line in inF:
        speeds=line.split()  

        for speed in speeds:
            float_speed = safeFloat(speed)
            #print(float_speed)

            if float_speed > 2:
                speed_total += float_speed
                speed_num += 1
                

    inF.close()
    total= round(speed_total / speed_num,2)
    #print(speed_total)
    #print(speed_num )
    print("Average speed is {} miles per hour".format(total))
    #return   there no need for return I believe 
            
            
            

        
        
        

    
        
        
    
