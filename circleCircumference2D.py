'''
Point objects have x, y attributes. Circle objects have center which is a Point, and radius, which is a number.
Write a function calculating circumference of a Circle.
Tests round answers to 6 decimal places.
'''

import math

'''
To calculate the circumference of a circle, you can use the formula: Circumference formula = 2*pi*radius or pi*diameter(twice radius)
Given that the Circle object has a center attribute (which is a Point object) and a radius, you can implement the circle_circumference function as follows:
'''
def circle_circumference(circle):
    # Circumference formula = 2*pi*radius or pi*diameter(twice radius)
    circumference = 2 * math.pi * circle.radius
    # Round the result to 6 decimal places
    return round(circumference, 6)

# Assuming you have defined the Point and Circle classes as follows:
class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

class Circle:
    def __init__(self, center, radius):
        self.center = center  # center is a Point object
        self.radius = radius  # radius is a number

# Create a Circle object
center_point = Point(0, 0)
my_circle = Circle(center_point, 5)

# Calculate the circumference
print(circle_circumference(my_circle))  # Output: 31.415927 (this is what the theory says it must result in)

'''
Explanation:
1) Import Math Module: The math module is imported to access the constant pi.
2) Function Definition: The circle_circumference function takes a circle object as an argument.
3) Calculate Circumference: The circumference is calculated using the formula (2 \times \pi \times \text{radius}).
4) Rounding: The result is rounded to 6 decimal places using the round() function.
Example Classes: Example Point and Circle classes are provided to demonstrate how the function can be used.
'''

# The instructions are somewhat misleading (what you think vs what needs to be done) but it's quite simple
# See geometry theory:

'''
To find the circumference of a circle given its x and y coordinates, you need to know the radius of the circle, which can be calculated using the distance formula from the center to any point on the circumference, and then use the formula C = 2 * pi * r, where C is the circumference and r is the radius. 
Here's a breakdown:

1. Understanding the Equation of a Circle:
The standard equation of a circle with center at (h, k) and radius r is: (x - h)² + (y - k)² = r².
Where (x, y) represents any point on the circumference of the circle. 

2. Finding the Radius:
If you know the coordinates of the center (h, k) and a point (x, y) on the circumference, you can find the radius (r) using the distance formula: r = √((x - h)² + (y - k)²). 

3. Calculating the Circumference:
Once you have the radius (r), you can calculate the circumference (C) using the formula: C = 2 * pi * r.
Where pi (π) is a mathematical constant approximately equal to 3.14159. 

Example:
Let's say you have a circle with:
- Center: (h, k) = (2, 3)
- A point on the circumference: (x, y) = (5, 7)

1. Find the radius:
r = √((5 - 2)² + (7 - 3)²), r = √(3² + 4²), r = √(9 + 16), r = √25, and r = 5.

2. Calculate the circumference:
C = 2 * pi * 5, C = 10 * pi, and C ≈ 31.42.

Therefore, the circumference of the circle is approximately 31.42 units (this is what the code above results in)
'''
