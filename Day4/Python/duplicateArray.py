def duplicate_array(numbers):

    for i in range(len(numbers)):
        if(numbers[i]== numbers[i]):
            return numbers
numbers = [9,5,1,4,7]
print(duplicate_array(numbers))


