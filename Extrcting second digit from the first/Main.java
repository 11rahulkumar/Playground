#include <stdio.h>
int main() {
	int n,a;
  scanf("%d",&n);
  while((n/100)!=0)
  {
    n=n/10;
  }
  printf("%d",n%10);
	return 0;
}