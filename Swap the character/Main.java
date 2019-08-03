#include<stdio.h>
#include<string.h>
int main()
{
  // type your code here 
  char s1[100],s2[100],s3[100],s4[100];
  int i;
  scanf("%s",s1);
  scanf("%s",s2);
  scanf("%s",s3);
  for(i=0;s1[i]!='\0';i++)
    if((s1[i]=='a')||(s1[i]=='e')||(s1[i]=='i')||(s1[i]=='o')||(s1[i]=='u')||
       (s1[i]=='A')||(s1[i]=='E')||(s1[i]=='I')||(s1[i]=='O')||(s1[i]=='U'))
      s1[i]='$';
  for(i=0;s2[i]!='\0';i++)
    if((s2[i]=='a')||(s2[i]=='e')||(s2[i]=='i')||(s2[i]=='o')||(s2[i]=='u')||
      (s2[i]=='A')||(s2[i]=='E')||(s2[i]=='I')||(s2[i]=='O')||(s2[i]=='U'))
      s2[i]=s2[i];
  	else
      s2[i]='#';
  for(i=0;i<strlen(s3);i++)
    if(s3[i]>='a'&&s3[i]<='z')
      s3[i]=s3[i]-32;
  strcat(s1,s2);
  strcat(s1,s3);
  printf("%s",s1);
  
  
}