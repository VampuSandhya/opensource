Vignesh, Charan = input().split()
if (Vignesh == 'S' and Charan == 'P') or (Vignesh == 'P' and Charan == 'R') or(Vignesh == 'R' and Charan == 'S'):
    print("Vignesh")
elif (Charan == 'S' and Vignesh == 'P') or (Charan == 'P' and Vignesh == 'R') or (Charan == 'R' and Vignesh == 'S'):
    print("Charan")
else:
    print("NULL")
