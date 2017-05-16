package Third;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*this programe is doing that:
-----创建一个名为PIMCollection的类来实现接口集合

	@author 吕学民 14130110061 mouron@qq.com
*/

public class PIMCollection extends ArrayList<PIMEntity>{
	/**
	 * PIMCollection继承自ArrayList，List 接口的大小可变数组的实现
	 */
	private static final long serialVersionUID = 1L;
//serialVersionUID 用来表明实现序列化类的不同版本间的兼容性，如果修改了此类, 要修改此值
	
	PIMCollection notes;
	PIMCollection todos;
	PIMCollection appointments;
	PIMCollection contact;
	PIMCollection date;
	//5种 PIMCollection 包含 已有的 Entity 类型
	
	public Collection<PIMEntity> getNotes() {
		//getNotes()返回一个包含当前在PIMCollection中的所有PIMNote项目的集合
		notes = new PIMCollection();
		for(int i=0;i<this.size();i++){
			if (this.get(i) instanceof PIMNote) {
				notes.add(this.get(i));
			}
		}
		return notes;
	}
	
	public Collection<PIMEntity> getTodos() {
		//getNotes()返回一个包含当前在PIMCollection中的所有PIMTodo项目的集合
		todos = new PIMCollection();
		for(int i=0;i<this.size();i++){
			if (this.get(i) instanceof PIMTodo) {
				todos.add(this.get(i));
			}
		}
		return todos;
	}
	
	public Collection<PIMEntity> getAppointments() 
	{
		//getAppointments()返回一个包含当前在PIMCollection中的所有PIMAppointment项目的集合
		appointments = new PIMCollection();
		for(int i=0;i<this.size();i++)
		{
			if (this.get(i) instanceof PIMAppointment) 
				appointments.add(this.get(i));
		}
		return appointments;
	}
	
	public Collection<PIMEntity> getContact() 
	{
		//getContacts()返回一个包含当前在PIMCollection中的所有PIMContact项目的集合
		contact = new PIMCollection();
		for(int i=0;i<this.size();i++)
		{
			if (this.get(i) instanceof PIMContact) 
				contact.add(this.get(i));
		}
		return contact;
	}
	
	public Collection<PIMEntity> getItemsForDate(Date d) {
		//getItemsForDate()返回一个包含当前在PIMTodo和PIMAppointment中的所有Data的集合
		date = new PIMCollection();
		for(int i=0;i<this.size();i++)
		{
			if (this.get(i) instanceof PIMTodo) 
			{
				if (equalsDate(d, ((PIMTodo)this.get(i)).getDate()))
					date.add(this.get(i));
			}
			else if (this.get(i) instanceof PIMAppointment) 
			{
				if (equalsDate(d, ((PIMAppointment)this.get(i)).getDate())) 
					date.add(this.get(i));
			}
		}
		return date;
	}
	
	private boolean equalsDate(Date date1,Date date2) 
	{
		if (date1.toString().equals(date2.toString())) 
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		PIMCollection test = new PIMCollection();
		//new一个PIMCollection 实例列表 test
		
		PIMContact mContact = new PIMContact();
		mContact.fromString("Gen,Mouron,mouron@qq.com,normal");
		//利用其内部函数初始化PIMCollection集合中的PIMContact类实例mContact
		test.add(mContact);
		//add(E e) 将指定的元素添加到此列表(test)的尾部。
		
		PIMTodo mTodo = new PIMTodo();
		Date date1 = new Date();
		date1.setDate(1);
		date1.setYear(2017);
		date1.setMonth(5);
		mTodo.setDate(date1);
		mTodo.fromString("reading books in coffee room,normal");
		//利用其内部函数初始化PIMCollection集合中的PIMTodo类实例mTodo
		test.add(mTodo);
		
		PIMAppointment mAppointment = new PIMAppointment();
		Date date2 = new Date();
		date2.setDate(30);
		date2.setYear(2017);
		date2.setMonth(4);
		mAppointment.setDate(date2);
		mAppointment.fromString("see Caser in KongGongDa,normal");
		//利用其内部函数初始化PIMCollection集合中的PIMAppointment类实例 mAppointment
		test.add(mAppointment);
		
		PIMNote mNote = new PIMNote();
		mNote.fromString("Donot forget Konan's birthday is 5 4th.,normal");
		//利用其内部函数初始化PIMCollection集合中的PIMNote类实例 mNote		
		test.add(mNote);
	
		Collection<PIMEntity> getTodo = test.getTodos();
		for (PIMEntity pimEntity : getTodo) 
			System.out.println(pimEntity.toString());

		System.out.println("------------------");
		Collection<PIMEntity> getNote = test.getNotes();
		for (PIMEntity pimEntity : getNote) 
			System.out.println(pimEntity.toString());

		System.out.println("------------------");
		Collection<PIMEntity> getAppointment = test.getAppointments();
		for (PIMEntity pimEntity : getAppointment) 
			System.out.println(pimEntity.toString());

		System.out.println("------------------");
		Collection<PIMEntity> getContact = test.getContact();
		for (PIMEntity pimEntity : getContact) 
			System.out.println(pimEntity.toString());

		System.out.println("------------------");
/*
		Collection<PIMEntity> getDate = test.getItemsForDate(date2);
		for (PIMEntity pimEntity : getDate) 
			System.out.println(pimEntity.toString());
*///单独测试date2
	}
}

