#include<stdio.h>
int main()
{
int i;
  char a[20];
 gets(a);
  for(i=0;a[i]!='\0';i++)
  {
if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
{ 
}
  else
  {
    printf("%c",a[i]);
  }}
 
  return 0;
}