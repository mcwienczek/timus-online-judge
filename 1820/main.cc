#include <stdio.h>

int main()
{
   int k, n;
   scanf("%d%d", &n, &k);
   
   if(n <= k)
   {
       printf("%d\n", 2);
       return 0;
   }

   //first side
   int timeFirstSide = n / k;
   int r = n % k;
   int timeSecondSide = (r + n) % k == 0 ? (r + n) / k : (r + n) / k + 1;

   int timesecondSide = n / k;
   int result = timeFirstSide + timeSecondSide;

   printf("%d\n", result);
   
   return 0;
}
