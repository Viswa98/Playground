#include<stdio.h>

int main()
{
  //Type your code here
  char s[100];
  int l,c=1,i;
  scanf("%[^\n]s",s);
  for(l=0;s[l]!='\0';l++);
  for(i=0;i<l;i++)
    if(s[i]==' ')
      c++;
  printf("%d",c);
}