N = int(input())
number = 1
for i in range(1, N + 1):
    for j in range(1, i + 1):
        print(number, end=" ")
        number += 1
    print()
