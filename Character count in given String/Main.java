#include<stdio.h>
int main()
{
  	//type your code here
  int c=1,i,l;
  char s[100];
  scanf("%s",s);
  for(l=0;s[l]!='\0';l++);
  if(l<=20)
    for(i=0;i<l;i++)
      if(s[i]==s[i+1])
        c++;
  	  else
      {
        printf("%c%d",s[i],c);
        c=1;
      }
  else
    printf("Invalid Input");
   
}