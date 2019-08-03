#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,i,h,n=1;
  scanf("%d%d",&a,&b);
  h=(a>b)?a:b;
  for(i=1;i<=h;i++)
  {
    if((a%i==0)&&(b%i==0))
    {
      a=a/i;
      b=b/i;
      n=n*i;
    } 
    else if((a%i==0)&&(b%i!=0))
    {
      a=a/i;
      n=n*i;
    }
    else if((a%i!=0)&&(b%i==0))
    {
      b=b/i;
      n=n*i;
    } 
    }
  printf("%d",n);
  return 0;
}