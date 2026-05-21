def get_array(numbers, number):

    for i in range(len(numbers)):
        if(numbers[i]+ numbers[i] == number):
            return numbers

numbers = [8, 6, 12, 4, -2]
number = 6 
print(get_array(numbers, number))
