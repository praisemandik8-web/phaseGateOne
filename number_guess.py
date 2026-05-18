import random
a = random.randint(1, 101)
for i in range(1, 6):
    number= int(input("Enter number"))
    if(number == a):
        print("congratulations" , a ," is correct")
        break
    #elif(number !=a):
     #   print("Wrong guess")
    elif(number <0 or number >100):
        print("Warning! Enter number between 1 - 100")
    elif(number > a):
        print("The answer is lower than ", number, " chief!")
    elif(number < a):
        print("The answer is Higher than ", number, " chief!")

    

print("correct answer is ", a)
    



