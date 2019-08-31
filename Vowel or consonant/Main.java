#include<stdio.h>
int main()
{
  char a[1];
  gets(a);
  if(a[0]=='a'||a[0]=='e'||a[0]=='i'||a[0]=='o'||a[0]=='u'||a[0]=='A'||a[0]=='E'||a[0]=='I'||a[0]=='O'||a[0]=='U')
  {
    printf("Vowel");
    
  }
  else{
    printf("Consonant");
  }
    
    return 0;
}