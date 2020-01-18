#include<iostream>
#include<vector>
using namespace std;
void fill(vector<vector<int> > & arr){
    for(int i = 0; i<arr.size(); i++){
        for(int j = 0; j<arr[0].size(); j++){
            cin>>arr[i][j];
        }
    }
}
void display(vector<vector<int> > & arr){
    for(int i = 0; i<arr.size(); i++){
        for(int j = 0; j<arr[0].size(); j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
}
void mulTwoArray(vector<vector<int> > & a, vector<vector<int> > & b){
    vector<vector<int> > ans(a.size(),vector<int>(a[0].size(),0));
    for(int i = 0; i<a.size(); i++){
        for(int j = 0; j<a[0].size(); j++){
            for(int k = 0; k<ans.size(); k++){
                ans[i][j]+=a[i][k]*b[k][j];
            }
        }
    }
    display(ans);
}
int main(){
    int r; cin>>r;
    int c; cin>>c;
    vector<vector<int> >  a(r,vector<int>(c,0));
    vector<vector<int> >  b(r,vector<int>(c,0));
    fill(a);        fill(b);
    mulTwoArray(a,b);
    return 0;
    }