def find_smallest(arr):
    return min(arr)  


size = int(input("Enter the size: "))
arr = list(map(int, input("Enter the elements: ").split()))


if len(arr) != size:
    print(f"Error: Please enter exactly {size} numbers.")
else:
    print("Smallest number:", find_smallest(arr))
