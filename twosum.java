//LeetCode problem find the element locations which provides target sum
/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 
Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
*/
//Code
import java.util.*;
class Solution {
public static int[] twoSum(int[] nums, int target) 
{
int n=nums.length ;
int num1[]=new int[n];
int k=0;  
for(int i=0;i<n;i++)  
    {
    for(int j=i+1;j<n;j++)
    {
        if(nums[i]+nums[j]==target)
            {
            num1[k++]=i;
            num1[k++]=j;
            }
                }
}  
int num2[] = new int[k];
for(int i=0;i<k;i++)
num2[i]=num1[i];
return num2;
}

public static void main(String args[])
{ 
int len,tar;
System.out.println("Enter Target Array Length");
try (Scanner in = new Scanner(System.in)) {
len=in.nextInt();
System.out.println("Enter Array Elements");
int arr[]= new int[len];
    for(int i=0; i < len ; i++ )
    arr[i]=in.nextInt();
System.out.println("Enter Target sum");
tar=in.nextInt();
int[] arr1=twoSum(arr,tar);
for(int i=0 ; i < arr1.length ; i++ )
System.out.print(arr1[i]+" ");
}
}

}
