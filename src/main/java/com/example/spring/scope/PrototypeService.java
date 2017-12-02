package com.example.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeService {
 public String getServiceName(){
	 return "prototypeService";
 }
}
