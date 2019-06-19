#include <stdio.h>
int main() {
	int n,a[50],r,count=0,i=0;
  scanf("%d",&n);
  while(n!=0)
  {
    r=n%10;
    a[i]=r;
    count++;
    i++;
    n=n/10;
  }
  printf("%d",a[count-2]);
	return 0;
}