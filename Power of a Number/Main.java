#include <stdio.h>
#include<math.h>
int main()
{
  int a,b,c;
  scanf("%d%d",&a,&b);
  if(b>=0)
  {
   c=pow(a,b);
  printf("%d",c);
  }
  else 
  {
    printf("Wrong input");
  }
     return 0;
}