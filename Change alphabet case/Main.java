#include <stdio.h>
int main() {
	char c;
  scanf("%c",&c);
  if(c<='Z'&&c>='A')
  {
    c=c+32;
    printf("%c",c);
  }
  else
  {
    c=c-32;
    printf("%c",c);
  }
	return 0;
}