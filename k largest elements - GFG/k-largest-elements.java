//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().kLargest(arr, n, k);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
        
        for(int i=n-1; i>=n-k; i--){
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            
            heapify(arr, i, 0);
        }
        
        int[] res = new int[k];
        for(int i=0; i<k; i++) {
            res[i] = arr[n-i-1];
        }
        return res;
    }
    
    private void heapify(int[] arr, int n, int i){
        
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        
        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }
        
        if(largest != i){
            int tmp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = tmp;
            
            heapify(arr, n, largest);
        }
        
    }
}