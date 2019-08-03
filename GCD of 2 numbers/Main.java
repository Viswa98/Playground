// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a,b,s,i;
  // Enter your code here 
  scanf("%d%d",&a,&b);
  for(i=1;i<a;i++)
  {
    if((a%i==0)&&(b%i==0))
      s=i;
  }
  printf("%d",s);
   return 0;
}