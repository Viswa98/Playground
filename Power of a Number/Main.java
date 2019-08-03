#include <stdio.h>
int main()
{
  	//Your code here
  long int n,e,ans=1,i;
  scanf("%ld%ld",&n,&e);
  if(e<0)
    printf("Wrong input");
  else if(e>0)
  {
    for(i=0;i<e;i++)
      ans=ans*n;
  printf("%ld",ans);
  }
  else
    printf("1");
    
  
    return 0;
}