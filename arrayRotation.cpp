#include<iostream>
#include<vector>
using namespace std;
void reverse(vector<int> & arr, int i, int j){
    while(i<=j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        i++; j--;
    }
}
void rotate(vector<int> & arr, int d, int n){
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
}
int main(){
    int n;
    cin>>n;

    vector<int> arr(n,0);
    for(int i = 0; i<n; i++){
        cin>>arr[i];
    }
    int d; cin>>d;
    rotate(arr,d,n);
    for(int i = 0; i<n; i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}
