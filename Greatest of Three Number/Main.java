#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{ 
    // type your code here
  char ch[200];
  char ar[20][20],b[20];
  int a[20];
  scanf("%s",ch);
  int i,j=0,k=0;
  if(ch[strlen(ch)-1]!=',')
  ch[strlen(ch)]=',';
  for(i=0;i<strlen(ch);i++)
  {
    if(ch[i]!=',')
    {
      b[j]=ch[i];
      j++;
    }
    else if(ch[i]==',')
    {
        strcpy(ar[k],b);
        k++;
        j=0;
    }
  } 
  for(i=0;i<3;i++)
  {
      a[i]=atoi(ar[i]);
  }
  if((a[0]>a[1])&&(a[0]>a[2]))
    printf("%d",a[0]);
  else if((a[1]>a[0])&&(a[1]>a[2]))
    printf("%d",a[1]);
  else
    printf("%d",a[2]);
    return 0;
}