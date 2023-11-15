#THIS IS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING A TUTOR OR CODE WRITTEN BY OTHER STUDENTS - Elijah Chou
import math
MAX = 10000000
M = [0]*(MAX+1)
for n in range(2, MAX+1):
    M[n] = M[n//2] + M[(n+1)//2] + (n-1)

S = [0]*(MAX+1)
for n in range(0, 140):
    S[n] = M[n]
for n in range(140, MAX+1):
    S[n] = 6 * math.ceil(n/5) + S[math.ceil(n/5)] + S[6+math.floor(7*n/10)]

i = 140
while(2*S[i] >= M[i]):
    i = i+1
print('n: ' + str(i))
print('S(n): ' + str(S[i]))
print('M(n): ' + str(M[i]))


