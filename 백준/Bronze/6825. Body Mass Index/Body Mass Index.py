"""
The Body Mass Index (BMI) is one of the calculations used by doctors to assess an adult’s health. The doctor measures the patient’s height (in metres) and weight (in kilograms), then calculates the BMI using the formula

BMI = weight/(height × height).

Write a program which prompts for the patient’s height and weight, calculates the BMI, and displays the corresponding message from the table below.

BMI Category	Message
More than 25	Overweight
Between 18.5 and 25.0 (inclusive)	Normal weight
Less than 18.5	Underweight
"""

a = float(input())
b = float(input())
c = a / (b * b)

if c > 25.0 :
    print("Overweight")
elif 18.5 <= c <= 25.0 :
    print("Normal weight")
else :
    print("Underweight")


