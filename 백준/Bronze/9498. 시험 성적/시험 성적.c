#include <stdio.h>

int main() {
	int grade;
	scanf("%d", &grade);

	if (grade <= 100 && grade >= 90) {
		printf("A");
	}
	else if (grade < 90 && grade >= 80) {
		printf("B");
	}
	else if (grade < 80 && grade >= 70) {
		printf("C");
	}
	else if (grade < 70 && grade >= 60) {
		printf("D");
	}
	else {
		printf("F");
	}
}