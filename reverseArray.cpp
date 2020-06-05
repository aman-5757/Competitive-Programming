#include<iostream>
#include<vector>
using namespace std;
void reverse(vector<int> & arr){
    int i = 0; 
    int j = arr.size()-1;
    while(i<=j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        i++; j--;
    }
}

void fillArray(vector<int> & arr){
    for(int i = 0; i<arr.size(); i++){
        cin>>arr[i];
    }
}

void display(vector<int> & arr){
    for(int i = 0; i<arr.size(); i++){
        cout<<arr[i]<<" ";
    }
}

int main(){
    int n;
    cin>>n;

    vector<int> arr(n,0);
    fillArray(arr);
    reverse(arr);
    display(arr);

    
    return 0;
}