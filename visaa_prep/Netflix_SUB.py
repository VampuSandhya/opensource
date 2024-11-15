A, B, C, X = list(map(int, input().split()))
if (A+B)|(B+C) >= X:
    print("YES")
else:
    print("NO")
