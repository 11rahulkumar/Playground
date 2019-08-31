#include <stdio.h>
int main() {
	int p,i,r,n,count=1,sum=0;
  scanf("%d",&n);
  r=n;
  while(n%10!=0)
  {
    p=n%10;
    for(i=1;i<=p;i++)
    {
      count=count*i;  
     
    }
    n=n/10;
    sum=count+sum;
    count=1; 
  }
 
  if(sum==r)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}