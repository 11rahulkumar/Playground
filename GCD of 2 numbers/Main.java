// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>

int main()
{
 int i,a,b;
  scanf("%d%d",&a,&b);
  int n;
  n=a>b?a:b;
  for(i=n;i>0;i--)
  {
    if(a%i==0 && b%i==0)
    {
      break;
    }}
    printf("%d",i);
   return 0;
}