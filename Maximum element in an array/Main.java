#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
 int i, a[n],max;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  max=a[0];

  for(i=1;i<n;i++)
  {
    if(a[i]>max)
    {
     
      max=a[i];
    }}
  
    printf("%d",max);
  return(0);
}