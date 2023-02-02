package com.example.hh.export;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class adding {
	 @Autowired
	private Exceuting exceuting;
	
@RequestMapping	("/Export")
public List<exportinfo> getAllExport() {
	return exceuting.getAllExport();
 }
@RequestMapping("/Export/spring{id}")
public exportinfo getexportinfo(@PathVariable String id) {
	return exceuting.getexportinfo(id);
	
 }
@RequestMapping(method=RequestMethod.POST, value="/topics")
public void addexportinfo(@RequestBody exportinfo exportinfo) {
	exceuting.addexportinfo(exportinfo);
}

@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
public void updateexportinfo(@RequestBody exportinfo exportinfo, @PathVariable String id) {
	exceuting.exportinfo(id, exportinfo);
}

@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
public void deleteexportinfo(@PathVariable String id) {
	exceuting.deleteexportinfo(id);
}
} 
