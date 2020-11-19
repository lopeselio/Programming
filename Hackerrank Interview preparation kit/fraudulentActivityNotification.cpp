#include<bits/stdc++.h>

using namespace std;

int arr[2000001];
int freq[201]={0};

int twice_median(int days)
{
    int sum=0;

    for (int i = 0; i < 201; ++i)
    {
        sum+=freq[i];

        if(2*sum> days)
        {
            return (2*i);
        }
        else if( 2*sum==days)
        {
            for(int j=i+1;; j++)
            {
                if(freq[j])
                {
                    return i+j;
                }
            }
        }
    }

    return -1;
}

int main()
{
    int n; // size of array
    int days; // no of trailing days
    int count=0;

    cin>>n>>days;

    for (int i = 0; i < n; ++i)
    {
        cin>>arr[i];
    }

    for (int i = 0; i < n; ++i)
    {
        if(i>=days)
        {
            if(arr[i]>=twice_median(days))
            {
                count++;
            }

            freq[arr[i-days]]--; // will remove the count from our freq array

        }
        freq[arr[i]]++;
    }

    cout<<count;

    return 0;
}
