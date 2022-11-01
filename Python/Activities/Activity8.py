numberlist = list(input("Enter a sequence of comma separated values: ").split(", "))

firstnum = numberlist[0]
lastnum = numberlist[-1]
print("First element is: " +firstnum)
print("Last element is: " +lastnum)

if (firstnum == lastnum):
    print(True)
else:
    print(False)