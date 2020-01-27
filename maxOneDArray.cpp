#include<iostream>
#include<vector>
using namespace std;
void fill(vector<int> & arr){
    for(int i = 0; i<arr.size(); i++){
        cin>>arr[i];
    }
}
int maxx(vector<int> & arr){
    int x = arr[0];
    for(int i = 0; i<arr.size(); i++){
        if(x<arr[i])       x=arr[i]; 
    }
    return x;
}
int main(){
    int n;  cin>>n;
    vector<int> arr(n,0);
    fill(arr);
    cout<<maxx(arr);
    return 0;
}