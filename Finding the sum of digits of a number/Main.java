#include <stdio.h>
int main() {
	int a,p=0;
  scanf("%d",&a);
  while(a!=0)
  {
    p+=a%10;
    a=a/10;
  }
  printf("%d",p);
	return 0;
}