#include <stdio.h>
int main() {
	int n,i,count=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    count=count*i;
  }
  printf("%d",count);
	return 0;
}