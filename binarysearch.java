class binarysearch{
    public static void main(String[] args){
        int[] arr={6,1,2,3,4};
        Arrays.sort(arr);
        int ele=10;
        if(binarysearch(arr,ele)){
            System.out.print("ele found");
        }else{
            System.out.print("ele not found");
        }
    }
    public static boolean binarysearch(int[] arr,int ele){
        int low=0,high=arr.length-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            if(ele==arr[middle]){
                return true;
            }
            if(ele>arr[middle]){
                low=middle+1;
            }else{
                high=middle-1;
            }
        }
        return false;
    }
}