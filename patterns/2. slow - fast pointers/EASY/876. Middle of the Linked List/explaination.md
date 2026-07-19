To find the middle of the linked list
with help of slow and fast pointers, as fast pointer traverse twice as slow, if fast is at the end 
slow will be in the middle ,
exactly half the length of the fast pointer, which is the middle of the linkedlist
if we get fast or fast.next == null, return slow

if there is a loop in the linkedlist, no middle is found, as our condition will not be satisfied of fast or fast.next being null, in that case, return null

initially

slow <- fast <- head

    while fast != null && fast.next != null

// logic is like, fast will traverse twice as slow per iteration
i.e., slow = slow.next
      fast = fast.next.next 


      if(fast == null || fast.next == null)
        return slow   

return null