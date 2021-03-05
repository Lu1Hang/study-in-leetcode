class Solution {
public:
    int maxx(vector<int>& nums,int target){
        int len = nums.size();
        int left = 0, right = len-1 , mid, ans = -2;
        while (left <= right)
        {
            mid =left + (right - left)/2;
            if (nums[mid] > target)
            {
                right = mid-1; 
                //ans = right;
            }
            else { 
                left = mid+1;
                ans = left;
            }   
        }
        return ans;
    }

    int minn(vector<int>& nums,int target){
        int len = nums.size();
        int left = 0, right = len-1 ,mid ,ans = -2;
        while (left <=right) 
        {
            mid = left + (right - left)/2;
            if (nums[mid] < target)
            {
              
                left = mid+1; 
              //  ans = left;
            }
            else{  
               right = mid-1;ans = right;
            }
        }
        return ans;
    }

    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> tmp;
        int a = minn(nums, target);
        int b = maxx(nums, target);
        if (a==-2 || b==-2)
            return {-1,-1};
        else if (nums[a+1]==target && nums[b-1]==target )
            return {a+1,b-1};
        else return{-1,-1};
    }
};
