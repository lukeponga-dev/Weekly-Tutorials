import java.util.Scanner;

public class tutorial{

    public void main(String[] args) {
            String original = "aaabbcccceeaa";
            String compressed_string = "";
            int count = 0;
           
            for(char i = 0; i <  original.length();i++){
                count++;
               }
            }
    }
}
    /**
     *Q1.
       Implement a method to perform a basic string compression using the counts of repeated characters e.g., 
       the string “aaabbcccceeaa” would become “a3b2c4a2”. If the 
       “compressed” string would not become smaller than the original string,
       your method should return the original string e.g. “abc” would return “abc”.
       You can assume the string has only uppercase and lowercase letters (a-z). *

       *A1. 
       original = "aaabbcccceeaa"
       compressed_string = ""
        count = 0;
        FOR each Character in string
                count++
                if char[i + 1] is diffrent THEN
                    add current character and count to copressed_string
                    count= 0;
                ENDIF
        ENDFOR
        if compressed_string.length < original.length
                return compressed_string
        ELSE
            return original
        ENDIF
        
---------------------------------------------------------------------------------------------------------------------------

        *Q2.
        Given two singly linked lists,
        determine if the two lists intersect. 
        You do not need to return the intersection,
        simply determine if they do intersect. *

        *A2.
        //two linked list Containing common elements 
        Linklist1 = [5, 8, 13, 21, 44]
        LinkList2 = [6, 14,14, 21, 45]
   
        compare each element in LinkList1 to each in Linklist2, 
        if ant rwoelements are the same, then we have an intersection

-----------------------------------------------------------------------------------------------------------------------------

        *Q3.
        Implement a function to check if a linked list is a palindrome. *
        Note: a palindrome is a word, number, 
        sentence or verse that reads the same backward or forward e.g. 
        palindrome
        singly lniked

        kayak, 
        12321,   
        1221 //check if pointer 2 prev is eaul to ponter 1 next
        racecar.

        *A1.
        originals = [k, a, y, a, k]
//        add LL1 to LL2
  //      check if equal
        reverse = []
//       set reverse to empty LinkedList
//     set pointer to the head of original
        while pointer != null
                add value in pointer to reverse
                set pointer to next
        endwhile
        // if reverse.equals(orignal)
                    is is a palindrome
            else
                    not a palindrome
        endif
        set ptr1 to head of original
        set prr2 to head of reverse

        while ptr1 != null AND ptr2 !=null
                check that ptr1.val equals ptr2.val
        IF
               ptr1 = ptr1.next
                ptr2 = ptr2.next
            
                IF ptr1 == null and ptr2 == null
                    return true
            ENDIF       
        ELSE
                return false
        ENDIF
        ENDWHILLE
        return false
Double Linked
    set ptr1 to head
    set ptr2 to tail

    WHILE ptr1 AND ptr2 are NOT null
            IF ptr1 VALUE is NOT equal to ptr2 VALUE
                 return false
            ENDIF

            if ptr1 IS ptr2 || ptr1.next IS ptr2
                    break
            endf

            ptr1 = ptr1.next
            ptr2 = ptr2.prev
    endwhile
    return true
     */
