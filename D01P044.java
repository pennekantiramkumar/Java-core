package com.learning.core.day1session1;

	import java.util.ArrayList;
	import java.util.List;
	
	public class D01P044 {
	    public static List<List<Integer>> findCombinations(int[] nums, int k) {
	        List<List<Integer>> result = new ArrayList<>();
	        List<Integer> combination = new ArrayList<>();
	        backtrack(nums, k, 0, combination, result);
	        return result;
	    }

	    private static void backtrack(int[] nums, int k, int start, List<Integer> combination, List<List<Integer>> result) {
	        if (combination.size() == k) {
	            result.add(new ArrayList<>(combination));
	            return;
	        }
	        for (int i = start; i < nums.length; i++) {
	            combination.add(nums[i]);
	            backtrack(nums, k, i + 1, combination, result);
	            combination.remove(combination.size() - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3};
	        int k = 2;
	        List<List<Integer>> combinations = findCombinations(nums, k);
	        for (List<Integer> combination : combinations) {
	            System.out.println(combination);
	        }
	    }
	}
