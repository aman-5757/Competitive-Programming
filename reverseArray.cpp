#include<iostream>
#include<vector>
using namespace std;
void fill(vector<int> & arr){
    for(int i = 0; i<arr.size(); i++){
        cin>>arr[i];
    }
}
void swap(vector<int> & arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
void reverse(vector<int> & arr){
    int i = 0;
    int j = arr.size()-1;
   while(i<=j){
       swap(arr, i,j);
       i++;
       j--;
   }
}

int main(){
    int n;      cin>>n;
    vector<int> arr(n,0);
    fill(arr);
    reverse(arr);
    for(int i = 0; i<n; i++){
        cout<<arr[i]<<" ";
    }





    return 0;
}