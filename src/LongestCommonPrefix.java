class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return an empty string if the input is empty or null
        }
        
        String prefix = strs[0]; // Assume the first string as the initial common prefix
        
        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the prefix, remove the last character from the prefix
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, there is no common prefix among the strings
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example usage
        String[] strings = {"flower", "flow", "flight"};
        String commonPrefix = solution.longestCommonPrefix(strings);
        System.out.println("Longest Common Prefix: " + commonPrefix); // Output: "fl"
    }
}
