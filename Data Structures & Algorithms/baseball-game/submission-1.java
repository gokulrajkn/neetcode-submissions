class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum  = 0;
        for(String op : operations) {
            switch(op) {
                case "C":
                    sum-=stack.pop();
                    break;
                case "D":
                    sum+=stack.push(2 *stack.peek());
                    break;
                case "+":
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(second);
                    stack.push(first);
                    sum+=stack.push(first+second);
                    break;
                default:
                    sum+=stack.push(Integer.parseInt(op));
                    break;
            }
        }
        return sum;
    }
}