import java.net.*;
import java.io.*;

public class Main {
		 static String sendGet(String url) {
				// ����һ���ַ��������洢��ҳ����
		  String result = "";
				 // ����һ�������ַ�������
		  BufferedReader in = null;
		  try {
				// ��stringת��url����
		   URL realUrl = new URL(url);
				// ��ʼ��һ�����ӵ��Ǹ�url������
		   URLConnection connection = realUrl.openConnection();
				 // ��ʼʵ�ʵ�����
		   connection.connect();
				 // ��ʼ�� BufferedReader����������ȡURL����Ӧ
		   in = new BufferedReader(new InputStreamReader(
			 connection.getInputStream()));
				// ������ʱ�洢ץȡ����ÿһ�е�����
		   String line;
		   while ((line = in.readLine()) != null) {
				// ����ץȡ����ÿһ�в�����洢��result����
			result += line;
			result += "\r\n";
			//System.out.print(result);

		   }
		  } catch (Exception e) {
		   System.out.println("����GET��������쳣��" + e);
		   e.printStackTrace();
		  }
		  // ʹ��finally���ر�������
		  finally {
		   try {
			if (in != null) {
			 in.close();
			}
		   } catch (Exception e2) {
			e2.printStackTrace();
		   }
		  }
		  return result;
		 }
		 public static void main(String[] args) {
			// ���弴�����ʵ�����
		  //String url = "http://www.sohu.com";
		  String url = "http://127.0.0.1";
			// �������Ӳ���ȡҳ������
		  String result = sendGet(url);

		 FileWriter fw = null;
			try {
				fw = new FileWriter("E:/Java_cording/spider/test1.txt", true);
					fw.write(result);//�������ļ���������
					fw.flush();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (fw != null) {
					try {
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

			//System.out.println(result);
}