package com.examples;

import java.util.*; 
import java.io.*; 
  
class CloudJumpLogic 
{ 
	
	public int countValleys(String s)
	{
		
	    int currentlevel = 0, valleylevel = 0;
	    for (int i=0;i<=s.length()-1;i++) {
	    	if(s.charAt(i)=='U') {
	    		currentlevel+=1;
	    		if (currentlevel == 0) // if two times up and two times down --> one valley that's level --> 0
	    		{
	    			valleylevel+=1;
	    		}
	    	}
	    	
	    	else {
	    		currentlevel--;
	    	}
	    }
	    return valleylevel;
	}
	
	public int countMinJumbs(int input,int arrayval[]) {
		int count=0;
		for(int i=0;i<input;i++){
	        if(i+1==input-1 || i+2==input-1){ //1 == 6 || 2 == 6  //3 ==6 || 4==6
	            count++; 
	            break;
	        }
	        if(arrayval[i+2]==0){// arr[2] == 0 // arr[4] == 0
	           i++; //1 // 5
	           count++;//1 //2 
	        }
	        else if(arrayval[i+1]==0){
	           count++;
	        }
        
	}
		return count;
	}
  
   //  
   public static void main(String args[]) 
   { 
	   CloudJumpLogic CJL = new CloudJumpLogic();
	   System.out.println(CJL.countValleys("DDUUDDUDUUUD"));
	   int array[] = {0,1,0,0,0,1,0};
	   //int array[] = {0,0,1,0,0,1,0};
	   System.out.println(CJL.countMinJumbs(7, array));
	   
   } 
} 
  