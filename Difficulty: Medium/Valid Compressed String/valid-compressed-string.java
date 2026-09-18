class Solution { 
    public boolean checkCompressed(String s, String t) { 
        int n = s.length(), m = t.length(); 
        int i = 0, j = 0; 
        while (i < n && j < m) { 
            if (s.charAt(i) == t.charAt(j)) { 
                i++; 
                j++; 
            } else if (Character.isDigit(t.charAt(j))) { 
                long d = 0; 
                while (j < m && Character.isDigit(t.charAt(j))) { 
                    d = d * 10 + (t.charAt(j) - '0'); 
                    j++; 
                    if (d > n) { 
                        d = n + 1; 
                    } 
                } 
                i += d; 
                if (i > n) { 
                    return false; 
                } 
            } else { 
                return false; 
            } 
        } 
        return i == n && j == m; 
    } 
}
