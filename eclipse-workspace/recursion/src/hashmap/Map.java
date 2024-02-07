package hashmap;
import java.util.*;
public class Map<k,v> {
    ArrayList<MapNode<k,v>> bucket;
    int size;
    int numbucket;
    public Map(){
    	numbucket=20;
    	bucket=new ArrayList<>(20);
    	for(int i=0;i<20;i++) {
    		bucket.add(null);
    	}
    }
    private int getbucketindex(k key) {
    	int hashcode=key.hashCode();
    	return hashcode%numbucket;
    }
    public void insert(k key,v value){
    	
    	int bucketIndex=getbucketindex(key);
    	   MapNode<k,v> head=bucket.get(bucketIndex);
    	   while(head!=null) {
    		   if(head.key.equals(key)){
    			   head.value=value;
    		   }
    		   head=head.next;
    	   }  
    	   size++;
    	   head=bucket.get(bucketIndex);
    	   MapNode<k,v> newnode=new MapNode<>(key,value);
    	   newnode.next=head;
    	   bucket.set(bucketIndex,newnode);
    	   double loadfactor=(1.0*size) / numbucket;
    	   if(loadfactor>0.7){
    		   rehash();
    	   }
    	   
      }
    public void rehash(){
    	System.out.println("Rehashing: buckets " + numbucket + " size " + size);
    	ArrayList<MapNode<k,v>> temp=bucket;
    	 bucket=new ArrayList<>();
    	for(int i=0;i<2*numbucket;i++) {
    		bucket.add(null);
    	}
    	size=0;
    	numbucket=numbucket*2;
    	
    	for(int i=0;i<temp.size();i++) {
    		  MapNode<k,v> head=temp.get(i);
    		  while(head!=null){
    			    k key=head.key;
    			    v value=head.value;
    			    insert(key,value);
    			    head=head.next;
    		  }
    	}
    }
    
    
    public Double LaodFactor(){
    	return 1.0*size/numbucket;
    }
    public boolean search(k key){
    	int bucketindex=getbucketindex(key);
    	MapNode<k,v> head=bucket.get(bucketindex);
    	while(head!=null) {
    		if(head.key.equals(key)) {
    			return true;
    		}
    		head=head.next;
    	}
    	return false;
    }
    
    public int size() {
    	return size;
    }
    
    public v getvalue(k key) {
    	int bucketIndex=getbucketindex(key);
    	MapNode<k,v> head=bucket.get(bucketIndex);
    	 while(head!=null) {
    		 if(head.key.equals(key)) {
    			 return head.value;
    		 }
    		 head=head.next;
    	 }
    	 return null;
    	
    }
    public v remove(k key){
    	int bucketIndex=getbucketindex(key);
    	MapNode<k,v> head=bucket.get(bucketIndex);
    	MapNode<k,v> prev=null;
    	 while(head!=null) {
    		 if(head.key.equals(key)) {
    			 size--;
    			if(prev==null){
    				bucket.set(bucketIndex, head.next);
    				
    			}else {
    				prev.next=head.next;
    				
    			}
    			return head.value;
    		 }
    		 prev=head;
    		 head=head.next;
    	 }
    	
    	return null;
    }  
    	
    	
    }
    

