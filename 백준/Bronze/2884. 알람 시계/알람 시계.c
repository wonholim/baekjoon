#include <stdio.h>

int main() {
	int H, M;
	scanf("%d %d", &H, &M);

	if (M - 45 < 0) {
		M = 60 + (M - 45);
		H -= 1;
		if (H < 0) {
			H += 24;
		}
		printf("%d %d", H, M);
	}
	else {
		M = M - 45;
		printf("%d %d", H, M);
	}
}