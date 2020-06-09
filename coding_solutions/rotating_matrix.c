#include <iostream>
#define M 3 
#define N 3
using namespace std;
void rotateMatrix(int matrix[][M], int k) { 
int temp[M];
k = k % M; 

for (int i = 0; i < N; i++) {
	for (int t = 0; t < M - k; t++) 
	temp[t] = matrix[i][t];
	for (int j = M - k; j < M; j++) 
	matrix[i][j - M + k] = matrix[i][j];
	for (int j = k; j < M; j++) 
	matrix[i][j] = temp[j - k]; 
} 
}
void displayMatrix(int matrix[][M]) { 
for (int i = 0; i < N; i++) { 
	for (int j = 0; j < M; j++) 
	cout << matrix[i][j] << " "; 
	cout << endl; 
} 
} 
int main() { 
int matrix[N][M] = {{10,20,30}, 
		    {40,50,60}, 
		    {70,80,90}}; 
int k = 2; 
rotateMatrix(matrix, k); 

displayMatrix(matrix); 

return 0; 
} 
