#include<stdio.h>
int main()
{
long int n,p=1;
  scanf("%ld",&n);
  while(n>0)
  {
    p=p*n;
    n--;
  }
  printf("%ld",p);
}