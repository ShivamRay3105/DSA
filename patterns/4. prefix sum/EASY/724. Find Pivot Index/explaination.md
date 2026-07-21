create 2 arrays other than nums[]

1. prefixSum[]
2. postSum[] 

initialize prefixSum[] will store the values of sum of all value to it's left including the current one

and visa-versa with postSum[]

eg:

nums[]      = 1,  7,  3,  6,  5,  6
prefixSum[] = 1,  8,  11, 17, 22, 28
postSum[]   = 28, 27, 20, 17, 11, 6

then traverse either of the arrays, prefixSum[] or postSum[] and in any case
    if(prefixArr[i] == postSum[i])
        return i;
return -1 // if no such index found