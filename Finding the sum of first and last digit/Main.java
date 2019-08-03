#include <stdio.h>
int main() {
	//Type your code
  int x,f=0,l=0,s;
  scanf("%d",&x);
  l=x%10;
  while(x>0)
  {
    f=x%10;
    x=x/10;
  }
  s=f+l;
  printf("%d",s);
	return 0;
}