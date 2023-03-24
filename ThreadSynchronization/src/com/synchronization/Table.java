package com.synchronization;

public class Table {
	synchronized public void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*num);
		}
		
	}
}
