#include<stdio.h>
int main()
{
  int o=0, i = 1,n,c=0,arr[100];
  //type your code here
  scanf("%d",&n);
  /*    
    while (n!=0)
    {
        o+=(n%8)*i;
        n/=8;
        i*=10;
    }
    */
  while(n!=0)
  {
    arr[c++]=n%8;
    n/=8;
  }
  for(i=c-1;i>=0;i--)
    printf("%d",arr[i]);
   //printf("%d",o);

  return 0;
}