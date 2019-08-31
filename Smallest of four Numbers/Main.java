#include<stdio.h>
int main()
{
 int i, a[4],small;
  for(i=0;i<4;i++)
  {
    scanf("%d",&a[i]);
  }
  small=a[0];
  for(i=1;i<4;i++)
  {
    if(a[i]<small)
    {
      small=a[i];
    }
  }
    printf("%d",small);
  return(0);
}