#include <stdio.h>
int main() {
	//Type your code
  int n,i,x=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    x=x*i;
  }
  printf("%d",x);
	return 0;
}