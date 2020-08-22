#include <bits/stdc++.h>

using namespace std;



// Complete the jumpingOnClouds function below.
int jumpingOnClouds(vector<int> c) {
    int n = c.size();
    vector<int> counts(n);
    counts[0] = 0;
    counts[1] = (c[1] == 1)?1000:1;

    for(int i=2; i<n; ++i){
        counts[i] = (c[i] == 1)? 1000: 1+std::min(counts[i-1],counts[i-2]);
    }
    return counts[n-1];


}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int n;
    cin >> n;

    vector<int> c(n);

    for (int i = 0; i < n; i++) {
        int temp;
        cin >> temp;
        c[i]=temp;
    }

    int result = jumpingOnClouds(c);

    fout << result << std::endl;

    return 0;
}

