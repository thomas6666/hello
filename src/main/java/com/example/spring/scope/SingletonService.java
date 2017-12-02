package com.example.spring.scope;
import org.springframework.stereotype.Service;
@Service
public class SingletonService {
   public String getServiceName(){
	   return "singletonService";
   }
}
