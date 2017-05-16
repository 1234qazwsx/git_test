package Third;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*this programe is doing that:
-----����һ����ΪPIMCollection������ʵ�ֽӿڼ���

	@author ��ѧ�� 14130110061 mouron@qq.com
*/

public class PIMCollection extends ArrayList<PIMEntity>{
	/**
	 * PIMCollection�̳���ArrayList��List �ӿڵĴ�С�ɱ������ʵ��
	 */
	private static final long serialVersionUID = 1L;
//serialVersionUID ��������ʵ�����л���Ĳ�ͬ�汾��ļ����ԣ�����޸��˴���, Ҫ�޸Ĵ�ֵ
	
	PIMCollection notes;
	PIMCollection todos;
	PIMCollection appointments;
	PIMCollection contact;
	PIMCollection date;
	//5�� PIMCollection ���� ���е� Entity ����
	
	public Collection<PIMEntity> getNotes() {
		//getNotes()����һ��������ǰ��PIMCollection�е�����PIMNote��Ŀ�ļ���
		notes = new PIMCollection();
		for(int i=0;i<this.size();i++){
			if (this.get(i) instanceof PIMNote) {
				notes.add(this.get(i));
			}
		}
		return notes;
	}
	
	public Collection<PIMEntity> getTodos() {
		//getNotes()����һ��������ǰ��PIMCollection�е�����PIMTodo��Ŀ�ļ���
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
		//getAppointments()����һ��������ǰ��PIMCollection�е�����PIMAppointment��Ŀ�ļ���
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
		//getContacts()����һ��������ǰ��PIMCollection�е�����PIMContact��Ŀ�ļ���
		contact = new PIMCollection();
		for(int i=0;i<this.size();i++)
		{
			if (this.get(i) instanceof PIMContact) 
				contact.add(this.get(i));
		}
		return contact;
	}
	
	public Collection<PIMEntity> getItemsForDate(Date d) {
		//getItemsForDate()����һ��������ǰ��PIMTodo��PIMAppointment�е�����Data�ļ���
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
		//newһ��PIMCollection ʵ���б� test
		
		PIMContact mContact = new PIMContact();
		mContact.fromString("Gen,Mouron,mouron@qq.com,normal");
		//�������ڲ�������ʼ��PIMCollection�����е�PIMContact��ʵ��mContact
		test.add(mContact);
		//add(E e) ��ָ����Ԫ����ӵ����б�(test)��β����
		
		PIMTodo mTodo = new PIMTodo();
		Date date1 = new Date();
		date1.setDate(1);
		date1.setYear(2017);
		date1.setMonth(5);
		mTodo.setDate(date1);
		mTodo.fromString("reading books in coffee room,normal");
		//�������ڲ�������ʼ��PIMCollection�����е�PIMTodo��ʵ��mTodo
		test.add(mTodo);
		
		PIMAppointment mAppointment = new PIMAppointment();
		Date date2 = new Date();
		date2.setDate(30);
		date2.setYear(2017);
		date2.setMonth(4);
		mAppointment.setDate(date2);
		mAppointment.fromString("see Caser in KongGongDa,normal");
		//�������ڲ�������ʼ��PIMCollection�����е�PIMAppointment��ʵ�� mAppointment
		test.add(mAppointment);
		
		PIMNote mNote = new PIMNote();
		mNote.fromString("Donot forget Konan's birthday is 5 4th.,normal");
		//�������ڲ�������ʼ��PIMCollection�����е�PIMNote��ʵ�� mNote		
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
*///��������date2
	}
}

