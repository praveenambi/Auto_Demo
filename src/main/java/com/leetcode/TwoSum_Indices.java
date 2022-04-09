package com.leetcode;





/*
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
 * nums[0] + nums[1] == 9, we return [0, 1].
 */


public class TwoSum_Indices {

	@SuppressWarnings("null")
	public  static  int[] indices(int[] nums, int target) {
		
		int[] arr = new int[2] ;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {

				if((nums[i] + nums[i+1]) == target) {

					System.out.println(i +" ," + (i+1));
					arr[i]=i;
					arr[j]=j;
							
					break;
				}

			}

		}

		System.out.println(arr[0] +" " +  arr[1]);
		return  arr;
		

	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {


		int[] nums = {2,7,11,15};

		int target = 9 ;

		indices(nums, target);









	}

}
