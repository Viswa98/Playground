#include<stdio.h>
int main()
{
  	//type your code here
  int n,arr[100],j,i,t;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  scanf("%d",&arr[i]);
for(i=0;i<n;i++)
  for(j=i+1;j<n;j++)
  if(arr[i]<arr[j])
  {
    t=arr[i];
    arr[i]=arr[j];
    arr[j]=t;
  }
  printf("%d",arr[0]);
}