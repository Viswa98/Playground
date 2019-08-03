#include <stdio.h>
int main() {
	//Type your code
  int x,s=0,f=0,m;
  scanf("%d",&x);
  while(x>0)
  {
    s=f;
    m=x%10;
    f=m;
    x=x/10;
  }
  printf("%d",s);
	return 0;
}