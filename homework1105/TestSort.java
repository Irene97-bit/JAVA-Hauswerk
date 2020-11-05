import java.util.ArrayList;

public class TestSort {
	
    ArrayList<Number> list = new ArrayList<Number>();
    
    public TestSort() {
    	
    }
    	
    public TestSort(ArrayList<Number> list) {
    	this.list = list;
    }
    
    //比较ArrayList元素的大小 置换下标位置
	public static void sort(ArrayList<Number> list) 
	{
		for (int i = 0; i< list.size()-1; i++) 
		{
            Number maxnumber = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(j).intValue() < maxnumber.intValue())
                {
                    minIndex = j;
                    maxnumber = list.get(j);
                }
            }
            if (minIndex != i)
            {
                list.set(minIndex, list.get(i));
                list.set(i, maxnumber);
		    }
		}
	}
	//向ArrayList里增加测试数据
	public static void main(String[] args) 
	{
		ArrayList<Number> list = new ArrayList<>();
		list.add(3);
		list.add(90);
		list.add(23);
		list.add(100);
		list.add(2);
		list.add(7828);
		SortArray.sort(list);
		for ( int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

	}
}
