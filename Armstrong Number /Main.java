#include <stdio.h>
int main() {
int i,q,n,sum=0;
  scanf("%d",&n);
  q=n;
  while(n!=0)
  {
    i=n%10;
    sum=sum+(i*i*i);
    n=n/10;
  }
  if(sum==q)
  {
  printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
  
    
	return 0;
}