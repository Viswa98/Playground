#include <stdio.h>
int main()
{
  float r,c,ans;
  scanf("%f%f",&r,&c);
  printf("%.2f",(c/360)*r*2*3.14);
  return 0;
}