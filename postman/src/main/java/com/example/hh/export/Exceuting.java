package com.example.hh.export;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service

public class Exceuting {
	 private List<exportinfo>  export = new ArrayList<>(Arrays.asList(
				new exportinfo("spring","springframework","spring framework information"),
				new exportinfo("microservices","cybersecurity","sd information"),
				new exportinfo("aws","cloud","cloud information")
				));
	public List<exportinfo> getAllExport(){
		return export;
	}
	public exportinfo getexportinfo(String id) {
		return export.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addexportinfo(exportinfo exportinfo) {
		export.add(exportinfo);
	}
	public void exportinfo(String id, exportinfo exportinfo) {
		for (int i =0; i< export.size(); i++) {
			exportinfo t = export.get(i);
			if (t.getId().equals(id)) {
				export.set(i, exportinfo);
				return;
			}
		}
		
	}

	public void deleteexportinfo(String id) {
		export.removeIf(t -> t.getId().equals(id));
	}
}