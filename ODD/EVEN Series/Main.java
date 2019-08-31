#include<stdio.h>
int main()
{
int i, n,p=1,r=1;
  scanf("%d",&n);
  if( n%2!=0)
  {
    n=n/2+1;
    for(i=1;i<n;i++)
    {
     p=i*2;
    }
    printf("%d",p);
  }
  else
  {
    n=n/2;
    printf("%d",n-1);
  }
	
}