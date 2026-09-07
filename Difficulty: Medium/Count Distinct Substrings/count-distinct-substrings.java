class Solution {
    static class State {
        int len, link;
        Map<Character, Integer> next = new HashMap<>();
    }

    public static int countSubs(String s) {
        List<State> st = new ArrayList<>();
        st.add(new State()); // initial state
        st.get(0).len = 0;
        st.get(0).link = -1;

        int last = 0;

        for (char c : s.toCharArray()) {
            int cur = st.size();
            st.add(new State());
            st.get(cur).len = st.get(last).len + 1;

            int p = last;
            while (p != -1 && !st.get(p).next.containsKey(c)) {
                st.get(p).next.put(c, cur);
                p = st.get(p).link;
            }

            if (p == -1) {
                st.get(cur).link = 0;
            } else {
                int q = st.get(p).next.get(c);
                if (st.get(p).len + 1 == st.get(q).len) {
                    st.get(cur).link = q;
                } else {
                    int clone = st.size();
                    st.add(new State());
                    st.get(clone).len = st.get(p).len + 1;
                    st.get(clone).next.putAll(st.get(q).next);
                    st.get(clone).link = st.get(q).link;

                    while (p != -1 && st.get(p).next.get(c) == q) {
                        st.get(p).next.put(c, clone);
                        p = st.get(p).link;
                    }

                    st.get(q).link = clone;
                    st.get(cur).link = clone;
                }
            }
            last = cur;
        }

        long ans = 0;
        for (int i = 1; i < st.size(); i++) {
            ans += st.get(i).len - st.get(st.get(i).link).len;
        }
        return (int) ans;
    }
}
