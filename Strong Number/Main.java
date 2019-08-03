#include <stdio.h>
int main() {
	//Type your code
  int n,i,s=0,a,x,f;
  scanf("%d",&n);
  x=n;
  while(n>0)
  {
   f=1;
    a=n%10;
  for(i=1;i<=a;i++)
  {
    f=f*i;
  }
    s=s+f;
    n=n/10;
  }
  if(s==x)
    printf("Yes");
  else
    printf("No");
	return 0;
}