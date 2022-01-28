package balaji.AssistedPractice;

public class UsingTryCatchBlock {
	    public static void main(String args[]) 
	    {
	        int[] array = new int[3];
	        try 
	        {
	            array[8] = 3;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size " + array.length);
	        }
	    }
	}

