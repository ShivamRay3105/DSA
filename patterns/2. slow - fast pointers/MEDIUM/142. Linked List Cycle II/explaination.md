to find the beginning of the cycle,
first we will find if there exist a cycle or not

so repeat steps as leetcode problem 141
if cycle found, instead of returning true, 
reset slow pointer, and until slow!!=fast, traverse both by moving forward by 1, 
i.e., slow = slow.next
      fast = fast.next

the point where they meet, return slow

if there is no cycle detected, 
return null

    while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast){
                    slow = head;
                    while(slow!=fast){
                        slow=slow.next;
                        fast = fast.next;
                    }
                return slow;
                }
            }
            return null;