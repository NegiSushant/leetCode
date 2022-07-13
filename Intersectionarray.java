//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.


class Intersectionarray {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if(nums1.length==0)
            return nums1;
        
        if(nums2.length==0)
            return nums2;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j] )
                i++;
            
            else if(nums2[j]<nums1[i])
                j++;
            
            else if(nums1[i]==nums2[j])
            {
                nums1[k++]=nums1[i];
                i++;            
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
        
    }
}