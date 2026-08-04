class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations) {
            switch(op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2 *stack.peek());
                    break;
                case "+":
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(second);
                    stack.push(first);
                    stack.push(first+second);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }
        int sum = 0;
        System.out.println(stack);
        int n= stack.size();
        for(int i=0;i<n;i++) {
            sum+=stack.pop();
        }
        return sum;
    }
}