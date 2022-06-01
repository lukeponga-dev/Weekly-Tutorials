# tutorial-4

<h> Q1) Insert the following values into an ordered linked list: 2, 3, 1, 4, 5.
Describe your ordered linked list textually as: x -> y -> z -> … \*<h>

A1) 
<p> left 1 -> head 2 -> right 3 -> right 4 -> right 5<br>
Process the head node,<br>
process the next node,<br>
 if greater then head insert right z,<br>
    else less then head insert left y,<br>
insert a new head x with y value.</p><br>
   head = 2 <br>
   left -> head -> right <br>
   head -> 2 -> 3<br>
   head <- 1 -> 2 -> 3 -> <br>
   head -> 1 -> 2 -> 3 -> 4 -> 5<br>
   | 1 | 2 | 3 | 4 | 5 | 


---

Q2) Insert the following values into a binary search tree: 2, 3, 1, 4, 5.
Describe your ordered BST textually as: Root x, left y, right z. Root y, left … \*

A2)
Root 2, left 1, right 3
root 3,  right 4, right 5

       | 2 |
      /     \
    | 1 |  | 3 |
             \
            | 4 |
               \
              | 5 |

---

Q3) Insert the following values into an AVL tree: 2, 3, 1, 4, 5.
(a) Did your tree need to be balanced? If so, what was the balance factor before balancing? What type
of imbalance was it? And what type of rotation did you use to correct the imbalance?
(b) Describe your AVL tree textually as: Root x, left y, right z. Root y, left … \*

A3)

       | 2 |
      /     \
    | 1 |  | 3 |
             \
            | 4 |
               \
              | 5 |

a) Yes,
H(xleft) - h(xright),
right heavy, 
rotate left on 4 and 3

 \*


b)
Root: 2 left 1, right 4, 
Root: 4, left 3, right 5,

        | 2 |
       /     \
    | 1 |   | 4 | 
           /     \
        | 3 |  | 5 |

---

Q4) Search for the value 5 in each of your data structures (linked list, BST, AVL). For each data structure,
how many values did you visit before you found the value 5? Discuss searching for each data structure in general. \*

A4) 4 values were visited

      | 2 |
     /     \
  | 1 |   | 3 |
             \  
            | 4 |
               \    
             | 5 |

---