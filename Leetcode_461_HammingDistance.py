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
        count = 0
        for i, j in zip(binx, biny):
            if(i!=j):
                count += 1
        return count
    
result = Solution()
print(result.hammingDistance(1, 4))