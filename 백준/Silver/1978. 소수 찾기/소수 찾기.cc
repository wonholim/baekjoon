#include <stdio.h>

int main(void) {
	int ab , a, b, c;
	b = 0;
	c = 0;
	scanf("%d", &ab);
	for (int j = 0; j < ab; j++) {
		scanf("%d", &a);
		for (int i = 2; i <= a; i++) {
			if ((a % i) == 0) {
				b++;
			}
		}
		if (b == 1) c++;
		b = 0;
	}
	printf("%d", c);
}
