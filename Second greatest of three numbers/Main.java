#include<stdio.h>
int main()
{
  // Type your code here
  int a,b,c,arr[20],t,i,j;
  scanf("%d%d%d",&a,&b,&c);
  if(a>b&&a>c)
  {
    if(b>c)
      printf("%d",b);
    else
      printf("%d",c);
  }
  else if(b>c)
  {
    if(a>c)
      printf("%d",a);
    else
      printf("%d",c);
  }
  else
  {
    if(b>a)
      printf("%d",b);
    else
      printf("%d",a);
  }
  
  return 0;
}