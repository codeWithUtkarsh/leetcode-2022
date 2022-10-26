/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Triplet implements Comparable<Triplet>{
    ListNode lists;
    
    public Triplet(ListNode lists){
        this.lists = lists;
    }
    
    public int compareTo(Triplet t){
        if(t.lists.val < lists.val){
            return 1;
        }else{
            return -1;
        }
    }
}
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        
        
        PriorityQueue<Triplet> q = new PriorityQueue<>();
        
        for(int i=0; i<lists.length; i++){
            if(lists[i] == null){
                continue;
            }
            q.add(new Triplet(lists[i]));
        }
        
        
        ListNode res = new ListNode();
        ListNode tmp = res;
        
        while(!q.isEmpty()){
            Triplet curr = q.poll();
            res.next = curr.lists;
            res = res.next;
            
            if(curr.lists.next != null)
                q.add(new Triplet(curr.lists.next));
        }
        
        return tmp.next;
            
    }
}