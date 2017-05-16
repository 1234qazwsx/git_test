package sipder_2;

import java.io.IOException;  

import org.apache.lucene.analysis.standard.StandardAnalyzer;  
import org.apache.lucene.document.Document;  
import org.apache.lucene.document.Field;  
import org.apache.lucene.document.TextField;  
import org.apache.lucene.index.DirectoryReader;  
import org.apache.lucene.index.IndexWriter;  
import org.apache.lucene.index.IndexWriterConfig;  
import org.apache.lucene.index.Term;  
import org.apache.lucene.search.IndexSearcher;  
import org.apache.lucene.search.Query;  
import org.apache.lucene.search.TermQuery;  
import org.apache.lucene.search.TopDocs;  
import org.apache.lucene.store.RAMDirectory;  
  
public class Joke {  
    public static void main(String[] args) throws IOException {  
         long startTime = System.currentTimeMillis();    
            System.out.println("*****************������ʼ**********************");    
            // ����һ���ڴ�Ŀ¼���������������ɵ�����������ڴ����У��������ڴ��С�    
            RAMDirectory directory = new RAMDirectory();    
            /* 
             * public IndexWriterConfig(Analyzer analyzer) 
             * analyzer���ִ������� 
             */  
            IndexWriterConfig writerConfig = new IndexWriterConfig(new StandardAnalyzer());  
            /*  
             * ��������д����󣬸ö���ȿ��԰�����д�뵽������Ҳ����д�뵽�ڴ��С� ����˵����   
             * public IndexWriter(Directory directory, IndexWriterConfig conf)  
             * directory:Ŀ¼����,Ҳ������FSDirectory ����Ŀ¼����   
             * conf:д�����Ŀ���  
             */    
              
            IndexWriter writer = new IndexWriter(directory, writerConfig);    
            // ����Document �ĵ�������lucene�д������������Կ������ݿ��е�һ�ű�����Ҳ�������ֶ�,�������������֮����Ը����ֶ�ȥƥ���ѯ    
            // ���洴����doc����������������ֶΣ��ֱ�Ϊname,sex,dosomething,    
            Document doc = new Document();    
            /*  
            * ����˵�� public Field(String name, String value, FieldType type)   
            * name : �ֶ�����   
            * value : �ֶε�ֵ store :  
            *  TextField.TYPE_STORED:�洢�ֶ�ֵ 
            */    
            doc.add(new Field("name", "��ѧ��14130110061", TextField.TYPE_STORED));    
            doc.add(new Field("address", "�й����������������ӿƼ���ѧ", TextField.TYPE_STORED));    
            doc.add(new Field("dosometing", "I am learning lucene ",TextField.TYPE_STORED));    
            writer.addDocument(doc);    
            writer.close(); // ���������ǰ�رգ���Ϊdictory д���ڴ�֮�� ��IndexWriter û���κι�ϵ��    
        
            // ��Ϊ���������ڴ��У����Դ�Ž�ȥ֮��Ҫ������ԣ����򣬹ر�Ӧ�ó���֮��ͼ���������    
            // ����IndexSearcher ���������Ķ�������Ҫ��������д����ڴ�Ŀ¼����directory   
            DirectoryReader ireader = DirectoryReader.open(directory);  
            IndexSearcher searcher = new IndexSearcher(ireader);    
            // ���������ؼ��� ��װһ��term��϶���Ȼ���װ��Query��ѯ����    
            // dosometing�����涨����ֶΣ�lucene�Ǽ����Ĺؼ���    
             Query query = new TermQuery(new Term("dosometing", "lucene"));    
//           Query query = new TermQuery(new Term("address", "�й��Ϻ�"));    
            // Query query = new TermQuery(new Term("name", "cheng"));     
                
            // ȥ����Ŀ¼�в�ѯ�����ص���TopDocs���������ŵľ�������ŵ�document�ĵ�����    
            TopDocs rs = searcher.search(query, 100);    
            long endTime = System.currentTimeMillis();    
            System.out.println("�ܹ�����" + (endTime - startTime) + "���룬������" + rs.totalHits + "����¼��");    
            for (int i = 0; i < rs.scoreDocs.length; i++) {    
                // rs.scoreDocs[i].doc �ǻ�ȡ�����еı�־λid, ��0��ʼ��¼    
                Document firstHit = searcher.doc(rs.scoreDocs[i].doc);    
                System.out.println("name:" + firstHit.getField("name").stringValue());    
                System.out.println("address:" + firstHit.getField("address").stringValue());    
                System.out.println("dosomething:" + firstHit.getField("dosometing").stringValue());    
            }    
              
            writer.close();    
            directory.close();    
            System.out.println("*****************��������**********************");    
    }  
}  