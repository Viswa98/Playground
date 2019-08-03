#include <stdio.h>
int main() {
	//Type your code
  int count=0,n,i,x,s=0,a,y;
  scanf("%d",&n);
  x=n;
  y=n;
  while(n>0)
    {
        n = n/10;
        count=count+1;
    }
for(x;x>0;x=x/10)
  {
    a=x%10;
    s=s+pow(a,count);
  }
if(y==s)
  printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  return 0;
}