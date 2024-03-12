import java.util.ArrayList;
import java.util.Collections;

public class Abc {
    static void bubble(int arr[]) {
        int n = arr.length;
        for (int i=0;i<n-1;i++) {
            boolean flag=false;
        for (int j=0;j<n-i-1;j++) {
        if (arr[j] > arr[j + 1]) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        flag=true;
     }
    }
    if(flag==false) return;
}
}

   static void selection(int arr[]) {
    int n=arr.length;
  for(int i=0;i<n-1;i++) {
  int min_index=i;
  for(int j=i;j<n;j++) {
  if(arr[j] < arr[min_index]) {
    min_index=j;
  }
  }
  if(min_index !=i) {
    int temp=arr[min_index];
    arr[min_index]=arr[i];
    arr[i]=temp;
  }
  }
   }

  static void insertion(int arr[]) {
    int n=arr.length;
    for(int i=0;i<n;i++) {
      int j=i;
      while(j>0 && arr[j] <arr[j-1]) {
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
        j--;
      }
    }
  }
   
  static void merge(int arr[] , int l , int r) {
    if(l >=r) return ;
    int mid=(l+r)/2;
    merge(arr, l, mid);
    merge(arr, mid+1, r);
    mergeF(arr,l,mid,r);
  }

  static void mergeF(int arr[] , int l ,int mid, int r) {
    int n1=mid-l+1;
    int n2=r-mid;

    int left[]=new int[n1];
    int right[]=new int[n2];

    for(int i=0;i<n1;i++) left[i]=arr[l+i];
    for(int j=0;j<n2;j++) right[j]=arr[mid +1 +j];

    int i=0, j=0, k=l;
    while(i<n1 && j<n2) {
        if(left[i] <= right[j]) arr[k++]=left[i++];
        else arr[k++]=right[j++];
    }
    while(i<n1) arr[k++]=left[i++];
    while(j<n2) arr[k++]=right[j++];
  }
 
  static void swap(int arr[], int i, int j) {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
 
  static void quick(int arr[], int st , int end) {
    if(st>=end) return;
    int pi=partition(arr,st, end);
    quick(arr, st, pi-1);
    quick(arr, pi+1, end);
 }
 
 static int partition(int arr[], int st,int end) {
    int pivot=arr[st];
    int count=0;
    for(int i=st+1;i<=end;i++) {
        if(arr[i] <=pivot) count++;
    }
    int pivotIdx=st+count;
    swap(arr,st,pivotIdx);
    int i=st , j=end;
    while(i<pivotIdx && j>pivotIdx) {
        while(arr[i] <=pivot) i++;
        while(arr[j] >pivot) j--;
        if(i<pivotIdx && j>pivotIdx) {
            swap(arr, i, j);
            i++;
            j--;;
        }
    }
    return pivotIdx;
 }
 
 static int max(int arr[]) {
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++) {
        if(arr[i] > mx) {
            mx=arr[i];
        }
     }
     return mx;
 }
 static void count(int arr[]) {
  int max=max(arr);
  int count[]=new int[max+1];

  for(int i=0;i<arr.length;i++) {
    count[arr[i]] ++;
  }
  int k=0;
  for(int i=0;i<count.length;i++) {
  for(int j=0;j<count[i];j++) {
    arr[k++]=i;
  }
  }
 }
 
 static void countStable(int arr[]) {
    int n=arr.length;
    int output[]=new int[n];
    int max=max(arr);
    int count[]=new int[max+1];
  
    for(int i=0;i<arr.length;i++) {
      count[arr[i]] ++;
    }

    for(int i=1;i<count.length;i++) {
        count[i] +=count[i-1];
    }

    for(int i=n-1;i>=0;i--) {
        int idx=count[arr[i]] -1;
        output[idx]=arr[i];
        count[arr[i]]--;
    }

    for(int i=0;i<n;i++) {
     arr[i]=output[i];
    }
   
 }

 static void countRadix(int arr[] , int place) {
    int n=arr.length;
    int output[]=new int[n];
    int count[]=new int[10];
  
    for(int i=0;i<arr.length;i++) {
      count[(arr[i]/place) %10] ++;
    }

    for(int i=1;i<count.length;i++) {
        count[i] +=count[i-1];
    }

    for(int i=n-1;i>=0;i--) {
        int idx=count[(arr[i]/place)%10] -1;
        output[idx]=arr[i];
        count[(arr[i]/place)%10]--;
    }

    for(int i=0;i<n;i++) {
     arr[i]=output[i];
    }
   
 }

 static void Radix(int arr[]){
    int max=max(arr);
    for(int place =1;max/place >0;place *=10) {
        countRadix(arr, place);
    }
 }
 
 static void bucket(Float []arr) {
    int n=arr.length;
    @SuppressWarnings("unchecked")
    ArrayList<Float> [] buckets=new ArrayList[n];
    for(int i=0;i<n;i++) {
        buckets[i]=new ArrayList<Float>();
    }
    for(int i=0;i<n;i++) {
        int bucketIdx=(int) (arr[i] *n);
        buckets[bucketIdx].add(arr[i]);
    }
    for(int i=0;i<buckets.length;i++) {
        Collections.sort(buckets[i]);
    }
    int idx=0;
    for(int i=0;i<buckets.length;i++) {
        ArrayList<Float> curr=buckets[i];
        for(int j=0;j<curr.size();j++) {
            arr[idx++]=curr.get(j);
        }
    }
 }

 public static void main(String[] args) {
    //  int arr[]={5,3,9,1,0,78,963};
    // int n=arr.length;
    //bubble(arr);
    // selection(arr);
    // insertion(arr);
    // merge(arr, 0, n-1);
    // quick(arr, 0, n-1);
    // count(arr);
    // countStable(arr);
    // Radix(arr);
    Float[] arr2 = {0.2f, 0.65f , 0.95f, 0.89f, 0.03f, 0.78f, 0.34f};
    bucket(arr2);
    for(float i:arr2) {
        System.out.print(i+" ");
    }

}
}
