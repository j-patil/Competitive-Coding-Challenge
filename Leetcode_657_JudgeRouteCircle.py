'''
Created on Oct 31, 2017

@author: Jayesh
'''
class Solution:
    def judgeCircle(self, moves):
        return moves.count('U') == moves.count('D') and moves.count('L') == moves.count('R')
    
result = Solution()
print(result.judgeCircle('UD'))