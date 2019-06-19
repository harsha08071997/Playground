#include<stdio.h>
int main()
{
  int n;
  scanf("%d", &n);
  int n1=n%10;
  int n2=(n/10)%10;
  int s=n1+n2;
  printf("%d", s);
  return 0;
}