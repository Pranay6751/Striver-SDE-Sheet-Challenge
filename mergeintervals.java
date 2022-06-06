import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    
    static class pair implements Comparable<pair>{
        int start,end;
        Interval i;
        pair(int s,int e,Interval i)
        {
            start=s;
            end=e;
            this.i=i;
        }
        public int compareTo(pair o)
        {
            return this.start-o.start;
        }
    }
    public static List<Interval> mergeIntervals(Interval[] a) {
        ArrayList<Interval>ll=new ArrayList();
        
        Stack<pair>st=new Stack();
        pair[] p=new pair[a.length];
        int ind=0;
        for(int i=0;i<a.length;i++)
        {
            p[ind++]=new pair(a[i].start,a[i].finish,a[i]);
        }
        Arrays.sort(p);
        st.push(p[0]);
        int ie=st.peek().end;
        for(int i=1;i<p.length;i++)
        {
            if(p[i].start<=ie)
            {
                ie=Math.max(ie,p[i].end);
                continue;
            }
            else
            {
                pair cur=st.pop();
                cur.i.finish=ie;
                ll.add(cur.i);
                st.push(p[i]);
                ie=p[i].end;
            }
        }
        if(!st.isEmpty())
        {
            pair cur=st.pop();
                cur.i.finish=ie;
                ll.add(cur.i);
        }
        // while(!st.isEmpty())
        // {
        //     ll.add(st.pop().i);
        // }
        return ll;
    }
}











