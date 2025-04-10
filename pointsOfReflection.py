def symmetric_point(p, q):
    '''
    "Point reflection" or "point symmetry" is a basic concept in geometry where a given point, P, 
    at a given position relative to a mid-point, Q has a corresponding point, P1, 
    which is the same distance from Q but in the opposite direction.
  
    Task
    Given two points P and Q, output the symmetric point of point P about Q. 
    Each argument is a two-element array of integers representing the point's X and Y coordinates. 
    Output should be in the same format, giving the X and Y coordinates of point P1. You do not have to validate the input.
    '''
  
    '''
    Theory and tool that helped me figure this out:
    https://www.calculatorsoup.com/calculators/geometry-plane/midpoint-calculator.php
    
    ***Formula to calculate endpoint***
    
    First we get x and y coordinates of each point
    (x1,y1) = 2,6
    (xm,ym) = -2,-6
    
    Now we check formula, replace values and do the math:
    E=(x2,y2)
    E=(2xm−x1,2ym−y1)
    E=(2(−2)−2,2(−6)−6)
    E=(−4−2,−12−6)
    E=(−6,−18)  
    '''
#     The following is the first version I came up with:
#     point1Formula = 2*q[0] - p[0]  
#     point2Formula = 2*q[1] - p[1]

#     result = []
#     result.append(point1Formula)
#     result.append(point2Formula)
#     return result

    return [2*q[0] - p[0], 2*q[1] - p[1]]# This is the latest and final version
    
print(symmetric_point([2,6],[-2,-6]))# Must print [-6, -18]
print(symmetric_point([10, -10], [-10, 10]))# Must print [-30, 30]
print(symmetric_point([1, -35], [-12, 1]))# Must print [-25, 37]
print(symmetric_point([1000, 15], [-7, -214]))# Must print [-1014, -443]
