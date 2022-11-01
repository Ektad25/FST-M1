numberlist = list(input("Enter a sequence of comma separated values: ").split(", "))
sum = 0
for num in numberlist:
    sum = sum + int(num)
print( "The total is: " +str(sum))