package com.company;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        /*
        stack = LIFO data structure . Last-In First-Out
                stores objects into a sort of "vertical tower"
                push() to add to the top
                pop() to remove from the top
         */
        Stack<String> stack = new Stack<>();

//        System.out.println(stack.isEmpty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

//        stack.pop();

//        String myFavGame = stack.pop();
//        System.out.println(myFavGame);
//        System.out.println(stack.peek());
//        System.out.println(stack.search("FFVII"));
//        System.out.println(stack);

        /*
        Uses of stacks ?
        1. undo/redo features in text editors
        2. moving back/forward through browser history
        3. backtracking algorithms (maze, file directories)
        4. calling functions (call stack)
        */
    }
}
