#include<stdio.h>
int main()
{
  int i,a,b;
    scanf("%d%d",&a,&b);
  int n;
  n=a>b?a:b;
  for(i=n;i<=a*b;i=i+n)
  {
    if(i%a==0&&i%b==0)
    {
      break;
    }}
    printf("%d",i);
  return 0;
}