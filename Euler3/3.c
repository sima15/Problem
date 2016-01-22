 #include <stdio.h>

int main() {
	long n = 600851475143L;
	long a, max = 0;

	for (a = 2; a * a <= n; a++)
		if (n % a == 0) {
			if (max < a)
				max = a;
			while (n % a == 0)
				n /= a;
		}
	if (max < n)
		max = n;
	printf("%ld\n", max);
	return 0;
}
