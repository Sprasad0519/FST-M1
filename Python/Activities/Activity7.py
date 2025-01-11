# a =[10,20,30,40]

# # Initialize a variable to hold the sum
# res =0

# # Loop through each value in the list
# for val in a:
#     #Add the current value to the sum 
#     res += val

#     print(res)

numbers = list(input("Enter a sequence of comma separated values: ").split(","))
sum = 0

for number in numbers:
    sum = sum + number
print(numbers)