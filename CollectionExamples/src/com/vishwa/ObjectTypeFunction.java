package com.vishwa;

public class ObjectTypeFunction {

	
	public static void main(String[] args) {
		Object []in={1,2,3,4,5,10};
		Float []fl={1.2f,2.3f,3.4f,4.6f,5.5f, 10.4f};
		Double []du={1.2,2.3,3.4,4.6,5.5, 112.4};
		//Object res=(Object) findMax(fl);
		Object res1=findMax(du);
		System.out.println("max is "+res1);
		

	}
	public static Object findMax(Object []obj)
	{
		Integer max = null;
		Float max1=null;
		Double max2=null;
		if(obj instanceof Float[]) {
			 max1= (Float) obj[0];
			 for(int i=0;i<obj.length;i++)
				{
					if((Float)obj[i]>max1)
					{
						max1=(Float)obj[i];
					}
				}
			 return max1;
		}
		else if(obj instanceof Integer[]) {
		max=(Integer) obj[0];
		for(int i=0;i<obj.length;i++)
		{
			if((Integer)obj[i]>max)
			{
				max=(Integer)obj[i];
			}
		}
		return max;
	}
		else  {
			max2=(Double) obj[0];
			for(int i=0;i<obj.length;i++)
			{
				if((Double)obj[i]>max2)
				{
					max2=(Double)obj[i];
				}
			}
			return max2;
		}
		
	}

}
