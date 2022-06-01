# Sets

### Q1. Array of elements which contains duplicates, whats the fastest way to remove duplicates in order to create a set?

    A.
                Set newSet to empty set
                FOR each item in array
                    IF NOT hasElemet AND item NOT in newSet 
                        add item to newSet
                    ENDIF
                END FOR

                boolean not_in (element)
                FOR each item in set
                    IF element == item
                        return false
                    ENDIF
                ENDFOR
                return true
  
### Q 2. Given an array of strings called "words",group the anagrams togerther as sets you can return the answer in any order

            A. 
                words = [cat, but, bat, tab, tub]
                c = 99
                a = 97
                t = 116
                sum = 312
  
### Q What is the fastest way to ensure two sets are equivalent

            A.
                 Set A ⊆ Set B
                A = [1, 2, 4] & B = [1, 2, 4]
                A is subset of B && B is subset of A
                FOR each item in array
                    is_subset{setA, setB)
                    if setA.length != setB.length
                        return FALSE
                        for each item in A:
                        for each item in B:
                isSubset (setB)
                IF isEmpty():
                    return TRUE
                    FOR each element:
                        if(!setB.contain(element)):
                            return FALSE
                        ENDIF
                    ENDFOR
                return TRUE
