package com.example.spring.data.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.example.spring.domain.Course;
public class GenerateDataUtil {
   private GenerateDataUtil(){
	   
   }
   /**
    * 根据传入的获取课程数，随机返回课程.
    * @param size 个数,最小为1,最大10，超过10的就认为是最大值.
    * @return
    */
   public static List<Course> createCourse(int size){
	   final int MIN=1;
	   final int MAX=10;
	   if(size<0){
		   size=MIN;
	   }
	   if(size>10){
		   size=MAX;
	   }
	   if(size==0){
		   return new ArrayList<Course>();
	   }
	   List<Course> courses=new ArrayList<Course>();
	   String[] courseNames=new String[]{"语文","数学","英语","物理",
			   "化学","生物","地理","音乐","计算机应用","体育"};
	   List<String> tmpList=new ArrayList<String>();
	   for(int i=0;i<size;i++){
		   Course course=new Course();
		   Random random=new Random();
		   int tmp=random.nextInt(size);
		   course.setCourseId("c"+tmp);
		   course.setCourseName(courseNames[tmp]);
		   if(!tmpList.contains(course.getCourseId())){
			   tmpList.add(course.getCourseId());
			   courses.add(course);
		   }
		   else{
			   i--;
		   }
	   }  
	   return courses;
   }
}
