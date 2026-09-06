class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']' , '[');
        map.put('}','{');

        System.out.println(map);

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == map.get(c))
                //System.out.println("theres smth now" + stack.peek());
                stack.pop();
                else{
                    return false;
                }
                //System.out.println(stack.isEmpty());
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
