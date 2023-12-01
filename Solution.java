class Solution {
    public String decodeMessage(String key, String message) {
        char[] temp = new char[26];
        Arrays.fill(temp, '?');
        int index = 0;
        for (char letter : key.toCharArray()) {
            if (letter == ' ' || temp[letter-'a'] != '?') {
                continue;
            }
            temp[letter-'a'] = (char) ((char) index + 'a');
            index++;
        }
        String ans = "";
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                ans += c;
                continue;
            }
            ans += temp[c-'a'];
        }
        return ans;
    }
}
