package org.example.dsfromscratch;

/*
* Stack Operations:
* Modifiers:
* push: add element to the top of the stack
* pop: remove element from the top of the stack
*
* Observers:
* top: top element of the stack
* isEmpty: is stack empty
* isFull: Is stack Full
*   if implemented using array, the capacity, else if using linked list, available memory size maybe?
* */


interface Stack {

    // modifiers
    // If can push, then push and return true else return false
    boolean push(String val);
    String pop();

    Object[] getStackObj();

    // observers
    boolean isEmpty();
    boolean isFull();
    String getTop();
    int getTopIndex();
}


//class StackUsingLinkedList implements Stack{
//
//}

class StackUsingArray implements Stack{

    String[] stackArr;
    int CAPACITY, top;

    StackUsingArray() {
        CAPACITY = 1000;
        top = -1;
        stackArr = new String[CAPACITY];
    }

    @Override
    public boolean push(String val) {
        if(top >= CAPACITY){
            return false;
        }
        stackArr[++this.top] = val;
        return true;
    }

    @Override
    public String pop() {
       if(this.top == -1) return null;

       var tempTop = stackArr[top];
       stackArr[top--] = null;
       return tempTop;
    }

    @Override
    public Object[] getStackObj() {
        return this.stackArr;
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public boolean isFull() {
        return this.top >= CAPACITY;
    }

    @Override
    public String getTop() {
        if(top >= 0)
            return this.stackArr[top];
        return null;
    }

    @Override
    public int getTopIndex() {
        return this.top;
    }

}



public class StackADT {
    public static void stackUse() {
        Stack stk =  new StackUsingArray();
        var strArr = new String[] {"The", "Quick",
                                   "Brown", "Fox",
                                  "Jomped","Over", "the", "Lazy", "Dog"};

        System.out.println("PUSH OPERATIONS");
        for ( var str : strArr ) {
            stk.push(str);
            System.out.printf("inserted, topIndex, topValue %S, %d, %S\n",
                    str,
                    stk.getTopIndex(),
                    stk.getTop()
            );
        }

        System.out.println("POP OPERATIONS");
        while( !stk.isEmpty() ){
            System.out.printf("After pop topValue, topIndex %S, %S\n",
                    stk.pop(),
                    stk.getTopIndex());
        }






    }
}
