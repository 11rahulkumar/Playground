#include <stdio.h>
int main() {
	int a,b;
  scanf("%d",&a);
  b=a%10;
  while(a/10!=0)
  {
    a=a/10;
  }
 
  printf("%d",a+b);
    return 0;
}