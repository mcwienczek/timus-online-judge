#include <stdio.h>

int main() {
    int k, n;
    scanf("%d%d", &k, &n);
    int array[n];
    for(int i = 0; i < n; i++) {
        scanf("%d", &array[i]);
    }

    int sum = 0;
    for(int i = 1; i < n; i ++) {
        array[i] = array[i] + (array[i - 1] - k > 0 ? array[i - 1] - k : 0);
    }


    printf("%d", (array[n - 1] - k) > 0 ? (array[n - 1] - k) : 0);
}