package com.devlop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlop.Model.StagesModel;
import com.devlop.Service.StageService;

@RestController
@RequestMapping("stage")
public class StagesController {
@Autowired
 private StageService service;
@PostMapping("/add")
public StagesModel addstage(@RequestBody StagesModel stage) {
	return service.addstage(stage);
}
@GetMapping("/all")
public List<StagesModel> getallStages(){
	return service.getallStages();
}
@PutMapping("/update")
public StagesModel updatestage(@RequestBody StagesModel stage) {
	return service.updatestage(stage);
}
}
