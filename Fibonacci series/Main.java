#include<stdio.h>
int main()
{
  //Type your code here
  int p,c,fib,i,n,ne;
  scanf("%d",&n);
  p=0;
  c=1;
  printf("%d %d",p,c);
  for(i=0;i<n-2;i++)
  {
    ne=c+p;
    printf(" %d",ne);
    p=c;
    c=ne;
    
  }
  
    return 0;
}
