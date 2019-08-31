#include<stdio.h>
int main()
{
 int i, a[3],max,smax;
  for(i=0;i<3;i++)
  {
    scanf("%d",&a[i]);
  }
  max=a[0];
  smax=0;
  for(i=1;i<3;i++)
  {
    if(a[i]>max)
    {
      smax=max;
      max=a[i];
    }
    else if(a[i]>smax)
    {
      smax=a[i];
    }}
    printf("%d",smax);
  return(0);
}