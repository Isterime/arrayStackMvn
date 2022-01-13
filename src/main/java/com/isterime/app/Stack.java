
package com.isterime.app;
public class Stack 
{

    private int initialSize = 10; 
    private int[] stackArr; //assiging name of array to stackArr
    private int head; // top aka what im indexing
    
    public Stack() //so its basically like the Random() instead of callign
                    // from a lib im definign here
    {
    // Initialize the array
    //this creates the empty array of size (initial size) 
    //this sets head to value -1
    //initialization of instance variables happens here
        stackArr = int[initialSize];
        head = -1;
    }


    public Stack(int size) 
    {
    // Instead of making to initialsize like above it makes it to user input
    //slightly different constructor, 
    //where the user provides the starting size of the arra
        stackArr = int[size];
        head = -1;
    }
    
    public int push(int item)
    {
        if(isFull())
        {
            //make new array with size head+1 times 2 and populate
           
            int[] tempArray = new int[10];
            int arrayLength = 0;
            int doubleLength = 0;
            arrayLength = stackArr.length; 
            doubleLength = arrayLength * 2;
            int[] tempArr = new int[doubleLength];
            int i = 0;
            
            while(i < head)
            {
                tempArr[i] = stackArr[i];
                i++;
            }
            
            i = 0;
            stackArr = int[doubleLength];
            
            while(i < head)
            {
                stackArr[i] = tempArr[i];
                i++;
            }
            //all of this can be done in copy?
        }
        
        stackArr[head +1] = item; //head+1 because start -1
        head ++;      
        return item;
    }

    public int pop()
    {   int tempValue = 0;
        tempValue = stackArr[head];
        head = head - 1;
        return tempValue;
    }
   
    public int peek()
    {
        return stackArr[head];
    }
    

    public boolean isEmpty()
    {
        if(head == -1)
        {
            return true;
        }
        return false;
    }
   
    private boolean isFull()
    {
        //int headOne = head + 1;
        if(head + 1 ==  stackArr.length)
        {
            return true; 
        }
        
        return false;
    }
    
    public int[] toArray()
    {//make reverse array and print
        int[] tempArray = new int[head + 1]; 
        for(int i = head; head != -1; i--)
        {
           // int[] tempArray;
            int j = 0;
            //tempArray = new int[head + 1];
            tempArray[j] = stackArr[i];
            j++;
           //1 return tempArray;
        }
       return tempArray;
    }
    
    public int length()
    {
        int length = 0;
        length = stackArr.length;
        return length;
    }
    public String toString()
    { // int[] tempArray = new stackArr.toArray()
        int[] tempArray = new int[head + 1];
        for(int i = head; head != -1; i--)
        {
            //int[] tempArray;
            int j = 0;
            //tempArray = new int[head + 1];
            tempArray[j] = stackArr[i];
            j++;
        }
        System.out.println(tempArray.toString());
        return tempArray.toString();
    }
    //public void printStack()

//LEARN HOW TO THROW EXCEPTIONS
}

