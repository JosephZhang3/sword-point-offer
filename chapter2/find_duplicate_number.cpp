#include<stdio.h>
#include <iostream>
using namespace std;

/**
 * find any ONE duplicate number in array
 * */
bool find(int numbers[], int length, int* duplication){
	if (numbers == nullptr || length == 0){
		return false;
	}

	for (int i = 0; i < length; ++i)
	{
		if (numbers[i] <0 || numbers[i] > length-1)
		{
			cerr << "The input is not valid." << endl;
			return false;
		}
	}


	for (int i = 0; i < length; ++i)
	{
		while(numbers[i] != i){
			if (numbers[i] == numbers[numbers[i]])
			{
				/* code */
				*duplication = numbers[i];
				cout << "found dup : " << numbers[i] << endl;
				return true;
			}

			// int temp = numbers[i];
			// numbers[i] = numbers[numbers[i]];
            // numbers[numbers[i]] = temp;
            // 上三行是错误写法 因为 numbers[i] 赋值后变化了

			int temp = numbers[i];
			numbers[i] = numbers[temp];
            numbers[temp] = temp;
		}
	}
	return false;
}

int main(){
	int numbers[] = {2,3,1,0,2,5,3};
	bool result = find(numbers, 7, &numbers[0]);
	if (result == true)
	{
		cout << "Really find dup" << endl;
	}
}