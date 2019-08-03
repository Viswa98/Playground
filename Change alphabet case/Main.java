#include <stdio.h>
int main() {
	// Type your code here
  char c;
  scanf("%c",&c);
  if(c>='A'&&c<='Z')
    printf("%c",c+32);
  else
    printf("%c",c-32);
	return 0;
}