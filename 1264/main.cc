#include <stdio.h>

int main() {
    int M, N;
    scanf("%d%d", &N, &M);

    int m = M + 1;
    int result = m * N;

    printf("%d", result);
}