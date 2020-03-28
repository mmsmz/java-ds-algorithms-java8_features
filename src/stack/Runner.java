package stack;

public class Runner {
    public static void main(String[] args) {

//        Stack nums = new Stack();
//        nums.push(41);
//        nums.push(22);
//        nums.push(88);
//
//        nums.peek();
//        System.out.println(nums);

        DStack nums = new DStack();
        nums.push(41);
        nums.show();
        nums.push(23);
        nums.show();
        nums.push(15);
        nums.show();
        nums.push(19);
        nums.show();
//        nums.push(48);
//        nums.show();
        nums.pop();
        nums.show();
        //System.out.println(nums.pop());
        System.out.println("size is : " + nums.size());
//        System.out.println("Is Empty :  : " + nums.isEmpty());

    }
}
