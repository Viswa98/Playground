#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char s[100];
  //scanf("%[^\n]*c",s);
  gets(s);
  printf("%d",strlen(s));
  return 0;
}