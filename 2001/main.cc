#include <stdio.h>

int main() {
    int a1, a2, a3, b1 ,basket1Weight ,basket2Weight, b3;
    scanf("%d%d", &a1, &b1);
    scanf("%d%d", &a2, &basket2Weight);
    scanf("%d%d", &basket1Weight, &b3);

    int berries1Weight = a1 - basket1Weight;
    int berries2Weight = b1 - basket2Weight;

    printf("%d %d\n", berries1Weight, berries2Weight);
}