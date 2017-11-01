'''
Created on Nov 1, 2017

@author: Jayesh
'''
class Solution:
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        binx = '{0:032b}'.format(x)
        biny = '{0:032b}'.format(y)
        
        """
        (Stackoverflow) Just to explain the parts of the formatting string:

        {} places a variable into a string
        0 takes the variable at argument position 0
        : adds formatting options for this variable (otherwise it would represent decimal x)
        032 formats the number to thirty two digits zero-padded on the left
        b converts the number to its binary representation
        """
        count = 0
        for i, j in zip(binx, biny):
            if(i!=j):
                count += 1
        return count
    
result = Solution()
print(result.hammingDistance(1, 4))