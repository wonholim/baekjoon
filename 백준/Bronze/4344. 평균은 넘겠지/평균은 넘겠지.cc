#include <stdio.h>
#include <stdlib.h>
int main(void) {
	int std, std_avg, sum;
	int avg = 0;
	double q = 0;
	int* arr;
	scanf("%d", &std);
	for (int i = 0; i < std; i++) {
		scanf("%d", &std_avg);
		arr = (int*)malloc(sizeof(int) * std_avg);
		for (int j = 0; j < std_avg; j++) {
			scanf("%d", &sum);
			arr[j] = sum;
			avg += sum;
		}
		for (int k = 0; k < std_avg; k++) {
			if (arr[k] > (double)(avg / std_avg)) {
				q++;
			}
		}
		printf("%.3f%%\n", (double)((q*100)/std_avg));
		avg = 0;
		q = 0;
	}
}