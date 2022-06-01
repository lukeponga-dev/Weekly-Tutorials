/*
Q.1 Revisiting duplicates: given an array of elements which contains duplicates, 
    what is the fastest way to remove duplicates in order to create a set? 
    Write your answer in pseudo code. Assume you have a BST implementation which does not allow duplicates with a valid insert method. 
    
    A.1: 
    [t, 3, 2, 5, 5, 2, 4]
    Set values to empty array []
    set stack to empty stack
    set curr to root of tree

while curr != null
    push curr onto stack
    set current left subtree
edwhile

while stack is not empty
    set temp node to stack.pop()
    add value in temp to values array
    if temp is not null THEN
        set temp to temp.right
         while temp != null
            push temp onto stack
            set temp to temp.left
        endwhile
    enfif
endwhile
------------
Q.2: Is your solution iterative or recursive? Explain which solution would be faster and why. 

    A.1: iterative
    even tho we have recursive we are just visiting every node once
-----------------
Q.3:Is your solution better than the options discussed in tutorial #1 using arrays and/or linked lists? Why or why not? Explain your answer.
    A.3: Yes This solution is better than the brute force method, its similar to a sorting method.

 */
