class Solution {
	public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
		// code here
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> inner = new ArrayList<>();
		subset(list, inner, 0, arr);
		return list;
	}
	
	public void subset(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> inner, int i, int[] arr) {
		
		if (i == arr.length) {
			list.add(new ArrayList(inner));
			return;
		}
		
		inner.add(arr[i]);
		subset(list, inner, i + 1, arr);
		
		inner.remove(inner.size() - 1);
		subset(list, inner, i + 1, arr);
	}
}
