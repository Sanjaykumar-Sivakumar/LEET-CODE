class Solution():
    def isCircularSentence(self, s : str ) -> bool:
        w = s.split()
        for i in range(len(w)):
            if w[i][-1] != w[(i + 1) % len(w)][0]:
                return False
        return True



       
        