#include<iostream>
using namespace std;

int x=423;
main(void)
{

    int a=130;
    char *ptr;
    ptr=(char *)&a;
    printf("%d", *ptr);
}

