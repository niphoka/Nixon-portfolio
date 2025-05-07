def is_opposite(s1,s2):
        return all(char1.swapcase() == char2 for char1, char2 in zip(s1, s2)) if s1 != "" and s2 != "" and len(s1) == len(s2) else False

'''
Check Conditions: The condition checks if both strings are not empty (s1 != "" and s2 != "") and if their lengths are equal (len(s1) == len(s2)).
Character Comparison: If the conditions are met, it proceeds to use all() to check if each character in s1, when swapped in case, matches the corresponding character in s2.
Else Clause: If any of the conditions are not met (either one or both strings are empty or their lengths are not equal), it returns False.

The zip() function in Python combines elements from multiple iterables (like lists, tuples, or strings) into a single iterable of tuples. It pairs the i-th elements from each iterable together. If the iterables have different lengths, the resulting iterable will be truncated to the length of the shortest input iterable. 
The zip() function returns a zip object, which is an iterator. To get a list or tuple from the result, you can use list() or tuple()
'''    

# Example usage
s1 = "ab"
s2 = "AB" 
result = is_opposite(s1, s2)
print(result)  # Output: True

s1 = "aB"
s2 = "Ab"
result = is_opposite(s1, s2)
print(result)  # Output: True

s1 = "aBcd"
s2 = "AbCD"
result = is_opposite(s1, s2)
print(result)  # Output: True

s1 = "AB"
s2 = "Ab"
result = is_opposite(s1, s2)
print(result)  # Output: False

s1 = ""
s2 = ""
result = is_opposite(s1, s2)
print(result)  # Output: False
