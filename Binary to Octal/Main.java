#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  int n,i=0,d=0,x=1,o=0;
  scanf("%d",&n);
  while(n!=0)
  {
    d+=(n%10)*pow(2,i);
    n/=10;
    i++;
  }
  while(d!=0)
  {
    o+=(d%8)*x;
      d/=8;
      x*=10;
  }
printf("%d",o);
}