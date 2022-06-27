#include <stdio.h>

int main() {
	int left, right;
	scanf("%d %d", &left, &right);
	
	if (left > right) {
		printf(">");
	}
	else if (left < right) {
		printf("<");
	}
	else {
		printf("==");
	}
}