to check if there is cycle in the linkedlist or not

initially

slow <- fast <- head

    while fast != null && fast.next != null

// logic is like, fast will traverse twice as slow per iteration
i.e., slow = slow.next
      fast = fast.next.next 


      if(both pointers meet at same node)
        <!-- proves that there exist a loop -->
        return true // loop found

return false