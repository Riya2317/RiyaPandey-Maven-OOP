package NewYearGift.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App 
{
	public Scanner input;
    public static void main( String[] args )
    {
        Kitkat kitkat = new Kitkat();
        DairyMilk dairyMilk = new DairyMilk();
        Pulse pulse = new Pulse();
        Bourbourn bourbourn = new Bourbourn();
        Munch munch = new Munch();
        ArrayList<chocolates> chocList = new ArrayList<chocolates>();
        chocList.add(kitkat);
        chocList.add(dairyMilk);
        chocList.add(pulse);
        chocList.add(bourbourn);
        chocList.add(munch);
        HashMap<chocolates, ArrayList<Integer>> priceOfChocolates =
        								new HashMap<chocolates, ArrayList<Integer>>();
        for(chocolates list:chocList)
        {
        	list.description();
        	list.price();
        	ArrayList<Integer> range =list.getRange();
        	priceOfChocolates.put(list,range);
        }
        for (chocolates name: priceOfChocolates.keySet())
        {
            System.out.println(name + " " + priceOfChocolates.get(name));  
        }
    }
}
interface sweets
{
	void description();
}
interface chocolates extends sweets
{
	void price();
	ArrayList<Integer> getRange();
}
class Kitkat implements chocolates
{
	SetPrice kiPrice = new SetPrice();
	public void description()
	{
		System.out.print("{Nestle product !!!}");
	}
	public void price()
	{	
		kiPrice.setFromRange(5);
		kiPrice.setToRange(100);
	}
	public ArrayList<Integer> getRange() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(kiPrice.getFromRange());
		list.add(kiPrice.getToRange());
		return list;
	}	
	@Override
	public String toString()
	{
		return "[kitkat]";
	}
}
class DairyMilk implements chocolates
{
	SetPrice dPrice = new SetPrice();
	public void description()
	{
		System.out.print("{Cadbury product !!!}");
	}
	public void price()
	{
		dPrice.setFromRange(5);
		dPrice.setToRange(100);
	}
	public ArrayList<Integer> getRange() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(dPrice.getFromRange());
		list.add(dPrice.getToRange());
		return list;
	}
	@Override
	public String toString()
	{
		return "[DairyMilk]";
	}
}
class Pulse implements chocolates
{
	SetPrice puPrice = new SetPrice();
	public void description()
	{
		System.out.println("{Nestle product !!!}");
	}
	public void price()
	{	
		puPrice.setFromRange(5);
		puPrice.setToRange(100);
	}
	public ArrayList<Integer> getRange() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(puPrice.getFromRange());
		list.add(puPrice.getToRange());
		return list;
	}
	@Override
	public String toString()
	{
		return "[Pulse]";
	}
}
class Bourbourn implements chocolates
{
	SetPrice bPrice = new SetPrice();
	public void description()
	{
		System.out.println("{BourBourn product !!!}");
	}
	public void price()
	{
		
		bPrice.setFromRange(5);
		bPrice.setToRange(100);
	}
	public ArrayList<Integer> getRange() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(bPrice.getFromRange());
		list.add(bPrice.getToRange());
		return list;
	}
	@Override
	public String toString()
	{
		return "[BourBourn]";
	}
}
class Munch implements chocolates
{
	SetPrice mPrice = new SetPrice();
	public void description()
	{
		System.out.print("{Nestle product !!!}");
	}
	public void price()
	{
		mPrice.setFromRange(5);
		mPrice.setToRange(100);
	}
	public ArrayList<Integer> getRange() 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(mPrice.getFromRange());
		list.add(mPrice.getToRange());
		return list;
	}
	@Override
	public String toString()
	{
		return "[Munch]";
	}
}