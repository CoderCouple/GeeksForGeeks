package GeeksForGeeks;

public class BinaryFloorSearch {

    public static int binaryFloorSearch(int [] nums, int key){
      if(nums==null || nums.length==0)
          return -1;
      int start=0;
      int end=nums.length-1;

      while(end-start>1)
      {
          int mid=start+(end-start)/2;
          if(nums[mid]<key)
              start=mid;
          else end=mid;
      }
        return nums[start];
    }

    public static int binaryCeilSearch(int [] nums, int key){
        if(nums==null || nums.length==0)
            return -1;
        int start=0;
        int end=nums.length-1;

        while(end-start>1)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]<key)
                start=mid;
            else end=mid;
        }
        return nums[end];
    }

    public static void main(String args[]){
        int array[] ={1,2,3,4,6,7,8,9};
        int key=5;
        System.out.println(binaryFloorSearch(array,key));
        System.out.println(binaryCeilSearch(array,key));
    }
}
