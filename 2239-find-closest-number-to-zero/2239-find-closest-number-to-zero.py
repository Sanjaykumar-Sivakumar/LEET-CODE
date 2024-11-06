class Solution:
    def findClosestNumber(self, numbers):
        closest_value = numbers[0]  # Initialize closest_value with the first number
        for number in numbers:
            if abs(number) < abs(closest_value):  # If current number is closer to zero than closest_value
                closest_value = number
            elif abs(number) == abs(closest_value):  # If two numbers have the same absolute value
                closest_value = max(closest_value, number)  # Take the larger one
        return closest_value

# Example to call the method
param_1 = [-4, 2, 3, -1, 5, -2]  # Define your list
solution = Solution()  # Create an instance of Solution
result = solution.findClosestNumber(param_1)  # Pass the list as an argument

print(result)  # Expected Output: -1
